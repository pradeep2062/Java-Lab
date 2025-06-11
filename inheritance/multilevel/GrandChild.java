package inheritance.multilevel;
public class GrandChild extends Child{
        void grandChildMethod(){
            System.out.println("This is from grand child class.");
        }

        public static void main(String[] args) {
            GrandChild c = new GrandChild();
            c.parentMethod();
            c.childMethod();
            c.grandChildMethod();
            c.grandChildMethod();
        }
}
