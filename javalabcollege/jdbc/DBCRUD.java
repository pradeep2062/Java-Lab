package javalabcollege.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBCrud {
    public static Connection connect() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded Successfully");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","");
        System.out.println("Database Connected Successfully");
        return conn;
    }
    public static boolean createRecord(int id ,String first_name,String last_name,String email,String mobile,Double salary) throws  Exception{
        boolean result = false  ;
        Connection conn = DBCrud.connect();
        String sql = "Insert into employee values (?,?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.setString(2,first_name);
        stmt.setString(3,last_name);
        stmt.setString(4,email);
        stmt.setString(5,mobile);
        stmt.setDouble(6,salary);
        int res = stmt.executeUpdate();
        if(res>0){
            result = true;
        }
        return result;
    }
    public static boolean updateRecord(int id , String firstName,String lastName, String email , String mobile , Double salary) throws Exception{
        boolean result = false;
        Connection conn = DBCrud.connect();
        String sql = "Update employee set first_name =?,second_name=?,email=?,mobile = ?,salary=? where id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1,firstName);
        stmt.setString(2,lastName);
        stmt.setString(3,email);
        stmt.setString(4,mobile);
        stmt.setDouble(5,salary);
        stmt.setInt(6,id);
        int res = stmt.executeUpdate();
        if (res>0){
            result = true;
        }
        return result;
    }
    public static boolean deleteRecord(int id ) throws Exception{
        boolean result = false;
        Connection conn = DBCrud.connect();
        String sql = "Delete from employee where id = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1,id);
                int res = stmt.executeUpdate();
                if(res>0){
                    result = true;
                }
        return result;
    }
    public  static ResultSet readOneRecord(int id) throws Exception{
        Connection conn = DBCrud.connect();
        String sql = "Select * from employee where id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1,id);
        ResultSet rs = stmt.executeQuery();
        return rs;
    }
    public  static ResultSet readAllRecord() throws Exception{
        Connection conn = DBCrud.connect();
        String sql = "Select * from employee";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        return rs;
    }

    public static void main(String[] args) {
        try{
            //
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
