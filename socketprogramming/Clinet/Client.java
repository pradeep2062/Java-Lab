package socketprogramming.Clinet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            Socket server = new Socket("localhost",1234);
            System.out.println("Client Ready...");
            DataInputStream din = new DataInputStream(server.getInputStream());
            DataOutputStream dos = new DataOutputStream(server.getOutputStream());
            Scanner in = new Scanner(System.in);
            System.out.println("Write a message:");
            while(true){
                dos.writeUTF(in.nextLine());
                dos.flush();
                System.out.println("Server:"+din.readUTF()+ "\n");
            }
        }catch(Exception e){
            System.out.println("Client Error:"+ e.getMessage());
        }
    }
}
