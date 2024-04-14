package cz.robodreams.javadeveloper.homeworks.hw21junits;

//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.net.Socket;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LibraryClient {
    private static final Logger LOGGER = Logger.getLogger(LibraryClient.class.getName());
    private static final Library library = new Library();

    public static void main(String[] args) {
        // Add some items to the library
        library.addBook(new Book("Book1", "Author1", Genre.ODBORNE, 5));
        library.addMagazine(new Magazine("Magazine1", "Publisher1", 5));
        library.addNewspaper(new Newspaper("Newspaper1", "Daily", 5));

        // Display the items in the library
        library.displayBooks();
        library.displayMagazines();
        library.displayNewspapers();

        // Borrow some items
        try {
            library.borrowBook("Book1");
            library.borrowMagazine("Magazine1");
            library.borrowNewspaper("Newspaper1");
        } catch (ItemUnavailableException e) {
            LOGGER.log(Level.SEVERE, "An item is unavailable", e);
        }

        // Return some items
        library.returnBook("Book1");
        library.returnMagazine("Magazine1");
        library.returnNewspaper("Newspaper1");

        // Reserve some items
        User user = new User("User1");
        try {
            library.reserveItem(user, "Book1");
            library.reserveItem(user, "Magazine1");
            library.reserveItem(user, "Newspaper1");
        } catch (ItemUnavailableException e) {
            LOGGER.log(Level.SEVERE, "An item is unavailable", e);
        }

        // Cancel some reservations
        library.cancelReservation(user, "Book1");
        library.cancelReservation(user, "Magazine1");
        library.cancelReservation(user, "Newspaper1");

        // Check if an item is reserved by a user
        boolean isBook1ReservedByUser1 = library.isItemReservedByUser(user, "Book1");
        System.out.println("Is Book1 reserved by User1? " + isBook1ReservedByUser1);
    }
}