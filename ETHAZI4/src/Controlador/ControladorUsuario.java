
package Controlador;

import Modelo.Usuario;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class ControladorUsuario{
    
    public ControladorUsuario(JButton conectar, JButton actualizar, JButton Nuevousuario, JButton delete, TextField us, JPasswordField pass) {
    
            /*Eventos 
        */
        conectar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {   
                Usuario usu = new Usuario();
                PasarPagina pasar= new PasarPagina(); 
                try {
                    usu.Login(us.getText(), pass.getText()); 
                    pasar.LoginaDestino();
                } catch (SQLException ex) {
                    System.out.println("Hubo un error");
                }
            }   
        }); 
        
        actualizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
              PasarPagina pasar= new PasarPagina(); 
              pasar.LoginaActualizar();
            }
        }); 
        
        Nuevousuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
              PasarPagina pasar= new PasarPagina(); 
              pasar.LoginaNew();
            }
        }); 
        
        Nuevousuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
             /* Usuario usu = new Usuario();
              usu.Delete(us, pass);*/

            }
        }); 
        
        /*Eventos 
        */
    }
}
