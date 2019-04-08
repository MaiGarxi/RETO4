
package Controlador;

import Modelo.Usuario;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class ControladorUsuario{
    
    public ControladorUsuario(JButton conectar, JButton actualizar, JButton Nuevousuario, JButton delete, TextField us, JPasswordField pass) {
    
            /*Eventos 
        */
        conectar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {          
              PasarPagina pasar= new PasarPagina(); 
                try {
                    pasar.classLoginaLista();
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
        
        actualizar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {          
              PasarPagina pasar= new PasarPagina(); 
              pasar.classLoginaActualizar();
            }
        }); 
        
        Nuevousuario.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {          
              PasarPagina pasar= new PasarPagina(); 
              pasar.classLoginaNew();
            }
        }); 
        
        Nuevousuario.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {          
             /* Usuario usu = new Usuario();
              usu.Delete(us, pass);*/

            }
        }); 
        
        /*Eventos 
        */
    }
}
