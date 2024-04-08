package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread {
    private final Socket socket; // Soket pro komunikaci s klientem

    public Echoer(Socket socket) {
        this.socket = socket; // Inicializace soketu
    }

    @Override
    public void run() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Čtení ze vstupu klienta
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true); // Zápis na výstup klienta

            while (true) {
                String echoString = input.readLine(); // Přečtení vstupu od klienta
                System.out.println("Received client input: " + echoString); // Výpis přijatého vstupu od klienta
                if (echoString.equals("exit")) { // Pokud klient zadá "exit", ukončíme smyčku
                    break;
                }

                if (echoString.startsWith("RESERVATION: ")) { // Pokud klient zadá "RESERVATION: ", zpracujeme rezervaci
                    // zpracování rezervace
                    output.println("Reservation confirmed"); // Potvrzení rezervace
                } else {
                    output.println("Unknown command"); // Pokud klient zadá jiný příkaz, oznámíme mu, že příkaz není rozpoznán
                }
            }
        } catch (IOException e) { // Zachycení výjimky IOException
            System.out.println("Oops: " + e.getMessage()); // Výpis chybové zprávy
        } finally {
            try {
                socket.close(); // Uzavření soketu
            } catch (IOException e) {
                // ignore
            }
        }
    }
}
