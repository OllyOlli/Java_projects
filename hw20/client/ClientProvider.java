package cz.robodreams.javadeveloper.homeworks.hw20chat.client;

public class ClientProvider {

    public static Client getNewClientInstance() {
        // Vytvoření instance klienta dle potřeby
        return new ClientImpl();
    }

}
