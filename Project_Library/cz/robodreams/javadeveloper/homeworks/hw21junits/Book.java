package cz.robodreams.javadeveloper.homeworks.hw21junits;

public class Book extends Item {
    private final String author; // autor knihy
    private final Genre genre; // žánr knihy
    private int numberOfCopies; // počet kopií knihy

    // konstruktor knihy
    public Book(String title, String author, Genre genre, int numberOfCopies) {
        super(title);
        this.author = author;
        this.genre = genre;
        this.numberOfCopies = numberOfCopies;
    }

    // getter pro autora knihy
    public String getAuthor() {
        return author;
    }

    // getter pro žánr knihy
    public Genre getGenre() {
        return genre;
    }

    // getter pro počet kopií knihy
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    // metoda pro zjištění, zda je kniha dostupná
    public boolean isAvailable() {
        return numberOfCopies > 0;
    }

    // metoda pro půjčení knihy
    public void borrowItem() throws ItemUnavailableException {
        if (!isAvailable()) {
            throw new ItemUnavailableException("Book " + getTitle() + " is not available.");
        }
        numberOfCopies--;
    }

    // metoda pro vrácení knihy
    public void returnItem() {
        numberOfCopies++;
    }

    // metoda pro výpis informací o knize
    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}