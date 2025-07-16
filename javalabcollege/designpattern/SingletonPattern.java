package javalabcollege.designpattern;

public class SingletonPattern {
    private static SingletonPattern instance;
    public static SingletonPattern getInstance(){
        if(instance == null){
            instance = new SingletonPattern();
        }
        return instance;
    }
    public void greeting(){
        System.out.println("Greeting to you!");
    }

    public static void main(String[] args) {
        SingletonPattern sp = SingletonPattern.getInstance();
        System.out.println(sp);
        sp.greeting();
        SingletonPattern sp1 = SingletonPattern.getInstance();
        System.out.println(sp1);
    }
}
