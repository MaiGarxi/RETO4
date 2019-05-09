package Controlador;

import Modelo.Alojamiento;
import Modelo.Calendario;
import Modelo.Ubicacion;
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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;

public class ControladorDestino {
    
    public String Alojamiento;
    
    public ControladorDestino(JButton buscar, JButton anterior,JComboBox<String> destino, JCalendar entrada, JCalendar salida, JLabel error, JLabel name, JButton exit,ArrayList<Usuario> Users,JSpinner adultos,JSpinner ninos,JSpinner hab,JCheckBox hotel,JCheckBox casa,JCheckBox apartamento) {        
      
        /*Cosas que hace antes de los eventos (es decir apenas se carga la pagina y los elementos
        que la componen
        */
        error.setVisible(false);
        Ubicacion ubi = new Ubicacion();
        ubi.obtener_destinos(destino);
        name.setText(Users.get(0).nombre);       
        Calendario calendario = new Calendario();
        Alojamiento aux = new Alojamiento();
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
        
        hotel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                if(hotel.isSelected()){
                       error.setVisible(false);
                }else{ 
                       error.setVisible(true);
                    }    
            }
        }); 
        
        casa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                if(casa.isSelected()){
                       error.setVisible(false);
                }else{ 
                       error.setVisible(true);
                    }    
            }
        }); 
        
        apartamento.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                if(apartamento.isSelected()){
                       error.setVisible(false);
                }else{ 
                       error.setVisible(true);
                    }    
            }
        }); 
        
        buscar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {  
                
                String entradas = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(entrada.getDate());                
                String salidas = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(salida.getDate());
                
                if((entradas.compareTo(salidas)) ==0){
                    error.setVisible(true);
                    error.setText("Debes escoger al menos una noche");
                }else{ 
                    error.setVisible(false);
                    error.setText("");
                    
                if( hotel.isSelected()){
                    Alojamiento = "h%";
                }else if(casa.isSelected()){
                    Alojamiento = "c%";
                }else if(apartamento.isSelected()){
                    Alojamiento = "a%";
                }
                
                if(hotel.isSelected() || casa.isSelected() || apartamento.isSelected()){
                    
                    error.setVisible(false);
                    error.setText("");
                 
                    try {      
                        ArrayList<ArrayList> patron=new ArrayList<ArrayList>();
                        
                        int dias=calendario.obtener_dia(entrada.getDate(), salida.getDate());
                        double precioTemp=calendario.calcularPrecioTemp(entrada.getDate(), salida.getDate());
                           
                        PasarPagina pasar= new PasarPagina();                       
                        pasar.DestinoaLista((String)destino.getSelectedItem(),Alojamiento,Users, entradas,salidas,patron,dias,precioTemp,Integer.parseInt(adultos.getValue().toString()),Integer.parseInt(hab.getValue().toString()),Integer.parseInt(ninos.getValue().toString()));
                    
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorDestino.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }else{
                    error.setVisible(true);
                    error.setText("Debes elegir tipo de alojamiento");}
                }              
            }
        }); 
        
            /*Eventos*/
    }
}
