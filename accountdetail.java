/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bank;

import java.sql.Connection;
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
public class accountdetail extends javax.swing.JFrame {
    Connection conn;
    String accountno,ID,accounttype,balance;

    /**
     * Creates new form accountdetail
     */
    public accountdetail() {
        initComponents();
        this.setLocationRelativeTo(null);
        conn = dbconfig.getconnection();
        
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("     Account Details");

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Back");
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 585, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1065, -1));

        jLabel2.setBackground(new java.awt.Color(102, 204, 0));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Account Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 76, 284, 45));

        jLabel3.setBackground(new java.awt.Color(153, 255, 153));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Account Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 424, 41));

        jLabel4.setBackground(new java.awt.Color(153, 255, 153));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText(" Balance");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 550, 125, 33));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton1.setText("find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 198, 171, -1));

        jTextField3.setBackground(new java.awt.Color(153, 255, 255));
        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 619, 276, 34));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Add");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 552, 171, 33));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 284, 33));

        jTextField4.setBackground(new java.awt.Color(153, 255, 255));
        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 239, 272, 36));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Full Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 424, 39));

        jTextField5.setBackground(new java.awt.Color(153, 255, 255));
        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 345, 270, 35));

        jLabel7.setBackground(new java.awt.Color(51, 204, 255));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 139, 137, 36));

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "saving", "fix", "current" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 479, 223, 33));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/clay-banks-XvS-uKUoUao-unsplash.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1070, 1140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dash form = new dash();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        PreparedStatement ps;
        ResultSet rs;
        try
        {
        String ID=jTextField4.getText();
        
        ps=conn.prepareStatement("select * from newemp where ID= ?");
        ps.setString(1, ID);
        rs=ps.executeQuery();
        
        if(rs.next()==false)
        {
                JOptionPane.showMessageDialog(this, "ID not found");
        }
        else
        {
            String fullname=rs.getString("fullname");
            jTextField5.setText(fullname.trim());
        }
        
        }
       catch (SQLException ex) {
            Logger.getLogger(accountdetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        accountno=jLabel7.getText();
        ID=jTextField4.getText();
        accounttype=jComboBox1.getSelectedItem().toString();
        balance=jTextField3.getText();

        if(!checkusername() && verifyfields() )
        {
            System.out.println("true");
            PreparedStatement ps;
            ResultSet rs;
            String registerUserQuery;
            registerUserQuery = "insert into account(accountno,ID,accounttype,balance)values(?,?,?,?)";
            
            try{
                ps=conn.prepareStatement(registerUserQuery);
                ps.setString(1,accountno);
                ps.setString(2,ID);
                ps.setString(3,accounttype);
                ps.setString(4,balance);
                
                
                if (ps.executeUpdate()==0)
                {
                    JOptionPane.showMessageDialog(null, "error:check your information");
                } else {
                    JOptionPane.showMessageDialog(null, "amount added");
                    resetValue();
                    dash form=new dash();
                        form.setVisible(true);
                        form.pack();
                        form.setLocationRelativeTo(null);
                        this.dispose();
                    
                }
            }
            catch(SQLException ex)
            {
                // Logger.getLogger(reg.class.getName()).log(Level1.SERVER,null,ex);
                Logger.getLogger(accountdetail.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        else
        {
            System.out.println("false");
        }


            
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void autoid()
    {
        PreparedStatement insert;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
           // conn=DriverManager.getConnection("jdbc:mysql://localhost/test01","root","");
            Statement s= conn.createStatement();
            ResultSet rs=s.executeQuery("select Max(ID) from account");
            
            rs.next();
            rs.getString("Max(ID)");
            
            if(rs.getString("Max(ID)")==null)
            {
                jLabel7.setText("AC001");
            }
            else
            {
                long id = Long.parseLong(rs.getString("Max(ID)").substring(2,rs.getString("Max(ID)").length()));
                id++;
                
                jLabel7.setText("AC" + String.format("%03d", id));
            }
                
            
        } catch (SQLException ex) {
            Logger.getLogger(accountdetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public boolean verifyfields() {
        accounttype=jComboBox1.getSelectedItem().toString();
        balance = jTextField3.getText();

        if (accounttype.equals("") || balance.equals("")) {
            JOptionPane.showMessageDialog(null, "one or more fields are empty", "empty fields", 2);
            return false;
        } else {
            return true;
        }
    }

    
    public boolean checkusername(){
        
    
        PreparedStatement st;
        ResultSet rs;
        String balance = jTextField3.getText();
        String accounttype = jComboBox1.getSelectedItem().toString();
        boolean accounttype_exist=false;


        String query = "SELECT * FROM `account` WHERE `balance` = ?";

        try {

            st = dbconfig.getconnection().prepareStatement(query);
            //st.setString(1,accounttype);
            st.setString(1,balance);
            rs = st.executeQuery();

            if (rs.next()) {
                accounttype_exist=true;
                JOptionPane.showMessageDialog(null, " already taken", " already taken", 2);
            } 

        } catch (SQLException ex) {
            Logger.getLogger(accountdetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accounttype_exist;
    }

    
     public void resetValue()
    {
        
        
        jTextField3.setText("");
        jTextField4.setText("");
       
        jTextField5.setText("");
       
        
    }
    
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
            java.util.logging.Logger.getLogger(accountdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountdetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
