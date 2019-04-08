package Vista;

import Controlador.ControladorUsuario;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false);
        
        ControladorUsuario Controlador = new ControladorUsuario(conectar,actualizar,Nuevousuario,delete,us,pass);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        us = new java.awt.TextField();
        BotonAnterior = new javax.swing.JButton();
        conectar = new javax.swing.JButton();
        Nuevousuario = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 110, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("USUARIO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setForeground(new java.awt.Color(0, 0, 0));
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 150, 30));
        getContentPane().add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 150, 30));

        BotonAnterior.setBackground(new java.awt.Color(51, 51, 51));
        BotonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        BotonAnterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 120, 80));

        conectar.setBackground(new java.awt.Color(51, 51, 51));
        conectar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        conectar.setForeground(new java.awt.Color(255, 255, 255));
        conectar.setText("CONECTAR");
        conectar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(conectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 160, 80));

        Nuevousuario.setBackground(new java.awt.Color(51, 51, 51));
        Nuevousuario.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        Nuevousuario.setForeground(new java.awt.Color(255, 255, 255));
        Nuevousuario.setText("NUEVO USUARIO");
        Nuevousuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Nuevousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 160, 40));

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("ELIMINAR USUARIO");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 160, 40));

        actualizar.setBackground(new java.awt.Color(51, 51, 51));
        actualizar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setText("ACTUALIZAR DATOS");
        actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 160, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CONTRASEÑA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
    Controlador.PasarPagina.classLoginaBienvenida();
    dispose();
    }//GEN-LAST:event_BotonAnteriorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton Nuevousuario;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton conectar;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pass;
    private java.awt.TextField us;
    // End of variables declaration//GEN-END:variables
}
