
package Controlador;

import Modelo.Conexion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class ControladorBienvenida {
    
    public ControladorBienvenida(JButton continuar){
        
        continuar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {  
                Conexion con = new Conexion();
                con.Conexion();
                PasarPagina pasar= new PasarPagina(); 
                pasar.BienvenidaaLogin();
            }
        });
    }
}
