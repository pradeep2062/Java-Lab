package javalabcollege;

public class FirstThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<=10;i+=2){
            System.out.println("Even Numbers:"+i);
            try{
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
