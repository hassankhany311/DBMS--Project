/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Hassan Khany
 */
public class NewMain{
    Date currentDate= new Date();
    
   
    public static Connection connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull");
            System.out.println("connected");
            return cn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    
}
