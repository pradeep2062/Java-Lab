import java.util.Scanner;
public class VotingAgeCheck {
    int age=0;
    VotingAgeCheck(int age){
        this.age=age;
    }
   public  void check() {
        if (age < 0) {
            System.out.print("You entered incorrect age.");
        } else if (age < 18) {
            System.out.print("You are not eligible for voting.");
        } else {
            System.out.print("You are eligible for voting.");
        }
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your age:");
            int age = in.nextInt();
        VotingAgeCheck obj = new VotingAgeCheck(age);
        obj.check();
        in.close();
    }
}