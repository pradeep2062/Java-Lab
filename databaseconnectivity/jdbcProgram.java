package databaseconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcProgram {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost:3306/jdbcdemo";
    static final String USER = "root";
   static final String PASS = "";
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;
// Register JDBC driver
        Class.forName(JDBC_DRIVER);
        // Open a connection
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        //create a statement object
        System.out.println("Creating Statement...");
        stmt = conn.createStatement();
        //execute sql statement
        String sql = "Select * from information";
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println("ID \t NAME \t ADDRESS");
        while(rs.next()){
            // print the values here
            System.out.println(rs.getInt("id")+ "\t"+rs.getString("name")+ "\t "+rs.getString("address"));
        }
        rs.close();
        conn.close();
        stmt.close();
    }
}
