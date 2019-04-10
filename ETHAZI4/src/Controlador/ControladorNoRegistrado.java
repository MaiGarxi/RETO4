
package Controlador;

import Modelo.Usuario;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControladorNoRegistrado {

    public ControladorNoRegistrado(JRadioButton H, JRadioButton M, JButton Registrar, JTextField apellidos, JPasswordField contraseña, JTextField dni, JDateChooser fecha_nac, JTextField nombre, JPasswordField password, JPasswordField contraseña0, JButton BotonAnterior) {
        
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
                Usuario usu = new Usuario();
                usu.CrearUsuario(dni.getText(), nombre.getText(), apellidos.getText(), fecha, sexo, contraseña.getText(),password.getText());
            }    
        });

        BotonAnterior.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { 
                PasarPagina pasar = new PasarPagina();
                pasar.NewaLogin();
            }    
        });
    }
                
}
