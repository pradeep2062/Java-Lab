package socketprogramming.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(1234);
            System.out.println("Server Ready...");
            while (true) {
                Socket socket = server.accept();
                System.out.println("Client is Ready:");
                DataInputStream din = new DataInputStream(socket.getInputStream());
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                Scanner in = new Scanner(System.in);
                while(true){
                    System.out.println("Client:"+ din.readUTF() + "\n");
                    System.out.println("Write  reply:");
                    dos.writeUTF(in.nextLine());
                }
            }
        } catch (Exception e) {
            System.out.println("Server Error:"+ e.getMessage());
        }
    }
}