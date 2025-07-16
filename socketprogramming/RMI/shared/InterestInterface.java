package socketprogramming.RMI.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterestInterface extends Remote {
    public double calculate(double p, double t, double r) throws RemoteException;
}
