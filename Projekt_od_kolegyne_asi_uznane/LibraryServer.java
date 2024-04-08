package cz.robodreams.javadeveloper.project;

import cz.robodreams.javadeveloper.project.exceptions.ItemAlreadyBorrowedException;
import cz.robodreams.javadeveloper.project.exceptions.UserNotFoundException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class LibraryServer {

    static User<Item> user = new User.Builder<>("Chodnik")
            .address("Zilina")
            .mobileNumber("0901020104")
            .build();

    Book book1 = new Book(1L, "SQL", "Marek Laurencik", "9788027107742", Genre.TECHNICAL_LITERATURE);
    Book book2 = new Book(2L, "Dianetika", "L. Ron Hubbard", "9788776887155", Genre.BESTSELLERS);

    private static Library<Item> generateLibrary() {
        List<Item> items = new ArrayList<>();
        items.add(new Book(1L, "SQL", "Marek Laurencik", "9788027107742", Genre.TECHNICAL_LITERATURE));
        items.add(new Book(2L, "Dianetika", "L. Ron Hubbard", "9788776887155", Genre.BESTSELLERS));
        return new Library<>("Old Library", items, new ArrayList<>());
    }

    public static void main(String[] args) {
        Library<Item> library = generateLibrary();

        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            while (true) {
                new ClientHandler(serverSocket.accept(), library).start();
            }
        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
    }

    private static class ClientHandler extends Thread {
        private Socket socket;
        private Library<Item> library;

        public ClientHandler(Socket socket, Library<Item> library) {
            this.socket = socket;
            this.library = library;
        }

        public void run() {
            try {
                BufferedReader inputFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter outputToClient = new PrintWriter(socket.getOutputStream(), true);

                String echoString;
                while ((echoString = inputFromClient.readLine()) != null) {
                    if (echoString.equals("exit")) {
                        break;
                    } if (echoString.startsWith("RESERVATION: ")) {
                        System.out.println("Received reservation command: " + echoString);
                        String itemName = echoString.substring(13);
                        Item item = library.findItemById(Long.valueOf(itemName));
                        if (item != null) {
                            try {
                                library.reserveItem(item, user);
                                outputToClient.println("CONFIRMED: " + itemName);
                            } catch (UserNotFoundException | ItemAlreadyBorrowedException e) {
                                outputToClient.println("ERROR: " + e.getMessage());
                            }
                        } else {
                            outputToClient.println("Item not found");
                        }
                    } else if (echoString.startsWith("HELP")) {
                        String response = "Available items: ";
                        for (Item item : library.getAvailableItems()) {
                            response = response.concat(item.toString());
                        }
                        outputToClient.println(response);
                    } else {
                        outputToClient.println("UNKNOWN COMMAND");
                    }
                }
            } catch (IOException e) {
                System.out.println("Server exception " + e.getMessage());
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    // okej, snazili sme sa :)
                }
            }
        }
    }
}
