import java.sql.*;
import java.swing.*;
import javax.swing.JOptionPane;

public class MySQLConnect {
    
    Connection conn = null;
    
    public static Connection ConnectDB(){
      
        try {
            // Loading the driver
            Class.forName("com.mysql.jdbc.Driver");
            
            // Establishing a Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","");
            JOptionPane.showMessageDialog(null, "Connection Successful");
            return conn;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    } 
    
}
