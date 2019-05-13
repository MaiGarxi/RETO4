
package Vista;

import Controlador.ControladorUsuarios;
import Modelo.Usuario;
import java.util.ArrayList;

public class Usuarios extends javax.swing.JFrame {

    public Usuarios(ArrayList<Usuario> Users) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false);     
        
        ControladorUsuarios usuario = new ControladorUsuarios(actualizar,cancelar,delete,Users,CancelarReserva,apellidos,dni,fechanac,nombre,sexo);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actualizar = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        CancelarReserva = new javax.swing.JButton();
        dni = new javax.swing.JLabel();
        jlabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        fechanac = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actualizar.setBackground(new java.awt.Color(51, 51, 51));
        actualizar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setText("ACTUALIZAR DATOS");
        actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 160, 40));

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("ELIMINAR USUARIO");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 160, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Reservas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 200, 70));

        cancelar.setBackground(new java.awt.Color(51, 51, 51));
        cancelar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 140, 80));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Datos Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 300, 70));

        jTable2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod_Reserva", "Entrada", "Salida", "Alojamiento", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 630, 90));

        CancelarReserva.setBackground(new java.awt.Color(51, 51, 51));
        CancelarReserva.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        CancelarReserva.setForeground(new java.awt.Color(255, 255, 255));
        CancelarReserva.setText("CANCELAR RESERVA");
        CancelarReserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(CancelarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 160, 40));

        dni.setBackground(new java.awt.Color(0, 0, 0));
        dni.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        dni.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 160, 30));

        jlabel1.setBackground(new java.awt.Color(255, 255, 255));
        jlabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(0, 0, 0));
        jlabel1.setText("DNI:");
        getContentPane().add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 40, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("APELLIDOS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jlabel2.setBackground(new java.awt.Color(255, 255, 255));
        jlabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jlabel2.setForeground(new java.awt.Color(0, 0, 0));
        jlabel2.setText("NOMBRE:");
        getContentPane().add(jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 170, -1));

        jlabel3.setBackground(new java.awt.Color(255, 255, 255));
        jlabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jlabel3.setForeground(new java.awt.Color(0, 0, 0));
        jlabel3.setText("SEXO:");
        getContentPane().add(jlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 50, -1));

        nombre.setBackground(new java.awt.Color(0, 0, 0));
        nombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 160, 30));

        apellidos.setBackground(new java.awt.Color(0, 0, 0));
        apellidos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        apellidos.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 160, 30));

        sexo.setBackground(new java.awt.Color(0, 0, 0));
        sexo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        sexo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 160, 30));

        fechanac.setBackground(new java.awt.Color(0, 0, 0));
        fechanac.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        fechanac.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(fechanac, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 160, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarReserva;
    private javax.swing.JButton actualizar;
    private javax.swing.JLabel apellidos;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton delete;
    private javax.swing.JLabel dni;
    private javax.swing.JLabel fechanac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel sexo;
    // End of variables declaration//GEN-END:variables
}
