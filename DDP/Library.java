package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.util.ArrayList;
import java.util.List;

// Třída reprezentující knihovnu
public class Library {
    private List<Book> books;

    // Konstruktor pro inicializaci knihovny s prázdným seznamem knih
    public Library() {
        this.books = new ArrayList<>();
    }

    // Metoda pro přidání knihy do knihovny
    public void addBook(Book book) {
        books.add(book);
    }

    // Metoda pro vyhledání knihy podle názvu
    public Book findBook(String title) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book '" + title + "' not found in the library.");
    }

    // Metoda pro zobrazení všech položek v knihovně
    public void displayItems() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Metoda pro půjčení knihy podle názvu
    public void borrowBook(String bookTitle) throws BookNotFoundException, BookUnavailableException {
        Book book = findBook(bookTitle);
        if (!book.isAvailable()) {
            throw new BookUnavailableException("Book '" + book.getTitle() + "' is not available for borrowing.");
        }
        book.setAvailable(false);
        System.out.println("Book '" + book.getTitle() + "' has been borrowed.");
    }

    // Nově přidaná metoda pro získání seznamu knih
    public List<Book> getBooks() {
        return books;
    }
}