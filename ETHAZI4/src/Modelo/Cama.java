
package Modelo;

import static ethazi4.ETHAZI4.consul;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Cama {
    
    protected String Cod_cama;
    protected int Capacidad;
    protected int Capacidad_inf;
    protected String Cod_habitacion;

    public Cama() {
    }

    public Cama(String Cod_cama, int Capacidad, int Capacidad_inf, String Cod_habitacion) {
        this.Cod_cama = Cod_cama;
        this.Capacidad = Capacidad;
        this.Capacidad_inf = Capacidad_inf;
        this.Cod_habitacion = Cod_habitacion;
    }

    public String getCod_cama() {
        return Cod_cama;
    }

    public void setCod_cama(String Cod_cama) {
        this.Cod_cama = Cod_cama;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getCapacidad_inf() {
        return Capacidad_inf;
    }

    public void setCapacidad_inf(int Capacidad_inf) {
        this.Capacidad_inf = Capacidad_inf;
    }

    public String getCod_habitacion() {
        return Cod_habitacion;
    }

    public void setCod_habitacion(String Cod_habitacion) {
        this.Cod_habitacion = Cod_habitacion;
    }


    
    public ArrayList<Cama> Devolver_habitaciones_uno(int habitaciones,int adultos,int ninos){
     
        ArrayList<Cama> patrones=new ArrayList<Cama>();
        if(habitaciones==adultos)
        {        
            for(int x=0;x<habitaciones;x++)
            {
                individual hab=new individual();
                patrones.add(hab);
            }
        }else{
            if(adultos>habitaciones)
            {         
                for(int x=0;x<adultos;x++)
                {
                    individual hab=new individual();
                    patrones.add(hab);
                } 
            }else{            
                for(int x=0;x<habitaciones;x++)
                {
                    individual hab=new individual();
                    patrones.add(hab);
                }
            }    
        }
        if(ninos>0)
        {
            patrones.get(0).Capacidad_inf=ninos; 
        } 
         
           return patrones;    
    }
     
    public ArrayList<Cama> Devolver_habitaciones_dos(int habitaciones,int adultos,int ninos)
    {
        ArrayList<Cama> patrones=new ArrayList<Cama>();
        if(adultos !=1)
        {
        if(habitaciones==adultos)
        {
            if(adultos%2==0)
            {        
                for(int x=0;x<adultos/2;x++)
                {
                    doble hab=new doble();
                    patrones.add(hab);
                }
            }else{          
                for(int x=0;x<Math.floor(habitaciones/2);x++)
                {
                    doble hab=new doble();
                    patrones.add(hab);
                }
                individual hab=new individual();
                patrones.add(hab);
                }
           
        }else{  
            if(adultos%2==0)
            {       
                for(int x=0;x<adultos/2;x++)
                {
                    doble hab=new doble();
                    patrones.add(hab);
                }
            }else{          
                for(int x=0;x<Math.floor(adultos/2);x++)
                {
                    doble hab=new doble();
                    patrones.add(hab);
                }
                individual hab=new individual();
                patrones.add(hab);   
               
            }           
        }
            if(ninos>0)
            {
                patrones.get(0).Capacidad_inf=ninos; 
            }   
        }
        return patrones;  
    }
     
     public ArrayList<Cama> Devolver_habitaciones_tres(int habitaciones,int adultos,int ninos)
     {
        ArrayList<Cama> patrones=new ArrayList<Cama>();
        
        if(adultos%2!=0)
        {                      
            for(int x=0;x<Math.ceil(adultos/2);x++)
            {
                doble hab=new doble();
                patrones.add(hab);
            }
            doble hab=new doble();
            patrones.add(hab);   
               if(ninos>0)
        {
            patrones.get(0).Capacidad_inf=ninos; 
           } 
        }    
        
        
        return patrones;    
    }
     
    public ArrayList<Cama> Devolver_habitaciones_cuatro(int habitaciones,int adultos,int ninos)
    {
        ArrayList<Cama> patrones=new ArrayList<Cama>();
        if(habitaciones!=2 && adultos !=2)
        {
        if(habitaciones>=adultos )
        {
            if(habitaciones%2==0)
            {
                if((habitaciones/2)%2==0)
                {
                for(int x=0;x<(habitaciones/2)/2;x++)
                {
                    doble hab=new doble();
                    patrones.add(hab);
                }
                for(int x=0;x<(habitaciones/2);x++)
                {
                    individual hab=new individual();
                    patrones.add(hab);
                }
                }
                else{
               
                 for(int x=0;x<Math.ceil((habitaciones/2)/2)+1;x++)
                {
                    doble hab=new doble();
                    patrones.add(hab);
                }
                  for(int x=0;x<(habitaciones/2)-1;x++)
                {
                    individual hab=new individual();
                    patrones.add(hab);
                }
                }

            }
            else{
                if(Math.floor(habitaciones/2)!=1)
                       {
                        for(int x=0;x<Math.floor(habitaciones/2)-1;x++)
                        {
                           doble hab=new doble();
                              patrones.add(hab);
                        }
                        int subHabitaciones=(int) (habitaciones-(Math.floor(habitaciones/2)));
                        for(int x=0;x<subHabitaciones;x++)
                        {
                           individual hab=new individual();
                              patrones.add(hab);
                        }
                       }
                else{
                for(int x=0;x<Math.floor(habitaciones/2);x++)
                        {
                           doble hab=new doble();
                              patrones.add(hab);
                        }
                        int subHabitaciones=(int) (habitaciones-(Math.floor(habitaciones/2)));
                        for(int x=0;x<subHabitaciones;x++)
                        {
                           individual hab=new individual();
                              patrones.add(hab);
                        }
                }         
            }
        }else if(habitaciones>=adultos)
            {  

                for(int x=0;x<adultos;x++)
                    {
                        System.out.println(habitaciones);
                        individual hab=new individual();
                        patrones.add(hab);
                    }

                if(ninos>0)
                {
                    patrones.get(0).Capacidad_inf=ninos; 
                }   
            }
        }       
        return patrones; 
    }
    
    public void grande_agregar(String nombre_hotel,String entrada,String salida,ArrayList<ArrayList> patron,DefaultTableModel modelo )
    {Cama cama=new Cama();
    System.out.println("Esta es la localidad  "+nombre_hotel);
    ArrayList<Cama> camas_disponibles=new ArrayList<Cama>();
    
    camas_disponibles=cama.camas_disponibles(nombre_hotel, entrada, salida);
    for(int y=0;y<=camas_disponibles.size();y++)
    {
        System.out.println(" Cama disponible "+camas_disponibles.get(y).Cod_cama);
    }
  cama.devolver_camas_finales(camas_disponibles, patron.get(0));
  cama.devolver_camas_finales(camas_disponibles, patron.get(1));
  cama.devolver_camas_finales(camas_disponibles, patron.get(2));
  cama.devolver_camas_finales(camas_disponibles, patron.get(3));
  
  
        ArrayList<Integer> capacidades=new ArrayList<Integer>();
        for(int l=0;l<patron.size();l++)
        {
        capacidades.add(orden_agregar(patron.get(l)));
        }      
                   
        ArrayList<Cama> parad=new ArrayList<Cama>();
        int auxi;
        for(int k=0;k<(patron.size()-1);k++)
        {
            for(int f=0;f<((patron.size()-k)-1);f++)
            {              
                if(capacidades.get(f)>capacidades.get(f+1))
                {
                    parad=patron.get(f+1);
                    patron.set(f+1,patron.get(f));
                    patron.set(f,parad);
                    auxi=capacidades.get(f+1);
                    capacidades.set(f+1,capacidades.get(f));
                    capacidades.set(f, auxi);                    
                }
            }
        }        
        for(int f=0;f<4;f++)
        {
            agregar_habitacion(patron.get(f),modelo);
        }
    }
         
    public int orden_agregar(ArrayList<Cama> patrones)
    {
        int individuales = 0,dobles = 0;
        for(int x=0;x<patrones.size();x++)
        {
            if(patrones.get(x) instanceof doble)
            {
                dobles=dobles+1;
            }else if(patrones.get(x) instanceof individual){
                individuales=individuales+1;
            }
        }
        if(individuales>0 || dobles>0){
            int capacidad=individuales+(dobles*2);
            patrones.get(0).Capacidad=capacidad;
            return capacidad;
        }else{
            return 100000;
        }
    }
              
    public void agregar_habitacion(ArrayList<Cama> patrones,DefaultTableModel modelo )
    {

        int individuales = 0,dobles = 0;
        String tipo=" ";
          for(int x=0;x<patrones.size();x++)
        {
       
            if(patrones.get(x) instanceof doble)
            {

                dobles=dobles+1;
            }else if(patrones.get(x) instanceof individual){

                individuales=individuales+1;
            }
        }
        if(dobles>0)
        {
            
            if(dobles>1)
            {
                tipo=" "+dobles+" Habitaciones Dobles";
            }else if(dobles==1){
                tipo=" "+dobles+" Habitacion Doble";
            }   
                     
            if(individuales>0)
            {
                 
                if(individuales>1)
                {
                    tipo+=" y "+individuales+"  Habitaciones Individuales";
                }else if(individuales==1){
                    tipo+=" y "+individuales+"  Habitacion Individual";
                }
            }
        }else{
            if(individuales>0){
                if(individuales>1)
                {
                    tipo=" "+individuales+"  Habitaciones Individuales";
                }
                else if(individuales==1){
                    tipo=" "+individuales+"  Habitacion Individual";
                }
            } 
        }
         
        if(individuales>0 || dobles>0){
        int capacidad=individuales+(dobles*2);
        String[]datos={tipo+" ",patrones.get(0).Capacidad_inf+"",capacidad+""};
         modelo.addRow(datos);
        }
        
    }
    
    public double obtener_precio_reserva(ArrayList<Cama> patrones)
    {
        double precio=0.0;
          for(int x=0;x<patrones.size();x++)
        {
            if(patrones.get(x) instanceof doble)
            {
                precio=precio+80;
            }else if(patrones.get(x) instanceof individual){
                precio=precio+50;
            }
        }
        for(int u=0;u<patrones.get(0).Capacidad_inf;u++)
        {
            System.out.println(patrones.get(0).Capacidad_inf);
            precio=precio+20;
        }
        return precio;
    }
     
    public int obtener_dia(Date dia_entrada, Date dia_salida) 
    {
        long ms=dia_salida.getTime()-dia_entrada.getTime();
        long dias=ms/(1000*60*60*24);       
        return (int)dias;
    }
    
     public ArrayList<Cama> camas_disponibles(String fecha_inicio,String fecha_final,String id_alojamiento)
    {
       ArrayList<Cama> camas_disponibile=new ArrayList<Cama>();
      ResultSet resultado= consul.consultar_camas_disponibles(id_alojamiento, fecha_inicio, fecha_final);
        try {
            while (resultado.next())
            {
                if(resultado.getString("Tipo_cama")=="Doble")
                {
                doble quillo=new doble();
                quillo.setCapacidad(resultado.getInt("Capacidad"));
                quillo.setCapacidad_inf(resultado.getInt("Capacidad_inf"));
                quillo.setCod_cama(resultado.getString("Cod_cama"));
                quillo.setCod_habitacion(resultado.getString("Cod_habitacion"));
                camas_disponibile.add(quillo);
                }
                else{
                individual quillo=new individual();
                quillo.setCapacidad(resultado.getInt("Capacidad"));
                quillo.setCapacidad_inf(resultado.getInt("Capacidad_inf"));
                quillo.setCod_cama(resultado.getString("Cod_cama"));
                quillo.setCod_habitacion(resultado.getString("Cod_habitacion"));
                camas_disponibile.add(quillo);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Cama.class.getName()).log(Level.SEVERE, null, ex);
        }
       return camas_disponibile;
    }
     
         public void devolver_camas_finales(ArrayList<Cama> camas_disponible,ArrayList<Cama> patron)
    {
        for(int u=0;u<patron.size();u++)
        {
            for(int l=0;l<camas_disponible.size();l++)
            {
                System.out.println("Hola me llamo pedro");
                System.out.println(camas_disponible.get(l).Cod_cama);
            if(patron.get(u).getClass()==camas_disponible.get(l).getClass())
            {
                System.out.println("El Patron "+patron+"La Habitacion: "+u+" Es valido");
            patron.get(u).setCapacidad(camas_disponible.get(l).Capacidad);
            patron.get(u).setCapacidad_inf(camas_disponible.get(l).Capacidad_inf);
            patron.get(u).setCod_cama(camas_disponible.get(l).Cod_cama);
            patron.get(u).setCod_habitacion(camas_disponible.get(l).Cod_habitacion);
            l=camas_disponible.size();
            }
            
            }
/*            if(patron.get(u).Cod_cama==null)
            {
                System.out.println("El patron se ha eliminado");
                for(int f=0;f<patron.size();f++)
             {
            patron.remove(f);
            }
            }      */ 
        }
       

     
    } 
}
