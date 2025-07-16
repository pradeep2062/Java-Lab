package socketprogramming.RMI.client;

import socketprogramming.RMI.shared.InterestInterface;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class InterestClient {
    public static void main(String[] args) throws RemoteException {
        try{
            Registry registry = LocateRegistry.getRegistry("192.168.1.126",1099);
            InterestInterface obj = (InterestInterface) registry.lookup("si");
            double p1 = obj.calculate(1000,2,12);
            System.out.println("Interest:"+p1);
        }catch(Exception e){
            System.out.println("Client Error:"+e.getMessage());
        }
    }
}
