import java.util.Random;
public class Matrix {
    public static void fillMatrix(double[][] matrix){
        Random rand = new Random();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = rand.nextDouble(0,10);
            }
        }
    }

    public static void printMatrix(double[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static double findMax(double[][] board){
        double max = board[0][0];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] > max){
                    max = board[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[][] matrix = new double[5][];
        matrix[0] = new double[5];
        matrix[1] = new double[1];
        matrix[2] = new double[4];
        matrix[3] = new double[2];
        matrix[4] = new double[3];

        fillMatrix(matrix);
        printMatrix(matrix);
        System.out.println();
        System.out.println("Max value is " + findMax(matrix));
    }
}
