//WAP to read and write from and to file
//Q1
//2082-03-10 lab 5
package javalabcollege;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutput {
   static void writeToFile(String filename , String text){
        try {
            FileOutputStream fOut = new FileOutputStream(filename);
            fOut.write(text.getBytes());
            fOut.close();
            System.out.println("Written Successfully");
        }catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }
    static void readFromFile(String filename){
        try{
            FileInputStream fis = new FileInputStream(filename);
            int c ;
            while((c=fis.read())!=-1){
                System.out.print((char)c);
            }
            fis.close();
            System.out.println("\nRead Successfully");
        }catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }

    }

    public static void main(String[] args) {
        writeToFile("Student.txt","Pradeep Pant");
        readFromFile("Student.txt");
    }
}
