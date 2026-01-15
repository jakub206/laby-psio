import ex1_2.Calculator;
import ex1_2.DivisionByZeroException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testDivideCorrection() {
        int expected = 7;
        int actual = Calculator.divide(14, 2);
        assertEquals(expected, actual);
    }

//    @Test
//    void testDivideByZero() {
//        assertThrows(ArithmeticException.class, () -> {
//            ex1_2.Calculator.divide(2137, 0);
//        });
//    }

    @Test
    void testDivideByZeroWithMyException() {
        DivisionByZeroException ex = assertThrows(DivisionByZeroException.class, () -> {
            Calculator.divide(2137, 0);
        });

        assertEquals(ex.getMessage(), "Division by zero");
    }
}