
package Controlador;

import Modelo.Hotel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ControladorDestino {

    public ControladorDestino(JButton buscar,JComboBox<String> destino) {
        
        /*Cosas que hace antes de los eventos (es decir apenas se carga la pagina y los elementos
        que la componen
        */
        
         Hotel aux = new Hotel();
         aux.obtener_destinos(destino);
       
        /*Cosas que hace antes de los eventos (es decir apenas se carga la pagina y los elementos
        que la componen
        */
        
        
        /*Eventos 
        */
        buscar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {          
              PasarPagina pasar= new PasarPagina(); 
              pasar.classDestinoaLista();
            }
        }); 
        
        /*Eventos 
        */
    }
}
