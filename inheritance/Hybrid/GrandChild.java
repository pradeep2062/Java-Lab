package inheritance.Hybrid;

public class GrandChild extends Child implements InterfaceParent{
    void grandChildMethod(){
        System.out.println("This is from grand child class.");
    }
    @Override
    public void interfaceParentMethod() {
        System.out.println("This is from interface parent method.");
    }
    public static void main(String[] args) {
        GrandChild c = new GrandChild();
        c.parentMethod();
        c.childMethod();
        c.interfaceParentMethod();
        c.grandChildMethod();
    }
}
