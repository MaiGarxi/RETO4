
package Vista;

import Controlador.ControladorUsuario;
import Modelo.Usuario;
import java.util.ArrayList;

public class Usuarios extends javax.swing.JFrame {

    public Usuarios(ArrayList<Usuario> Users) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false);     
        
        ControladorUsuario usuario = new ControladorUsuario(actualizar,cancelar,delete,Users);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actualizar = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actualizar.setBackground(new java.awt.Color(51, 51, 51));
        actualizar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setText("ACTUALIZAR DATOS");
        actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 160, 40));

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("ELIMINAR USUARIO");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 160, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Datos Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 300, 70));

        cancelar.setBackground(new java.awt.Color(51, 51, 51));
        cancelar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 150, 70));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -29, 720, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
