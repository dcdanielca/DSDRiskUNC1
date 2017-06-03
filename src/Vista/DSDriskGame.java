package Vista;

import Model.User;

/**
 *
 * @author GROUP 1 UNC
 */
public class DSDriskGame extends javax.swing.JFrame {

    User user;

    /**
     * Creates new form DSDriskGame
     */
    public DSDriskGame() {
        initComponents();
        user = new User();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1Label = new javax.swing.JLabel();
        title2Label = new javax.swing.JLabel();
        logIn = new javax.swing.JButton();
        createAccount = new javax.swing.JButton();
        image1 = new javax.swing.JLabel();
        aboutLabel = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DSDrisk Game");
        setMinimumSize(new java.awt.Dimension(489, 344));
        setResizable(false);
        getContentPane().setLayout(null);

        title1Label.setFont(new java.awt.Font("AR DESTINE", 0, 48)); // NOI18N
        title1Label.setForeground(new java.awt.Color(255, 0, 0));
        title1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1Label.setText("DSDRisk Game");
        getContentPane().add(title1Label);
        title1Label.setBounds(0, 0, 480, 78);

        title2Label.setText("What would you like to do?");
        getContentPane().add(title2Label);
        title2Label.setBounds(185, 89, 150, 15);

        logIn.setText("Log in");
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });
        getContentPane().add(logIn);
        logIn.setBounds(85, 249, 100, 30);

        createAccount.setText("Create account");
        createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountActionPerformed(evt);
            }
        });
        getContentPane().add(createAccount);
        createAccount.setBounds(295, 249, 120, 30);

        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Warriors.jpg"))); // NOI18N
        getContentPane().add(image1);
        image1.setBounds(140, 120, 220, 110);

        aboutLabel.setForeground(new java.awt.Color(0, 0, 204));
        aboutLabel.setText("About this game");
        getContentPane().add(aboutLabel);
        aboutLabel.setBounds(200, 280, 100, 20);

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/background.jpg"))); // NOI18N
        getContentPane().add(imageBackground);
        imageBackground.setBounds(0, 0, 516, 347);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 34, 15);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed
        LogInGUI login = new LogInGUI(user);
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logInActionPerformed

    private void createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountActionPerformed
        CreateAccountGUI c = new CreateAccountGUI(user);
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createAccountActionPerformed

   
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DSDriskGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSDriskGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSDriskGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSDriskGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSDriskGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JButton createAccount;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel imageBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logIn;
    private javax.swing.JLabel title1Label;
    private javax.swing.JLabel title2Label;
    // End of variables declaration//GEN-END:variables
}
