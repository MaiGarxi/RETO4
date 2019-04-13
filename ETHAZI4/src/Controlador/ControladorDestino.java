
package Controlador;

import Modelo.Habitacion;
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
import javax.swing.JSpinner;

public class ControladorDestino {
    
   public ControladorDestino(JButton buscar, JButton anterior,JComboBox<String> destino, JCalendar entrada, JCalendar salida, JLabel error, JLabel name, JButton exit,ArrayList<Usuario> Users,JSpinner adultos,JSpinner ninos,JSpinner hab) {        
      
        /*Cosas que hace antes de los eventos (es decir apenas se carga la pagina y los elementos
        que la componen
        */
        error.setVisible(false);
        Hotel aux = new Hotel();
        aux.obtener_destinos(destino); 
        name.setText(Users.get(0).nombre);       
       
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
            String entradas = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(entrada.getDate());
            String salidas = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(salida.getDate());
            if((entradas.compareTo(salidas)) ==0){
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
        
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                PasarPagina pasar= new PasarPagina(); 
                pasar.Bienvenida();
            }
        }); 
                
        buscar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {  
                String entradas = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(entrada.getDate());
                String salidas = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(salida.getDate());
                if((entradas.compareTo(salidas)) ==0){
                    error.setVisible(true);
                }else{ 
                    error.setVisible(false);
                    try {      
                        ArrayList<Habitacion> patron1=new ArrayList<Habitacion>();
                         ArrayList<Habitacion> patron2=new ArrayList<Habitacion>();
                        PasarPagina pasar= new PasarPagina();
                           System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                     patron1=  aux.Devolver_habitaciones_uno(Integer.parseInt(hab.getValue().toString()),Integer.parseInt(adultos.getValue().toString()),Integer.parseInt( ninos.getValue().toString()));
                     for(int x=0;x<patron1.size();x++)
                     {
                         System.out.println("Patron1");
                     System.out.println(patron1.get(x).getClass());
                     }
                     
                      patron2=  aux.Devolver_habitaciones_dos((int) hab.getValue(),(int) adultos.getValue(),(int) ninos.getValue());
                       for(int x=0;x<patron2.size();x++)
                     {
                         System.out.println("Patron2");
                     System.out.println(patron2.get(x).getClass());
                     }
                        pasar.DestinoaLista((String) destino.getSelectedItem(),Users, entradas,salidas);
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorDestino.class.getName()).log(Level.SEVERE, null, ex);
                    }                   
                }              
            }
        }); 
        
            /*Eventos*/
    }
}
