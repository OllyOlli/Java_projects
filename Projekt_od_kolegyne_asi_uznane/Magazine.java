package cz.robodreams.javadeveloper.project;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
public class Magazine extends Item {

    private final long id;
    private final String publisher;
    private final String magazineName;
    private final LocalDate publicationDate;

    @Override
    public String getTitle() {
        return magazineName;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "publisher='" + publisher + '\'' +
                ", magazineName='" + magazineName + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}

