
import java.sql.*;


public class DbConnector {

     public static Connection getConnection(){
    Connection con = null;
         try{
             
             Class.forName("com.mysql.jdbc.Driver");             
             con = DriverManager.getConnection("jdbc:mysql://localhost/stdinfdb","root","");
             
         } catch(Exception ex) 
         {
             System.out.println("Error; " + ex);
         }
         
         return con;

    } 
     
}
