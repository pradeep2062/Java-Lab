package socketprogramming.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(9999);
        System.out.println("Server Ready...");
        while (true) {
            byte[] dReceive = new byte[1024];
            DatagramPacket dpReceive = new DatagramPacket(dReceive, dReceive.length);
            ds.receive(dpReceive);

            String message = new String(dpReceive.getData(), 0, dpReceive.getLength());
            System.out.println("Client:" + message);

            byte[] dSend = message.toUpperCase().getBytes();
            InetAddress clientAddress = dpReceive.getAddress();
            int clientPort = dpReceive.getPort();
            DatagramPacket dpSend = new DatagramPacket(dSend, dSend.length, clientAddress, clientPort);
            ds.send(dpSend);
        }
    }
}