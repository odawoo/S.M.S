
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ManageStudents extends javax.swing.JFrame {

    Students std = new Students();
    DefaultTableModel model;
    
    public ManageStudents() {
        initComponents();
        setLocationRelativeTo(null);
        std.fillStudentsJTable(StudentDetails, "");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        model = (DefaultTableModel)StudentDetails.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmname = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtpnumber = new javax.swing.JTextField();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        btnRemove = new javax.swing.JButton();
        DatePicker = new org.jdesktop.swingx.JXDatePicker();
        btnEdit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        StudentDetails = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnAddStudent = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 252, 192));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 26)); // NOI18N
        jLabel1.setText("Manage Students");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setText("First Name : ");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setText("Last Name : ");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setText("Middle Name : ");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setText("Sex : ");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel6.setText("Date Of Birth : ");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setText("Phone Number : ");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel8.setText("Address : ");

        txtmname.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        txtfname.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        txtlname.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnameActionPerformed(evt);
            }
        });

        txtpnumber.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        txtpnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnumberActionPerformed(evt);
            }
        });
        txtpnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpnumberKeyTyped(evt);
            }
        });

        rbmale.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        rbmale.setText("Male");

        rbfemale.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        rbfemale.setText("Female");

        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        btnRemove.setBackground(new java.awt.Color(55, 150, 118));
        btnRemove.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cancel-32.png"))); // NOI18N
        btnRemove.setText("REMOVE");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(55, 150, 118));
        btnEdit.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-32.png"))); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        StudentDetails.setBackground(new java.awt.Color(252, 252, 192));
        StudentDetails.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        StudentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Second Name", "Last Name", "Sex", "Date of Birth", "Phone Number", "Address"
            }
        ));
        StudentDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentDetailsMouseClicked(evt);
            }
        });
        StudentDetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                StudentDetailsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(StudentDetails);

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel9.setText("ID : ");

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        btnAddStudent.setBackground(new java.awt.Color(55, 150, 118));
        btnAddStudent.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        btnAddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-plus-32.png"))); // NOI18N
        btnAddStudent.setText("ADD");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel10.setText("Enter Value To Search : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rbmale, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(rbfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtlname)
                            .addComponent(txtmname)
                            .addComponent(txtfname)
                            .addComponent(txtpnumber)
                            .addComponent(DatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtID)))
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnRemove)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(50, 50, 50)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtmname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbmale)
                            .addComponent(rbfemale))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtpnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddStudent)
                            .addComponent(btnEdit)
                            .addComponent(btnRemove)))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

    private void txtpnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnumberActionPerformed

    }//GEN-LAST:event_txtpnumberActionPerformed

    private void txtpnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpnumberKeyTyped

        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }

    }//GEN-LAST:event_txtpnumberKeyTyped

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
       
        if(txtID.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Select A Student");
        } else 
        {
            int id = Integer.valueOf(txtID.getText());
        std.insertUpdateDeleteStudents('d', id, null, null, null, null, null, null, null);
        std.fillStudentsJTable(StudentDetails, "");
        StudentDetails.setModel(new DefaultTableModel(null, new Object[]{"ID","First Name","Middle Name","Last Name","Sex","Date Of Birth","Phone Number","Address"}));
        std.fillStudentsJTable(StudentDetails, txtSearch.getText());
        MainForm.lblStudentCount.setText("Number Of Students ; "+Integer.toString(MyFunction.countData("students")));
        
        txtID.setText("");
        txtfname.setText("");
        txtmname.setText("");
        txtlname.setText("");
        txtaddress.setText("");
        txtpnumber.setText("");
        rbmale.setSelected(false);
        rbfemale.setSelected(false);
        DatePicker.setDate(null);
        }
        
    }//GEN-LAST:event_btnRemoveActionPerformed
    
    public boolean verifText(){
        if(txtID.getText().equals("") || txtfname.getText().equals("") || txtlname.getText().equals("") || 
           txtpnumber.getText().equals("") || txtaddress.getText().equals("") || DatePicker.getDate() == null)
        {
            JOptionPane.showMessageDialog(null, "Please Fill In All The Required Fields");
            return false;
        } else if(DatePicker.getDate().compareTo(new Date()) > 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter A Date Lower Than The Current Date");
                    return false;
                } 
        else {
                    return true;
                }
       
    }
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String fname = txtfname.getText();
        String mname = txtmname.getText();
        String lname = txtlname.getText();
        String phone = txtpnumber.getText();
        String address = txtaddress.getText();
        int id = Integer.valueOf(txtID.getText());
        
        String sex = "";
            if(rbfemale.isSelected())
            {
                sex = "Female";
            } else if(rbmale.isSelected()) {
                sex = "Male";
            }

        if(verifText()){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    
        String dobirth  = dateFormat.format(DatePicker.getDate());
        Students std =new Students();
        std.insertUpdateDeleteStudents('u', id, fname, mname, lname, sex, dobirth, phone, address);
        //MainForm.lblStudentCount.setText("Number Of Students ; "+Integer.toString(MyFunction.countData("students")));
        }
    }//GEN-LAST:event_btnEditActionPerformed

    int rowIndex;
    private void StudentDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentDetailsMouseClicked
        
        rowIndex = StudentDetails.getSelectedRow();
        
        
        if(model.getValueAt(rowIndex, 4).toString().equals("Male"))
        {
            rbmale.setSelected(true);
            rbfemale.setSelected(false);
        } else
        {
            rbfemale.setSelected(true);
            rbmale.setSelected(false);
        }
        
        txtID.setText(model.getValueAt(rowIndex, 0).toString());
        txtfname.setText(model.getValueAt(rowIndex, 1).toString());
        txtmname.setText(model.getValueAt(rowIndex, 2).toString());
        txtlname.setText(model.getValueAt(rowIndex, 3).toString());
        txtpnumber.setText(model.getValueAt(rowIndex, 6).toString());
        txtaddress.setText(model.getValueAt(rowIndex, 7).toString());
        
        Date dobirth;
        try {
            dobirth = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 5).toString());
            DatePicker.setDate(dobirth);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_StudentDetailsMouseClicked

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        
                            AddStudentForm asf = new AddStudentForm();
                            asf.setVisible(true);
                            asf.pack();
                            asf.setLocationRelativeTo(null);
                            asf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
       
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        StudentDetails.setModel(new DefaultTableModel(null, new Object[]{"ID","First Name","Middle Name","Last Name","Sex","Date Of Birth","Phone Number","Address"}));       
        std.fillStudentsJTable(StudentDetails, txtSearch.getText());
    }//GEN-LAST:event_txtSearchKeyReleased

    private void StudentDetailsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentDetailsKeyReleased
        
    }//GEN-LAST:event_StudentDetailsKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DatePicker;
    public static javax.swing.JTable StudentDetails;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmname;
    private javax.swing.JTextField txtpnumber;
    // End of variables declaration//GEN-END:variables
}