package cz.robodreams.javadeveloper.project.exceptions;

public class ItemAlreadyBorrowedException extends RuntimeException {
    public ItemAlreadyBorrowedException(String message) {
        super(message);
    }
}
