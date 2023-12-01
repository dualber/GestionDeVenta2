

package GUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.logging.Logger; 
import java.util.logging.*;

public class frm_pagina extends javax.swing.JFrame {
   
    
    usuarioDao usuDao = new usuarioDao();
    usuarioLogic usuLog = new usuarioLogic();
    
    public frm_pagina() {
        initComponents();
        // txt_usuario.putClientProperty("JComponent.roundRect",true); //redonde la caja de texto
      
    }
    
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Icono = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        txt_usuario = new javax.swing.JTextField();
        btn_registrarse = new javax.swing.JButton();
        txt_contrasena = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 219, 194));

        jPanel2.setBackground(new java.awt.Color(239, 219, 194));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/150-removebg-preview.png"))); // NOI18N
        jPanel2.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(228, 194, 156));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 26)); // NOI18N
        jLabel6.setText("Inicio de sesion");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel5.setText("Contraseña:");

        btn_login.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btn_login.setText("Login");
        btn_login.setAutoscrolls(true);
        btn_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        txt_usuario.setBackground(new java.awt.Color(239, 219, 194));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        btn_registrarse.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        btn_registrarse.setText("¿registrarse?");
        btn_registrarse.setBorderPainted(false);
        btn_registrarse.setContentAreaFilled(false);
        btn_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarseActionPerformed(evt);
            }
        });

        txt_contrasena.setBackground(new java.awt.Color(239, 219, 194));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 320, 390));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel3.setText("¡ Bienvenido Artista !");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mona lisa.jpeg"))); // NOI18N
        jPanel2.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String correo = txt_usuario.getText();
        String pass = String.valueOf(txt_contrasena.getPassword());
        if(!"".equals(correo)||!"".equals(pass)){
            if(usuLog.autentificar(txt_usuario.getText(),String.valueOf(txt_contrasena.getPassword()))){
                frm_pagina3 nuevapagina = new frm_pagina3 (); 
                nuevapagina.setVisible(true);
                this.dispose();
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null,"correo o contraseña incorrecta");
        }

    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarseActionPerformed
     frm_pagina2 p2 = new frm_pagina2(); 
     p2.setVisible(true);
     this.dispose();// ciera la venta cuando se abra otra, y evia que se acumulen todas las ventanas abiertas
    }//GEN-LAST:event_btn_registrarseActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
      
    }//GEN-LAST:event_txt_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(frm_pagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_pagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_pagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_pagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_pagina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_registrarse;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txt_contrasena;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    private static class usuario {

        public usuario() {
        }

        private boolean verificarCredenciales(String usuario, String contraseña) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
