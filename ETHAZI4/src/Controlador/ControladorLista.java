package Controlador;

import Modelo.Habitacion;
import Modelo.Hotel;
import Modelo.Usuario;

import java.awt.Color;

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
import javax.swing.table.TableColumnModel;

public class ControladorLista {
    
    public ControladorLista(JButton reservar, JButton anterior, JComboBox<String>Destinos,String localidad, JLabel precio,JList<String> jList1,JLabel error,ArrayList<Usuario> Users,JLabel name,JButton exit,String entradas, String salidas,JTable jTable1,ArrayList<ArrayList> patron,int dias) {
          
        /*Apenas de inicia el controlador*/
      
        String[] columnas = {"Tipo de Habitaciòn/es", "Niños","Capacidad"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        jTable1.setModel(modelo);
        error.setVisible(false);
        name.setText(Users.get(0).nombre);
        Hotel aux = new Hotel();
        aux.obtener_hoteles(jList1,localidad);
        aux.obtener_destinos(Destinos,localidad);
       
        
        /*TAMAÑO DE LAS COLUMNAS*/
          jTable1.getTableHeader().setOpaque(false);
                 jTable1.getTableHeader().setBackground(new Color(32,136,203));
                          jTable1.getTableHeader().setForeground(new Color(255,255,255));
                                  TableColumnModel columnModel= jTable1.getColumnModel();
                                  columnModel.getColumn(0).setPreferredWidth(300);
                                   System.out.println(columnModel.getColumn(0).getWidth());
                                   columnModel.getColumn(1).setPreferredWidth(50);
                                    columnModel.getColumn(2).setPreferredWidth(70);
        /*TAMAÑO DE LAS COLUMNAS*/
        
            /*Apenas de inicia el controlador*/    
                  
            
            
            
            
           /*Seleccionar Hotel*/
        jList1.addListSelectionListener((ListSelectionEvent evt) -> {
            
        error.setVisible(false);
        modelo.setRowCount(0);
        Habitacion habi = new Habitacion();
        habi.grande_agregar(patron,modelo);
          precio.setText(String.valueOf(" "));
        });
            /*Seleccionar Hotel*/
            
            
           /*Seleccionar Habitaciòn*/
           
           jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent e) 
      {
          double preciox=0.0;
          Habitacion habi = new Habitacion();
           preciox= habi.obtener_precio_reserva(patron.get(jTable1.getSelectedRow()));
   
          
          
       /*   
         String tipo_habitacion=(String) jTable1.getValueAt( jTable1.getSelectedRow(), 0);
         System.out.println(tipo_habitacion);
        System.out.println(jTable1.getValueAt( jTable1.getSelectedRow(), 1));
        System.out.println(jTable1.getValueAt( jTable1.getSelectedRow(), 2));
          */
       
    precio.setText(String.valueOf((preciox*dias) + " € "+"  Por "+dias+" Noches"));
       }});
           
           
            /*Seleccionar Habitaciòn*/
            
            
            
                        
                /*Reservar*/
        reservar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {            
            
            if(jList1.isSelectionEmpty())
            {
                error.setText("Debes escoger un Hotel");
                
                error.setVisible(true);                
            }
            else if(jTable1.getSelectedRow()==-1)
            {
                error.setText("Debes Escoger Una Reserva");
                 error.setVisible(true);  
            
            }
            else if(jTable1.getSelectedRow()>-1){
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
            modelo.setRowCount(0); 
             precio.setText(String.valueOf(" "));
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
                pasar.ListaaBienvenida();
            }
        }); 
    }
}
//System.out.println(jList1.getSelectedValue());