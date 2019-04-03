
package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class ControladorLista {
    
    public ControladorLista(JButton reservar, JButton anterior) {
        
        reservar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {          
              PasarPagina pasar= new PasarPagina(); 
              pasar.classListaaPago();
            }
        });
        
        anterior.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {          
              PasarPagina pasar= new PasarPagina(); 
              pasar.classListaaDestino();
            }
        }); 
    }
}
