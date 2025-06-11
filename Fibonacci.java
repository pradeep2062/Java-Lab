import java.util.Scanner;
public class Fibonacci {
    public void output(int n){
        System.out.println("Fibonacci Series:");
        System.out.print("0\t1\t");
        long a=0;
        long b=1;
        for(int i=0;i<n-2;i++){
            b=b+a;
            a=b-a;
            System.out.print(b+"\t");
        }
    }
    public static void main(String... args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n =in.nextInt();
        Fibonacci obj = new Fibonacci();
        obj.output(n);
        in.close();
    }
}
