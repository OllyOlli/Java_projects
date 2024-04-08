package cz.robodreams.javadeveloper.homeworks.hw21junits;

@Getter
@Setter
@RequiredArgsConstructor
public class Magazine extends Item {
    private final String type; // Pole pro typ časopisu

    @Override
    public String getTitle() {
        return title; // Vrátí název časopisu
    }

    @Override
    public boolean isAvailable() {
        // implementace dostupnosti časopisu
    }

    @Override
    public void borrowedToUser(User user) {
        // implementace půjčení časopisu uživateli
    }

    @Override
    public void returnToLibrary() {
        // implementace vrácení časopisu do knihovny
    }

    @Override
    public void reserveToUser(User user) {
        // implementace rezervace časopisu uživatelem
    }
}
