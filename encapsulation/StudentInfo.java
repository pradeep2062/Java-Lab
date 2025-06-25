package encapsulation;

public class StudentInfo {
    private String name, address;
    private int rollNo;
    public StudentInfo(String name, String address, int rollNo){
        this.name = name;
        this.address = address;
        this.rollNo = rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getRollNo(){
        return rollNo;
    }
}
