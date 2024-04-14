package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Library {
    private final HashMap<String, Item> items = new HashMap<>(); // Map of items in the library
    private final List<Reservation> reservations = new ArrayList<>(); // List of reservations

    public boolean isItemReservedByUser(User user, String title) {
        for (Reservation reservation : reservations) {
            if (reservation.getUser().equals(user) && reservation.getItem().getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    // Seznam knih v knihovně
    private final List<Book> books = new ArrayList<>();
    // Seznam časopisů v knihovně
    private final List<Magazine> magazines = new ArrayList<>();
    // Seznam novin v knihovně
    private final List<Newspaper> newspapers = new ArrayList<>();

    // Metoda pro přidání knihy do knihovny
    public void addBook(Book book) {
        books.add(book);
        items.put(book.getTitle(), book);
    }

    // Metoda pro přidání časopisu do knihovny
    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
        items.put(magazine.getTitle(), magazine);
    }

    // Metoda pro přidání novin do knihovny
    public void addNewspaper(Newspaper newspaper) {
        newspapers.add(newspaper);
        items.put(newspaper.getTitle(), newspaper);
    }

    // Metoda pro zobrazení všech knih v knihovně
    public void displayBooks() {
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Genre: " + book.getGenre() + ", Copies: " + book.getNumberOfCopies());
        }
    }

    // Metoda pro zobrazení všech časopisů v knihovně
    public void displayMagazines() {
        System.out.println("Magazines:");
        for (Magazine magazine : magazines) {
            System.out.println("Title: " + magazine.getTitle() + ", Publisher: " + magazine.getPublisher() + ", Copies: " + magazine.getNumberOfCopies());
        }
    }

    // Metoda pro zobrazení všech novin v knihovně
    public void displayNewspapers() {
        System.out.println("Newspapers:");
        for (Newspaper newspaper : newspapers) {
            System.out.println("Title: " + newspaper.getTitle() + ", Frequency: " + newspaper.getFrequency() + ", Copies: " + newspaper.getNumberOfCopies());
        }
    }

    // Metoda pro půjčení knihy na základě názvu. Pokud kniha není dostupná, vyhodí výjimku ItemUnavailableException.
    public void borrowBook(String bookTitle) throws ItemUnavailableException {
        Item item = items.get(bookTitle); // Získání knihy z mapy na základě názvu
        if (item == null || !item.isAvailable()) { // Kontrola, zda je kniha dostupná
            throw new ItemUnavailableException("Book " + bookTitle + " is not available."); // Vyhodí výjimku, pokud kniha není dostupná
        }
        item.borrowItem(); // Půjčení knihy
    }

    // Metoda pro půjčení časopisu na základě názvu. Pokud časopis není dostupný, vyhodí výjimku ItemUnavailableException.
    public void borrowMagazine(String magazineTitle) throws ItemUnavailableException {
        Item item = items.get(magazineTitle); // Získání časopisu z mapy na základě názvu
        if (item == null || !item.isAvailable()) { // Kontrola, zda je časopis dostupný
            throw new ItemUnavailableException("Magazine " + magazineTitle + " is not available."); // Vyhodí výjimku, pokud časopis není dostupný
        }
        item.borrowItem(); // Půjčení časopisu
    }

    // Metoda pro půjčení novin na základě názvu. Pokud noviny nejsou dostupné, vyhodí výjimku ItemUnavailableException.
    public void borrowNewspaper(String newspaperTitle) throws ItemUnavailableException {
        Item item = items.get(newspaperTitle); // Získání novin z mapy na základě názvu
        if (item == null || !item.isAvailable()) { // Kontrola, zda jsou noviny dostupné
            throw new ItemUnavailableException("Newspaper " + newspaperTitle + " is not available."); // Vyhodí výjimku, pokud noviny nejsou dostupné
        }
        item.borrowItem(); // Půjčení novin
    }

    // Metoda pro vrácení knihy na základě názvu. Pokud kniha neexistuje, vypíše chybovou zprávu.
    public void returnBook(String bookTitle) {
        Item item = items.get(bookTitle); // Získání knihy z mapy na základě názvu
        if (item != null) { // Kontrola, zda kniha existuje
            item.returnItem(); // Vrácení knihy
        } else {
            System.out.println("Book " + bookTitle + " does not exist in the library."); // Výpis chyby, pokud kniha neexistuje
        }
    }

    // Metoda pro vrácení časopisu na základě názvu. Pokud časopis neexistuje, vypíše chybovou zprávu.
    public void returnMagazine(String magazineTitle) {
        Item item = items.get(magazineTitle); // Získání časopisu z mapy na základě názvu
        if (item != null) { // Kontrola, zda časopis existuje
            item.returnItem(); // Vrácení časopisu
        } else {
            System.out.println("Magazine " + magazineTitle + " does not exist in the library."); // Výpis chyby, pokud časopis neexistuje
        }
    }

    // Metoda pro vrácení novin na základě názvu. Pokud noviny neexistují, vypíše chybovou zprávu.
    public void returnNewspaper(String newspaperTitle) {
        Item item = items.get(newspaperTitle); // Získání novin z mapy na základě názvu
        if (item != null) { // Kontrola, zda noviny existují
            item.returnItem(); // Vrácení novin
        } else {
            System.out.println("Newspaper " + newspaperTitle + " does not exist in the library."); // Výpis chyby, pokud noviny neexistují
        }
    }

    // Metoda pro vytvoření rezervace
    public void reserveItem(User user, String title) throws ItemUnavailableException {
        Item item = items.get(title); // Získání položky z mapy na základě názvu
        if (item == null || !item.isAvailable()) { // Kontrola, zda je položka dostupná
            throw new ItemUnavailableException("Item " + title + " is not available."); // Vyhodí výjimku, pokud položka není dostupná
        }
        reservations.add(new Reservation(user, item)); // Přidání rezervace do seznamu
    }

    // Metoda pro zrušení rezervace
    public void cancelReservation(User user, String title) {
        reservations.removeIf(reservation -> reservation.getUser().equals(user) && reservation.getItem().getTitle().equals(title));
    }

        public void displayReservations() {
            for (Reservation reservation : reservations) {
                System.out.println("User: " + reservation.getUser().getName()
                        + ", Item: " + reservation.getItem().getTitle()
                        + ", Reservation Time: " + reservation.getReservationTime());
            }
        }
    }