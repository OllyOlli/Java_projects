package cz.robodreams.javadeveloper.homeworks.hw20chat.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClientImpl implements Client {

    private String name;
    private PrintWriter out;
    private Scanner in;
    private Socket socket;

    public static void main(String[] args) {
        ClientImpl client = new ClientImpl();
        client.setName("Martin");
        client.connectToRoom("newRoomOneChat");
        client.sendMessage("message");
        client.killConnect(); // Zavřít spojení po odeslání zprávy
    }

    @Override
    public void connectToRoom(String room) {
        try {
            socket = new Socket("localhost", ServerImpl.PORT);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new Scanner(socket.getInputStream());
            out.println("[" + room + "] " + name + " connected.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        out.println(name + ": " + message);
    }

    @Override
    public List<String> getAllRoomMessage() {
        List<String> messages = new LinkedList<>();
        while (in.hasNextLine()) {
            messages.add(in.nextLine());
        }
        return messages;
    }

    @Override
    public void killConnect() {
        try {
            out.close();
            in.close();
            socket.close(); // Zavřít socket po ukončení spojení
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
