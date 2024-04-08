package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class Item {
    protected final String title; // Název položky
    protected final String author; // Autor položky
    protected final String genre; // Žánr položky

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Genre: " + genre; // Vrátí textovou reprezentaci položky
    }

    public abstract String getTitle(); // Abstraktní metoda pro získání názvu položky

    public abstract boolean isAvailable(); // Abstraktní metoda pro zjištění dostupnosti položky

    public abstract void borrowedToUser(User user); // Abstraktní metoda pro půjčení položky uživateli

    public abstract void returnToLibrary(); // Abstraktní metoda pro vrácení položky do knihovny

    public abstract void reserveToUser(User user); // Abstraktní metoda pro rezervaci položky uživatelem
}
