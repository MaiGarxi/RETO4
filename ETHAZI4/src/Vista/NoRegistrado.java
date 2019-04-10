package Vista;

import Controlador.ControladorNoRegistrado;
import Controlador.PasarPagina;

public class NoRegistrado extends javax.swing.JFrame {

    public NoRegistrado() {
    
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false);
        
        ControladorNoRegistrado Controlador = new ControladorNoRegistrado(H,M,Registrar,apellidos,contraseña,dni,fecha_nac,nombre,password,contraseña);
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gruposexo = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        BotonAnterior = new javax.swing.JButton();
        jlabel2 = new javax.swing.JLabel();
        jlabel1 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        H = new javax.swing.JRadioButton();
        M = new javax.swing.JRadioButton();
        dni = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        fecha_nac = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DATOS USUARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 210, 30));

        BotonAnterior.setBackground(new java.awt.Color(51, 51, 51));
        BotonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        BotonAnterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(BotonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 140, 80));

        jlabel2.setBackground(new java.awt.Color(255, 255, 255));
        jlabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jlabel2.setForeground(new java.awt.Color(0, 0, 0));
        jlabel2.setText("NOMBRE:");
        getContentPane().add(jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jlabel1.setBackground(new java.awt.Color(255, 255, 255));
        jlabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(0, 0, 0));
        jlabel1.setText("DNI:");
        getContentPane().add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 40, 20));

        Registrar.setBackground(new java.awt.Color(51, 51, 51));
        Registrar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("REGISTRAR");
        Registrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 140, 60));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("APELLIDOS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jlabel3.setBackground(new java.awt.Color(255, 255, 255));
        jlabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jlabel3.setForeground(new java.awt.Color(0, 0, 0));
        jlabel3.setText("SEXO:");
        getContentPane().add(jlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 50, -1));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 0, 0));
        pass.setText("CONTRASEÑA:");
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        gruposexo.add(H);
        H.setText("Hombre");
        getContentPane().add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        gruposexo.add(M);
        M.setText("Mujer");
        getContentPane().add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));
        getContentPane().add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 130, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 100, -1));
        getContentPane().add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 130, -1));

        fecha_nac.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(fecha_nac, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 100, 20));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 180, -1));

        contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("REPETIR CONTRASEÑA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 130, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JRadioButton H;
    private javax.swing.JRadioButton M;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField apellidos;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField dni;
    public static com.toedter.calendar.JDateChooser fecha_nac;
    private javax.swing.ButtonGroup gruposexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
