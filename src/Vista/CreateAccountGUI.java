package Vista;

import AppAccount.AccountManager;
import Model.User;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Controller.ConnectionStatus;

/**
 *
 * @author GROUP 1 UNC
 */
public class CreateAccountGUI extends javax.swing.JFrame {

    public CreateAccountGUI(User user) {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1Label = new javax.swing.JLabel();
        title2Label = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        goBack = new javax.swing.JButton();
        confirmPassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        aboutLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1Label.setFont(new java.awt.Font("AR DESTINE", 0, 48)); // NOI18N
        title1Label.setForeground(new java.awt.Color(255, 0, 0));
        title1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1Label.setText("DSDRisk Game");
        title1Label.setMinimumSize(new java.awt.Dimension(100, 55));
        title1Label.setPreferredSize(new java.awt.Dimension(50, 55));
        getContentPane().add(title1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 340, 60));

        title2Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        title2Label.setText("Enter correct dates");
        getContentPane().add(title2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        goBack.setText("Go Back");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });
        getContentPane().add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 90, -1));
        getContentPane().add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 220, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 220, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 220, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 220, -1));

        aboutLabel.setForeground(new java.awt.Color(0, 0, 204));
        aboutLabel.setText("About this game");
        getContentPane().add(aboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        usernameLabel.setText("Username");
        getContentPane().add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        emailLabel.setText("Email");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        confirmPasswordLabel.setText("Confirm password");
        getContentPane().add(confirmPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        imageBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/background.jpg"))); // NOI18N
        getContentPane().add(imageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed

        ConnectionStatus status = AccountManager.createAccount(username.getText(), String.valueOf(password.getPassword()), String.valueOf(confirmPassword.getPassword()), email.getText());

        if (null != status) switch (status) {
            case SUCCESSFUL:
                JOptionPane.showMessageDialog(this, "The user was created", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case FAILED:
                JOptionPane.showMessageDialog(this, "That username is taken", "Message", JOptionPane.ERROR_MESSAGE);
                break;
            case INVALID_PARAMETERS:
                JOptionPane.showMessageDialog(this, "The password and confirm password are diferent", "Message", JOptionPane.ERROR_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(this, "There are problems with the connection", "Message", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        this.setVisible(false);
        DSDriskGame game = new DSDriskGame();
    }//GEN-LAST:event_goBackActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        
    }//GEN-LAST:event_usernameActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JButton confirm;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel confirmPasswordLabel;
    public javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel imageBackground;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel title1Label;
    private javax.swing.JLabel title2Label;
    public javax.swing.JTextField username;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}