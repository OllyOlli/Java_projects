package cz.robodreams.javadeveloper.homeworks.hw21junits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testGetName() {
        String name = "John Doe";
        User user = new User(name);
        assertEquals(name, user.getName());
    }

    @Test
    void testBorrowBook() {
        Book availableBook = new Book("Book1", "Author1", Genre.BELETRIE);
        Book unavailableBook = new Book("Book2", "Author2", Genre.ODBORNE);
        unavailableBook.setAvailable(false);

        User user = new User("John Doe");

        // Test borrowing an available book
        assertDoesNotThrow(() -> user.borrowBook(availableBook));

        // Test borrowing an unavailable book
        assertThrows(BookUnavailableException.class, () -> user.borrowBook(unavailableBook));
    }
}
