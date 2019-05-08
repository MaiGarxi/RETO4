
package Vista;

import Controlador.ControladorLista;
import Modelo.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

public class Lista extends javax.swing.JFrame {

    public Lista(String localidad,String Alojamiento,ArrayList<Usuario> Users, String entradas, String salidas,ArrayList<ArrayList> patron, int dias,int personas,int habitaciones,int ninos) throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false);
        
        ControladorLista Controlador = new ControladorLista(reservar, anterior, hotel,localidad, Alojamiento, precio,jTable2,error,Users,name,exit,entradas,salidas,jTable1,patron,dias,jLabel2,personas,habitaciones,ninos);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        reservar = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        hotel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("HOTEL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 310, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("PRECIO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 660, 100, 40));

        precio.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 660, 260, 40));

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

        error.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, 250, 30));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        name.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        name.setText("ALEJANDRO");
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        exit.setBackground(new java.awt.Color(204, 0, 51));
        exit.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Cerrar Sesión");
        exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 120, 30));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hotel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 220, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Destino");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 260, 120));

        jCheckBox1.setText("WIFI");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, -1));

        jCheckBox2.setText("PISCINA");
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        jCheckBox3.setText("SPA");
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, -1));

        jCheckBox4.setText("PARKING");
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 100, -1));

        jCheckBox5.setText("AIRE ACONDICIONADO");
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jCheckBox6.setText("RESTAURANTE");
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jCheckBox7.setText("BAR");
        getContentPane().add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 100, -1));

        jCheckBox8.setText("GIMNASIO");
        getContentPane().add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 100, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("HABITACIÓN/ES:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 270, 40));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable1.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setDoubleBuffered(true);
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 390, 140));

        jTable2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setRowHeight(40);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 110, 390, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JLabel error;
    private javax.swing.JButton exit;
    public javax.swing.JComboBox<String> hotel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel name;
    public javax.swing.JLabel precio;
    private javax.swing.JButton reservar;
    // End of variables declaration//GEN-END:variables
}
