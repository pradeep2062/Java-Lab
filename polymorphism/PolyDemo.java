package polymorphism;

import java.util.Scanner;

public class PolyDemo {
    public static void main(String[] args) {
        AC obj = new AC();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature of the room:");
        int temp = in.nextInt();
        obj.on();
        if (temp < 10) {
            obj = new Heater();
            obj.on();
            obj.off();
        }
        if (temp > 20) {
            obj = new Cooler();
            obj.on();
            obj.off();
        }
    }
}
