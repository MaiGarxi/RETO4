
package Controlador;

import Modelo.Hotel;
import com.toedter.calendar.JCalendar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class ControladorDestino {
    
   public ControladorDestino(JButton buscar, JButton anterior,JComboBox<String> destino, JCalendar entrada, JCalendar salida, JLabel error) {
        
        /*Cosas que hace antes de los eventos (es decir apenas se carga la pagina y los elementos
        que la componen
        */
        error.setVisible(false);
        Hotel aux = new Hotel();
        aux.obtener_destinos(destino);
       
        /*Cosas que hace antes de los eventos (es decir apenas se carga la pagina y los elementos
        que la componen
        */    
           
            /*Fechas*/        
        entrada.setMinSelectableDate(new Date());
        salida.setMinSelectableDate(new Date());
        entrada.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            salida.setMinSelectableDate(entrada.getDate());
        });   
        
        salida.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            String fecha1 = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(entrada.getDate());
            String fecha2 = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(salida.getDate());
            if((fecha1.compareTo(fecha2)) ==0){
                error.setVisible(true);
            }else{ 
                error.setVisible(false);
            }               
        });
         
            /*Fechas*/
            
            /*Eventos*/
            
        anterior.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                PasarPagina pasar= new PasarPagina(); 
                pasar.DestinoaLogin();
            }
        });
                
        buscar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {  
                String fecha1 = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(entrada.getDate());
                String fecha2 = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(salida.getDate());
                if((fecha1.compareTo(fecha2)) ==0){
                    error.setVisible(true);
                }else{ 
                    error.setVisible(false);
                    try {                        
                        PasarPagina pasar= new PasarPagina();
                        pasar.DestinoaLista((String) destino.getSelectedItem());
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorDestino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }              
            }
        }); 
        
            /*Eventos*/
    }
}
