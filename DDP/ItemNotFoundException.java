package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Výjimka označující, že položka (DVD, Magazine, Newspaper) nebyla nalezena
public class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}
