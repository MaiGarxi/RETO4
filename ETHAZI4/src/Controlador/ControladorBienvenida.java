
package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class ControladorBienvenida {

    public ControladorBienvenida(JButton jButton1) {
        
        jButton1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {          
              PasarPagina pasar= new PasarPagina(); 
              pasar.classBienvenidaaDestino();
            }
        }); 
    }   
}
