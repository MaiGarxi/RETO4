
package Controlador;

import Modelo.Hotel;

import Modelo.Usuario;
import com.toedter.calendar.JCalendar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;

public class ControladorDestino {
    
   public ControladorDestino(JButton buscar, JButton anterior,JComboBox<String> destino, JCalendar entrada, JCalendar salida, JLabel error, JLabel name, JButton exit,ArrayList<Usuario> Users,JSpinner adultos,JSpinner ninos,JRadioButton doble,JRadioButton individual,JRadioButton infantil) {
  
       name.setText(Users.get(0).nombre);
      infantil.setEnabled(false);
       ninos.setEnabled(false);
       adultos.setEnabled(false);
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
        
        individual.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {    
                if(individual.isSelected())
                {
                 adultos.setEnabled(true);
               infantil.setEnabled(true);
                }
                else{
                if(doble.isSelected())
                {
                
                }
                else{
                adultos.setEnabled(false);
               infantil.setEnabled(false);
                }
                
                }
             
            }
        });
        
        doble.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                if(doble.isSelected())
                {
                 adultos.setEnabled(true);
               infantil.setEnabled(true);
                }
                else{
                if(individual.isSelected())
                {
                
                }
                else{
                adultos.setEnabled(false);
               infantil.setEnabled(false);
                }
                
                }
            }
        });
        
         infantil.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { 
                if(infantil.isSelected())
                {
                ninos.setEnabled(true);  
                }
                else
                {
                ninos.setEnabled(false);  
                }
                 
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
                        pasar.DestinoaLista((String) destino.getSelectedItem(),Users);
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorDestino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }              
            }
        }); 
        
            /*Eventos*/
    }
}
