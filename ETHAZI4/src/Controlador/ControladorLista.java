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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ControladorLista {
    
    public double preci=0.0;
    public String id_alojamiento;
    
    public ControladorLista(JButton reservar, JButton anterior, JComboBox<String>Destinos,String localidad, String Alojamiento, JLabel precio,JTable jTable2,JLabel error,ArrayList<Usuario> Users,JLabel name,JButton exit,String entradas, String salidas,JTable jTable1,ArrayList<ArrayList> patron,int dias,JLabel jLabel2,int personas,int hab,int ninos,double precioTemp, double precioFestivo,JButton herramienta,JCheckBox wifi, JCheckBox piscina, JCheckBox spa, JCheckBox parking, JCheckBox restaurante, JCheckBox bar, JCheckBox gimnasio, JCheckBox aire, JComboBox<String> estrellas) {
          
        /*Apenas de inicia el controlador*/
        DefaultTableModel modelo = new DefaultTableModel();
        Cama cama = new Cama();
        Usuario usu = new Usuario();
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
                                      columnModel.getColumn(1).setPreferredWidth(200);
                                      columnModel.getColumn(2).setPreferredWidth(200);
            /*TAMAÑO DE LAS COLUMNAS*/

                       /*Seleccionar Habitaciòn*/

            jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) 
            {
                double preciox=0.0;                         
                Alojamiento alojamiento = new Alojamiento();
                preciox= (cama.obtener_precio_reserva(patron.get(jTable1.getSelectedRow())));                
                preci= (preciox*dias)+(preciox*precioTemp*dias)+(preciox*precioFestivo);
                precio.setText(String.valueOf(preci+" € Por "+dias+" Noches"));
            }});          
           
            /*Seleccionar Habitación*/
        }else{
            String[] columnas = {"Tipo", "Descripción"};
            modelo.setColumnIdentifiers(columnas);
            jTable1.setModel(modelo);
                /*TAMAÑO DE LAS COLUMNAS*/
            jTable1.getTableHeader().setOpaque(false);
                     jTable1.getTableHeader().setBackground(new Color(32,136,203));
                              jTable1.getTableHeader().setForeground(new Color(255,255,255));
                                      TableColumnModel columnModel= jTable1.getColumnModel();
                                      columnModel.getColumn(0).setPreferredWidth(80);
                                      columnModel.getColumn(1).setPreferredWidth(2500);

                /*TAMAÑO DE LAS COLUMNAS*/
        }
       
        /*Tabla de Las Alojamientos*/
        DefaultTableModel modelo2 = new DefaultTableModel();
        if(Alojamiento=="h%")
        {
            String[] columnas2 = {"Nombre", "Popularidad"};
            modelo2.setColumnIdentifiers(columnas2);
            jTable2.setModel(modelo2);
            /*TAMAÑO DE LAS COLUMNAS*/
            jTable2.getTableHeader().setOpaque(false);
                jTable2.getTableHeader().setBackground(new Color(32,136,203));
                        jTable2.getTableHeader().setForeground(new Color(255,255,255));
                                TableColumnModel columnModel2= jTable2.getColumnModel();
                                columnModel2.getColumn(0).setPreferredWidth(285);
                                columnModel2.getColumn(1).setPreferredWidth(100);
        }else{
            String[] columnas2 = {"Nombre"," Capacidad","Popularidad"};
            modelo2.setColumnIdentifiers(columnas2);
            jTable2.setModel(modelo2);
            /*TAMAÑO DE LAS COLUMNAS*/
            jTable2.getTableHeader().setOpaque(false);
                jTable2.getTableHeader().setBackground(new Color(32,136,203));
                        jTable2.getTableHeader().setForeground(new Color(255,255,255));
                        TableColumnModel columnModel2= jTable2.getColumnModel();
                        columnModel2.getColumn(0).setPreferredWidth(230);
                        columnModel2.getColumn(1).setPreferredWidth(80);
        }       
        
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
        
        /*Apenas de inicia el controlador*/ 
        
        
        /*Click en  Alojamiento*/
        
        if(Alojamiento==null){
        
            //jTable2.setValueAt("No hay alojamientos disponibles", 0, 0);
            //jTable2.setEnabled(false);
        
        }
        
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
                Aloja.Obtener_habitaciones(dato,modelo,Alojamiento);
                double preciox=0.0;                         
                Alojamiento alojamiento = new Alojamiento();                  
                preciox=(alojamiento.ObtenerPrecioAlojamiento(dato,Alojamiento));
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
                        
                        pasar.ListaaPago(reserva.Crear_arrayHotel(dato,entradas, salidas,preci,patron.get(jTable1.getSelectedRow()),Users),Users,Alojamiento,patron.get(jTable1.getSelectedRow()));   
                    }            
                }
                if(Alojamiento=="c%"||Alojamiento=="a%")
                {
                    if(jTable2.getSelectedRow()==-1)
                    {
                        error.setText("Debes Escoger un Alojamiento");                
                        error.setVisible(true);                
                    }                   
                    else{
                        PasarPagina pasar= new PasarPagina(); 
                        String dato=String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(),0));
                        pasar.ListaaPago(reserva.Crear_arrayCasaApartamento(dato,entradas, salidas,preci,Users,Alojamiento),Users,Alojamiento,patron.get(0));   
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
        
        PasarPagina pasar= new PasarPagina();    
           
        herramienta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {  
                int n= JOptionPane.showConfirmDialog(null, "Si Cierra Sesion perderá toda la información de búsqueda ¿Está seguro?", "Cerrar Sesión" , JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION) 
                { 
                    try {
                        pasar.ListaaUsuarios(Users,name,reserva.Reservas(Users));
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorLista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }); 
           
        anterior.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {                
                pasar.ListaaDestino();
            }
            });  
        
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {  
                int n= JOptionPane.showConfirmDialog(null, "Si Cierra Sesión perderá toda la información de búsqueda ¿Está seguro?", "Cerrar Sesión" , JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION) 
                { 
                    pasar.ListaaBienvenida();
                }          
            }
        });
        
        estrellas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) 
            {
             jTable2.removeAll();
             
                
                
            }}); 
    }
}