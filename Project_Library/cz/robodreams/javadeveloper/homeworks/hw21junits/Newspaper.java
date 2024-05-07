package hw21junits;

public class Newspaper extends Item {
    private final String frequency; // frequency of the newspaper
    private int numberOfCopies; // number of copies of the newspaper

    // constructor for Newspaper
    public Newspaper(String title, String frequency, int numberOfCopies) {
        super(title);
        this.frequency = frequency;
        this.numberOfCopies = numberOfCopies;
    }

    // getter for frequency
    public String getFrequency() {
        return frequency;
    }

    // getter for number of copies
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    // method to check if the newspaper is available
    public boolean isAvailable() {
        return numberOfCopies > 0;
    }

    // method to borrow the newspaper
    public void borrowItem() throws ItemUnavailableException {
        if (!isAvailable()) {
            throw new ItemUnavailableException("Newspaper " + getTitle() + " is not available.");
        }
        numberOfCopies--;
    }

    // method to return the newspaper
    public void returnItem() {
        numberOfCopies++;
    }
}
