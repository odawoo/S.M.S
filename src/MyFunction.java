
import java.sql.*;

public class MyFunction {
    
    public static int countData(String tableName)
    {
        
            int total = 0; 
            Connection con = DbConnector.getConnection();
            
         try {
             
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM "+ tableName);
            while(rs.next())
            {
                total = rs.getInt(1);
            }
            
                } catch (Exception ex) {
           System.out.println(ex);
                }
        return total;
    }
    
}
