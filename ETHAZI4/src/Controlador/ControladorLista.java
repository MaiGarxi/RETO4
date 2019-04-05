
package Controlador;

import Modelo.Hotel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ControladorLista {
    
    public ControladorLista(JButton reservar, JButton anterior, JComboBox<String>hotel) {
        
        Hotel aux = new Hotel();
        aux.obtener_hoteles(hotel);
        
           /*Eventos 
        */
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
        
           /*Eventos 
        */
           
           
    }
}
