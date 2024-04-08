package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Vlastní výjimka pro nedostupnost knihy
public class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}
