package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Výjimka označující, že uživatel nebyl nalezen
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}