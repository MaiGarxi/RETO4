
package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class ControladorBasesLegales {
    
    public ControladorBasesLegales(JButton aceptar,JButton cancelar,JTextArea bases){
        
        PasarPagina pasar = new PasarPagina();
        
        cancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                pasar.BasesLegalesaLogin();   
            }
        });
        aceptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                pasar.BasesLegalesaLogin(); 
            }
        });
    }
}
