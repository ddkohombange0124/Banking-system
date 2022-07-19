/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kohombange DD
 */
public class newacc extends javax.swing.JFrame {
    String ID,title,fullname,dob,address,postalcode,nearestbranch,mobileno,email,profession;
    String namewithinitials;
    Connection conn;

    /**
     * Creates new form main
     */
    public newacc() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        conn=dbconfig.getconnection();
        
        autoid();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Title");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 185, 270, 47));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Full Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 250, 270, 46));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Name with initials");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 314, 270, 50));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("DOB");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 382, 270, 44));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 444, 270, 39));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Postal code");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 501, 270, 47));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Nearest Branch");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 566, 270, 51));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Mobile No");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 635, 270, 47));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 700, 270, 43));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("Profession");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 761, 270, 50));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("ID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 124, 270, 40));

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 260, 267, -1));

        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 326, 267, -1));

        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 391, 267, -1));

        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 450, 267, -1));

        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 511, 267, -1));

        jTextField8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 645, 267, -1));

        jTextField9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 708, 267, -1));

        jTextField10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 773, 267, -1));

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Miss", "Another" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 195, 126, -1));

        jComboBox2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Galle", "Matara", "Hambantota", "Matale", "Kandy", "Jaffna" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 578, 193, -1));

        jLabel12.setBackground(new java.awt.Color(102, 102, 255));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 124, 267, 40));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton1.setText("Create new account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 829, 285, 41));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButton3.setText("close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(1092, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 0, 1350, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setText("         Create An Account");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/new.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 70, 1700, 1250));

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ID=jLabel12.getText();
        title=jComboBox1.getSelectedItem().toString();
        fullname = jTextField2.getText();
        namewithinitials=jTextField3.getText();
        dob=jTextField4.getText();
        address=jTextField5.getText();
        postalcode=jTextField6.getText();
        nearestbranch=jComboBox2.getSelectedItem().toString();
        mobileno=jTextField8.getText();
        email=jTextField9.getText();
        profession=jTextField10.getText();
        
        if(verifyfields() && !checkusername())
        {
            System.out.println("true");
            PreparedStatement ps;
            ResultSet rs;
            String registerUserQuery="insert into newemp(ID,title,fullname,name_with_initials,dob,address,postal_code,nearest_branch,mobile_no,email,profession)values(?,?,?,?,?,?,?,?,?,?,?)";
            
            try{
                ps=conn.prepareStatement(registerUserQuery);
                ps.setString(1,ID);
                ps.setString(2,title);
                ps.setString(3,fullname);
                ps.setString(4,namewithinitials);
                ps.setString(5,dob);
                ps.setString(6,address);
                ps.setString(7,postalcode);
                ps.setString(8,nearestbranch);
                ps.setString(9,mobileno);
                ps.setString(10,email);
                ps.setString(11,profession);
                
                
                if (ps.executeUpdate() != 0) {
                        JOptionPane.showMessageDialog(null, " your account has been created");
                        resetValue();
                        accountdetail form=new accountdetail();
                        form.setVisible(true);
                        form.pack();
                        form.setLocationRelativeTo(null);
                        this.dispose();
                
                    } else {
                        JOptionPane.showMessageDialog(null, "error:check your information");
                    }
                
                
                
            }

            
            catch(SQLException ex)
            {
                // Logger.getLogger(reg.class.getName()).log(Level1.SERVER,null,ex);
                Logger.getLogger(newacc.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        else
        {
            System.out.println("false");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setState(ICONIFIED);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        cuslog1 form = new cuslog1();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public void autoid()
    {
        PreparedStatement insert;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
           // conn=DriverManager.getConnection("jdbc:mysql://localhost/test01","root","");
            Statement s= conn.createStatement();
            ResultSet rs=s.executeQuery("select Max(ID) from newemp");
            
            rs.next();
            rs.getString("Max(ID)");
            
            if(rs.getString("Max(ID)")==null)
            {
                jLabel12.setText("CS001");
            }
            else
            {
                long id = Long.parseLong(rs.getString("Max(ID)").substring(2,rs.getString("Max(ID)").length()));
                id++;
                
                jLabel12.setText("CS" + String.format("%03d", id));
            }
                
            
        } catch (SQLException ex) {
            Logger.getLogger(newacc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean verifyfields() {
         title=jComboBox1.getSelectedItem().toString();
        fullname = jTextField2.getText();

        if (title.equals("") || fullname.equals("")) {
            JOptionPane.showMessageDialog(null, "one or more fields are empty", "empty fields", 2);
            return false;
        } else {
            return true;
        }
    }
    
    
    public boolean checkusername(){
        
    
        PreparedStatement st;
        ResultSet rs;
        String fullname = jTextField2.getText();
        String title = jComboBox1.getSelectedItem().toString();
        boolean fullname_exist=false;


        String query = "SELECT * FROM `newemp` WHERE `fullname` = ?";

        try {

            st = dbconfig.getconnection().prepareStatement(query);
            //st.setString(1,title);
            st.setString(1,fullname);
            rs = st.executeQuery();

            if (rs.next()) {
                fullname_exist=true;
                JOptionPane.showMessageDialog(null, " already taken", " already taken", 2);
            } 

        } catch (SQLException ex) {
            Logger.getLogger(newacc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fullname_exist;
    }
    
    public void resetValue()
    {
        
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
       
        jTextField5.setText("");
        jTextField6.setText("");
         jTextField8.setText("");
          jTextField9.setText("");
           jTextField10.setText("");
        
        
    }
    
    
        
        
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
            java.util.logging.Logger.getLogger(newacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newacc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
