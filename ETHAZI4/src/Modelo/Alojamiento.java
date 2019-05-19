
package Modelo;

import static ethazi4.ETHAZI4.consul;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class Alojamiento {
    
    protected String Cod_alojamiento; 
    protected String Nombre;
    protected int habitacion_disponible;

    public Alojamiento() {
    }

    public Alojamiento(String Cod_alojamiento, String Nombre, int habitacion_disponible) {
        this.Cod_alojamiento = Cod_alojamiento;
        this.Nombre = Nombre;
        this.habitacion_disponible = habitacion_disponible;
    }

    public String getCod_alojamiento() {
        return Cod_alojamiento;
    }

    public void setCod_alojamiento(String Cod_alojamiento) {
        this.Cod_alojamiento = Cod_alojamiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getHabitacion_disponible() {
        return habitacion_disponible;
    }

    public void setHabitacion_disponible(int habitacion_disponible) {
        this.habitacion_disponible = habitacion_disponible;
    }
    
    public ArrayList <String> ordenar_destinos(ArrayList <String> Destinos,String localidad)
    {                 
        String auxe;              
        for(int f=0;f<Destinos.size();f++)
        {                 
            if(Destinos.get(f).equals(localidad))
            {
                auxe=Destinos.get(f);
                Destinos.set(f,Destinos.get(0));
                Destinos.set(0,auxe);                    
            }
        }
        return Destinos;       
    } 
      
    public void obtener_destinos(JComboBox<String> destino)
    {
        try {
            destino.removeAllItems();           
            ResultSet resultado=consul.ConsultaDestino();           
            while (resultado.next())
            {
                destino.addItem(resultado.getString("Localidad"));
            }      
        } catch (SQLException ex) {
            System.out.println("Hubo un error");
        }
    }
         
    public void obtener_destinos(JComboBox<String> destino,String locali)
    {              
        try {           
            Hotel ex=new Hotel();
            ArrayList<String> Destinos = new ArrayList<String>();
            ResultSet resultado=consul.ConsultaDestino();
              while (resultado.next())
              {                 
                Destinos.add(resultado.getString("Localidad"));
               }
            for (int x=0;Destinos.size()>x;x++)
            {
                destino.addItem(ex.ordenar_destinos(Destinos,locali).get(x));      
            }
        } catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public String obtener_alojamiento(DefaultTableModel alojamiento,String localidad, String Alojamiento,String fecha_inicio,String fecha_fin,int personas) 
    {           
        
        if(Alojamiento=="h%")
        {
            try {
                ResultSet resultado=consul.Consultahotel_Nombre(localidad);                
                while (resultado.next()){
                    String[]datos={resultado.getString("Nombre"),resultado.getString("popularidad")+" "};
                   alojamiento.addRow(datos);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No existe ningún Hotel");
            }
            return null;
        }else{
             if(Alojamiento=="a%"){
               try {               
                ResultSet resultado=consul.Consulta_apartamento_Nombre(localidad,fecha_inicio,fecha_fin,personas);                
                while (resultado.next()){
                    String[]datos={resultado.getString("Nombre"),resultado.getString("Capacidad")+" ",resultado.getString("popularidad")+" "};
                    alojamiento.addRow(datos);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No existe ningún Alojamiento");
            }
             }
             else{
            try {               
                ResultSet resultado=consul.Consultacasa_Nombre(localidad,fecha_inicio,fecha_fin,personas);                
                while (resultado.next()){
                    String[]datos={resultado.getString("Nombre"),resultado.getString("Capacidad")+" ",resultado.getString("popularidad")+" "};
                    alojamiento.addRow(datos);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No existe ningún Alojamiento");
            }
        }
            return null;
    }
    }
                
    public void Obtener_habitaciones(String Cod_alojamiento,DefaultTableModel  habitaciones,String Alojamiento)
    {
        System.out.println("En obtener Habitaciones");
        if(Alojamiento=="a%")
        {
           
               try{
            ResultSet resultado=consul.habitaciones_apartamento(Cod_alojamiento);
            while (resultado.next()){
                String[]datos={resultado.getString("Tipo"),resultado.getString("Descripcion")+" "};
                habitaciones.addRow(datos);              
            }
        } catch (SQLException ex) {
            System.out.println("No existe ninguna Habitación");
        }
        }
        else{
              System.out.println("En obtener c%");
        try{
            ResultSet resultado=consul.habitaciones_casa(Cod_alojamiento);
            while (resultado.next()){
                String[]datos={resultado.getString("Tipo"),resultado.getString("Descripcion")+" "};
                System.out.println(datos);
                habitaciones.addRow(datos);              
            }
        } catch (SQLException ex) {
            System.out.println("No existe ninguna Habitación");
        }
    }
    }
    
    public double ObtenerPrecioAlojamiento(String localidad,String Alojamiento)
    {
        
        double precioTotal=0;
        
        if(Alojamiento=="a%")
        {
            try{

                ResultSet resultado=consul.PrecioApartamento(localidad);
                while (resultado.next()){
                    double precio=resultado.getDouble("precio");
                    precioTotal=(Math.round(precio));
                    return precioTotal;
                }
            } catch (SQLException ex) {
                System.out.println("Hubo un error");
            }       
        }else{
             try{           
                ResultSet resultado=consul.PrecioCasa(localidad);
                
                while (resultado.next()){
                double precio=resultado.getDouble("precio");
                precioTotal=(Math.round(precio));
                
                return precioTotal;
                }
            } catch (SQLException ex) {
                System.out.println("Hubo un error");
            }
          
        }
            return 0.0;
    }

    public String obtener_hotel_estrellas(DefaultTableModel alojamiento,String localidad, String Alojamiento,String fecha_inicio,String fecha_fin,int personas,String estrellas) 
    {       
        int estrellita=1;
        String patricio="";
        for(int u=1;u<=5;u++)
        {
        patricio=patricio+"*";
  
            if(patricio.equals(estrellas))
            {
            estrellita=u;
            }
        }
        if(Alojamiento=="h%")
        {
            try {
                ResultSet resultado=consul.Consultahotel_Nombre(localidad,estrellita);                
                while (resultado.next()){
                    String[]datos={resultado.getString("Nombre"),resultado.getString("popularidad")+" "};
                   alojamiento.addRow(datos);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }else{
           
            return null;
    }
    }
    
       public String obtener_alojamiento_servicio(DefaultTableModel alojamiento,String localidad, String Alojamiento,String fecha_inicio,String fecha_fin,int personas,String query,String estrellas) 
    {           
        System.out.println(query);
              int estrellita=1;
        String patricio="";
        for(int u=1;u<=5;u++)
        {
        patricio=patricio+"*";
  
            if(patricio.equals(estrellas))
            {
            estrellita=u;
            }
        }
      if(estrellas.equals("Todos"))
              {
                  estrellita=0;
              }
        if(Alojamiento=="h%")
        {
            
            
            try { 
                ResultSet resultado=consul.Consultahotel_Nombre_servicio(localidad,query,estrellita);                
                while (resultado.next()){
                    System.out.println(resultado.getString("Nombre"));
                    String[]datos={resultado.getString("Nombre"),resultado.getString("popularidad")+" "};
                   alojamiento.addRow(datos);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No existe ningún Hotel");
            }
            return null;
        }else{
             if(Alojamiento=="a%"){
               try {               
                ResultSet resultado=consul.Consulta_apartamento_Nombre_servicio(localidad,fecha_inicio,fecha_fin,personas,query);                
                while (resultado.next()){
                    String[]datos={resultado.getString("Nombre"),resultado.getString("Capacidad")+" ",resultado.getString("popularidad")+" "};
                    alojamiento.addRow(datos);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No existe ningún Alojamiento");
            }
             }
             else{
            try {               
                ResultSet resultado=consul.Consultacasa_Nombre_servicio(localidad,fecha_inicio,fecha_fin,personas,query);                
                while (resultado.next()){
                    String[]datos={resultado.getString("Nombre"),resultado.getString("Capacidad")+" ",resultado.getString("popularidad")+" "};
                    alojamiento.addRow(datos);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No existe ningún Alojamiento");
            }
        }
            return null;
    }
    }
 

    
}