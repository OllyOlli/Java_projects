package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Třída pro reprezentaci novin v knihovně
public class Newspaper {
    private String title; // Název novin
    private String type; // Typ novin (seriózní, populární, atd.)

    // Konstruktor pro inicializaci novin
    public Newspaper(String title, String type) {
        this.title = title;
        this.type = type;
    }

    // Getter pro získání názvu novin
    public String getTitle() {
        return title;
    }

    // Getter pro získání typu novin
    public String getType() {
        return type;
    }
}
