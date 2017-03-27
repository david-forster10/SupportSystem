package helpline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HelpLine 
{
    ArrayList<String> User = new ArrayList<String>();
    
    public static void main(String[] args) 
    {
        if (DatabaseConnection() == false) 
        {
        JOptionPane.showMessageDialog(null, "Failed to connect to database", "Fatal Error", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
        }
        
        Navigation form = new Navigation();
        form.setVisible(true);   
    }
    
    public static boolean DatabaseConnection()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/helpline","user","user");
            Statement stmt = (Statement)con.createStatement();
            
            String sql = "Select * From Login";
            ResultSet rst;
            rst = stmt.executeQuery(sql);

            while (rst.next()) 
            {
                
            }
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(HelpLine.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
