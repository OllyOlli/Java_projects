package cz.robodreams.javadeveloper.homeworks.hw15exceptions.exceptions;
//
/**
 * Vyjímkaa označující nedostupnost kurzu pro určitý čas
 */
public class TimeNotAvailableException extends RuntimeException {

    public TimeNotAvailableException(String message) {
        super(message);
    }
}