package cz.robodreams.javadeveloper.homeworks.hw21junits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    private Library library;
    private Book book;
    private Magazine magazine;
    private Newspaper newspaper;
    private User user;

    @BeforeEach
    public void setUp() {
        library = new Library();
        book = new Book("Test Book", "Test Author", Genre.BELETRIE, 3);
        magazine = new Magazine("Test Magazine", "Test Publisher", 5);
        newspaper = new Newspaper("Test Newspaper", "Daily", 10);
        user = new User("Test User");
    }

    @Test
    public void testAddBook() {
        library.addBook(book);
        assertTrue(library.isItemReservedByUser(user, "Test Book"));
    }

    @Test
    public void testAddMagazine() {
        library.addMagazine(magazine);
        assertFalse(library.isItemReservedByUser(user, "Test Magazine"));
    }

    @Test
    public void testAddNewspaper() {
        library.addNewspaper(newspaper);
        assertFalse(library.isItemReservedByUser(user, "Test Newspaper"));
    }

    @Test
    public void testBorrowBook() throws ItemUnavailableException {
        library.addBook(book);
        library.borrowBook("Test Book");
        assertFalse(library.isItemReservedByUser(user, "Test Book"));
    }

    @Test
    public void testBorrowMagazine() throws ItemUnavailableException {
        library.addMagazine(magazine);
        library.borrowMagazine("Test Magazine");
        assertFalse(library.isItemReservedByUser(user, "Test Magazine"));
    }

    @Test
    public void testBorrowNewspaper() throws ItemUnavailableException {
        library.addNewspaper(newspaper);
        library.borrowNewspaper("Test Newspaper");
        assertFalse(library.isItemReservedByUser(user, "Test Newspaper"));
    }

    @Test
    public void testReserveItem() throws ItemUnavailableException {
        library.addBook(book);
        library.reserveItem(user, "Test Book");
        assertTrue(library.isItemReservedByUser(user, "Test Book"));
    }

    @Test
    public void testCancelReservation() throws ItemUnavailableException {
        library.addBook(book);
        library.reserveItem(user, "Test Book");
        library.cancelReservation(user, "Test Book");
        assertFalse(library.isItemReservedByUser(user, "Test Book"));
    }
}
