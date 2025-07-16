package javalabcollege;
public class SecondThread implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=10 ;i+=2){
            System.out.println("Odd Numbers:"+i);
            try{
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    }
