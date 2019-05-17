
package Vista;

import Controlador.ControladorPago;
import Modelo.Cama;
import Modelo.reserva;
import Modelo.Usuario;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Pago extends javax.swing.JFrame {
    
    public double valor, pago2;
    
    public Pago(ArrayList<reserva>reservas,ArrayList <Usuario> Users,String alojamiento,ArrayList <Cama> cama) {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false);               
        
        ControladorPago Controlador = new ControladorPago(Lista,reservas,Users,cama,cancelar, reiniciar, confirmar,actualizaPago,bi200,bi100,bi50,bi20,bi10,bi5,mo2,mo1,mo01,mo02,mo05,mo001,mo002,mo005,totalAPagar,name,exit,alojamiento,herramienta,codigo,texto,OK);
        
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
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        herramienta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        texto = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        jlabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelar.setBackground(new java.awt.Color(51, 51, 51));
        cancelar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("CANCELAR");
        cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 150, 70));

        confirmar.setBackground(new java.awt.Color(51, 51, 51));
        confirmar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        confirmar.setForeground(new java.awt.Color(255, 255, 255));
        confirmar.setText("CONFIRMAR");
        confirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 650, 150, 70));

        totalAPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(totalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("TOTAL A PAGAR:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));
        getContentPane().add(bi50, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 110, 60));
        getContentPane().add(bi20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 110, 60));
        getContentPane().add(bi10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 110, 60));
        getContentPane().add(bi5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 110, 60));
        getContentPane().add(mo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 80, 60));
        getContentPane().add(mo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 80, 60));
        getContentPane().add(mo05, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 80, 60));
        getContentPane().add(mo02, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 80, 60));
        getContentPane().add(mo01, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 80, 60));
        getContentPane().add(mo005, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 80, 60));
        getContentPane().add(bi100, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 110, 60));
        getContentPane().add(mo002, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 80, 60));
        getContentPane().add(mo001, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 80, 60));

        actualizaPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(actualizaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 80, 30));
        getContentPane().add(bi200, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 110, 60));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel5.setText("PAGADO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, -1, -1));

        reiniciar.setBackground(new java.awt.Color(51, 51, 51));
        reiniciar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        reiniciar.setText("REINICIAR PAGO");
        reiniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setText("Seleccione el dinero a ingresar:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 220, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("RESERVA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 40));

        Lista.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(Lista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 680, 120));

        exit.setBackground(new java.awt.Color(204, 0, 51));
        exit.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Cerrar Sesión");
        exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 120, 50));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        name.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 30));

        herramienta.setBackground(new java.awt.Color(153, 153, 153));
        herramienta.setForeground(new java.awt.Color(153, 153, 153));
        herramienta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/herramienta.png"))); // NOI18N
        herramienta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(herramienta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código Promocional:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        codigo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 70, 30));

        texto.setBackground(new java.awt.Color(255, 0, 0));
        texto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 230, 30));

        OK.setBackground(new java.awt.Color(102, 102, 102));
        OK.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        OK.setForeground(new java.awt.Color(255, 255, 255));
        OK.setText("OK");
        OK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 225, 60, 40));

        jlabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        jlabel1.setText("Codigo Promocional:");
        getContentPane().add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista;
    private javax.swing.JButton OK;
    private javax.swing.JLabel actualizaPago;
    private javax.swing.JButton bi10;
    private javax.swing.JButton bi100;
    private javax.swing.JButton bi20;
    public javax.swing.JButton bi200;
    private javax.swing.JButton bi5;
    private javax.swing.JButton bi50;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField codigo;
    public javax.swing.JButton confirmar;
    private javax.swing.JButton exit;
    private javax.swing.JButton herramienta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JButton mo001;
    private javax.swing.JButton mo002;
    private javax.swing.JButton mo005;
    private javax.swing.JButton mo01;
    private javax.swing.JButton mo02;
    private javax.swing.JButton mo05;
    private javax.swing.JButton mo1;
    private javax.swing.JButton mo2;
    private javax.swing.JLabel name;
    private javax.swing.JButton reiniciar;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel totalAPagar;
    // End of variables declaration//GEN-END:variables
}
