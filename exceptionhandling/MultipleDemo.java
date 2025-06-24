package exceptionhandling;

import java.util.Scanner;

public class MultipleDemo {
    public static void main(String[] args) {
        int[] a ={12,321,2,3,2,23,3};
        int b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of b:");
        b= in.nextInt();
        try {
            System.out.println("Enter the position of array you want to use:");
            int n = in.nextInt();
            int c = a[n] / b;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception Caught:"+e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception :" +e.getMessage());
        }catch(Exception e){
            System.out.println("Other exception :" +e.getMessage());
        }
    }
}
