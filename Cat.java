import java.util.Scanner;

public class Cat extends Animal {
    void meow() {
        System.out.println("Meow Meow ...");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the id , name , color of the animal:");
        int id = in.nextInt();
        in.nextLine();
        String name = in.nextLine();
        String color = in.nextLine();
        Cat obj = new Cat();
        obj.setMethod(id, name, color);
        obj.meow();
        obj.displayInformation();
        in.close();
    }
}
