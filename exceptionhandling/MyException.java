package exceptionhandling;
import java.util.Scanner;
public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
    public static void main(String[] args) {
        float balance,withdrawal;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your balance:");
        balance = in.nextFloat();
        System.out.println("Enter the amount you wanna withdraw:");
        withdrawal = in.nextFloat();
        try{
            if(balance<withdrawal){
                throw new MyException("Insufficient Amount.");
            }
            else if((balance-500)<withdrawal){
                throw new MyException("The withdrawal amount must be less than 500 less than real balance.");
            }
            else{
                System.out.println("Withdrawn Successfully...");
                balance = balance - withdrawal;
                System.out.println("Remaining Balance :"+balance);
            }
        } catch (MyException e) {
            System.out.println("Exception Found:"+e.getMessage());
        }
    }
}
