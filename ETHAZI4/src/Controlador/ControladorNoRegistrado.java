
package Controlador;

import Modelo.Usuario;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControladorNoRegistrado {

    public ControladorNoRegistrado(JRadioButton H, JRadioButton M, JButton Registrar, JTextField apellidos, JPasswordField contraseña, JTextField dni, JDateChooser fecha_nac, JTextField nombre, JPasswordField password, JPasswordField contraseña0, JButton BotonAnterior) {


        BotonAnterior.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { 
                PasarPagina pasar = new PasarPagina();
                pasar.NewaLogin();
            }    
        });
    }
                
}
