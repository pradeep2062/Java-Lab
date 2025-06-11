package inheritance.simple;
public class Child extends Parent{
    void childMethod(){
        System.out.println("This is from child class.");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod();
        c.childMethod();
    }
}
