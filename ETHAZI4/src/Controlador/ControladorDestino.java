
package Controlador;

import Modelo.Hotel;
import com.toedter.calendar.JCalendar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ControladorDestino {

    public ControladorDestino(JButton buscar,JComboBox<String> destino, JCalendar entrada, JCalendar salida) {
        
        /*Cosas que hace antes de los eventos (es decir apenas se carga la pagina y los elementos
        que la componen
        */
        
         Hotel aux = new Hotel();
         aux.obtener_destinos(destino);
         
         String fecha1 = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(entrada.getDate());
         String fecha2 = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(salida.getDate());
         entrada.setMinSelectableDate(new Date());
         salida.setMinSelectableDate(entrada.getDate());
       
        /*Cosas que hace antes de los eventos (es decir apenas se carga la pagina y los elementos
        que la componen
        */
               
        /*Eventos 
        */
        buscar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {          
                try {
                    PasarPagina pasar= new PasarPagina();
                    pasar.classDestinoaLista((String) destino.getSelectedItem());
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorDestino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
        
        /*Eventos 
        */
    }
}
