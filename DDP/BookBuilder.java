package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Builder pro vytváření nových knih
public class BookBuilder {
    private String title;
    private String author;
    private Genre genre;

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

    // Metoda pro vytvoření instance knihy
    public Book build() {
        return new Book(title, author, genre);
    }
}
