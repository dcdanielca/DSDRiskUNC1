package Vista;

import AppGameSetup.SessionManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 *
 * @author GROUP 1 UNC
 */
public class InitialSetupGUI extends javax.swing.JFrame {

    String username;

    /**
     * Creates new form InitialSetupGUI
     */
    public InitialSetupGUI(String username) {
        this.username = username;
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

        chooseMap = new javax.swing.JComboBox<>();
        title2Label = new javax.swing.JLabel();
        title1Label = new javax.swing.JLabel();
        chooseMapLabel = new javax.swing.JLabel();
        typeOfGame = new javax.swing.JComboBox<>();
        typeOfGameLabel = new javax.swing.JLabel();
        leaveSession = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        aboutLabel = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chooseMap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classic" }));
        chooseMap.setEnabled(false);
        getContentPane().add(chooseMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 113, 130, -1));

        title2Label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2Label.setText("Initial Setup");
        getContentPane().add(title2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 73, 119, -1));

        title1Label.setFont(new java.awt.Font("AR DESTINE", 0, 48)); // NOI18N
        title1Label.setForeground(new java.awt.Color(255, 0, 0));
        title1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1Label.setText("DSDRisk Game");
        title1Label.setMinimumSize(new java.awt.Dimension(100, 55));
        title1Label.setPreferredSize(new java.awt.Dimension(50, 55));
        getContentPane().add(title1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));

        chooseMapLabel.setText("Choose map");
        getContentPane().add(chooseMapLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 116, 90, -1));

        typeOfGame.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "World domination risk", "Secret Mission Risk", "Capital Risk", "Risk for 2 players" }));
        typeOfGame.setEnabled(false);
        getContentPane().add(typeOfGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 144, 130, -1));

        typeOfGameLabel.setText("Type of game");
        getContentPane().add(typeOfGameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 147, 90, -1));

        leaveSession.setText("Leave session");
        leaveSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveSessionActionPerformed(evt);
            }
        });
        getContentPane().add(leaveSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Color"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 140));

        aboutLabel.setForeground(new java.awt.Color(0, 0, 204));
        aboutLabel.setText("About this game");
        getContentPane().add(aboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/background700400.jpg"))); // NOI18N
        getContentPane().add(imageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 560, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leaveSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveSessionActionPerformed
        try {
            JSONArray array = SessionManager.leaveSession(username);
            boolean status = (boolean) (((JSONObject) (array.get(0))).get("status"));
            String message = (String) (((JSONObject) (array.get(0))).get("message"));
            if (status) {
                this.setVisible(false);
                new SessionGUI(username).setVisible(true);
            } else {
                JOptionPane.showOptionDialog(null, message, "Message",
                        JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
                        null, new Object[]{"Accept"}, null);
            }
        } catch (ParseException ex) {
            Logger.getLogger(LogInGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_leaveSessionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JComboBox<String> chooseMap;
    private javax.swing.JLabel chooseMapLabel;
    private javax.swing.JLabel imageBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton leaveSession;
    private javax.swing.JLabel title1Label;
    private javax.swing.JLabel title2Label;
    private javax.swing.JComboBox<String> typeOfGame;
    private javax.swing.JLabel typeOfGameLabel;
    // End of variables declaration//GEN-END:variables
}
