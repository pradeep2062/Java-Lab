package socketprogramming.RMI.chatsytem.client;
import socketprogramming.RMI.chatsytem.shared.ChatInterface;
import socketprogramming.RMI.chatsytem.shared.ClientCallback;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
public class ChatClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("27.34.71.64", 1099);
                    ChatInterface chat = (ChatInterface) registry.lookup("ChatService");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            // Callback object
            ClientCallback callback = new ClientCallback() {
                public void receive(String message) {
                    System.out.println(message);
                }
            };

            ClientCallback stub = (ClientCallback) UnicastRemoteObject.exportObject(callback, 0);
            chat.registerClient(stub);

            System.out.println("You can now start chatting!");
            while (true) {
                String msg = sc.nextLine();
                chat.sendMessage(name, msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
