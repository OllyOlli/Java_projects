package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Import pro třídu IllegalArgumentException
import java.lang.IllegalArgumentException;

// Třída pro reprezentaci časopisu v knihovně
public class Magazine {
    private String title; // Název časopisu
    private String publisher; // Vydavatel časopisu

    // Konstruktor pro inicializaci časopisu
    public Magazine(String title, String publisher) {
        if (title == null || publisher == null) {
            throw new IllegalArgumentException("Title and publisher must not be null.");
        }
        this.title = title;
        this.publisher = publisher;
    }

    // Getter pro název časopisu
    public String getTitle() {
        return title;
    }

    // Getter pro vydavatele časopisu
    public String getPublisher() {
        return publisher;
    }
}
