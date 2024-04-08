package cz.robodreams.javadeveloper.homeworks.hw21junits;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Book extends Item {
    private final int copies; // Počet kopií knihy

    public Book(String title, String author, Genre genre, int copies) {
        super(title, author, genre);
        this.copies = copies;
    }

    @Override
    public String getTitle() {
        return title; // Název knihy
    }

    @Override
    public boolean isAvailable() {
        return copies > 0; // Vrací true, pokud jsou k dispozici nějaké kopie knihy
    }

    @Override
    public void borrowedToUser(User user) {
        // implementace půjčení knihy uživateli
    }

    @Override
    public void returnToLibrary() {
        // implementace vrácení knihy do knihovny
    }

    @Override
    public void reserveToUser(User user) {
        // implementace rezervace knihy uživatelem
    }
}
