package polymorphism;

public class Cooler extends AC{
    @Override
    void on(){
        System.out.println("Cooler On");
    }
    void off(){
        System.out.println("Cooler Off");
    }
}
