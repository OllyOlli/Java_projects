package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Třída pro reprezentaci položky v knihovně
public class Item {
    private String title; // Název položky

    // Konstruktor pro inicializaci položky
    public Item(String title) {
        this.title = title;
    }

    // Getter pro název položky
    public String getTitle() {
        return title;
    }
}

