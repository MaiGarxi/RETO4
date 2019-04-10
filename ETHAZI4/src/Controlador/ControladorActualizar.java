
package Controlador;

import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControladorActualizar {

    public ControladorActualizar(JRadioButton H, JRadioButton M, JButton BotonAnterior, JButton actualizar, JTextField apellidos, JPasswordField contraseña, JTextField dni, JDateChooser fecha_nac, ButtonGroup gruposexo, JTextField nombre, JPasswordField password) {
    
          BotonAnterior.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { 
                PasarPagina pasar = new PasarPagina();
                pasar.ActualizaraLogin();
            }    
        });
    }
    
}
