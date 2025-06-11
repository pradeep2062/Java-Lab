import java.util.Scanner;
class Grading {
    float marks;
    public void checkgrade(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the marks:");
        marks=in.nextFloat();
        if(marks>100||marks<0){
            System.out.println("Incorrect Input!!!");
        }else if(marks>=90){
            System.out.println("You obtained A grade.");
        }else if(marks>=85){
            System.out.println("You obtained A- grade.");
        }else if(marks>=80){
            System.out.println("You obtained B+ grade.");
        }else if(marks>=75){
            System.out.println("You obtained B grade.");
        }else if(marks>=70){
        System.out.println("You obtained B- grade.");
        }else if(marks>=65){
        System.out.println("You obtained C+ grade.");
        }else if(marks>=60){
        System.out.println("You obtained C grade.");
        }else if(marks>=55){
        System.out.println("You obtained C- grade.");
        }else if(marks>=50){
        System.out.println("You obtained D+ grade.");
        }else if(marks>=45){
        System.out.println("You obtained D grade.");
        }else{
                System.out.println("Unfortunately you fail in exam.");
        }
        in.close();
    }
    public static void main(String[] args){
        Grading std1 = new Grading();
        std1.checkgrade();
    }

}
