
package Controlador;

import Modelo.Hotel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ControladorLista {
    
    public ControladorLista(JButton reservar, JButton anterior, JComboBox<String>Destinos, JLabel precio,JList<String> jList1,JLabel jLabel5, JDateChooser entrada, JDateChooser salida) throws SQLException {
      
    /*Apenas de inicia el controlador*/
    
        jLabel5.setVisible(false);
        Hotel aux = new Hotel();
        /*aux.obtener_hoteles(jList1);*/
        aux.obtener_destinos(Destinos);
         
    /*Apenas de inicia el controlador*/    
    
        /*String fecha1 = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(entrada.getDate());
        String fecha2 = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(salida.getDate());*/
        entrada.setMinSelectableDate(new Date());
        salida.setMinSelectableDate(new Date());
        salida.setDate(entrada.getDate());
        
           /*Eventos 
        */                     
           /*Cambiar el precio*/
        jList1.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
            //System.out.println(jList1.getSelectedValue());
            jLabel5.setVisible(false);
            precio.setText(String.valueOf(100 + " €"));
            }
        });
            /*Cambiar el precio*/
                        
                /*Reservar*/
        reservar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) { 
            
            if(jList1.isSelectionEmpty())
            {
                jLabel5.setVisible(true);
            }
            else{
                PasarPagina pasar= new PasarPagina(); 
                pasar.classListaaPago(aux.Crear_array(jList1,"Entrada","Salida"));
            }            
            }
            });  
        
                /*Reservar*/  
                
            /*Cambiar Destinos*/
            
        Destinos.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                String localidad= (String) Destinos.getSelectedItem();
                Destinos.removeAllItems();
                aux.obtener_hoteles(jList1,localidad);
               aux.obtener_destinos(Destinos,localidad);
            }
        });
            /*Cambiar Destinos*/
       
           /*Eventos 
        */           
        anterior.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) { 
                PasarPagina pasar= new PasarPagina(); 
                pasar.classListaaLogin();
            }
            });  
    }
}
