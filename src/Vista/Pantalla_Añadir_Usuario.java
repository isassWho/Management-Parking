/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Isass
 */
public class Pantalla_Añadir_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla_Añadir_Usuario
     */
    public Pantalla_Añadir_Usuario() {
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

        panelPrincipal = new javax.swing.JPanel();
        TabbedPane = new javax.swing.JTabbedPane();
        pestañaSeguridad = new javax.swing.JPanel();
        panelSeguridad = new javax.swing.JPanel();
        botonGuardarSeguridad = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pestañaExterior = new javax.swing.JPanel();
        panelExterior = new javax.swing.JPanel();
        botonGuardarExterior = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabbedPane.setBackground(new java.awt.Color(0, 153, 255));
        TabbedPane.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TabbedPane.setOpaque(true);

        pestañaSeguridad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSeguridad.setBackground(new java.awt.Color(153, 204, 255));
        panelSeguridad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonGuardarSeguridad.setBackground(new java.awt.Color(255, 204, 51));
        botonGuardarSeguridad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonGuardarSeguridad.setForeground(new java.awt.Color(51, 51, 51));
        botonGuardarSeguridad.setText("Registrar");
        panelSeguridad.add(botonGuardarSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelSeguridad.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, -1));
        panelSeguridad.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 40, -1));
        panelSeguridad.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));
        panelSeguridad.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 40, -1));

        jLabel2.setText("Nombre");
        panelSeguridad.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setText("Edad");
        panelSeguridad.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, -1));

        jLabel4.setText("Otro");
        panelSeguridad.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 20));

        jLabel5.setText("Otro mas");
        panelSeguridad.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        pestañaSeguridad.add(panelSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 230));

        TabbedPane.addTab("Seguridad", pestañaSeguridad);

        pestañaExterior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelExterior.setBackground(new java.awt.Color(153, 204, 255));
        panelExterior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonGuardarExterior.setBackground(new java.awt.Color(255, 204, 51));
        botonGuardarExterior.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonGuardarExterior.setForeground(new java.awt.Color(51, 51, 51));
        botonGuardarExterior.setText("Registrar");
        panelExterior.add(botonGuardarExterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        panelExterior.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, -1));
        panelExterior.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 40, -1));

        jTextField7.setText(" ");
        panelExterior.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 60, -1));

        jTextField8.setText(" ");
        panelExterior.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        jTextField9.setText(" ");
        panelExterior.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 70, -1));

        jLabel6.setText("Nombre");
        panelExterior.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel7.setText("Edad");
        panelExterior.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel8.setText("Color");
        panelExterior.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel9.setText("Carro");
        panelExterior.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jLabel10.setText("modelo");
        panelExterior.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        pestañaExterior.add(panelExterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 230));

        TabbedPane.addTab("Exterior", pestañaExterior);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registro de Usuario");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(TabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_Añadir_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Añadir_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Añadir_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Añadir_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Añadir_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    public javax.swing.JButton botonGuardarExterior;
    public javax.swing.JButton botonGuardarSeguridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel panelExterior;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSeguridad;
    private javax.swing.JPanel pestañaExterior;
    private javax.swing.JPanel pestañaSeguridad;
    // End of variables declaration//GEN-END:variables
}
