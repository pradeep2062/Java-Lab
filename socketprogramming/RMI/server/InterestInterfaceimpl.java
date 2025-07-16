package socketprogramming.RMI.server;

import socketprogramming.RMI.shared.InterestInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class InterestInterfaceimpl extends UnicastRemoteObject implements InterestInterface {
    public  InterestInterfaceimpl() throws RemoteException {
        super(0);
    }
    public double calculate(double p,double t, double r){
        return ((p*t*r)/100);
    }
}
