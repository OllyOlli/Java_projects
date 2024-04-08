package cz.robodreams.javadeveloper.project;

import lombok.Getter;

@Getter
public enum Genre {
    THRILLER("Thriller"),
    FANTASY("Fantasy"),
    NOVEL("Romance literature"),
    BIOGRAPHY("Biography"),
    BESTSELLERS("Bestsellers"),
    TECHNICAL_LITERATURE("Specialized literature");
    private final String genre;


    Genre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return genre;
    }
}
