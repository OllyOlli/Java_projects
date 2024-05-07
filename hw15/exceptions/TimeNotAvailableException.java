package hw15exceptions.exceptions;

/**
 * Vyjímka označující nedostupnost kurzu pro určitý čas
 */
public class TimeNotAvailableException extends RuntimeException {

    public TimeNotAvailableException(String message) {
        super(message);
    }
}
