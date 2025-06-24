package polymorphism;
public class Heater extends AC {
    @Override
    void on(){
        System.out.println("Heater On");
    }
    void off(){
        System.out.println("Heater Off");
    }
}