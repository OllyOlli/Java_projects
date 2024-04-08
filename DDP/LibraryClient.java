package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

// Klient pro odesílání rezervací knih
public class LibraryClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); // Připojení na server
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            // Odeslání rezervace a další logika...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
