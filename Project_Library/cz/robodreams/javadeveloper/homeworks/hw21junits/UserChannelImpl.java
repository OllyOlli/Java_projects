package hw21junits;

// Implementace rozhraní UserChannel
public class UserChannelImpl implements UserChannel {
    private final String userName; // Jméno uživatele

    // Konstruktor pro inicializaci uživatelského kanálu s daným jménem uživatele
    public UserChannelImpl(String userName) {
        this.userName = userName;
    }

    // Metoda pro odeslání zprávy uživateli
    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent to " + userName + ": " + message);
    }
}
