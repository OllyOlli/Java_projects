package cz.robodreams.javadeveloper.homeworks.hw21junits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class LibraryClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000); // Vytvoření soketu pro připojení ke serveru
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Čtení ze vstupního proudu soketu
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true); // Zápis do výstupního proudu soketu
            Scanner scanner = new Scanner(System.in); // Inicializace skeneru pro čtení vstupu od uživatele

            while (true) {
                System.out.println("Enter your message: "); // Vyzvěte uživatele k zadání zprávy
                String message = scanner.nextLine(); // Přečtěte vstup od uživatele
                writer.println(message); // Pošlete zprávu serveru
                String response = reader.readLine(); // Přečtěte odpověď ze serveru
                System.out.println("Server response: " + response); // Vypište odpověď ze serveru
                if (message.equals("exit")) break; // Pokud je zpráva "exit", ukončete smyčku
            }
        } catch (IOException e) {
            e.printStackTrace(); // Vypíšte výjimku, pokud dojde k chybě v komunikaci se serverem
        }
    }
}
