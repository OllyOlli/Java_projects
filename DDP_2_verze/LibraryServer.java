package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LibraryServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) { // Vytvoření serverového soketu na portu 5000
            while (true) {
                Socket clientSocket = serverSocket.accept(); // Přijetí připojení klienta
                new ClientHandler(clientSocket).start(); // Vytvoření a spuštění nového vlákna pro obsluhu klienta
            }
        } catch (IOException e) {
            e.printStackTrace(); // Vypíše chybu v případě, že dojde k problému při komunikaci se serverem
        }
    }

    private static class ClientHandler extends Thread {
        private final Socket clientSocket;

        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            try {
                // implementace obsluhy klienta
            } catch (IOException e) {
                e.printStackTrace(); // Vypíše chybu v případě, že dojde k problému při komunikaci se serverem
            } finally {
                try {
                    clientSocket.close(); // Uzavře soket pro klienta
                } catch (IOException e) {
                    e.printStackTrace(); // Vypíše chybu v případě, že dojde k problému při uzavírání soketu
                }
            }
        }
    }
}
