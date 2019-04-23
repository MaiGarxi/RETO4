
package Modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Habitacion {
    
    protected int Cod_habitacion, Capacidad_niños, Cod_hotel,cantidad_ninos;
    
    public Habitacion() {
    }

    public Habitacion(int Cod_habitacion, int Capacidad_niños, int Cod_hotel) {
        this.Cod_habitacion = Cod_habitacion;
        this.Capacidad_niños = Capacidad_niños;
        this.Cod_hotel = Cod_hotel;
    }

    public int getCod_habitacion() {
        return Cod_habitacion;
    }

    public void setCod_habitacion(int Cod_habitacion) {
        this.Cod_habitacion = Cod_habitacion;
    }



    public int getCapacidad_niños() {
        return Capacidad_niños;
    }

    public void setCapacidad_niños(int Capacidad_niños) {
        this.Capacidad_niños = Capacidad_niños;
    }

    public int getCod_hotel() {
        return Cod_hotel;
    }

    public void setCod_hotel(int Cod_hotel) {
        this.Cod_hotel = Cod_hotel;
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
            }else{          
                for(int x=0;x<Math.floor(habitaciones/2);x++)
                {
                    doble hab=new doble();
                    patrones.add(hab);
                }
                individual hab=new individual();
                patrones.add(hab);
                }
            return patrones;
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
        if(habitaciones>=adultos)
        {  
            
            for(int x=0;x<habitaciones;x++)
                {
                    System.out.println(habitaciones);
                    doble hab=new doble();
                    patrones.add(hab);
                }

 
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
        String[]datos={tipo,0+" ",capacidad+""};
         modelo.addRow(datos);
        }
        
    }
    
     public double obtener_precio_reserva(ArrayList<Habitacion> patrones)
     {
         double precio=0.0;
          for(int x=0;x<patrones.size();x++)
        {
            if(patrones.get(x) instanceof doble)
            {
                precio=precio+100;
            }else if(patrones.get(x) instanceof individual){
                precio=precio+50;
            }
        }
     return precio;
     }
}
