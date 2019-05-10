package Controlador;

import Modelo.Alojamiento;
import Modelo.Cama;
import Modelo.Ubicacion;
import Modelo.Usuario;
import Modelo.reserva;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ControladorLista {
    
    public double preci=0.0;
    public String id_alojamiento;
    
    public ControladorLista(JButton reservar, JButton anterior, JComboBox<String>Destinos,String localidad, String Alojamiento, JLabel precio,JTable jTable2,JLabel error,ArrayList<Usuario> Users,JLabel name,JButton exit,String entradas, String salidas,JTable jTable1,ArrayList<ArrayList> patron,int dias,JLabel jLabel2,int personas,int hab,int ninos,double precioTemp, double precioFestivo) {
          
        /*Apenas de inicia el controlador*/
        DefaultTableModel modelo = new DefaultTableModel();
        Cama cama = new Cama();
        patron.add(cama.Devolver_habitaciones_uno(hab,personas,ninos));
                patron.add(cama.Devolver_habitaciones_dos(hab,personas,ninos));
                patron.add(cama.Devolver_habitaciones_tres(hab,personas,ninos));
                patron.add(cama.Devolver_habitaciones_cuatro(hab,personas,ninos));
        /*Tabla de Las Habitaciones*/
        if(Alojamiento=="h%")
        {
            String[] columnas = {"Tipo de Habitación/es", "Niños","Capacidad"};
            modelo.setColumnIdentifiers(columnas);
            jTable1.setModel(modelo);
                    /*TAMAÑO DE LAS COLUMNAS*/
            jTable1.getTableHeader().setOpaque(false);
                     jTable1.getTableHeader().setBackground(new Color(32,136,203));
                              jTable1.getTableHeader().setForeground(new Color(255,255,255));
                                      TableColumnModel columnModel= jTable1.getColumnModel();
                                      columnModel.getColumn(0).setPreferredWidth(300);
                                      columnModel.getColumn(1).setPreferredWidth(50);
                                      columnModel.getColumn(2).setPreferredWidth(70);
            /*TAMAÑO DE LAS COLUMNAS*/

                       /*Seleccionar Habitaciòn*/

            jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) 
            {
                double preciox=0.0;                         
                Alojamiento alojamiento = new Alojamiento();
                if(Alojamiento=="h%"){
                preciox= (cama.obtener_precio_reserva(patron.get(jTable1.getSelectedRow())));                
                preci= (preciox*dias)+(preciox*precioTemp*dias)+(preciox*precioFestivo);
                precio.setText(String.valueOf(preci+" € Por "+dias+" Noches"));
                }else{                   
                preciox=(alojamiento.ObtenerPrecioAlojamiento(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(),0))));
                preci=(preciox*dias)+(preciox*precioTemp*dias)+(preciox*precioFestivo);
                precio.setText(String.valueOf(preci+" € Por "+dias+" Noches"));
                }
            }});
           
           
            /*Seleccionar Habitación*/
        }else{
            String[] columnas = {"Tipo de Habitación", "Descripciòn"};
            modelo.setColumnIdentifiers(columnas);
            jTable1.setModel(modelo);
                /*TAMAÑO DE LAS COLUMNAS*/
            jTable1.getTableHeader().setOpaque(false);
                     jTable1.getTableHeader().setBackground(new Color(32,136,203));
                              jTable1.getTableHeader().setForeground(new Color(255,255,255));
                                      TableColumnModel columnModel= jTable1.getColumnModel();
                                      columnModel.getColumn(0).setPreferredWidth(100);
                                      columnModel.getColumn(1).setPreferredWidth(250);

                /*TAMAÑO DE LAS COLUMNAS*/
        }
       
        /*Tabla de Las Habitaciones*/
        DefaultTableModel modelo2 = new DefaultTableModel();
        if(Alojamiento=="h%")
        {
            String[] columnas2 = {"Nombre", "Popularidad"};
            modelo2.setColumnIdentifiers(columnas2);
            jTable2.setModel(modelo2);
        }else{
            String[] columnas2 = {"Nombre"," Capacidad","Popularidad"};
            modelo2.setColumnIdentifiers(columnas2);
            jTable2.setModel(modelo2);        
        }
        
        /*Tabla de Los Alojamientos*/
        
        
        /*TAMAÑO DE LAS COLUMNAS*/
        jTable2.getTableHeader().setOpaque(false);
                jTable2.getTableHeader().setBackground(new Color(32,136,203));
                        jTable2.getTableHeader().setForeground(new Color(255,255,255));
                                TableColumnModel columnModel2= jTable2.getColumnModel();
                                columnModel2.getColumn(0).setPreferredWidth(300);
                                columnModel2.getColumn(1).setPreferredWidth(100);
        /*TAMAÑO DE LAS COLUMNAS*/
        
        /*Tabla de Los Alojamientos*/
        
        
        error.setVisible(false);
        name.setText(Users.get(0).nombre);
        Alojamiento aux = new Alojamiento();
        id_alojamiento= aux.obtener_alojamiento(modelo2,localidad,Alojamiento,entradas,salidas,personas);
        Ubicacion ubi = new Ubicacion();
        ubi.obtener_destinos(Destinos);
        reserva reserva = new reserva(); 
        
        if(Alojamiento=="h%")
        {
            jLabel2.setText("HOTEL");
        }else{
            if(Alojamiento=="a%")
            {
                jLabel2.setText("APARTAMENTO");
            }else{
                jLabel2.setText("CASA");
            }
        }
        /*Tabla de Los Alojamientos*/
        
        /*Apenas de inicia el controlador*/ 
        
        
        /*Click en  Alojamiento*/
        if(Alojamiento=="h%")
        {
            jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) 
            {
                modelo.setRowCount(0);                                             
                error.setVisible(false);
               
                String dato=String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(),0));
                cama.grande_agregar(dato,entradas,salidas,patron,modelo);
                precio.setText(String.valueOf(" "));
            }});
       }else{
            jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) 
            {
                modelo.setRowCount(0);
                Alojamiento Aloja=new Alojamiento();
                String dato=String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(),0));
                Aloja.Obtener_habitaciones(dato,modelo);
                double preciox=0.0;                         
                Alojamiento alojamiento = new Alojamiento();                  
                preciox=(alojamiento.ObtenerPrecioAlojamiento(dato));
                preci=(preciox*dias)+(preciox*precioTemp*dias)+(preciox*precioFestivo);
                precio.setText(String.valueOf(preci+" € Por "+dias+" Noches"));
            }});
       }
        /*Click en Alojamiento*/
                       
                /*Reservar*/
        reservar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {   
                if(Alojamiento=="h%")
                {    
                    if(jTable2.getSelectedRow()==-1)
                    {
                        error.setText("Debes Escoger un Alojamiento");                
                        error.setVisible(true);                
                    }
                    else if(jTable1.getSelectedRow()==-1)
                    {
                        error.setText("Debes Escoger Una Reserva");
                        error.setVisible(true);  

                    }
                    else if(jTable1.getSelectedRow()>-1){
                        PasarPagina pasar= new PasarPagina(); 
                        String dato=String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(),0));
                        pasar.ListaaPago(reserva.Crear_array(dato,entradas, salidas,preci,patron.get(0),Users),Users);   
                    }            
                }
                if(Alojamiento=="c%"||Alojamiento=="a%")
                {
                    if(jTable2.getSelectedRow()==-1)
                    {
                        error.setText("Debes Escoger un Alojamiento");                
                        error.setVisible(true);                
                    }                   
                    else if(jTable1.getSelectedRow()>-1){
                        PasarPagina pasar= new PasarPagina(); 
                        String dato=String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(),0));
                        pasar.ListaaPago(reserva.Crear_array(dato,entradas, salidas,preci,patron.get(0),Users),Users);   
                    } 
                }
            }
        });  
        
                /*Reservar*/  
                
            /*Cambiar Destinos*/
             
        Destinos.addActionListener ((ActionEvent e) -> {
            String localidad1 = (String) Destinos.getSelectedItem();
            Destinos.removeAllItems();
            modelo2.setRowCount(0); 
            id_alojamiento= aux.obtener_alojamiento(modelo2, localidad1, Alojamiento,entradas,salidas,personas);
            ubi.obtener_destinos(Destinos,localidad1);
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