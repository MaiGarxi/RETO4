
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Calendario { 
    
    public int obtener_dia(Date dia_entrada, Date dia_salida) 
    {
        long ms=dia_salida.getTime()-dia_entrada.getTime();
        long dias=ms/(1000*60*60*24);       
        return (int)dias;
    }
    
    public double calcularPrecioTemp(Date dia_entrada, Date dia_salida) {
        double precioAlta=0.2;	
	
        double precioTemp = 0;
        System.out.println(Calendar.MAY);
	if (dia_entrada.getDate() > Calendar.MAY && dia_entrada.getDate() < Calendar.OCTOBER){ 
            precioTemp = 0.2;
        }
        return precioTemp;
        
    }
    
    public double precioFestivo(Date dia_entrada, Date dia_salida){
            
        double precioFestivo = 0;
        ArrayList<Calendario> Festivos = new ArrayList<Calendario>();

	for (int x=0;x<=Festivos.size();x++) {
            if (dia_entrada.equals(Festivos)){ 
		precioFestivo = 1.75;
            
            }
        }	
        return precioFestivo;
    }
}
