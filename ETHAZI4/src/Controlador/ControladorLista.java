
package Controlador;

import Modelo.Hotel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ControladorLista {
    
    public ControladorLista(JButton reservar, JButton anterior, JComboBox<String>hotel,String localidad) {
        
        Hotel aux = new Hotel();
        aux.obtener_hoteles(hotel,localidad);
        
           /*Eventos 
        */
        reservar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {  
             System.out.println(aux.Crear_array(hotel).get(0).getCod_hotel());
                        
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
