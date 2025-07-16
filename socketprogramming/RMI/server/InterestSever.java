package socketprogramming.RMI;


import socketprogramming.rmi.InterestInterfaceimpl;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class InterestSever {
    public static void main(String[] args) throws Exception{
        try{
            Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println("Java RMI registry created.");
            InterestInterface obj = new InterestInterfaceimpl();
            registry.rebind("si", (Remote) obj);
            System.out.println("RMI server started");
        }catch(Exception e){
            System.out.println("Java RMI registry already exists:"+e.getMessage());
        }
    }
}