package cz.robodreams.javadeveloper.project;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        User<Item> user1 = new User.Builder<>("Chodnik")
                .address("Zilina")
                .mobileNumber("0901020104")
                .build();
        User<Item> user2 = new User.Builder<>("Dano Drevo")
                .address("Puchov")
                .mobileNumber("0901020105")
                .build();
        UserChannel<Item> user1Channel = new UserChannelImpl<>(user1);
        UserChannel<Item> user2Channel = new UserChannelImpl<>(user2);

        List<User<Item>> users = new ArrayList<>(Arrays.asList(user1, user2));

        System.out.println("Users in Library: ");

        System.out.println("User1: " + user1.getName() + ", " + user1.getAddress() + ", " + user1.getMobileNumber());
        System.out.println("User2: " + user2.getName() + ", " + user2.getAddress() + ", " + user2.getMobileNumber());


        System.out.println();

        Book book1 = new Book(1L, "SQL", "Marek Laurencik", "9788027107742", Genre.TECHNICAL_LITERATURE);
        Book book2 = new Book(2L, "Dianetika", "L. Ron Hubbard", "9788776887155", Genre.BESTSELLERS);
        Book book3 = new Book(3L, "Bublina", "Anders De La Motte", "9788055131832", Genre.THRILLER);
        Book book4 = new Book(4L, "Reckoning", "Lili St. Crow", "9781595143952", Genre.FANTASY);
        Book book5 = new Book(5L, "Sum", "Anders De La Motte", "9788055131825", Genre.NOVEL);
        Book book6 = new Book(6L, "Tazsi ako nebo", "Charles R. Cross", "9788082302205", Genre.BIOGRAPHY);
        List<Item> books = new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5, book6));

        System.out.println("Books in the Library: ");
        for (Item book : books) {
            System.out.println(book);
        }

        System.out.println();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);


        Magazine magazine1 = new Magazine(7L, "Publisher 1", "Magazine Name 1", LocalDate.now());
        Magazine magazine2 = new Magazine(8L, "Publisher 2", "Magazine Name 2", LocalDate.now());
        List<Item> magazines = new ArrayList<>();

        magazines.add(magazine1);
        magazines.add(magazine2);
        System.out.println("Magazines in the Library: ");
        for (Item magazine : magazines) {
            System.out.println(magazine);
        }

        System.out.println();

        Newspaper newspaper1 = new Newspaper(9L, "Publisher 1", "Headline 1", LocalDate.now());
        Newspaper newspaper2 = new Newspaper(10L, "Publisher 2", "Headline 2", LocalDate.now());
        List<Item> newspapers = new ArrayList<>();

        newspapers.add(newspaper1);
        newspapers.add(newspaper2);
        System.out.println("Newspapers in the Library: ");
        for (Item newspaper : newspapers) {
            System.out.println(newspaper);
        }

        List<Item> items = new ArrayList<>();
        items.addAll(books);
        items.addAll(magazines);
        items.addAll(newspapers);


        Library<Item> library = new Library<>("Old Library", items, users);

        for (Item item : items) {
            library.addUserChannel(item, user1Channel);
            library.addUserChannel(item, user2Channel);
        }


        library.borrowItem(book1, user1);
        library.borrowItem(magazine1, user1);
        library.borrowItem(newspaper1, user1);
        library.reserveItem(newspaper2, user2);


        System.out.println();

        System.out.println("Borrowed items: ");

        System.out.println("User1: " + user1.getName() + " borrowed book: " + book1.getTitle());
        System.out.println("User1: " + user1.getName() + " borrowed magazine: " + magazine1.getMagazineName());
        System.out.println("User1: " + user1.getName() + " borrowed newspaper: " + newspaper1.getHeadline());
        System.out.println("User2: " + user2.getName() + " reserved newspaper: " + newspaper2.getHeadline());
        System.out.println();

        System.out.println("Is book1 available? " + book1.isAvailable());
        System.out.println("Is magazine2 available? " + magazine2.isAvailable());


        System.out.println("========");

        System.out.println("User1 has borrowed items: " + user1.hasBorrowedItems());
        System.out.println("User2 has borrowed items: " + user2.hasBorrowedItems());
        System.out.println("User1 has reserved items: " + user1.hasReservedItems());
        System.out.println("User2 has reserved items: " + user2.hasReservedItems());

        System.out.println("User1 count of borrowed items: " + user1.countBorrowedItems());
        System.out.println("User2 count of borrowed items: " + user2.countBorrowedItems());
        System.out.println("User1 count of reserved items: " + user1.countReservedItems());
        System.out.println("User2 count of reserved items: " + user2.countReservedItems());

        System.out.println();

        System.out.println("Available items: ");
        library.printAvailableItems();
    }
}

