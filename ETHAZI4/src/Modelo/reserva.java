
package Modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class reserva {
    
    protected int cod_reserva,cod_hotel;
    protected double precio;
    public String entrada;
    protected String salida;

    public reserva(int cod_reserva, int cod_hotel, double precio, String entrada, String salida) {
        this.cod_reserva = cod_reserva;
        this.cod_hotel = cod_hotel;
        this.precio = precio;
        this.entrada = entrada;
        this.salida = salida;
    }

    public int getCod_reserva() {
        return cod_reserva;
    }

    public void setCod_reserva(int cod_reserva) {
        this.cod_reserva = cod_reserva;
    }

    public int getCod_hotel() {
        return cod_hotel;
    }

    public void setCod_hotel(int cod_hotel) {
        this.cod_hotel = cod_hotel;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public reserva() {
    }

   public ArrayList <reserva> Crear_reservas (ArrayList<Hotel> hoteles)
    {
         ArrayList <reserva> reservas;
         reservas = new ArrayList<reserva>();
        for(int x=0;hoteles.size()>x;x++)
        {
           /*reserva reser= new reserva((x+1),hoteles.get(x).cod_hotel,100.0);
        reservas.add(reser);*/ //modificar segun la base de datos**************************************
        
        }
      return reservas;
    }
   
    public  double calcular_total_pagar (ArrayList<reserva> reservas)
   {
        double precio_final =0;
           for(int x=0;reservas.size()>x;x++)
        {
            precio_final = precio_final + reservas.get(x).precio;       
        }
   return precio_final;
   }
   
   public String crear_txt(ArrayList<reserva> reservas)
   {      
        try{
            String ruta= "src\\modelo\\Reserva.txt"; 
            FileWriter archivo = new FileWriter(ruta);
            for(int x=0;x<reservas.size();x++)
        {    
          String mensaje =         " \n"
				+"                                                             BIDAI-ON S.L.                        "+" \t\n"
				+" **********************************************************************************************************************"+" \t\n"
				
				+" -Número de Reservas Realizadas: "+(reservas.size())+"  \t \n\n"  
				+" -Código de Reserva : " +reservas.get(x).cod_reserva+" \t\t\n"
				+" **********************************************************************************************************************"+" \t\n"
				
				+" -Código del Hotel Reservado: " + reservas.get(x).cod_hotel+"  \t\n" 
				+" **********************************************************************************************************************"+" \t\n"
				
				+" -Precio final: " +reservas.get(x).calcular_total_pagar(reservas)+" €";
                                archivo.write(mensaje);
        }
            archivo.close();
            return "Archivo Creado Con Exito";         
        }catch(IOException e){
           return  "Hubo un error";       
        }         
   }   
}
