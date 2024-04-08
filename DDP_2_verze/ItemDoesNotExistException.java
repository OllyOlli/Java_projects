package cz.robodreams.javadeveloper.homeworks.hw21junits;

public class ItemDoesNotExistException extends RuntimeException {
    public ItemDoesNotExistException(String message) {
        super(message);
    }
}
