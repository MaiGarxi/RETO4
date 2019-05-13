
package Controlador;

import Modelo.Usuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ControladorUsuarios {
    
    public ControladorUsuarios( JButton actualizar,JButton cancelar, JButton delete,ArrayList<Usuario> Users,JButton CancelarReserva,JLabel apellidos,JLabel dni,JLabel fechanac,JLabel nombre,JLabel sexo) {
        
        nombre.setText(Users.get(0).nombre);
        dni.setText(Users.get(0).dni);
        apellidos.setText(Users.get(0).apellidos);
        sexo.setText(Users.get(0).sexo);
        fechanac.setText(Users.get(0).fecha);
        dni.setEnabled(false);
        nombre.setEnabled(false);
        apellidos.setEnabled(false);
        sexo.setEnabled(false);
        fechanac.setEnabled(false);
        
        
        PasarPagina pasar = new PasarPagina();
        
        delete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                Usuario usu = new Usuario();
                usu.Delete(Users.get(0).getDni(),Users.get(0).getContraseña());
                pasar.BienvenidaaLogin();               
            }
        });    
        
        actualizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { 
                Usuario usu = new Usuario(); 
                Usuario recibe=new Usuario();
                ArrayList<Usuario> users= new ArrayList<Usuario>();
                try {
                    recibe= usu.Login(Users.get(0).getDni(),Users.get(0).getContraseña());
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                users=usu.crear_Array(recibe);
                pasar.UsuariosaActualizar(users);
            } 
        }); 
        
        cancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                pasar.UsuariosaDestino();               
            }
        });  
        
    }
}
