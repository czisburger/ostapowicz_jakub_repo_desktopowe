package com.mycompany.jakubostapowiczrejestracjalogowanie;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Jakub Ostapowicz
 */
public class RejestracjaLogowanie extends javax.swing.JFrame {
    
    public RejestracjaLogowanie() {
        initComponents();
        setLocationRelativeTo(null);
        addKeyListenerTojo_jTFRejestracjaUsername();
        addKeyListenerTojo_jPFRejestracjaPassword();
        addKeyListenerTojo_jPFRejestracjaConfirmPassword();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jo_jTPMain = new javax.swing.JTabbedPane();
        jo_jPLogowanie = new javax.swing.JPanel();
        jo_jLLogowanie = new javax.swing.JLabel();
        jo_jLLogowanieEmail = new javax.swing.JLabel();
        jo_jTFLogowanieEmail = new javax.swing.JTextField();
        jo_jLLogowaniePassword = new javax.swing.JLabel();
        jo_jBZaloguj = new javax.swing.JButton();
        jo_jPFLogowaniePassword = new javax.swing.JPasswordField();
        jo_jPRejestracja = new javax.swing.JPanel();
        jo_jLRejestracja = new javax.swing.JLabel();
        jo_jLRejestracjaEmail = new javax.swing.JLabel();
        jo_jTFRejestracjaEmail = new javax.swing.JTextField();
        jo_jLRejestracjaPassword = new javax.swing.JLabel();
        jo_jTFRejestracjaUsername = new javax.swing.JTextField();
        jo_jLRejestracjaUsername = new javax.swing.JLabel();
        jo_jLRejestracjaConfirmPassword = new javax.swing.JLabel();
        jojBRejestracja = new javax.swing.JButton();
        jo_jPFRejestracjaPassword = new javax.swing.JPasswordField();
        jo_jPFRejestracjaConfirmPassword = new javax.swing.JPasswordField();
        jo_jBRejestracjaWyczysc = new javax.swing.JButton();
        jo_jCBShowPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RejestracjaLogowanie");
        setResizable(false);

        jo_jTPMain.setBackground(new java.awt.Color(255, 255, 255));

        jo_jPLogowanie.setBackground(new java.awt.Color(255, 255, 255));

        jo_jLLogowanie.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jo_jLLogowanie.setText("Logowanie");

        jo_jLLogowanieEmail.setText("Email");

        jo_jTFLogowanieEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jo_jTFLogowanieEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jTFLogowanieEmailActionPerformed(evt);
            }
        });

        jo_jLLogowaniePassword.setText("Password");

        jo_jBZaloguj.setBackground(new java.awt.Color(255, 255, 255));
        jo_jBZaloguj.setText("Zaloguj");
        jo_jBZaloguj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jBZalogujActionPerformed(evt);
            }
        });

        jo_jPFLogowaniePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jo_jPLogowanieLayout = new javax.swing.GroupLayout(jo_jPLogowanie);
        jo_jPLogowanie.setLayout(jo_jPLogowanieLayout);
        jo_jPLogowanieLayout.setHorizontalGroup(
            jo_jPLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jo_jPLogowanieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jo_jPLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jo_jPFLogowaniePassword)
                    .addGroup(jo_jPLogowanieLayout.createSequentialGroup()
                        .addGroup(jo_jPLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jo_jLLogowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jo_jLLogowanieEmail)
                            .addComponent(jo_jLLogowaniePassword)
                            .addComponent(jo_jBZaloguj))
                        .addGap(0, 272, Short.MAX_VALUE))
                    .addComponent(jo_jTFLogowanieEmail))
                .addContainerGap())
        );
        jo_jPLogowanieLayout.setVerticalGroup(
            jo_jPLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jo_jPLogowanieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jo_jLLogowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jo_jLLogowanieEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jo_jTFLogowanieEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jo_jLLogowaniePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jo_jPFLogowaniePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jo_jBZaloguj)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jo_jTPMain.addTab("Logowanie", jo_jPLogowanie);

        jo_jPRejestracja.setBackground(new java.awt.Color(255, 255, 255));

        jo_jLRejestracja.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jo_jLRejestracja.setText("Rejestracja");

        jo_jLRejestracjaEmail.setText("Email");

        jo_jTFRejestracjaEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jo_jLRejestracjaPassword.setText("Password");

        jo_jTFRejestracjaUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jo_jLRejestracjaUsername.setText("Username");

        jo_jLRejestracjaConfirmPassword.setText("Confirm Password");

        jojBRejestracja.setBackground(new java.awt.Color(255, 255, 255));
        jojBRejestracja.setText("Rejestracja");
        jojBRejestracja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jojBRejestracjaActionPerformed(evt);
            }
        });

        jo_jPFRejestracjaPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jo_jPFRejestracjaConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jo_jBRejestracjaWyczysc.setText("Wyczyść");
        jo_jBRejestracjaWyczysc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jBRejestracjaWyczyscActionPerformed(evt);
            }
        });

        jo_jCBShowPassword.setText("Pokaż Hasło");
        jo_jCBShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jCBShowPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jo_jPRejestracjaLayout = new javax.swing.GroupLayout(jo_jPRejestracja);
        jo_jPRejestracja.setLayout(jo_jPRejestracjaLayout);
        jo_jPRejestracjaLayout.setHorizontalGroup(
            jo_jPRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jo_jPRejestracjaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jo_jPRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jo_jPFRejestracjaPassword)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jo_jPRejestracjaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jo_jPRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jo_jPRejestracjaLayout.createSequentialGroup()
                                .addGroup(jo_jPRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jo_jLRejestracjaEmail)
                                    .addComponent(jo_jLRejestracjaPassword))
                                .addGap(304, 304, 304))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jo_jPRejestracjaLayout.createSequentialGroup()
                                .addComponent(jo_jLRejestracjaUsername)
                                .addGap(302, 302, 302))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jo_jPRejestracjaLayout.createSequentialGroup()
                                .addComponent(jo_jLRejestracjaConfirmPassword)
                                .addGap(264, 264, 264))))
                    .addComponent(jo_jPFRejestracjaConfirmPassword)
                    .addGroup(jo_jPRejestracjaLayout.createSequentialGroup()
                        .addComponent(jojBRejestracja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jo_jBRejestracjaWyczysc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jo_jCBShowPassword))
                    .addComponent(jo_jTFRejestracjaUsername)
                    .addGroup(jo_jPRejestracjaLayout.createSequentialGroup()
                        .addComponent(jo_jLRejestracja, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jo_jTFRejestracjaEmail))
                .addContainerGap())
        );
        jo_jPRejestracjaLayout.setVerticalGroup(
            jo_jPRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jo_jPRejestracjaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jo_jLRejestracja, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jo_jLRejestracjaUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jo_jTFRejestracjaUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jo_jLRejestracjaEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jo_jTFRejestracjaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jo_jLRejestracjaPassword)
                .addGap(4, 4, 4)
                .addComponent(jo_jPFRejestracjaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jo_jLRejestracjaConfirmPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jo_jPFRejestracjaConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jo_jPRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jojBRejestracja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jo_jPRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jo_jBRejestracjaWyczysc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jo_jCBShowPassword)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jo_jTPMain.addTab("Rejestracja", jo_jPRejestracja);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jo_jTPMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jo_jTPMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jo_jBRejestracjaWyczyscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jBRejestracjaWyczyscActionPerformed
        jo_jTFRejestracjaUsername.setText("");
        jo_jTFRejestracjaEmail.setText("");
        jo_jPFRejestracjaPassword.setText("");
        jo_jPFRejestracjaConfirmPassword.setText("");
    }//GEN-LAST:event_jo_jBRejestracjaWyczyscActionPerformed

    private void jojBRejestracjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jojBRejestracjaActionPerformed
        FileUtils rff = new FileUtils();
        rff.readFromFile();
        if(jo_jPFRejestracjaPassword.getText().equals(jo_jPFRejestracjaConfirmPassword.getText()) &&
                jo_jPFRejestracjaPassword.getText().length() >= 4 && 
                jo_jTFRejestracjaUsername.getText().length() >= 2 && 
                !jo_jTFRejestracjaEmail.getText().equals("") && 
                !jo_jTFRejestracjaUsername.getText().equals("") && 
                !jo_jPFRejestracjaPassword.getText().equals("") && 
                !jo_jPFRejestracjaConfirmPassword.getText().equals("")){
            FileUtils stf = new FileUtils();
            String text = jo_jTFRejestracjaUsername.getText()+";"+jo_jTFRejestracjaEmail.getText()+";"+jo_jPFRejestracjaPassword.getText();
            stf.saveToFile(text);
            jo_jTFRejestracjaUsername.setText("");
            jo_jTFRejestracjaEmail.setText("");
            jo_jPFRejestracjaPassword.setText("");
            jo_jPFRejestracjaConfirmPassword.setText("");
        }
    }//GEN-LAST:event_jojBRejestracjaActionPerformed

    private void jo_jCBShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jCBShowPasswordActionPerformed
        if(jo_jCBShowPassword.isSelected()){
            jo_jPFRejestracjaPassword.setEchoChar((char)0);
            jo_jPFRejestracjaConfirmPassword.setEchoChar((char)0);
        }else{
            jo_jPFRejestracjaPassword.setEchoChar('*');
            jo_jPFRejestracjaConfirmPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jo_jCBShowPasswordActionPerformed

    private void jo_jTFLogowanieEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jTFLogowanieEmailActionPerformed
        
    }//GEN-LAST:event_jo_jTFLogowanieEmailActionPerformed

    private void jo_jBZalogujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jBZalogujActionPerformed
        FileUtils rff = new FileUtils();
        rff.readFromFile();
        if(jo_jTFLogowanieEmail.getText().equals(rff.column[1]) && jo_jPFLogowaniePassword.getText().equals(rff.column[2])){
            JOptionPane.showMessageDialog(rootPane, "Witaj: "+rff.column[0]);
            jo_jTFLogowanieEmail.setText("");
            jo_jPFLogowaniePassword.setText("");
        }else{
            JOptionPane.showMessageDialog(rootPane, "zły email lub hasło");
        }
    }//GEN-LAST:event_jo_jBZalogujActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(RejestracjaLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RejestracjaLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RejestracjaLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RejestracjaLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RejestracjaLogowanie().setVisible(true);
            }
        });
    }
    
    private void addKeyListenerTojo_jTFRejestracjaUsername(){
        jo_jTFRejestracjaUsername.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jo_jTFRejestracjaUsername.getText();
                char ch = e.getKeyChar();
                if(ch >= KeyEvent.VK_A && ch <= KeyEvent.VK_Z || ch >= 'a' && ch <= 'z' || ch == KeyEvent.VK_BACK_SPACE){
                    if(temp.length() > 20){
                        jo_jTFRejestracjaUsername.setEditable(false);
                    }
                }else{
                    jo_jTFRejestracjaUsername.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    
    private void addKeyListenerTojo_jPFRejestracjaPassword(){
        jo_jPFRejestracjaPassword.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if(ch >= KeyEvent.VK_A && ch <= KeyEvent.VK_Z || ch >= 'a' && ch <= 'z' || ch >= KeyEvent.VK_0 && ch <= KeyEvent.VK_9 || ch == KeyEvent.VK_BACK_SPACE){
                    jo_jPFRejestracjaPassword.setEditable(true);
                }else{
                    jo_jPFRejestracjaPassword.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    
    private void addKeyListenerTojo_jPFRejestracjaConfirmPassword(){
        jo_jPFRejestracjaConfirmPassword.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if(ch >= KeyEvent.VK_A && ch <= KeyEvent.VK_Z || ch >= 'a' && ch <= 'z' || ch >= KeyEvent.VK_0 && ch <= KeyEvent.VK_9 || ch == KeyEvent.VK_BACK_SPACE){
                    jo_jPFRejestracjaConfirmPassword.setEditable(true);
                }else{
                    jo_jPFRejestracjaConfirmPassword.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jo_jBRejestracjaWyczysc;
    private javax.swing.JButton jo_jBZaloguj;
    private javax.swing.JCheckBox jo_jCBShowPassword;
    private javax.swing.JLabel jo_jLLogowanie;
    private javax.swing.JLabel jo_jLLogowanieEmail;
    private javax.swing.JLabel jo_jLLogowaniePassword;
    private javax.swing.JLabel jo_jLRejestracja;
    private javax.swing.JLabel jo_jLRejestracjaConfirmPassword;
    private javax.swing.JLabel jo_jLRejestracjaEmail;
    private javax.swing.JLabel jo_jLRejestracjaPassword;
    private javax.swing.JLabel jo_jLRejestracjaUsername;
    private javax.swing.JPasswordField jo_jPFLogowaniePassword;
    private javax.swing.JPasswordField jo_jPFRejestracjaConfirmPassword;
    private javax.swing.JPasswordField jo_jPFRejestracjaPassword;
    private javax.swing.JPanel jo_jPLogowanie;
    private javax.swing.JPanel jo_jPRejestracja;
    private javax.swing.JTextField jo_jTFLogowanieEmail;
    private javax.swing.JTextField jo_jTFRejestracjaEmail;
    private javax.swing.JTextField jo_jTFRejestracjaUsername;
    private javax.swing.JTabbedPane jo_jTPMain;
    private javax.swing.JButton jojBRejestracja;
    // End of variables declaration//GEN-END:variables
}
