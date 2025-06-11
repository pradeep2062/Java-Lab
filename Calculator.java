import java.util.Scanner;
public class Calculator {
    int first,second;
    Calculator(){
        first=1;
        second=1;
    }
    Calculator(int a,int b){
        this.first= a;
        this.second= b;
    }
    void add(){
        System.out.println("The sum is "+ (first+second));
    }
    void sub(){
        System.out.println("The difference is " + (first - second));
    }
    void mul(){
        System.out.println("The product is "+  (first*second));
    }
    void div(){
        System.out.println("The division is "+  (first/second));
    }
    void mod(){
        System.out.println("The modulus division  is "+  (first%second));
    }
    public static void main(String[] args){
        Calculator obj1 = new Calculator();
        obj1.add();
        obj1.sub();
        obj1.mul();
        obj1.div();
        obj1.mod();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int a = scanner.nextInt();
        int b=scanner.nextInt();
        Calculator obj2 = new Calculator(a,b);
        obj2.add();
        obj2.sub();
        obj2.mul();
        obj2.div();
        obj2.mod();
        scanner.close();
    }
}
