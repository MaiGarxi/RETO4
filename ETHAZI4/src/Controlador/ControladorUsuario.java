
package Controlador;

import Modelo.Usuario;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
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
                try {
                    Usuario recibe=new Usuario();
                    ArrayList<Usuario> users= new ArrayList<Usuario>();
                    recibe= usu.Login(us.getText(), pass.getText());
                    users=usu.crear_Array(recibe);
                    PasarPagina pasar = new PasarPagina();
                    pasar.LoginaDestino(users);
                } catch (SQLException ex) {
                    System.out.println("Hubo un error");
                }
            }   
        }); 
        
        actualizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { 
                Usuario usu = new Usuario(); 
                try {
                    Usuario recibe=new Usuario();
                    ArrayList<Usuario> users= new ArrayList<Usuario>();
                    recibe= usu.Login(us.getText(), pass.getText());
                    users=usu.crear_Array(recibe);
                    PasarPagina pasar = new PasarPagina();
                    pasar.LoginaActualizar(users);
                } catch (SQLException ex) {
                    System.out.println("Hubo un error");
                }
            } 
        }); 
        
        Nuevousuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {               
              PasarPagina pasar= new PasarPagina(); 
              pasar.LoginaNew();
            }
        }); 
        
        delete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                Usuario usu = new Usuario();
                usu.Delete(us.getText(), pass.getText());
            }
        });          
        
            /*Eventos*/
    }
}
