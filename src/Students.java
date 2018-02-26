
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Students {
    
    public void insertUpdateDeleteStudents(char operation, Integer id, String fname, String mname, String lname, String sex, String dobirth, String phone, String address){
        
        Connection con = DbConnector.getConnection();
        PreparedStatement ps;
        
       if(operation == 'i')
       {
            try {
                ps = con.prepareStatement("INSERT INTO students(first_name, middle_name, last_name, sex, date_of_birth, phone_number, address) VALUES (?,?,?,?,?,?,?)");
                ps.setString(1, fname);
                ps.setString(2, mname);
                ps.setString(3, lname);
                ps.setString(4, sex);
                ps.setString(5, dobirth);
                ps.setString(6, phone);
                ps.setString(7, address);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "New Student Added");
                }
                
            } catch (SQLException ex) {
                System.out.println(ex);
            }
       }
       
        if(operation == 'u')
       {
            try {
                ps = con.prepareStatement("UPDATE `students` SET `first_name`= ?,`middle_name`= ?,`last_name`= ?,`sex`= ?,`date_of_birth`= ?,`phone_number`= ?,`address`= ? WHERE `id`= ?");
                ps.setString(1, fname);
                ps.setString(2, mname);
                ps.setString(3, lname);
                ps.setString(4, sex);
                ps.setString(5, dobirth);
                ps.setString(6, phone);
                ps.setString(7, address);
                ps.setInt(8, id);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Student Details Updated");
                }
                
            } catch (SQLException ex) {
                System.out.println(ex);
            }
       }
        
        if(operation == 'd')
       {
            try {
                ps = con.prepareStatement("DELETE FROM `students` WHERE `id` = ?");
             
                ps.setInt(1, id);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Student Details Deleted");
                }
                
            } catch (SQLException ex) {
                System.out.println(ex);
            }
       }
        
    }
    
    public void fillStudentsJTable(JTable table, String valueToSearch)
    {
        
        Connection con = DbConnector.getConnection();
        PreparedStatement ps;
        try
        {
            
            ps = con.prepareStatement("SELECT * FROM `students` WHERE CONCAT(`first_name`, `middle_name`, `last_name`, `phone_number`, `address`)LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[8];
                row [0] = rs.getInt(1);
                row [1] = rs.getString(2);
                row [2] = rs.getString(3);
                row [3] = rs.getString(4);
                row [4] = rs.getString(5);
                row [5] = rs.getString(6);
                row [6] = rs.getString(7);
                row [7] = rs.getString(8);
                
                model.addRow(row);
                
            }
            
        } catch(SQLException ex)
        {
            System.out.println(ex);
        }
    }

}
