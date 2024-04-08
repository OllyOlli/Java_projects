package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class Library<T extends Item> {
    private final List<T> items = new ArrayList<>(); // Seznam položek v knihovně

    public void addItem(T item) {
        items.add(item); // Přidání položky do knihovny
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item); // Výpis všech položek v knihovně
        }
    }

    // Metoda pro odstranění položky z knihovny
    public void removeItem(T item) {
        items.remove(item);
    }

    // Metoda pro získání položek knihovny
    public List<T> getItems() {
        return items;
    }

    // Metoda pro získání položek dostupných k půjčení
    public List<T> getAvailableItems() {
        List<T> availableItems = new ArrayList<>();
        for (T item : items) {
            if (item.isAvailable()) {
                availableItems.add(item);
            }
        }
        return availableItems;
    }

    // Metoda pro získání položek podle žánru
    public List<T> getItemsByGenre(Genre genre) {
        List<T> itemsByGenre = new ArrayList<>();
        for (T item : items) {
            if (item.getGenre().equals(genre)) {
                itemsByGenre.add(item);
            }
        }
        return itemsByGenre;
    }

    // další metody knihovny
}
