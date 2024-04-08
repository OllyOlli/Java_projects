package cz.robodreams.javadeveloper.homeworks.hw21junits;

public enum Genre {
    BELETRIE("Beletrie"), // Žánr beletrie
    ODBORNE("Odborné"), // Žánr odborné literatury
    POHADKA("Pohádka"); // Žánr pohádek

    private final String name; // Název žánru

    Genre(String name) {
        this.name = name; // Inicializace názvu žánru
    }

    @Override
    public String toString() {
        return name; // Vrátí název žánru
    }
}
