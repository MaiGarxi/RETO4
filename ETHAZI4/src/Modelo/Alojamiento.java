
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
        if(Alojamiento=="a%")
        {
               try{
            ResultSet resultado=consul.habitaciones_casa(Cod_alojamiento);
            while (resultado.next()){
                String[]datos={resultado.getString("tipito"),resultado.getString("Descri")+" "};
                habitaciones.addRow(datos);              
            }
        } catch (SQLException ex) {
            System.out.println("No existe ninguna Habitación");
        }
        }
        else{
        try{
            ResultSet resultado=consul.habitaciones_apartamento(Cod_alojamiento);
            while (resultado.next()){
                String[]datos={resultado.getString("tipito"),resultado.getString("Descri")+" "};
                habitaciones.addRow(datos);              
            }
        } catch (SQLException ex) {
            System.out.println("No existe ninguna Habitación");
        }
    }
    }
    
    public double ObtenerPrecioAlojamiento(String localidad)
    {
        double precioTotal=0;
        try{
            
            ResultSet resultado=consul.PrecioCasaApartamento(localidad);
            while (resultado.next()){
                int numHab=resultado.getInt("numeroHab");
                double precio=resultado.getDouble("precio");
                precioTotal=numHab*precio;
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un error");
        }
        return precioTotal;
    }
}
