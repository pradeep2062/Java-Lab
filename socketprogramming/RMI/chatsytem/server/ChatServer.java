package socketprogramming.RMI.chatsytem.server;
import socketprogramming.RMI.chatsytem.shared.ChatInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ChatInterface chat = new ChatServerImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("ChatService", chat);
            System.out.println("Chat server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
