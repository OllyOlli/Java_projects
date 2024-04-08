package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Třída pro reprezentaci DVD v knihovně
public class DVD {
    private String title; // Název DVD
    private String director; // Režisér DVD

    // Konstruktor pro inicializaci DVD
    public DVD (String title, String director) {
        this.title = title;
        this.director = director;
    }

    // Getter pro získání názvu DVD
    public String getTitle() {
        return title;
    }

    // Getter pro získání režiséra DVD
    public String getDirector() {
        return director;
    }
}
