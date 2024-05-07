package hw21junits;

// Builder pro vytváření nových knih
public class BookBuilder {
    private String title; // název knihy
    private String author; // autor knihy
    private Genre genre; // žánr knihy
    private int numberOfCopies; // počet kopií knihy


    // Konstruktor pro inicializaci builderu
    public BookBuilder() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.genre = Genre.BELETRIE;
        this.numberOfCopies = 0;
    }

    BookBuilder bookBuilder = new BookBuilder();
    Book book = bookBuilder.setTitle("Title")
            .setAuthor("Author")
            .setGenre(Genre.BELETRIE)
            .setNumberOfCopies(5)
            .build();

    // Metoda pro nastavení názvu knihy
    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    // Metoda pro nastavení autora knihy
    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    // Metoda pro nastavení žánru knihy
    public BookBuilder setGenre(Genre genre) {
        this.genre = genre;
        return this;
    }

    // Metoda pro nastavení počtu kopií knihy
    public BookBuilder setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
        return this;
    }

    // Metoda pro vytvoření instance knihy
    public Book build() {
        return new Book(title, author, genre, numberOfCopies);
    }
}
