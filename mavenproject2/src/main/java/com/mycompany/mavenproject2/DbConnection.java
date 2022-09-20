
package com.mycompany.mavenproject2;
import java.sql.*;

public class DbConnection {
    public static void main(String[] args) {
        connectDB();
    }
    
    public static Connection connectDB(){
        Connection con = null;
        try {
            //register jdbc driver, uncomment for later versions of JDK
            Class.forName("com.mysql.cj.jdbc.Driver");                        
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skillsinternationalschool","root","");
            
            
        } catch (Exception e) {
            System.out.println("Error Occurs while connecting to DB");
        }
        return con;
    }
}
