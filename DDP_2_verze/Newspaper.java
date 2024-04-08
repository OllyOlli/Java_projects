package cz.robodreams.javadeveloper.homeworks.hw21junits;

@Getter
@Setter
@RequiredArgsConstructor
public class Newspaper extends Item {
    private final String type; // Pole pro typ novin

    @Override
    public String getTitle() {
        return title; // Vrátí název novin
    }

    @Override
    public boolean isAvailable() {
        // implementace dostupnosti noviny
        return true; // Nastaví dostupnost na vždy true
    }

    @Override
    public void borrowedToUser(User user) {
        // implementace půjčení novin uživateli
    }

    @Override
    public void returnToLibrary() {
        // implementace vrácení novin do knihovny
    }

    @Override
    public void reserveToUser(User user) {
        // implementace rezervace novin uživatelem
    }
}
