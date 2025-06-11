public class EvenNumbers {
    public void output(){
        System.out.println("Total even numbers from 1000 to 200 is:");
        int n=1000;
        int i=0;
        while(n>200) {
           i++;
            n=n-2;
        }
        System.out.print(i);
    }
    public static void main(String... args){
        EvenNumbers obj = new EvenNumbers();
        obj.output();
    }
}
