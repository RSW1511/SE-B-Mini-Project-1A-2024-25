
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

// Your class and method definitions go here

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Varunkumar lysetti
 */
public class joinorg extends javax.swing.JFrame {

    /**
     * Creates new form joinorg
     */
    public joinorg() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edtPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        edtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edtUsername1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Join Organisation");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Org. Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 82, 22));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Org. password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        edtPassword.setBackground(new java.awt.Color(153, 153, 255));
        edtPassword.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        edtPassword.setForeground(new java.awt.Color(255, 255, 255));
        edtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(edtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 176, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setText("Join");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, 29));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, 29));

        edtUsername.setBackground(new java.awt.Color(153, 153, 255));
        edtUsername.setForeground(new java.awt.Color(255, 255, 255));
        edtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(edtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("UserName");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 82, 22));

        edtUsername1.setBackground(new java.awt.Color(153, 153, 255));
        edtUsername1.setForeground(new java.awt.Color(255, 255, 255));
        edtUsername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUsername1ActionPerformed(evt);
            }
        });
        getContentPane().add(edtUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 140, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picsart_24-09-01_22-01-15-634.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try {
    // Load the MySQL driver
    Class.forName("com.mysql.cj.jdbc.Driver");
    // Establish the connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pat", "root", "pat@admin#0987");

    // Get the username and password from the input fields
    String username = edtUsername1.getText(); // Get the username from edtUsername1
    String password = edtPassword.getText(); // Get the password (if you want to check)
    String orgName = edtUsername.getText(); // Get the organization name from the appropriate field

    // Check if the username exists in the signup table
    String sqlCheckUsername = "SELECT * FROM signup WHERE username=?";
    PreparedStatement stmtCheck = con.prepareStatement(sqlCheckUsername);
    stmtCheck.setString(1, username);
    ResultSet rsCheck = stmtCheck.executeQuery();

    // If the username exists
    if (rsCheck.next()) {
        // Check if the username already exists in the `org det` table
        String sqlCheckOrgDet = "SELECT * FROM `org det` WHERE username=?";
        PreparedStatement stmtCheckOrgDet = con.prepareStatement(sqlCheckOrgDet);
        stmtCheckOrgDet.setString(1, username);
        ResultSet rsOrgDetCheck = stmtCheckOrgDet.executeQuery();

        if (rsOrgDetCheck.next()) {
            // Username already exists in `org det`
            JOptionPane.showMessageDialog(this, "Username is already stored in org det.");
        } else {
            // Username is valid and not already stored in `org det`
            JOptionPane.showMessageDialog(this, "Username is valid. Storing in org det.");

            // Insert the username and orgName into `org det` table
            String sqlInsert = "INSERT INTO `org det` (username, oname, number) VALUES (?, ?, ?)";
            PreparedStatement stmtInsert = con.prepareStatement(sqlInsert);

            // Get the next number for the `org det` table
            String sqlMaxNumber = "SELECT COALESCE(MAX(number), 0) + 1 AS nextNumber FROM `org det`";
            Statement stmtMax = con.createStatement();
            ResultSet rsMax = stmtMax.executeQuery(sqlMaxNumber);
            int nextNumber = 1; // Default to 1 if the table is empty
            if (rsMax.next()) {
                nextNumber = rsMax.getInt("nextNumber");
            }

            // Set parameters for the insert statement
            stmtInsert.setString(1, username); // Use username from edtUsername1
            stmtInsert.setString(2, orgName);   // Store OrgName in the oname column
            stmtInsert.setInt(3, nextNumber);    // Set the next number
            stmtInsert.executeUpdate(); // Execute the insert statement

            // Notify success
            JOptionPane.showMessageDialog(this, "Username and OrgName stored successfully!");

            // Optionally redirect to another form
            USERHOME1 userHome = new USERHOME1(); // Assuming USERHOME1 is your next form
            userHome.setVisible(true);
            this.dispose(); // Close the current form
        }
    } else {
        // If the username does not exist in the signup table
        JOptionPane.showMessageDialog(this, "Username does not exist.");
        edtUsername1.setText(""); // Clear the username field
    }

    con.close(); // Close the database connection
} catch (Exception e) {
    e.printStackTrace(); // Print stack trace for better debugging
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    homepage a=new homepage();
        a.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void edtUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUsername1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtUsername1ActionPerformed

    private void edtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtUsernameActionPerformed

    private void edtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(joinorg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(joinorg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(joinorg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(joinorg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new joinorg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edtPassword;
    private javax.swing.JTextField edtUsername;
    private javax.swing.JTextField edtUsername1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
