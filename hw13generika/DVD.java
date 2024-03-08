
///
public class DVD {

    private String title;
    private String director;

    public DVD(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    //
    @Override
    public String toString() {
    return "DVD: Title - " + title + ", Director - " + director;
    }
}