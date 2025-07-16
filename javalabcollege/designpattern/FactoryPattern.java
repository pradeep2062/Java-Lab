package javalabcollege.designpattern;

import java.util.Scanner;

public class FactoryPattern {
    public static Shape getInstance(int sides){
        if(sides == 3){
            return new Triangle();
        } else if (sides == 4) {
            return new Rectangle();
        } else if (sides == 5) {
            return new Pentagon();
        }
        else {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter sides:");
        Scanner in = new Scanner(System.in);
        try{
        int n = in.nextInt();
         Shape sp = getInstance(n);
         sp.draw();
    }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
