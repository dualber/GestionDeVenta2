
package Vista;

import Modelo.Login;
import Modelo.LoginDao;
import javax.swing.JOptionPane;

public class LoginPrincipal extends javax.swing.JFrame {
     Login lg = new Login();
     LoginDao login = new LoginDao();
  
    public LoginPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void validar(){
        String correo= txtCorreo.getText();
        String pass = String.valueOf(txtPass.getPassword());
        if(!"".equals(pass) || !"".equals(correo)){
            lg = login.log(correo, pass);
            if(lg.getCorreo()!=null && lg.getPass()!=null){
                sistemaPrincipal sis= new sistemaPrincipal();
                sis.setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Correo o contraseña incorrectos.");
                txtCorreo.setText("");
                txtPass.setText("");
            }
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 240, 201));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(86, 89, 156));
        jLabel2.setText("Login ");
        jLabel2.setPreferredSize(new java.awt.Dimension(73, 35));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 90, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo login.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("sign in to your Account ");
        jLabel4.setPreferredSize(new java.awt.Dimension(123, 14));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 130, -1));

        txtCorreo.setBackground(new java.awt.Color(196, 196, 196));
        txtCorreo.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        txtCorreo.setToolTipText("");
        txtCorreo.setBorder(null);
        txtCorreo.setDisabledTextColor(new java.awt.Color(196, 196, 196));
        txtCorreo.setPreferredSize(new java.awt.Dimension(235, 33));
        txtCorreo.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel5.setText("Username");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 240, 201));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(86, 89, 156));
        jLabel7.setText("Login ");
        jLabel7.setPreferredSize(new java.awt.Dimension(73, 35));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 90, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo login.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setText("sign in to your Account ");
        jLabel9.setPreferredSize(new java.awt.Dimension(123, 14));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 130, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel10.setText("Username");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user 1.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 20, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel12.setText("Password ");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/candado.png"))); // NOI18N
        jLabel13.setPreferredSize(new java.awt.Dimension(20, 18));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 20, 30));

        btnLogin.setBackground(new java.awt.Color(14, 28, 62));
        btnLogin.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 254, 254));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setPreferredSize(new java.awt.Dimension(238, 33));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, 40));

        txtPass.setBackground(new java.awt.Color(196, 196, 196));
        txtPass.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        txtPass.setBorder(null);
        txtPass.setPreferredSize(new java.awt.Dimension(235, 33));
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        validar();
    }//GEN-LAST:event_btnLoginActionPerformed


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
            java.util.logging.Logger.getLogger(LoginPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
