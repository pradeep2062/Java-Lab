package javalabcollege.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.stream.StreamSupport;

public class DBCrud {
    public static Connection connect() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded Successfully");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","");
        System.out.println("Database Connected Successfully");
        return conn;
    }
    public static boolean createRecord(int id ,String full_name,String email,String mobile,Double salary) throws  Exception{
        boolean result = false  ;
        Connection conn = DBCrud.connect();
        String sql = "Insert into employee values (?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.setString(2,full_name);
        stmt.setString(3,email);
        stmt.setString(4,mobile);
        stmt.setDouble(5,salary);
        int res = stmt.executeUpdate();
        if(res>0){
            result = true;
        }
        return result;
    }
    public static boolean updateRecord(int id , String fullName, String email , String mobile , Double salary) throws Exception{
        boolean result = false;
        Connection conn = DBCrud.connect();
        String sql = "Update employee set full_name=?,email=?,mobile = ?,salary=? where id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1,fullName);
        stmt.setString(2,email);
        stmt.setString(3,mobile);
        stmt.setDouble(4,salary);
        stmt.setInt(5,id);
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
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Full Name: " + rs.getString("full_name"));
            System.out.println("Email: " + rs.getString("email"));
            System.out.println("Mobile: " + rs.getString("mobile"));
            System.out.println("Salary: " + rs.getDouble("salary"));
        }
        return rs;
    }
    public  static ResultSet readAllRecords() throws Exception{
        Connection conn = DBCrud.connect();
        String sql = "Select * from employee";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println("\nID: " + rs.getInt("id"));
            System.out.println("Full Name: " + rs.getString("full_name"));
            System.out.println("Email: " + rs.getString("email"));
            System.out.println("Mobile: " + rs.getString("mobile"));
            System.out.println("Salary: " + rs.getDouble("salary"));
        }
        return rs;
    }
}
