import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testUnderage {
    @Test
    void testIsAdult(){
        assertTrue(Main.isAdult(18));
        assertFalse(Main.isAdult(14));
    }
}
