package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Server pro přijímání rezervací knih
public class LibraryServer {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10); // Vytvoření poolu vláken pro obsluhu klientů
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Serverový soket na portu 12345
            System.out.println("Server started. Waiting for clients...");

            while (true) {
                Socket socket = serverSocket.accept(); // Přijímání klientů
                executor.execute(new ClientHandler(socket)); // Spuštění nového vlákna pro obsluhu klienta
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); // Ukončení poolu vláken po ukončení práce
        }
    }

    // Vnitřní třída pro zpracování jednoho klienta
    static class ClientHandler implements Runnable {
        private final Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (
                    ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream())
            ) {
                // Přijetí rezervace a další logika...
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
