
package Modelo;

import java.util.ArrayList;
import java.util.Date;
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
    
    public void grande_agregar(ArrayList<ArrayList> patron,DefaultTableModel modelo )
    {
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
}
