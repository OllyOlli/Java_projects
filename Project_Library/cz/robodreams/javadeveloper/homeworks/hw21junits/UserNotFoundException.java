package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Třída reprezentující výjimku, kdy uživatel nebyl nalezen
public class UserNotFoundException extends Exception {
    // Konstruktor pro inicializaci výjimky s danou zprávou
    public UserNotFoundException(String message) {
        super(message);
    }
}