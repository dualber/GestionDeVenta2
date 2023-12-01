
package GUI;

import GUI.frm_pagina;
import GUI.frm_pagina4;


public class frm_pagina3 extends javax.swing.JFrame {

   
    public frm_pagina3() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_clases = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        btn_todo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_notificaciones = new javax.swing.JButton();
        btn_perfil = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 219, 194));

        btn_clases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/video (1) (1) (1).png"))); // NOI18N
        btn_clases.setBorderPainted(false);
        btn_clases.setContentAreaFilled(false);
        btn_clases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clasesActionPerformed(evt);
            }
        });

        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga__4___1_-removebg-preview.png"))); // NOI18N
        btn_inicio.setBorderPainted(false);
        btn_inicio.setContentAreaFilled(false);
        btn_inicio.setDefaultCapable(false);

        btn_todo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/todo.png"))); // NOI18N
        btn_todo.setBorderPainted(false);
        btn_todo.setContentAreaFilled(false);
        btn_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_todoActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/150-removebg-preview.png"))); // NOI18N

        btn_notificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/notificacion (3).png"))); // NOI18N
        btn_notificaciones.setBorderPainted(false);
        btn_notificaciones.setContentAreaFilled(false);
        btn_notificaciones.setDefaultCapable(false);
        btn_notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notificacionesActionPerformed(evt);
            }
        });

        btn_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatar2.png"))); // NOI18N
        btn_perfil.setBorderPainted(false);
        btn_perfil.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btn_inicio)
                .addGap(70, 70, 70)
                .addComponent(btn_todo)
                .addGap(76, 76, 76)
                .addComponent(btn_clases)
                .addGap(94, 94, 94)
                .addComponent(btn_notificaciones)
                .addGap(85, 85, 85)
                .addComponent(btn_perfil)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_clases, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 80));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Permíte te soñar en colores ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 320, 30));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel5.setText(" y verás cómo la creatividad ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 280, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel6.setText(" se convierte en tu mejor obra");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga (6).jpeg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 800, 680));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salr.png"))); // NOI18N
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel3.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 700, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_notificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notificacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_notificacionesActionPerformed

    private void btn_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_todoActionPerformed
    frm_pagina4 nuevapagina = new frm_pagina4 (); 
     nuevapagina.setVisible(true);
     this.dispose(); 
    }//GEN-LAST:event_btn_todoActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        
     frm_pagina nuevapagina = new frm_pagina(); 
     nuevapagina.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_clasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clasesActionPerformed
        frm_pagina4 nuevapagina = new frm_pagina4(); 
     nuevapagina.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btn_clasesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IllegalAccessException {
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
            java.util.logging.Logger.getLogger(frm_pagina3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_pagina3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            /*} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_pagina3.class.getName()).log(java.utilbtn_Iniciog.Level.SEVERE, null, ex);*/
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_pagina3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_pagina3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clases;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_notificaciones;
    private javax.swing.JButton btn_perfil;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_todo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
