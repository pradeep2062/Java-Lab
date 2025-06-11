package inheritance.Hierarchical;
public class FirstChild extends Parent{
    void firstChildMethod(){
        System.out.println("This is from first child class.");
    }

    public static void main(String[] args) {
        FirstChild c = new FirstChild();
        c.parentMethod();
        c.firstChildMethod();
    }
}
