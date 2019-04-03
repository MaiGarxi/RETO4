
package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class ControladorDestino {

    public ControladorDestino(JButton buscar) {       
        buscar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {          
              PasarPagina pasar= new PasarPagina(); 
              pasar.classDestinoaLista();
            }
        }); 
    }
}
