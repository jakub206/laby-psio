package ex1_2;

public class Calculator {
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Division by zero");
        }
        return a / b;
    }
}
