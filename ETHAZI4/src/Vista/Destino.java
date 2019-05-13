
package Vista;

import Controlador.ControladorDestino;
import Modelo.Usuario;
import java.util.ArrayList;

public class Destino extends javax.swing.JFrame {

    public Destino(ArrayList<Usuario> Users) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false);
        
        ControladorDestino Controlador = new ControladorDestino(buscar, anterior,destino,entrada,salida,error,name,exit,Users,adultos,niños,hab,hotel,casa,apartamento,herramienta);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alojamientos = new javax.swing.ButtonGroup();
        anterior = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        herramienta = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        entrada = new com.toedter.calendar.JCalendar();
        salida = new com.toedter.calendar.JCalendar();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        destino = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        niños = new javax.swing.JSpinner();
        adultos = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hab = new javax.swing.JSpinner();
        hotel = new javax.swing.JCheckBox();
        casa = new javax.swing.JCheckBox();
        apartamento = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        anterior.setBackground(new java.awt.Color(51, 51, 51));
        anterior.setForeground(new java.awt.Color(51, 51, 51));
        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        anterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 140, 80));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        name.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 30));

        herramienta.setBackground(new java.awt.Color(153, 153, 153));
        herramienta.setForeground(new java.awt.Color(153, 153, 153));
        herramienta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/herramienta.png"))); // NOI18N
        herramienta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(herramienta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 60));

        exit.setBackground(new java.awt.Color(204, 0, 51));
        exit.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Cerrar Sesión");
        exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 120, 50));

        buscar.setBackground(new java.awt.Color(51, 51, 51));
        buscar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("BUSCAR");
        buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, 120, 70));

        entrada.setWeekOfYearVisible(false);
        getContentPane().add(entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 200, 170));

        salida.setWeekOfYearVisible(false);
        getContentPane().add(salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 200, 170));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("ENTRADA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("SALIDA");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, 30));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        destino.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        destino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 220, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Destino");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 140, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NÚMERO DE HABITACIÓN/ES");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        niños.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        niños.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2, 1));
        niños.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(niños, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 40, 20));

        adultos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        adultos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        adultos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(adultos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 40, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIÑOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADULTOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        hab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        hab.setModel(new javax.swing.SpinnerNumberModel(1, 0, 10, 1));
        hab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(hab, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 40, -1));

        alojamientos.add(hotel);
        hotel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        hotel.setText("HOTEL");
        hotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, 30));

        alojamientos.add(casa);
        casa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        casa.setText("CASA");
        casa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(casa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 70, 30));

        alojamientos.add(apartamento);
        apartamento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        apartamento.setText("APARTAMENTO");
        apartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(apartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de Alojamiento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 490, 310));

        error.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 290, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner adultos;
    private javax.swing.ButtonGroup alojamientos;
    private javax.swing.JButton anterior;
    private javax.swing.JCheckBox apartamento;
    private javax.swing.JButton buscar;
    private javax.swing.JCheckBox casa;
    public javax.swing.JComboBox<String> destino;
    private com.toedter.calendar.JCalendar entrada;
    private javax.swing.JLabel error;
    private javax.swing.JButton exit;
    private javax.swing.JSpinner hab;
    private javax.swing.JButton herramienta;
    private javax.swing.JCheckBox hotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JSpinner niños;
    private com.toedter.calendar.JCalendar salida;
    // End of variables declaration//GEN-END:variables
}
