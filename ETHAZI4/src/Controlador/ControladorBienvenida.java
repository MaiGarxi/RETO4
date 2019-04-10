
package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class ControladorBienvenida {

    public ControladorBienvenida(JButton continuar) {
        
                   /*Eventos*/           
        continuar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { 
                PasarPagina pasar= new PasarPagina(); 
                pasar.BienvenidaaLogin();
            }
            });  
    }
}
    
    

