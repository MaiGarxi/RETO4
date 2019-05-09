
package Modelo;

import static ethazi4.ETHAZI4.consul;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Calendario { 
    
    public int obtener_dia(Date dia_entrada, Date dia_salida) 
    {
        long ms=dia_salida.getTime()-dia_entrada.getTime();
        long dias=ms/(1000*60*60*24);  
        return (int)dias;
    }
    
    public double calcularPrecioTemp(String dia_entrada, String dia_salida) {
        
        double precioAlta=0.2;		
        double precioTemp=0;
        
        String junio="0000-06-00";
        String julio="0000-07-00";
        String agosto="0000-08-00";
        String septiembre="0000-09-00";
        
        char jun=junio.charAt(6);
        char jul=julio.charAt(6);
        char ago=agosto.charAt(6);
        char sep=septiembre.charAt(6);
        
        char e =dia_entrada.charAt(6);
        char s= dia_salida.charAt(6);

	if ( e==jun || e==jul || e==ago || e==sep && s==jun || s==jul || s==ago || s==sep ){ 
            precioTemp = precioAlta;
        }
        return precioTemp;        
    }
    
    public double precioFestivo(String dia_entrada, String dia_salida){
            
        double precioFestivo = 0;
        double numeroFestivos=0;
        
        try {         
            ResultSet resultado=consul.ComprobarFestivos(dia_entrada, dia_salida);           
            while (resultado.next())
            {
                numeroFestivos=resultado.getInt("Fecha_festivo");               
            }  
            if(numeroFestivos>0){
                precioFestivo=numeroFestivos*1.75;
                    System.out.println("precioFestivo: "+precioFestivo);
            }
            
        } catch (SQLException ex) {
            System.out.println("Hubo un error");
        }	
        return precioFestivo;
    }
}
