package Controlador;

import Modelo.Habitacion;
import Modelo.Hotel;
import Modelo.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

public class ControladorLista {
    
    public ControladorLista(JButton reservar, JButton anterior, JComboBox<String>Destinos,String localidad, JLabel precio,JList<String> jList1,JLabel error,ArrayList<Usuario> Users,JLabel name,JButton exit,String entradas, String salidas,JTable jTable1,ArrayList<Habitacion> patron1,ArrayList<Habitacion> patron2,ArrayList<Habitacion> patron3) {
          
        /*Apenas de inicia el controlador*/
        String[] columnas = {"Nùmero de Habitacion/es", "Capacidad"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        jTable1.setModel(modelo);
        error.setVisible(false);
        name.setText(Users.get(0).nombre);
        Hotel aux = new Hotel();
        aux.obtener_hoteles(jList1,localidad);
        aux.obtener_destinos(Destinos,localidad);
        Habitacion habi = new Habitacion();
        habi.agregar_habitacion(patron1,modelo);
        habi.agregar_habitacion(patron2,modelo);
        habi.agregar_habitacion(patron3,modelo);
            /*Apenas de inicia el controlador*/    
                  
           /*Cambiar el precio*/
        jList1.addListSelectionListener((ListSelectionEvent evt) -> {
            //System.out.println(jList1.getSelectedValue());
            error.setVisible(false);
            precio.setText(String.valueOf(100 + " €"));
        });
            /*Cambiar el precio*/
                        
                /*Reservar*/
        reservar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {            
            
            if(jList1.isSelectionEmpty())
            {
                error.setVisible(true);                
            }
            else{
                PasarPagina pasar= new PasarPagina(); 
                pasar.ListaaPago(aux.Crear_array(jList1,entradas, salidas),Users);
            }            
            }
            });  
        
                /*Reservar*/  
                
            /*Cambiar Destinos*/
            
        Destinos.addActionListener ((ActionEvent e) -> {
            String localidad1 = (String) Destinos.getSelectedItem();
            Destinos.removeAllItems();
            aux.obtener_hoteles(jList1, localidad1);
            aux.obtener_destinos(Destinos, localidad1);
        });
            /*Cambiar Destinos*/
       
           /*Eventos 
        */           
        anterior.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { 
                PasarPagina pasar= new PasarPagina(); 
                pasar.ListaaDestino();
            }
            });  
        
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                PasarPagina pasar= new PasarPagina(); 
                pasar.Bienvenida();
            }
        }); 
    }
}
