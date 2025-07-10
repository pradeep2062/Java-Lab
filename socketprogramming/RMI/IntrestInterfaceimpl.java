package socketprogramming.rmi;

import socketprogramming.RMI.IntrestInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IntrestInterfaceimpl extends UnicastRemoteObject implements IntrestInterface {
    public  IntrestInterfaceimpl() throws RemoteException {
        super(0);
    }
    public double calculate(double p,double t, double r){
        return (p*t*r);
    }
}
