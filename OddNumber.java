public class OddNumber {
    public void check(){
        int n=1;
        int count=0;
        System.out.println("Total odd numbers from 1 to 50 is:");

        do{
            count++;
            n=n+2;
        }while(n<50);
        System.out.print(count);
    }
    public static void main(String... args){
        OddNumber obj = new OddNumber();
        obj.check();
    }
}
