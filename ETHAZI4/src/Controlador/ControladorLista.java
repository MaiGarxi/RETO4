
package Controlador;

import Modelo.Hotel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class ControladorLista {
    
    public ControladorLista(JButton reservar, JButton anterior, JComboBox<String>hotel,String localidad, JLabel precio) {
       
        Hotel aux = new Hotel();
        aux.obtener_hoteles(hotel,localidad);
        
           /*Eventos 
        */
        reservar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {  
             System.out.println(aux.Crear_array(hotel).get(0).getCod_hotel());
                        
              PasarPagina pasar= new PasarPagina(); 
              pasar.classListaaPago(aux.Crear_array(hotel));
            }
        });
        
             reservar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {  
             System.out.println(aux.Crear_array(hotel).get(0).getCod_hotel());
                        
              PasarPagina pasar= new PasarPagina(); 
              pasar.classListaaPago(aux.Crear_array(hotel));
            }
        });
        
    
        
        hotel.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
            precio.setText(String.valueOf(100));
            }
        });
           /*Eventos 
        */                 
    }
}
