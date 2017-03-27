/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanilla
 */
public class HelpLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        if (DatabaseConnection() == false) 
        {
        JOptionPane.showMessageDialog(null, "Failed to connect to database", "Fatal Error", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
        }
        
        Login_Form form = new Login_Form();
        form.setVisible(true);   
    }
    
    public static boolean DatabaseConnection()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/helpline","user","user");
            Statement stmt = (Statement)con.createStatement();
            
            String sql = "Select * From 'customer reporting form'";
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
