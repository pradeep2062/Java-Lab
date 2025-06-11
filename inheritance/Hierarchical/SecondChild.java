package inheritance.Hierarchical;

public class SecondChild extends Parent{
        void secondChildMethod(){
            System.out.println("This is from second child class.");
        }

        public static void main(String[] args) {
            SecondChild c = new SecondChild();
            c.parentMethod();
            c.secondChildMethod();
        }
    }

