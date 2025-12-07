import java.util.Scanner;
public class TicTacToe {

    public static void printBoard(String[][] board) {
        System.out.println("---------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print("["+board[i][j]+"]" + " ");
            }
            System.out.print("\n");
        }
            System.out.println();
    }

    public static boolean isDraw(String[][] board) {
        boolean draw = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!board[i][j].equals("\033[1m"+"X"+"\033[0m")&!board[i][j].equals("\033[1m"+"O"+"\033[0m")) {
                    draw = false;
                }
            }
        }

        if (draw) {
            System.out.println("Draw");
        }
        return draw;
    }
    public static boolean isWin(String[][] board) {
        boolean win = false;
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])){
            win = true;
            System.out.println(board[0][0]+" wins the game!");
        } else if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])){
            win = true;
            System.out.println(board[0][2]+" wins the game!");
        }

        if (!win){
            for  (int i = 0; i < board.length; i++) {
                if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
                    win = true;
                    System.out.println(board[i][0]+" wins the game!");
                }
            }
        }

        if (!win){
            for  (int i = 0; i < board[0].length; i++) {
                if (board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) {
                    win = true;
                    System.out.println(board[0][i]+" wins the game!");
                }
            }
        }

        return win;
    }

    public static void choosingField(String[][] board, String sign) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the field: ");
        int field = input.nextInt();

        while (field>9 || field<1) {
            System.out.println();
            printBoard(board);
            System.out.println("Field not found!");
            System.out.print("Enter the number of the field again: ");
            field = input.nextInt();
        }

        while (!isFree(board, field)) {
            System.out.println();
            printBoard(board);
            System.out.println("The field is not free!");
            System.out.print("Enter the number of the field again: ");
            field = input.nextInt();
        }

        String BOLD = "\033[1m";
        String RESET = "\033[0m";
        if (field>=7){
            board[2][field-7] = BOLD+sign+RESET;
        } else if(field>=4){
            board[1][field-4] = BOLD+sign+RESET;
        } else{
            board[0][field-1] = BOLD+sign+RESET;
        }
    }

    public static boolean isFree(String[][] board, int field) {
        boolean free = false;

        for  (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals(Integer.toString(field))) {
                    free = true;
                    break;
                }
            }
        }
        return free;
    }

    public static void main(String[] args) {
        String[][] board = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};

        printBoard(board);
        while (!isDraw(board)) {

            System.out.println("Player X's turn!");
            choosingField(board, "X");

            printBoard(board);
            if (isWin(board) || isDraw(board)) {
                break;
            }

            System.out.println("Player O's turn!");
            choosingField(board, "O");

            printBoard(board);
            if (isWin(board) || isDraw(board)) {
                break;
            }
        }

    }
}
