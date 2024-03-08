///
public class Magazine {

    private String title;
    private String publisher;

    public Magazine(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    //
    @Override
    public String toString() {
    return "Magazine: Title - " + title + ", Publisher - " + publisher;
    }
}