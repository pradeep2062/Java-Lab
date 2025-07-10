package socketprogramming.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Locale;

public class UDPServer {
    public static void main(String[] args) throws  Exception {
        DatagramSocket ds = new DatagramSocket(9999);
        System.out.println("Server Ready...");
        while(true){
            byte[] dReceive = new byte[1024];
            DatagramPacket dpReceive = new DatagramPacket(dReceive, dReceive.length);
            ds.receive(dpReceive);

            String message = new String(dpReceive.getData(),0, dpReceive.getLength());
            System.out.println("Client:"+message);

            byte[] dSend = message.toUpperCase().getBytes();
            InetAddress ia = InetAddress.getByName("192.168.1.151");
            DatagramPacket dpSend = new DatagramPacket(dSend,dSend.length,ia,dpReceive.getPort());
            ds.send(dpSend);
        }
    }
}