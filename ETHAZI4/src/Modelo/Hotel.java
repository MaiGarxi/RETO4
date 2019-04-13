
package Modelo;

import static ethazi4.ETHAZI4.consul;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Hotel {

    protected int cod_hotel,estrellas,num_habitaciones,num_camas,cp;
    protected String nombre,localidad;   

    public Hotel() {
    }

    public Hotel(int cod_hotel, int estrellas, int num_habitaciones, int num_camas, int cp, String nombre, String localidad) {
        this.cod_hotel = cod_hotel;
        this.estrellas = estrellas;
        this.num_habitaciones = num_habitaciones;
        this.num_camas = num_camas;
        this.cp = cp;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public int getCod_hotel() {
        return cod_hotel;
    }

    public void setCod_hotel(int cod_hotel) {
        this.cod_hotel = cod_hotel;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    public void setNum_habitaciones(int num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
    }

    public int getNum_camas() {
        return num_camas;
    }

    public void setNum_camas(int num_camas) {
        this.num_camas = num_camas;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public ArrayList <Hotel>  buscar_hoteles(String salida,String destino,String entrada)
    {
        ArrayList<Hotel> hoteles = new ArrayList<Hotel>();
        return hoteles;
    }
    
    public ArrayList <String>  ordenar_destinos(ArrayList <String> Destinos,String localidad)
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
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void obtener_hoteles(JList<String> hotel,String localidad) 
    {           
        try {
            DefaultListModel listModel;
            listModel = new DefaultListModel();
            hotel.setModel(listModel);
           
            ResultSet resultado=consul.ConsultaHoteles_Nombre(localidad);                
            while (resultado.next()){
                listModel.addElement(resultado.getString("Nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No existe ningùn Hotel");
        }
    }
    
    public ArrayList<reserva> Crear_array(JList<String> hotel,String fecha1, String fecha2)
    {
        try {
            ArrayList<reserva> hoteles_reserva = new ArrayList<reserva>();
            String Des = (String) hotel.getSelectedValue();
            System.out.println(Des);            
            ResultSet resultado = consul.hotel_para_reservar(Des);
            for(int x=0;resultado.next();x++)
            {
                reserva reser= new reserva( Integer.parseInt(resultado.getString("Cod_hotel")),(x+1),100.0,fecha1,fecha2);
                hoteles_reserva.add(reser);
            } 
            return hoteles_reserva;
        } catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
   
     public ArrayList<Habitacion> Devolver_habitaciones_uno(int habitaciones,int adultos,int ninos){
     
    ArrayList<Habitacion> patrones=new ArrayList<Habitacion>();
     if(habitaciones==adultos)
     {
        
         for(int x=0;x<habitaciones;x++)
         {
             individual hab=new individual();
             patrones.add(hab);
         }
     }
     else{
        if(adultos>habitaciones)
        {
         
         for(int x=0;x<adultos;x++)
         {
             individual hab=new individual();
             patrones.add(hab);
         } 
        }
        else{
            
         for(int x=0;x<habitaciones;x++)
         {
             individual hab=new individual();
             patrones.add(hab);
         }
        }
     }
 
     if(ninos>0)
     {


        }

     
     
        return patrones;
     
     }
     
     public ArrayList<Habitacion> Devolver_habitaciones_dos(int habitaciones,int adultos,int ninos)
     {
          ArrayList<Habitacion> patrones=new ArrayList<Habitacion>();
         if(habitaciones==adultos)
     {
         
         if(adultos%2==0)
        {
        
         for(int x=0;x<adultos/2;x++)
         {
             doble hab=new doble();
             patrones.add(hab);
         }
         
         
        }
         else{
          
         for(int x=0;x<Math.floor(habitaciones/2);x++)
         {
             doble hab=new doble();
             patrones.add(hab);
         }
         individual hab=new individual();
         patrones.add(hab);
         }
 return patrones;
     }
         else{
  
          if(adultos%2==0)
        {
         
         for(int x=0;x<adultos/2;x++)
         {
             doble hab=new doble();
             patrones.add(hab);
         }
        }
         else{
           
         for(int x=0;x<Math.floor(adultos/2);x++)
         {
             doble hab=new doble();
             patrones.add(hab);
         }
         individual hab=new individual();
         patrones.add(hab);   
          return patrones;
                 }
           
        }
      return patrones;

         
         
          
      
     }
     
     public ArrayList<Habitacion> Devolver_habitaciones_tres(int habitaciones,int adultos,int ninos)
     {
         ArrayList<Habitacion> patrones=new ArrayList<Habitacion>();
          if(adultos%2!=0)
        {
           
           
            for(int x=0;x<Math.ceil(adultos/2);x++)
         {
             doble hab=new doble();
             patrones.add(hab);
         }
         doble hab=new doble();
         patrones.add(hab);   
          
                 }
     
      

     
    return patrones;
     
     
     
}
     
          public ArrayList<Habitacion> Devolver_habitaciones_cuatro(int habitaciones,int adultos,int ninos)
     {
         ArrayList<Habitacion> patrones=new ArrayList<Habitacion>();
          if(habitaciones>adultos)
        {
           
           
            for(int x=0;x<Math.ceil(adultos/2);x++)
         {
             doble hab=new doble();
             patrones.add(hab);
         }
         doble hab=new doble();
         patrones.add(hab);   
          
                 }
     
      

     
    return patrones;
     
     
     
}
          
          public void agregar_habitacion(ArrayList<Habitacion> patrones,DefaultTableModel modelo )
          {
              int individuales = 0,dobles = 0;
             
              String tipo=" ";
            for(int x=0;x<patrones.size();x++)
                     {
                     if(patrones.get(x) instanceof doble)
                     {
                         dobles=dobles+1;
                     }
                     else{
                          individuales=individuales+1;
                     }
                   
                     }
                     if(dobles>0)
                     {
                         if(dobles>1)
                         {
                         tipo=" "+dobles+" Habitaciones Dobles";
                         }
                         else if(dobles==1)
                         {
                         tipo=" "+dobles+" Habitacion Doble";
                         }   
                     
                      if(individuales>0)
                     {
                         if(individuales>1)
                         {
                          tipo+=" y "+individuales+"  Habitaciones Individuales";
                         }
                         else if(individuales==1)
                         {
                          tipo+=" y "+individuales+"  Habitacion Individual";
                         }
                    
                     }
                     }
                     else
                     {
                     if(individuales>0)
                     {
                      if(individuales>1)
                         {
                          tipo=" "+individuales+"  Habitaciones Individuales";
                         }
                         else if(individuales==1)
                         {
                          tipo=" "+individuales+"  Habitacion Individual";
                         }
                     } 
                     }
                     
                     
                     int capacidad=individuales+(dobles*2);
                      String[]datos={tipo,String.valueOf(capacidad)};
            modelo.addRow(datos);
          }
}
