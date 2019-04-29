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
        Habitacion habi = new Habitacion();
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
                pasar.DestinoaBienvenida();
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
                        ArrayList<ArrayList> patron=new ArrayList<ArrayList>();
                       
                      int dias=habi.obtener_dia(entrada.getDate(), salida.getDate());
                        patron.add(habi.Devolver_habitaciones_uno(Integer.parseInt(hab.getValue().toString()),Integer.parseInt(adultos.getValue().toString()),Integer.parseInt( ninos.getValue().toString())));
                        patron.add(habi.Devolver_habitaciones_dos(Integer.parseInt(hab.getValue().toString()),Integer.parseInt(adultos.getValue().toString()),Integer.parseInt( ninos.getValue().toString())));
                        patron.add(habi.Devolver_habitaciones_tres(Integer.parseInt(hab.getValue().toString()),Integer.parseInt(adultos.getValue().toString()),Integer.parseInt( ninos.getValue().toString())));
                        patron.add(habi.Devolver_habitaciones_cuatro(Integer.parseInt(hab.getValue().toString()),Integer.parseInt(adultos.getValue().toString()),Integer.parseInt( ninos.getValue().toString())));
                           
                        PasarPagina pasar= new PasarPagina();
                        
                        pasar.DestinoaLista((String) destino.getSelectedItem(),Users, entradas,salidas,patron,dias);
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorDestino.class.getName()).log(Level.SEVERE, null, ex);
                    }                   
                }              
            }
        }); 
        
            /*Eventos*/
    }
}
