
package Controlador;

import Modelo.Usuario;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControladorNoRegistrado {

    public ControladorNoRegistrado(JRadioButton H, JRadioButton M, JButton Registrar, JTextField apellidos, JPasswordField contraseña, JTextField dni, JDateChooser fecha_nac, JTextField nombre, JPasswordField password, JPasswordField contraseña0, JButton BotonAnterior) {
        
        PasarPagina pasar = new PasarPagina();
        Usuario usu = new Usuario();
        Registrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String sexo = "";
                if (H.isSelected()){
                    sexo= "V";
                } else if (M.isSelected()){
                    sexo= "M";
                } 
                Date date = fecha_nac.getDate();
                if (date == null) {
                  JOptionPane.showMessageDialog(null, "No has ingresado la Fecha de Nacimiento");
                }               
                String fecha = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(fecha_nac.getDate());
                try {
                    usu.CrearUsuario(dni.getText(), nombre.getText(), apellidos.getText(), fecha, sexo, contraseña.getText(),password.getText());
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorNoRegistrado.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }    
        });

        BotonAnterior.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {            
                pasar.NewaLogin();
            }    
        });
    }
                
}
