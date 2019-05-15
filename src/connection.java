import java.sql.*;
import javax.swing.JOptionPane;

public class connection {
    Connection conn;
    public static Connection connectDB()
    {
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
    
    return conn;
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null,e);
    return null;
    }
    }
}
