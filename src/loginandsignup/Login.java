package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import models.UserModel;
import sun.security.util.Password;

public class Login extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String selectedValue = "";
    static UserModel userModel = new UserModel(0,null, null, null);

    public Login() {
        initComponents();
        conn = db.java_db();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        LoginBt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(790, 1920));
        setSize(new java.awt.Dimension(1024, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 563, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("  copyright©Obicule Technologies Pvt.Ltd. All rights reserved");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 478, 523, 53));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lg.png"))); // NOI18N
        jLabel2.setText(" ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 135, 279, 269));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 680));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Email");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 98, -1, 40));

        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 147, 263, 50));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Password");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 224, -1, -1));

        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 272, 263, 48));

        LoginBt.setBackground(new java.awt.Color(0, 102, 102));
        LoginBt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoginBt.setForeground(new java.awt.Color(255, 255, 255));
        LoginBt.setText("Login");
        LoginBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtActionPerformed(evt);
            }
        });
        jPanel3.add(LoginBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 525, 126, 49));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Login");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 16, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 525, 113, 49));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Select User");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 359, 166, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "User" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 409, 282, 37));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 740, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        password.grabFocus();
    }//GEN-LAST:event_passwordActionPerformed

    private void LoginBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtActionPerformed
        //System.out.println("Sign up btn clicked!");

        String Email, Password, Options, query, fname = null, passDb = null;
        int notFound = 0;

        try {
            if ("".equals(email.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is require", "Error", JOptionPane.ERROR_MESSAGE);

            } else if ("".equals(password.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error", JOptionPane.ERROR_MESSAGE);

            } else if ("".equals(selectedValue) || "Select".equals(selectedValue)) {
                JOptionPane.showMessageDialog(new JFrame(), "Please select user type", "Error", JOptionPane.ERROR_MESSAGE);

            } else {

                Email = email.getText();
                Password = password.getText();

                if (selectedValue.equals("Admin")) {
                    query = "SELECT * From user WHERE email='" + Email + "' AND password='" + Password + "' AND options='" + selectedValue + "'";
                    System.out.println(query);
                    pst = conn.prepareStatement(query);
                    rs = pst.executeQuery();

                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or password", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        int id = rs.getInt("id");
                        String name = rs.getString("full_name");
                        String email = rs.getString("email");
                        String type = rs.getString("options");

                        userModel = new UserModel(id,name, type, email);
                        AdminFrame AdminFrame = new AdminFrame();
                        AdminFrame.setVisible(true);
                        AdminFrame.pack();
                        AdminFrame.setLocationRelativeTo(null);

                        this.dispose();

                    }
                }else{
                    query = "SELECT * From employee_information WHERE Email='" + Email + "' AND Password='" + Password + "'";
                    System.out.println(query);
                    pst = conn.prepareStatement(query);
                    rs = pst.executeQuery();

                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or password", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        int id = rs.getInt("id");

                        userModel = new UserModel(id,null,null,null);
                        User user = new User();
                        user.setVisible(true);
                        user.pack();
                        user.setLocationRelativeTo(null);

                        this.dispose();

                    }
                }
                password.setText("");

            }

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());

        }

    }//GEN-LAST:event_LoginBtActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        email.grabFocus();

    }//GEN-LAST:event_emailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        selectedValue = String.valueOf(jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBt;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
