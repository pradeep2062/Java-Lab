package exceptionhandling;

import java.util.Scanner;
import exceptionhandling.MyExceptions;
public class MyException extends Exception{
    public static void main(String[] args) {
        float balance,withdrawal;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your balance:");
        balance = in.nextFloat();
        System.out.println("Enter the amount you wanna withdraw:");
        withdrawal = in.nextFloat();
        try{
            if(balance<withdrawal){
                throw new MyExceptions("Insufficient Amount.");
            }
            else if((balance-500)<withdrawal){
                throw new MyExceptions("The withdrawal amount must be less than 500 less than real balance.");
            }
            else{
                System.out.println("Withdrawn Successfully...");
                balance = balance - withdrawal;
                System.out.println("Remaining Balance :"+balance);
            }
        }catch (MyExceptions e){
            System.out.println("Exception Found:"+e.getMessage());
        }
    }
}
