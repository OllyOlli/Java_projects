package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Výjimka označující, že kniha nebyla nalezena
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}
