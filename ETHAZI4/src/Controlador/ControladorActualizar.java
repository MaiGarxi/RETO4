
package Controlador;

import Modelo.Usuario;
import Vista.Actualizar;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControladorActualizar {

    public ControladorActualizar(JRadioButton H, JRadioButton M, JButton BotonAnterior, JButton actualizar, JTextField apellidos, JPasswordField contraseña, JTextField dni, JDateChooser fecha_nac, ButtonGroup gruposexo, JTextField nombre, JPasswordField password) {
        
        Usuario usu = new Usuario();
        
        dni.setEnabled(false);
        dni.setText(usu.dni);
        nombre.setText(usu.nombre);
        apellidos.setText(usu.apellidos);
        contraseña.setText(usu.contraseña);
        password.setText(usu.contraseña);
        
        BotonAnterior.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { 
                PasarPagina pasar = new PasarPagina();
                pasar.ActualizaraLogin();
            }    
        });
        
        actualizar.addMouseListener(new MouseAdapter() {
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
                String fecha = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(Actualizar.fecha_nac.getDate());
                Usuario usu = new Usuario();
                usu.Actualizar(dni.getText(), nombre.getText(), apellidos.getText(), fecha, sexo, contraseña.getText(),password.getText()) ;
            }    
        });
    }
    
}
