package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Vytvoření knihovny
        Library library = new Library();
        // Přidání knih do knihovny
        library.addBook(new Book("Kupec benátský", "William Shakespeare", Genre.BELETRIE));
        library.addBook(new Book("Sen noci svatojánské", "William Shakespeare", Genre.BELETRIE));
        library.addBook(new Book("Hamlet", "William Shakespeare", Genre.BELETRIE));
        library.addBook(new Book("Mackbet", "William Shakespeare", Genre.BELETRIE));

        library.addBook(new Book("Učebnice jazyka Java", "Pavel Herout", Genre.ODBORNE));
        library.addBook(new Book("Java a XML", "Pavel Herout", Genre.ODBORNE));
        library.addBook(new Book("How Linux Works", "Ward Brian", Genre.ODBORNE));
        library.addBook(new Book("Kali Linux Penetration Testing Bible", "Unknown", Genre.ODBORNE));

        library.addBook(new Book("Malý princ", "Antoine de Saint-Exupéry", Genre.POHADKA));
        library.addBook(new Book("Honzíkova cesta", "Bohumil Říha", Genre.POHADKA));
        library.addBook(new Book("Povídání o pejskovi a kočičce", "Josef Čapek", Genre.POHADKA));

        // Výpis všech knih v knihovně
        library.displayItems();

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
        System.out.println("Users:");
        Arrays.stream(users).forEach(System.out::println);
    }
}