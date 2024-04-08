package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // vytvoření uživatelů
        User user1 = new User.Builder("Jan Novák").build();
        User user2 = new User.Builder("Václav Novotný").build();
        User user3 = new User.Builder("Pavel Dvořák").build();
        User user4 = new User.Builder("Vladimír Černý").build();
        User user5 = new User.Builder("Iva Modrá").build();
        User user6 = new User.Builder("Eva Nová").build();

        // vytvoření uživatelských kanálů
        UserChannel userChannel1 = new UserChannelImpl(user1.getName(), "", "");
        UserChannel userChannel2 = new UserChannelImpl(user2.getName(), "", "");
        UserChannel userChannel3 = new UserChannelImpl(user3.getName(), "", "");
        UserChannel userChannel4 = new UserChannelImpl(user4.getName(), "", "");
        UserChannel userChannel5 = new UserChannelImpl(user5.getName(), "", "");
        UserChannel userChannel6 = new UserChannelImpl(user6.getName(), "", "");

        // seznam uživatelů
        List<User> users = List.of(user1, user2, user3, user4, user5, user6);

        // vytvoření knih
        Book book1 = new Book("Kupec benátský", "William Shakespeare", Genre.BELETRIE, 5);
        Book book2 = new Book("Sen noci svatojánské", "William Shakespeare", Genre.BELETRIE, 3);
        Book book3 = new Book("Hamlet", "William Shakespeare", Genre.BELETRIE, 8);
        Book book4 = new Book("Učebnice jazyka Java", "Pavel Herout", Genre.ODBORNE, 10);
        Book book5 = new Book("Java a XML", "Pavel Herout", Genre.ODBORNE, 6);
        Book book6 = new Book("How Linux Works", "Ward Brian", Genre.ODBORNE, 4);
        Book book7 = new Book("Malý princ", "Antoine de Saint-Exupéry", Genre.POHADKA, 7);
        Book book8 = new Book("Honzíkova cesta", "Bohumil Říha", Genre.POHADKA, 2);
        Book book9 = new Book("Povídání o pejskovi a kočičce", "Josef Čapek", Genre.POHADKA, 6);

        // seznam novin
        Newspaper newspaper1 = new Newspaper("MF DNES", "Seriózně-populární tisk");
        Newspaper newspaper2 = new Newspaper("Hospodářské noviny", "Poloseriózní");
        Newspaper newspaper3 = new Newspaper("Deník", "Seriózně-populární tisk");
        Newspaper newspaper4 = new Newspaper("Deník N", "Poloseriózní");
        Newspaper newspaper5 = new Newspaper("E15", "Poloseriózní");

        // seznam časopisů
        Magazine magazine1 = new Magazine("IT systems");
        Magazine magazine2 = new Magazine("Security World");
        Magazine magazine3 = new Magazine("ChannelWorld");
        Magazine magazine4 = new Magazine("CIO");
        Magazine magazine5 = new Magazine("Security");

        // vytvoření knihovny
        Library<Item> library = new Library<>();

        // přidání položek do knihovny
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);
        library.addItem(book4);
        library.addItem(book5);
        library.addItem(book6);
        library.addItem(book7);
        library.addItem(book8);
        library.addItem(book9);
        library.addItem(newspaper1);
        library.addItem(newspaper2);
        library.addItem(newspaper3);
        library.addItem(newspaper4);
        library.addItem(newspaper5);
        library.addItem(magazine1);
        library.addItem(magazine2);
        library.addItem(magazine3);
        library.addItem(magazine4);
        library.addItem(magazine5);

        // přidání uživatelských kanálů pro všechny položky
        for (User user : users) {
            user.addUserChannel(userChannel1);
            user.addUserChannel(userChannel2);
            user.addUserChannel(userChannel3);
            user.addUserChannel(userChannel4);
            user.addUserChannel(userChannel5);
            user.addUserChannel(userChannel6);
        }

        // možnost půjčit položku
        Item itemToBorrow = library.getItems().get(0);
        User borrower = users.get(0);
        if (itemToBorrow.isAvailable()) {
            borrower.borrowItem(itemToBorrow);
        }

        // možnost rezervovat položku
        Item itemToReserve = library.getItems().get(1);
        User reserver = users.get(1);
        reserver.reserveItem(itemToReserve);

        // info o půjčce
        System.out.println("Borrowed items by " + borrower.getName() + ":");
        for (Item item : borrower.getBorrowedItems()) {
            System.out.println(item);
        }

        // info o rezervaci
        System.out.println("Reserved items by " + reserver.getName() + ":");
        for (Item item : reserver.getReservedItems()) {
            System.out.println(item);
        }

        // kontrola dostupnosti položky v knihovně
        Item itemToCheck = library.getItems().get(2);
        System.out.println("Availability of " + itemToCheck.getTitle() + ": " + itemToCheck.isAvailable());
    }
}
