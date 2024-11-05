
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.beans.Statement;
import java.sql.ResultSet;
import patmini.usersession;
import java.sql.Connection;

import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author Varunkumar lysetti
 */
public class utest extends javax.swing.JFrame {
    private String correctAnswer; // Declare at the class level
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    private String asName;
    private int currentQuestionIndex = 0;
    private int correctAnswers = 0;
    private int totalQuestions = 5; // Assuming 5 questions for now

         public utest() {
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

        jLabel1 = new javax.swing.JLabel();
        question = new javax.swing.JTextField();
        opt2 = new javax.swing.JTextField();
        opt3 = new javax.swing.JTextField();
        opt1 = new javax.swing.JTextField();
        opt4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        opt5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        opt6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Q.No. 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, -1));

        question.setBackground(new java.awt.Color(153, 153, 255));
        question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionActionPerformed(evt);
            }
        });
        getContentPane().add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 390, 80));

        opt2.setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().add(opt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 390, -1));

        opt3.setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().add(opt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 390, -1));

        opt1.setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().add(opt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 390, -1));

        opt4.setBackground(new java.awt.Color(153, 153, 255));
        opt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt4ActionPerformed(evt);
            }
        });
        getContentPane().add(opt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 390, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("QUESTIONS & ANSWERS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 290, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 80, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        opt5.setBackground(new java.awt.Color(153, 153, 255));
        opt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt5ActionPerformed(evt);
            }
        });
        getContentPane().add(opt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 390, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Option - 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 70, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Option - 3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 70, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Option - 4");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 70, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("Answer");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 50, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 255));
        jLabel9.setText("Option - 1");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 70, -1));

        opt6.setBackground(new java.awt.Color(153, 153, 255));
        opt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt6ActionPerformed(evt);
            }
        });
        getContentPane().add(opt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 390, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picsart_24-09-01_22-01-15-634.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void loadQuestions() {
     try {
        // Get asname from the text field on the first iteration
        if (asName == null) {
            asName = opt6.getText(); // Get the name entered in the text field
            if (asName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a name.");
                return; // Exit if no name is entered
            }
        }

        // Connect to the database
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pat", "root", "pat@admin#0987");

        // Update the query to filter by asname
        String query = "SELECT * FROM ques WHERE asname = ? LIMIT ?, 1"; // Fetch one question at a time
        pst = conn.prepareStatement(query);
        pst.setString(1, asName); // Use the stored asname
        pst.setInt(2, currentQuestionIndex); // Current question index
        rs = pst.executeQuery();

        if (rs.next()) {
            // Display question and options
            jLabel1.setText("Q.No. " + (currentQuestionIndex + 1));
            question.setText(rs.getString("question"));
            opt1.setText(rs.getString("opt1"));
            opt2.setText(rs.getString("opt2"));
            opt3.setText(rs.getString("opt3"));
            opt4.setText(rs.getString("opt4"));

            // Store the correct answer
            correctAnswer = rs.getString("answer"); 
        } else {
            JOptionPane.showMessageDialog(this, "No more questions found for the entered name.");
            this.dispose(); // Close if no questions left
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Print the error stack trace
        JOptionPane.showMessageDialog(this, "Error loading questions: " + e.getMessage());
    } 
}

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
    
    // Load the first question when the button is pressed for the first time
    if (currentQuestionIndex < totalQuestions) {
        String userAnswer = opt5.getText(); // Get the user's answer from the answer text field

        // Compare user's answer with the correct answer
        if (userAnswer.equalsIgnoreCase(correctAnswer)) { // Using equalsIgnoreCase for case-insensitivity
            correctAnswers++;
        }

        // Move to the next question
        currentQuestionIndex++;

        // Check if we reached the end of the quiz
        if (currentQuestionIndex >= totalQuestions) {
            // Save results to reports table
            saveResults();
            JOptionPane.showMessageDialog(this, "You finished the test! Correct Answers: " + correctAnswers);
            this.dispose(); // Close the application or go to the results screen
        } else {
            // Load the next question
            loadQuestions();
        }
    } else {
        JOptionPane.showMessageDialog(this, "All questions have been answered.");
    }

    // Clear the answer text field for the next iteration
    opt5.setText(""); 


    }//GEN-LAST:event_jButton2ActionPerformed

     private void saveResults() {
   // Ensure the database connection is established before executing the query
    if (conn == null) {
        JOptionPane.showMessageDialog(this, "Database connection is not established.");
        return;
    }

    try {
        String query = "INSERT INTO report(username, marks) VALUES(?, ?)";
        pst = conn.prepareStatement(query);
        pst.setString(1, UserSession.loggedInUsername);
        pst.setInt(2, correctAnswers);
        
        int rowsAffected = pst.executeUpdate(); // Use executeUpdate for insert, update, delete
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Your results have been saved.");
        } else {
            JOptionPane.showMessageDialog(this, "No results were saved.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error saving results: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + e.getMessage());
    } finally {
        // Ensure resources are closed (if applicable)
        try {
            if (pst != null) {
                pst.close(); // Close the prepared statement
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error closing resources: " + e.getMessage());
        }
    }
}

    

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionActionPerformed

    private void opt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opt5ActionPerformed

    private void opt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opt4ActionPerformed

    private void opt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opt6ActionPerformed

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
            java.util.logging.Logger.getLogger(QSS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QSS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QSS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QSS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new utest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField opt1;
    private javax.swing.JTextField opt2;
    private javax.swing.JTextField opt3;
    private javax.swing.JTextField opt4;
    private javax.swing.JTextField opt5;
    private javax.swing.JTextField opt6;
    private javax.swing.JTextField question;
    // End of variables declaration//GEN-END:variables
}
