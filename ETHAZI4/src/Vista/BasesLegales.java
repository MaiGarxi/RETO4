
package Vista;

import Controlador.ControladorBasesLegales;

public class BasesLegales extends javax.swing.JFrame {

    public BasesLegales() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false); 
        
        ControladorBasesLegales baseslegales = new ControladorBasesLegales(aceptar,cancelar,bases);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bases = new javax.swing.JTextArea();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("BASES LEGALES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 390, 60));

        bases.setColumns(20);
        bases.setRows(5);
        jScrollPane1.setViewportView(bases);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 580, 480));

        aceptar.setBackground(new java.awt.Color(51, 51, 51));
        aceptar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setText("ACEPTAR");
        aceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 160, 40));

        cancelar.setBackground(new java.awt.Color(51, 51, 51));
        cancelar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("CANCELAR");
        cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextArea bases;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
