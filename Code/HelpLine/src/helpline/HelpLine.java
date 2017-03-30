package helpline;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    static ArrayList<String> User = new ArrayList<String>();
    static ArrayList<String> Password = new ArrayList<String>();
    
    public static void main(String[] args) 
    {
        if (DatabaseConnection() == false) 
        {
            JOptionPane.showMessageDialog(null, "Failed to connect to database", "Fatal Error", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        
        Login_Form login = new Login_Form();
        login.setVisible(true);   
    }

    public static boolean DatabaseConnection()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/helpline?allowMultiQueries=true","user","user");
            Statement stmt = (Statement)con.createStatement();
            
            String sql = "Select StaffID From Login; Select Password From Login;";
            boolean hasMoreResultSets = stmt.execute( sql );
            
            boolean bLeave = false;
            int table = 0;
            while ( hasMoreResultSets || stmt.getUpdateCount() != -1 || bLeave == true) 
            {  
                if ( hasMoreResultSets ) 
                {  
                    ResultSet rst = stmt.getResultSet();
                    if (table == 0)
                    {
                        while (rst.next()) 
                        {
                            User.add(rst.getString("StaffID"));
                        }
                        table += 1;
                    }
                    if (table == 1)
                    {
                        while (rst.next()) 
                        {
                            Password.add(rst.getString("Password"));
                        }
                    }
                }
                else 
                {
                    int queryResult = stmt.getUpdateCount();  
                    if ( queryResult == -1 ) 
                    { 
                        bLeave = true;  
                    }
                }
                hasMoreResultSets = stmt.getMoreResults();  
            }
            con.close();
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(HelpLine.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public static String SHA_Hash (String input)
    {
        try
        {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(input.getBytes(Charset.forName("UTF-8")),0,input.length());
            return new BigInteger(1, messageDigest.digest()).toString(16);
        }
        catch (NoSuchAlgorithmException nsgex)
        {
            Logger.getLogger(HelpLine.class.getName()).log(Level.SEVERE, null, nsgex);
            return null;
        }
    }
}