import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void testCorrectUserCreation(){
        assertDoesNotThrow(() -> new User("Jakub", "jakub@de", 19));
    }

    @Test
    void testInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> new User("", "jakub@de", 19));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> new User("Jakub", "blablabla", 19));
    }

    @Test
    void testInvalidAge() {
        assertThrows(IllegalArgumentException.class, () -> new User("Jakub", "jakub@de", -5));
    }
}
