package cz.robodreams.javadeveloper.homeworks.hw21junits;

public interface UserChannel {
    void onItemBorrowed(User user, Item item); // Metoda pro událost půjčení položky
    void onItemReturned(User user, Item item); // Metoda pro událost vrácení položky
    void onItemReserved(User user, Item item); // Metoda pro událost rezervace položky
}
