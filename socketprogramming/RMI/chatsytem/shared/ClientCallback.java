package socketprogramming.RMI.chatsytem.shared;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientCallback extends Remote {
    void receive(String message) throws RemoteException;
}
