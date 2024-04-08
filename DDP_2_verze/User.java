package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class User {
    private final String name; // Pole pro jméno uživatele
    private final List<Item> borrowedItems = new ArrayList<>(); // List pro půjčené položky
    private final List<Item> reservedItems = new ArrayList<>(); // List pro rezervované položky

    public void borrowItem(Item item) {
        // implementace půjčení položky uživatelem
    }

    public void returnOrUnreserveItem(Item item) {
        // implementace vrácení nebo zrušení rezervace položky uživatelem
    }

    // Metoda pro přidání položky mezi půjčené
    public void addBorrowedItem(Item item) {
        borrowedItems.add(item);
    }

    // Metoda pro odebrání položky z půjčených
    public void removeBorrowedItem(Item item) {
        borrowedItems.remove(item);
    }

    // Metoda pro přidání položky mezi rezervované
    public void addReservedItem(Item item) {
        reservedItems.add(item);
    }

    // Metoda pro odebrání položky z rezervovaných
    public void removeReservedItem(Item item) {
        reservedItems.remove(item);
    }

    // další metody pro práci s položkami uživatele
}
