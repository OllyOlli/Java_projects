public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Nová metoda pro získání popisu knihy
    public String getDescription() {
        return "Book: Title - " + title + ", Author - " + author;
    }
}