package hw21junits;

public class Item {
    protected String title; // Název položky
    private boolean isAvailable; // Dostupnost položky

    public Item(String title) {
        this.title = title;
        this.isAvailable = true; // Položka je na začátku dostupná
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowItem() throws ItemUnavailableException {
        if (!isAvailable()) {
            throw new ItemUnavailableException("Item " + title + " is not available.");
        }
        isAvailable = false;
    }

    public void returnItem() {
        isAvailable = true;
    }
}
