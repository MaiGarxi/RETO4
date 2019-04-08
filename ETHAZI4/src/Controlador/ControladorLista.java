
package Controlador;

import Modelo.Hotel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ControladorLista {
    
    public ControladorLista(JButton reservar, JButton anterior, JComboBox<String>Destinos,String localidad, JLabel precio,JList<String> jList1,JLabel jLabel5) throws SQLException {
      
    /*Apenas de inicia el controlador*/
    
        jLabel5.setVisible(false);
        Hotel aux = new Hotel();
        aux.obtener_hoteles(jList1,localidad);
        aux.obtener_destinos(Destinos,localidad);
         
    /*Apenas de inicia el controlador*/      
        
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
                pasar.classListaaDestino();
            }
            });  
    }
}
