package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Třída reprezentující uživatele
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
}
