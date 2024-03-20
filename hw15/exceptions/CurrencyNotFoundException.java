package cz.robodreams.javadeveloper.homeworks.hw15exceptions.exceptions;

/**
 * Vyjímka označující neexistenci měny
 */
public class CurrencyNotFoundException extends RuntimeException {

    public CurrencyNotFoundException(String message) {
        super(message);
    }
}
