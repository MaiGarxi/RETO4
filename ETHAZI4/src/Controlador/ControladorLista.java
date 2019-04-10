package Controlador;

import Modelo.Hotel;
import com.toedter.calendar.JCalendar;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;

public class ControladorLista {
    
    public ControladorLista(JButton reservar, JButton anterior, JComboBox<String>Destinos, JLabel precio,JList<String> jList1,JLabel jLabel5, JCalendar entrada, JCalendar salida) throws SQLException {
      
            /*Apenas de inicia el controlador*/
    
        jLabel5.setVisible(false);
        Hotel aux = new Hotel();
        aux.obtener_destinos(Destinos);
         
            /*Apenas de inicia el controlador*/    
                  
           /*Cambiar el precio*/
        jList1.addListSelectionListener((ListSelectionEvent evt) -> {
            //System.out.println(jList1.getSelectedValue());
            jLabel5.setVisible(false);
            precio.setText(String.valueOf(100 + " €"));
        });
            /*Cambiar el precio*/
                        
                /*Reservar*/
        reservar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {            
            
            if(jList1.isSelectionEmpty())
            {
                jLabel5.setVisible(true);                
            }
            else{
                PasarPagina pasar= new PasarPagina(); 
                pasar.ListaaPago(aux.Crear_array(jList1,"Entrada","Salida"));
            }            
            }
            });  
        
                /*Reservar*/  
                
            /*Cambiar Destinos*/
            
        Destinos.addActionListener ((ActionEvent e) -> {
            String localidad= (String) Destinos.getSelectedItem();
            Destinos.removeAllItems();
            aux.obtener_hoteles(jList1,localidad);
            aux.obtener_destinos(Destinos,localidad);
        });
            /*Cambiar Destinos*/
       
           /*Eventos 
        */           
        anterior.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { 
                PasarPagina pasar= new PasarPagina(); 
                
            }
            });  
    }
}
