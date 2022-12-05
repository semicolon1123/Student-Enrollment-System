import java.sql.*;
import javax.swing.*;

public class MySQLConnect {
    
    Connection conn = null;
    
    public static Connection ConnectDB(){
      
        try {
            // Loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establishing a Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","123");
            JOptionPane.showMessageDialog(null, "Connection Successful");
            return conn;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    } // End ConnectDB Method here
    
} // End MySQLConnect class here
