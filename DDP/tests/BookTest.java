package cz.robodreams.javadeveloper.homeworks.hw21junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book("BOOK_1", "Knuth", Genre.ODBORNE);
    }

    @Test
    void getTitle() {
        assertEquals("BOOK_1", book.getTitle());
    }

    @Test
    void getAuthor() {
        assertEquals("Autor_Autor", book.getAuthor());
    }

    @Test
    void getGenre() {
        assertEquals(Genre.ODBORNE, book.getGenre());
    }

    @Test
    void isAvailable() {
        assertTrue(book.isAvailable());
    }

    @Test
    void setAvailable() {
        book.setAvailable(false);
        assertFalse(book.isAvailable());
    }

    @Test
    void testToString() {
        String expected = "Book{title='Učebnice jazyka Java', author='Pavel Herout', genre=ODBORNE, isAvailable=true}";
        assertEquals(expected, book.toString());
    }
}