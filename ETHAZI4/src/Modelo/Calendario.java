
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
    
    protected double precioAlta=0.1;
    protected double precioBaja;
    
    
    public int obtener_dia(Date dia_entrada, Date dia_salida) 
    {
        long ms=dia_salida.getTime()-dia_entrada.getTime();
        long dias=ms/(1000*60*60*24);       
        return (int)dias;
    }
    
    public double calcularPrecioBase(Date dia_entrada, Date dia_salida) {
        	
	double precio = 0;
        double precioTemp = 0;

	if (dia_entrada.getDate() > Calendar.MAY && dia_entrada.getDate() < Calendar.OCTOBER){ 
            precioTemp = precioTemp*precioAlta;
        }else{
            precioTemp = precioTemp*precioBaja;
        }
		
	precio += precioTemp;
                
        ArrayList<Calendario> Festivos = new ArrayList<Calendario>();

	for (int x=0;x<=Festivos.size();x++) {
            if (dia_entrada.equals(Festivos)){ 
		precio += precioTemp * 1.75;
            
            }
        }	
            return precio;
    }
}
