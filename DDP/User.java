package cz.robodreams.javadeveloper.homeworks.hw21junits;

public class User {
    private final String name; // Jméno uživatele

    // Konstruktor pro inicializaci uživatele
    public User(String name) {
        this.name = name;
    }

    // Getter pro získání jména uživatele
    public String getName() {
        return name;
    }

    // Metoda pro půjčení knihy uživatelem
    public void borrowBook(Book book) throws BookUnavailableException {
        if (!book.isAvailable()) {
            throw new BookUnavailableException("Book is not available for borrowing.");
        }
        // Implementace půjčení knihy...
    }
}
