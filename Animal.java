public class Animal {
    int id;
    String name,color;
    void setMethod(int id ,String name,String color){
        this.id=id;
        this.name=name;
        this.color=color;
    }
    void displayInformation(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Color:"+color);
    }
}
