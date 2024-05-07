package hw21junits;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibraryServer {
    private static final Logger LOGGER = Logger.getLogger(LibraryServer.class.getName());

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for clients...");

            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();
                executor.execute(new ClientHandler(socket));
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "An IO exception occurred", e);
        } finally {
            executor.shutdown();
        }
    }

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
                // Read from and write to the socket connection using inputStream and outputStream
                // For example, let's read a message from the client and send a response
                String message = (String) inputStream.readObject();
                System.out.println("Received message: " + message);
                outputStream.writeObject("Message received");
            } catch (IOException | ClassNotFoundException e) {
                LOGGER.log(Level.SEVERE, "An exception occurred", e);
            }
        }
    }
}
