package hw20chat.client;

import java.util.List;

public interface Client {
    void connectToRoom(String room);
    void setName(String name);
    void sendMessage(String message);
    List<String> getAllRoomMessage();
    void killConnect();
}
