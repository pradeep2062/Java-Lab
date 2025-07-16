package socketprogramming.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args){
        try{
        DatagramSocket ds = new DatagramSocket();
            System.out.println("Client started on " + InetAddress.getLocalHost().getHostAddress());
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Server IP Address:");
            String serverIP = in.nextLine();
            System.out.println("Enter Message:");
            while (true) {
                byte[] dSend = in.nextLine().getBytes();
                InetAddress ia = InetAddress.getByName(serverIP);
            DatagramPacket dpSend = new DatagramPacket(dSend,dSend.length,ia,9999);
            ds.send(dpSend);
            byte[] dReceive = new byte[1024];
            DatagramPacket dpReceive = new DatagramPacket(dReceive,dReceive.length);
            ds.receive(dpReceive);
            String message = new String(dpReceive.getData(),0,dpReceive.getLength());
            System.out.println("Server:"+message);
        }
    }catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
}
