package hw21junits;

// Vlastní výjimka pro situaci, kdy je položka nedostupná
public class ItemUnavailableException extends Exception {
    // Konstruktor výjimky, který přijímá zprávu o chybě
    public ItemUnavailableException(String message) {
        super(message);
    }
}
