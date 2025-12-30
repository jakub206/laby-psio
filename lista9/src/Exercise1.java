import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.print("First number: ");
            int a = Integer.parseInt(sc.next());
            System.out.print("Second number: ");
            int b = Integer.parseInt(sc.next());
            int result = a /b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by 0!");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect number!");
        }

    }
}
