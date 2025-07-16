package javalabcollege;

public class ThreadDemo {
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        ft.setPriority(Thread.MAX_PRIORITY);
        ft.start();
        SecondThread st = new SecondThread();
        Thread t = new Thread(st);
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
    }
}
