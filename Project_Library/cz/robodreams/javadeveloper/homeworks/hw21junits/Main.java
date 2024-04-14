package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Vytvoření instance knihovny
        Library library = new Library();

        // Přidání knih do knihovny
        library.addBook(new Book("Kupec benátský", "William Shakespeare", Genre.BELETRIE, 5));
        library.addBook(new Book("Sen noci svatojánské", "William Shakespeare", Genre.BELETRIE, 5));
        library.addBook(new Book("Hamlet", "William Shakespeare", Genre.BELETRIE, 5));
        library.addBook(new Book("Mackbet", "William Shakespeare", Genre.BELETRIE, 5));

        library.addBook(new Book("Učebnice jazyka Java", "Pavel Herout", Genre.ODBORNE, 5));
        library.addBook(new Book("Java a XML", "Pavel Herout", Genre.ODBORNE, 5));
        library.addBook(new Book("How Linux Works", "Ward Brian", Genre.ODBORNE, 5));
        library.addBook(new Book("Kali Linux Penetration Testing Bible", "Unknown", Genre.ODBORNE, 5));

        library.addBook(new Book("Malý princ", "Antoine de Saint-Exupéry", Genre.POHADKA, 5));
        library.addBook(new Book("Honzíkova cesta", "Bohumil Říha", Genre.POHADKA, 5));
        library.addBook(new Book("Povídání o pejskovi a kočičce", "Josef Čapek", Genre.POHADKA, 5));


        // Výpis všech knih v knihovně
        library.displayBooks();

        // Vytvoření časopisů
        Magazine magazine1 = new Magazine("Forbes", "Forbes Media", 10);
        Magazine magazine2 = new Magazine("Time", "Time Inc.", 5);

        // Přidání časopisů do knihovny
        library.addMagazine(magazine1);
        library.addMagazine(magazine2);

        // Výpis všech časopisů v knihovně
        library.displayMagazines();

        // Vytvoření novin
        Newspaper newspaper1 = new Newspaper("The New York Times", "Daily", 20);
        Newspaper newspaper2 = new Newspaper("The Washington Post", "Daily", 15);

        // Přidání novin do knihovny
        library.addNewspaper(newspaper1);
        library.addNewspaper(newspaper2);

        // Výpis všech novin v knihovně
        library.displayNewspapers();

        // Vytvoření uživatelů
        User[] users = {
                new User("Jan Novák"),
                new User("Václav Novotný"),
                new User("Pavel Dvořák"),
                new User("Vladimír Černý"),
                new User("Iva Modrá"),
                new User("Eva Nová")
        };

        // Výpis uživatelů
        System.out.println("Uživatelé:");
        Arrays.stream(users).forEach(user -> System.out.println(user.getName()));
    }
}