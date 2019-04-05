
package Vista;

import Controlador.ControladorPago;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Pago extends javax.swing.JFrame {
    
    public double valor;
    
    public Pago() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false);
        
        totalAPagar.setText(String.valueOf(valor+" €"));
        
        ControladorPago Controlador = new ControladorPago(cancelar, reiniciar, confirmar,actualizaPago,bi200,bi100,bi50,bi20,bi10,bi5,mo2,mo1,mo01,mo02,mo05,mo001,mo002,mo005);
        
        ImageIcon Imagen = new ImageIcon ("src/Imagenes/200.jpg");
        Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(bi200.getWidth(), bi200.getHeight(), Image.SCALE_DEFAULT));bi200.setIcon(icono);
        this.repaint();

        ImageIcon Imagen2 = new ImageIcon ("src/Imagenes/100.jpg");
        Icon icono2 = new ImageIcon(Imagen2.getImage().getScaledInstance(bi100.getWidth(), bi100.getHeight(), Image.SCALE_DEFAULT));bi100.setIcon(icono2);
        this.repaint();

        ImageIcon Imagen3 = new ImageIcon ("src/Imagenes/50.png");
        Icon icono3 = new ImageIcon(Imagen3.getImage().getScaledInstance(bi50.getWidth(), bi50.getHeight(), Image.SCALE_DEFAULT));bi50.setIcon(icono3);
        this.repaint();

        ImageIcon Imagen4 = new ImageIcon ("src/Imagenes/20.png");
        Icon icono4 = new ImageIcon(Imagen4.getImage().getScaledInstance(bi20.getWidth(), bi20.getHeight(), Image.SCALE_DEFAULT));bi20.setIcon(icono4);
        this.repaint();

        ImageIcon Imagen5 = new ImageIcon ("src/Imagenes/10.jpg");
        Icon icono5 = new ImageIcon(Imagen5.getImage().getScaledInstance(bi10.getWidth(), bi10.getHeight(), Image.SCALE_DEFAULT));bi10.setIcon(icono5);
        this.repaint();

        ImageIcon Imagen6 = new ImageIcon ("src/Imagenes/5.png");
        Icon icono6 = new ImageIcon(Imagen6.getImage().getScaledInstance(bi5.getWidth(), bi5.getHeight(), Image.SCALE_DEFAULT));bi5.setIcon(icono6);
        this.repaint();

        ImageIcon Imagen7 = new ImageIcon ("src/Imagenes/2euros.jpg");
        Icon icono7 = new ImageIcon(Imagen7.getImage().getScaledInstance(mo2.getWidth(), mo2.getHeight(), Image.SCALE_DEFAULT));mo2.setIcon(icono7);
        this.repaint();

        ImageIcon Imagen8 = new ImageIcon ("src/Imagenes/1.jpg");
        Icon icono8 = new ImageIcon(Imagen8.getImage().getScaledInstance(mo1.getWidth(), mo1.getHeight(), Image.SCALE_DEFAULT));mo1.setIcon(icono8);
        this.repaint();

        ImageIcon Imagen9 = new ImageIcon ("src/Imagenes/50 cent.jpg");
        Icon icono9 = new ImageIcon(Imagen9.getImage().getScaledInstance(mo05.getWidth(), mo05.getHeight(), Image.SCALE_DEFAULT));mo05.setIcon(icono9);
        this.repaint();

        ImageIcon Imagen10 = new ImageIcon ("src/Imagenes/20 cent.gif");
        Icon icono10 = new ImageIcon(Imagen10.getImage().getScaledInstance(mo02.getWidth(), mo02.getHeight(), Image.SCALE_DEFAULT));mo02.setIcon(icono10);
        this.repaint();

        ImageIcon Imagen11 = new ImageIcon ("src/Imagenes/10 centimos.jpg");
        Icon icono11 = new ImageIcon(Imagen11.getImage().getScaledInstance(mo01.getWidth(), mo01.getHeight(), Image.SCALE_DEFAULT));mo01.setIcon(icono11);
        this.repaint();

        ImageIcon Imagen12 = new ImageIcon ("src/Imagenes/5 cent.jpg");
        Icon icono12 = new ImageIcon(Imagen12.getImage().getScaledInstance(mo005.getWidth(), mo005.getHeight(), Image.SCALE_DEFAULT));mo005.setIcon(icono12);
        this.repaint();

        ImageIcon Imagen13 = new ImageIcon ("src/Imagenes/2 cent.jpg");
        Icon icono13 = new ImageIcon(Imagen13.getImage().getScaledInstance(mo002.getWidth(), mo002.getHeight(), Image.SCALE_DEFAULT));mo002.setIcon(icono13);
        this.repaint();

        ImageIcon Imagen14 = new ImageIcon ("src/Imagenes/1 cent.jpg");
        Icon icono14 = new ImageIcon(Imagen14.getImage().getScaledInstance(mo001.getWidth(), mo001.getHeight(), Image.SCALE_DEFAULT));mo001.setIcon(icono14);
        this.repaint();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        totalAPagar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bi50 = new javax.swing.JButton();
        bi20 = new javax.swing.JButton();
        bi10 = new javax.swing.JButton();
        bi5 = new javax.swing.JButton();
        mo2 = new javax.swing.JButton();
        mo1 = new javax.swing.JButton();
        mo05 = new javax.swing.JButton();
        mo02 = new javax.swing.JButton();
        mo01 = new javax.swing.JButton();
        mo005 = new javax.swing.JButton();
        bi100 = new javax.swing.JButton();
        mo002 = new javax.swing.JButton();
        mo001 = new javax.swing.JButton();
        actualizaPago = new javax.swing.JLabel();
        bi200 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        reiniciar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("ALEJANDRO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        cancelar.setBackground(new java.awt.Color(51, 51, 51));
        cancelar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("CANCELAR");
        cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 170, 90));

        confirmar.setBackground(new java.awt.Color(51, 51, 51));
        confirmar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        confirmar.setForeground(new java.awt.Color(255, 255, 255));
        confirmar.setText("CONFIRMAR");
        confirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, 170, 90));

        totalAPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(totalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TOTAL A PAGAR:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));
        getContentPane().add(bi50, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 110, 60));
        getContentPane().add(bi20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 110, 60));
        getContentPane().add(bi10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 110, 60));
        getContentPane().add(bi5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 110, 60));
        getContentPane().add(mo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 80, 60));
        getContentPane().add(mo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 80, 60));
        getContentPane().add(mo05, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 80, 60));
        getContentPane().add(mo02, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 80, 60));
        getContentPane().add(mo01, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 80, 60));
        getContentPane().add(mo005, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 80, 60));
        getContentPane().add(bi100, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 110, 60));
        getContentPane().add(mo002, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 80, 60));
        getContentPane().add(mo001, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 80, 60));

        actualizaPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(actualizaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 80, 30));
        getContentPane().add(bi200, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 110, 60));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PAGADO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

        reiniciar.setBackground(new java.awt.Color(51, 51, 51));
        reiniciar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        reiniciar.setText("REINICIAR PAGO");
        reiniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Seleccione el dinero a ingresar:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
     this.setVisible(false);
    }//GEN-LAST:event_confirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualizaPago;
    private javax.swing.JButton bi10;
    private javax.swing.JButton bi100;
    private javax.swing.JButton bi20;
    public javax.swing.JButton bi200;
    private javax.swing.JButton bi5;
    private javax.swing.JButton bi50;
    private javax.swing.JButton cancelar;
    public javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mo001;
    private javax.swing.JButton mo002;
    private javax.swing.JButton mo005;
    private javax.swing.JButton mo01;
    private javax.swing.JButton mo02;
    private javax.swing.JButton mo05;
    private javax.swing.JButton mo1;
    private javax.swing.JButton mo2;
    private javax.swing.JButton reiniciar;
    private javax.swing.JLabel totalAPagar;
    // End of variables declaration//GEN-END:variables
}
