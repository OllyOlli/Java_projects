package hw21junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testConstructor() {
        User user = new User("John Doe");
        assertNotNull(user);
        assertEquals("John Doe", user.getName());
    }
}
