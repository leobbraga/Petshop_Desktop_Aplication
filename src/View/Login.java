/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author tiago
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        LabelTitleLogin = new javax.swing.JLabel();
        LabelUser = new javax.swing.JLabel();
        TextUser = new javax.swing.JTextField();
        LabelPassword = new javax.swing.JLabel();
        TextPassword = new javax.swing.JPasswordField();
        ButtonLogin = new javax.swing.JButton();
        LabelPainelBackground = new javax.swing.JLabel();
        LabelLoginBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTitleLogin.setFont(new java.awt.Font("Courier 10 Pitch", 1, 48)); // NOI18N
        LabelTitleLogin.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitleLogin.setText("Login");
        getContentPane().add(LabelTitleLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        LabelUser.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        LabelUser.setForeground(new java.awt.Color(255, 255, 255));
        LabelUser.setText("User");
        getContentPane().add(LabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        TextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUserActionPerformed(evt);
            }
        });
        getContentPane().add(TextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 400, 40));

        LabelPassword.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        LabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        LabelPassword.setText("Password");
        getContentPane().add(LabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        TextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(TextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 400, 40));

        ButtonLogin.setBackground(new java.awt.Color(164, 152, 152));
        ButtonLogin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ButtonLogin.setText("Login");
        ButtonLogin.setActionCommand("ButtonEntrar");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 400, 50));

        LabelPainelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/painel-login.png"))); // NOI18N
        getContentPane().add(LabelPainelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 590, 520));

        LabelLoginBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLoginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Petshop-background.jpg"))); // NOI18N
        getContentPane().add(LabelLoginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 1070));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUserActionPerformed

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void TextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JLabel LabelLoginBackground;
    private javax.swing.JLabel LabelPainelBackground;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelTitleLogin;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JTextField TextUser;
    // End of variables declaration//GEN-END:variables
}
