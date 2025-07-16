package socketprogramming.RMI.chatsytem.server;
import socketprogramming.RMI.chatsytem.shared.ChatInterface;
import socketprogramming.RMI.chatsytem.shared.ClientCallback;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
public class ChatServerImpl extends UnicastRemoteObject implements ChatInterface {
    private List<ClientCallback> clients = new ArrayList<>();

    protected ChatServerImpl() throws RemoteException {
        super();
    }

    public void sendMessage(String name, String message) throws RemoteException {
        String fullMessage = name + ": " + message;
        System.out.println(fullMessage);

        for (ClientCallback client : clients) {
            client.receive(fullMessage);
        }
    }

    public void registerClient(ClientCallback client) throws RemoteException {
        clients.add(client);
        client.receive(">> You have joined the chat");
    }
}
