package cz.robodreams.javadeveloper.homeworks.hw21junits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.junit.MockitoJUnitRunner;


@ExtendWith(MockitoExtension.class)
class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testAddBook() {
        // Given
        Book book = mock(Book.class);

        // When
        library.addBook(book);

        // Then
        assertEquals(1, library.getBooks().size());
        assertTrue(library.getBooks().contains(book));
    }

    @Test
    void testFindBookWhenBookExists() throws BookNotFoundException {
        // Given
        Book book = mock(Book.class);
        when(book.getTitle()).thenReturn("Test Book");
        library.addBook(book);

        // When
        Book foundBook = library.findBook("Test Book");

        // Then
        assertEquals(book, foundBook);
    }

    @Test
    void testFindBookWhenBookDoesNotExist() {
        // Given/When/Then
        assertThrows(BookNotFoundException.class, () -> {
            library.findBook("Non-existent Book");
        });
    }

    @Test
    void testDisplayItems() {
        // Given
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        library.addBook(book1);
        library.addBook(book2);

        // When
        library.displayItems();

        // Then
        verify(book1, times(1)).toString();
        verify(book2, times(1)).toString();
    }

    @Test
    void testBorrowBookWhenBookAvailable() throws BookNotFoundException, BookUnavailableException {
        // Given
        Book book = mock(Book.class);
        when(book.getTitle()).thenReturn("Available Book");
        when(book.isAvailable()).thenReturn(true);
        library.addBook(book);

        // When
        library.borrowBook("Available Book");

        // Then
        verify(book, times(1)).setAvailable(false);
        System.out.println("Book 'Available Book' has been borrowed.");
    }

    @Test
    void testBorrowBookWhenBookUnavailable() {
        // Given
        Book book = mock(Book.class);
        when(book.getTitle()).thenReturn("Unavailable Book");
        when(book.isAvailable()).thenReturn(false);
        library.addBook(book);

        // When/Then
        assertThrows(BookUnavailableException.class, () -> {
            library.borrowBook("Unavailable Book");
        });
    }
}
