package javalabcollege.interfaceDemo;
public class Car implements ModernEngine {
    float mileage,capacity;
    Car(float mileage, float capacity){
        this.mileage = mileage;
        this.capacity = capacity;
    }

    @Override
    public void mileAge() {
        System.out.println("The mileage of the car is " + mileage);
    }
    @Override
    public void capacity() {
        System.out.println("The capacity(in L) is " +capacity);
    }
    @Override
    public void on() {
        System.out.println("Car is on");
    }
    @Override
    public void off() {
        System.out.println("Car is off");
    }
    public static void main(String[] args) {
        Car c = new Car(30,40);
        c.on();
        c.mileAge();
        c.capacity();
        c.off();
    }
}

