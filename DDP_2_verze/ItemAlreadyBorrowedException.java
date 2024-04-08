package cz.robodreams.javadeveloper.homeworks.hw21junits;

public class ItemAlreadyBorrowedException extends RuntimeException {
    public ItemAlreadyBorrowedException(String message) {
        super(message); // Inicializace výjimky s danou zprávou
    }
}
