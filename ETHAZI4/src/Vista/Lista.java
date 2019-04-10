
package Vista;

import Controlador.ControladorLista;
import Controlador.PasarPagina;
import java.sql.SQLException;

public class Lista extends javax.swing.JFrame {

    public Lista() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false);
        
        ControladorLista Controlador = new ControladorLista(reservar, anterior, hotel, precio,jList1,jLabel5,entrada,salida);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        reservar = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        hotel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        doble = new javax.swing.JRadioButton();
        individual = new javax.swing.JRadioButton();
        infantil = new javax.swing.JRadioButton();
        entrada = new com.toedter.calendar.JCalendar();
        salida = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("HOTEL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 130, 60));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PRECIO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, 100, 40));

        precio.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 660, 130, 40));

        reservar.setBackground(new java.awt.Color(51, 51, 51));
        reservar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        reservar.setForeground(new java.awt.Color(255, 255, 255));
        reservar.setText("RESERVAR");
        reservar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, 140, 80));

        anterior.setBackground(new java.awt.Color(51, 51, 51));
        anterior.setForeground(new java.awt.Color(51, 51, 51));
        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        anterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 140, 80));

        jList1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 330, 280));

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Debes Escoger un Hotel");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 200, 30));

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

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("ENTRADA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("SALIDA");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hotel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 310, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Destino");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("TIPO DE HABITACIÓN:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, 30));

        doble.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        doble.setText("DOBLE");
        doble.setActionCommand("");
        jPanel1.add(doble, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, -1));

        individual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        individual.setText("INDIVIDUAL");
        jPanel1.add(individual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, -1));

        infantil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        infantil.setText("INFANTIL");
        jPanel1.add(infantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 350, 280));

        entrada.setWeekOfYearVisible(false);
        getContentPane().add(entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 200, 170));

        salida.setWeekOfYearVisible(false);
        getContentPane().add(salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 200, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    PasarPagina pasar = new PasarPagina();
    pasar.Bienvenida();
    dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JRadioButton doble;
    private com.toedter.calendar.JCalendar entrada;
    public javax.swing.JComboBox<String> hotel;
    private javax.swing.JRadioButton individual;
    private javax.swing.JRadioButton infantil;
    private javax.swing.JButton jButton6;
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
    public javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel precio;
    private javax.swing.JButton reservar;
    private com.toedter.calendar.JCalendar salida;
    // End of variables declaration//GEN-END:variables
}
