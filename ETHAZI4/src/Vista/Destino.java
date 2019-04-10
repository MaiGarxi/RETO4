
package Vista;

import Controlador.ControladorDestino;

public class Destino extends javax.swing.JFrame {

    public Destino() {
       initComponents();
        setLocationRelativeTo(null);
        setResizable (false);
        
        ControladorDestino Controlador = new ControladorDestino(buscar, anterior,destino,entrada,salida,error);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anterior = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        entrada = new com.toedter.calendar.JCalendar();
        salida = new com.toedter.calendar.JCalendar();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        destino = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        doble = new javax.swing.JRadioButton();
        individual = new javax.swing.JRadioButton();
        jSpinner2 = new javax.swing.JSpinner();
        infantil = new javax.swing.JRadioButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setText("ALEJANDRO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jButton6.setBackground(new java.awt.Color(204, 0, 51));
        jButton6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cerrar Sesión");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 120, 30));

        buscar.setBackground(new java.awt.Color(51, 51, 51));
        buscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("BUSCAR");
        buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 120, 70));

        entrada.setWeekOfYearVisible(false);
        getContentPane().add(entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 200, 170));

        salida.setWeekOfYearVisible(false);
        getContentPane().add(salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 200, 170));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("ENTRADA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("SALIDA");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        destino.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 220, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Destino");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 140, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("TIPO DE HABITACIÓN:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 30));

        doble.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        doble.setText("DOBLE");
        doble.setActionCommand("");
        jPanel1.add(doble, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 110, -1));

        individual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        individual.setText("INDIVIDUAL");
        jPanel1.add(individual, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 110, -1));

        jSpinner2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 40, 20));

        infantil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        infantil.setText("INFANTIL");
        jPanel1.add(infantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, -1));

        jSpinner1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 40, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIÑOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADULTOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 600, 260));

        error.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));
        error.setText("Debes escoger al menos una noche");
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 290, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton buscar;
    public javax.swing.JComboBox<String> destino;
    private javax.swing.JRadioButton doble;
    private com.toedter.calendar.JCalendar entrada;
    private javax.swing.JLabel error;
    private javax.swing.JRadioButton individual;
    private javax.swing.JRadioButton infantil;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private com.toedter.calendar.JCalendar salida;
    // End of variables declaration//GEN-END:variables
}
