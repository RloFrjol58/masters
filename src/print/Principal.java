
package print;

public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnRefacciones = new javax.swing.JButton();
        btnMecanicos = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRefacciones.setBackground(new java.awt.Color(204, 255, 255));
        btnRefacciones.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnRefacciones.setForeground(new java.awt.Color(0, 0, 0));
        btnRefacciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/print/engine_4929182 (1).png"))); // NOI18N
        btnRefacciones.setText("MENU REFACCIONES");
        btnRefacciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefacciones.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnRefacciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRefacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefaccionesActionPerformed(evt);
            }
        });

        btnMecanicos.setBackground(new java.awt.Color(204, 255, 255));
        btnMecanicos.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnMecanicos.setForeground(new java.awt.Color(0, 0, 0));
        btnMecanicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/print/superhero_1541693.png"))); // NOI18N
        btnMecanicos.setText("REGISTRO MECANICOS");
        btnMecanicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMecanicos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnMecanicos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMecanicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMecanicosActionPerformed(evt);
            }
        });

        btnServicios.setBackground(new java.awt.Color(204, 255, 255));
        btnServicios.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(0, 0, 0));
        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/print/electric-car_4277608.png"))); // NOI18N
        btnServicios.setText("MENU SERVICIOS");
        btnServicios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnServicios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnServicios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BIENVENIDO A RIP ");

        btnUsuarios.setBackground(new java.awt.Color(204, 255, 255));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/print/racer_1505523.png"))); // NOI18N
        btnUsuarios.setText("REGISTRO USUARIOS");
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btnRefacciones, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnMecanicos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnServicios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnUsuarios, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMecanicos)
                    .addComponent(btnRefacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUsuarios)
                    .addComponent(btnRefacciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnServicios)
                    .addComponent(btnMecanicos))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefaccionesActionPerformed
        Refaccion v2 = new Refaccion();
        v2.setVisible(true);
       
        if (!v2.isShowing()) {
             jDesktopPane1.add(v2); 
        }
    }//GEN-LAST:event_btnRefaccionesActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        Servicios v3 = new Servicios();
        v3.setVisible(true);
       
        if (!v3.isShowing()) {
             jDesktopPane1.add(v3); 
        }
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnMecanicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMecanicosActionPerformed
        Mecanicos v4 = new Mecanicos();
        v4.setVisible(true);
       
        if (!v4.isShowing()) {
             jDesktopPane1.add(v4); 
        }
    }//GEN-LAST:event_btnMecanicosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        Usuarios v1 = new Usuarios();
        v1.setVisible(true);

        if (!v1.isShowing()) {
            jDesktopPane1.add(v1);
        }
    }//GEN-LAST:event_btnUsuariosActionPerformed

    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMecanicos;
    private javax.swing.JButton btnRefacciones;
    private javax.swing.JButton btnServicios;
    public javax.swing.JButton btnUsuarios;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
