package hw20chat.server;

public class ServerProvider {

    public static Server getInstance() {
        // Vytvoření instance serveru dle potřeby
        return new ServerImpl();
    }

}
