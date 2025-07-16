package socketprogramming.RMI.chatsytem.shared;
import socketprogramming.RMI.chatsytem.shared.ClientCallback;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatInterface extends Remote {
    void sendMessage(String name, String message) throws RemoteException;
    void registerClient(ClientCallback client) throws RemoteException;
}
