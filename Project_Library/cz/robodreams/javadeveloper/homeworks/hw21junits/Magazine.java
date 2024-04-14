package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.lang.IllegalArgumentException;

public class Magazine extends Item {
    private final String publisher; // Vydavatel časopisu
    private int numberOfCopies; // Počet kopií časopisu

    // Konstruktor pro inicializaci časopisu
    public Magazine(String title, String publisher, int numberOfCopies) {
        super(title);
        if (publisher == null) {
            throw new IllegalArgumentException("Publisher must not be null.");
        }
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
    }

    // Getter pro získání vydavatele časopisu
    public String getPublisher() {
        return publisher;
    }

    // getter for number of copies
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    // Metoda pro kontrolu dostupnosti časopisu
    public boolean isAvailable() {
        return numberOfCopies > 0;
    }

    // Metoda pro vypůjčení časopisu
    public void borrowItem() throws ItemUnavailableException {
        if (!isAvailable()) {
            throw new ItemUnavailableException("Magazine " + getTitle() + " is not available.");
        }
        numberOfCopies--;
    }

    // Metoda pro vrácení časopisu
    public void returnItem() {
        numberOfCopies++;
    }
}