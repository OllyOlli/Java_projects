package cz.robodreams.javadeveloper.project;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
public class Newspaper extends Item {

    private final long id;
    private final String publisher;
    private final String headline;
    private final LocalDate date;

    @Override
    public String getTitle() {
        return headline;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "publisher='" + publisher + '\'' +
                ", headline='" + headline + '\'' +
                ", date=" + date +
                '}';
    }
}
