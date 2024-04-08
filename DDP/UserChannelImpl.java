package cz.robodreams.javadeveloper.homeworks.hw21junits;

// Implementace uživatelského kanálu
public class UserChannelImpl implements UserChannel {
    private String userName;

    // Konstruktor pro inicializaci uživatelského kanálu
    public UserChannelImpl(String userName) {
        this.userName = userName;
    }

    // Metoda pro odeslání zprávy
    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent to " + userName + ": " + message);
    }
}

