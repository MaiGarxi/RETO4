
package Vista;

import Controlador.ControladorLista;

public class Lista extends javax.swing.JFrame {

    public Lista() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false);
        
        ControladorLista Controlador = new ControladorLista(reservar, anterior, hotel);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        hotel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        reservar = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("HOTEL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 130, 60));

        getContentPane().add(hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 280, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PRECIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 100, 40));
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 110, 40));

        reservar.setBackground(new java.awt.Color(51, 51, 51));
        reservar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        reservar.setForeground(new java.awt.Color(255, 255, 255));
        reservar.setText("RESERVAR");
        reservar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarActionPerformed(evt);
            }
        });
        getContentPane().add(reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, 170, 80));

        anterior.setBackground(new java.awt.Color(51, 51, 51));
        anterior.setForeground(new java.awt.Color(51, 51, 51));
        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        anterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        getContentPane().add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 160, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_anteriorActionPerformed

    private void reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_reservarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JComboBox<String> hotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel precio;
    private javax.swing.JButton reservar;
    // End of variables declaration//GEN-END:variables
}
