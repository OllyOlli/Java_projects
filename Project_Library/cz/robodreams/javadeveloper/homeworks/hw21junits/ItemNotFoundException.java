package hw21junits;

// Výjimka označující, že položka (například DVD, časopis, noviny) nebyla nalezena
public class ItemNotFoundException extends Exception {
    // Konstruktor výjimky, který přijímá zprávu o chybě
    public ItemNotFoundException(String message) {
        super(message);
    }
}


