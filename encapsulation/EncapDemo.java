package encapsulation;

public class EncapDemo {
    public static void main(String[] args) {
        StudentInfo s = new StudentInfo("Rajesh", "Kumar", 123456);
        System.out.println(s.getName());
        System.out.println(s.getAddress());
        System.out.println(s.getRollNo());
    }
}
