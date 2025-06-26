import java.util.Scanner;
public class ArrayImplementation {
    public void output(int n){
        String[] stdName=new String[n];
        Scanner in =new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of student "+(i+1)+":");
            stdName[i]=in.nextLine();
        }
        System.out.println("The names which are stored in array are:");
        for (int i=0;i<n;i++){
            System.out.print(stdName[i]+"\t");
        }
    }
    public static void main(String... args){
        ArrayImplementation obj = new ArrayImplementation();
        System.out.println("Enter the number of names you wants to input:");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        obj.output(n);
    }
}
