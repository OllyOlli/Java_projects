package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Třída pro reprezentaci knihy v knihovně
public class Book {
    private String title; // Název knihy
    private String author; // Autor knihy
    private Genre genre; // Žánr knihy
    private boolean isAvailable; // Dostupnost knihy

    // Konstruktor pro inicializaci knihy
    public Book(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true; // Při vytvoření je kniha volná
    }

    // Gettery pro název, autora, žánr a dostupnost knihy
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Metoda pro získání žánru knihy
    public Genre getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter pro nastavení dostupnosti knihy
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Přepsaná metoda toString pro získání informací o knize
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
