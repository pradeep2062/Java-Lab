package inheritance.multiple;
public class Child extends SecondParent implements FirstParent {
    void childMethod(){
        System.out.println("This is from child class.");
    }
    public void firstParentMethod(){
        System.out.println("This is from first parent class.");
    }
        public static void main(String[] args) {
            Child c = new Child();
            c.firstParentMethod();
            c.secondParentMethod();
            c.childMethod();
        }
    }
