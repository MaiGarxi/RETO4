
package Vista;

import Controlador.ControladorDestino;

public class Destino extends javax.swing.JFrame {

    public Destino() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false);

        ControladorDestino Controlador = new ControladorDestino(buscar,destino,entrada,salida);
    }    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        destino = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        entrada = new com.toedter.calendar.JCalendar();
        salida = new com.toedter.calendar.JCalendar();
        buscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DESTINO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 190, 50));

        destino.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 320, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ENTRADA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("SALIDA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 90, 40));

        entrada.setDate(new java.util.Date(1554661364000L));
        entrada.setWeekOfYearVisible(false);
        getContentPane().add(entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        salida.setWeekOfYearVisible(false);
        getContentPane().add(salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        buscar.setBackground(new java.awt.Color(51, 51, 51));
        buscar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("BUSCAR");
        buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 220, 90));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setText("ALEJANDRO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jButton6.setBackground(new java.awt.Color(204, 0, 51));
        jButton6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cerrar Sesión");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    public javax.swing.JComboBox<String> destino;
    private com.toedter.calendar.JCalendar entrada;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JCalendar salida;
    // End of variables declaration//GEN-END:variables
}
