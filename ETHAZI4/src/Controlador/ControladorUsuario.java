
package Controlador;

import Modelo.Usuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;

public class ControladorUsuario {
    
    public ControladorUsuario( JButton actualizar, JButton delete,ArrayList<Usuario> Users) {
        
       /* delete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                Usuario usu = new Usuario();
                usu.Delete(us.getText(), pass.getText());
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
        }); */
        
    }
}
