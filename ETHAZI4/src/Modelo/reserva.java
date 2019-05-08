
package Modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class reserva {
    
    protected int cod_reserva;
    protected String cod_hotel;
    protected double precio;
    protected String entrada;
    protected String salida;

    public reserva(int cod_reserva, String cod_hotel, double precio, String entrada, String salida) {
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

    public String getCod_hotel() {
        return cod_hotel;
    }

    public void setCod_hotel(String cod_hotel) {
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
            reserva reser= new reserva((x+1),hoteles.get(x).cod_hotel,reservas.get(x).precio,reservas.get(x).entrada,reservas.get(x).salida);
            reservas.add(reser);        
        }
        return reservas;
    }
   
    public double calcular_total_pagar (ArrayList<reserva> reservas)
    {
        double precio_final =0;
           for(int x=0;reservas.size()>x;x++)
        {
            precio_final = precio_final + reservas.get(x).precio;       
        }
        return precio_final;
    }
   
    public String crear_txt(ArrayList<reserva> reservas,ArrayList<Usuario> Users)
    {      
        try{
            String ruta= "src\\modelo\\Reserva.txt"; 
            FileWriter archivo = new FileWriter(ruta);
        for(int x=0;x<reservas.size();x++)
        {    
            String mensaje =     " \n"
				+"                                                             BIDAI-ON S.L.                        "+" \t\n"
				+" **********************************************************************************************************************"+" \t\n"				
                                +" -Nombre : "+Users.get(0).nombre+" \t\t\n"
                                +" -Apellidos : "+Users.get(0).apellidos +" \t\t\n"
                                +" -DNI : "+Users.get(x).dni +" \t\t\n"
				+" -Código de Reserva : " +reservas.get(x).cod_reserva+" \t\t\n"
                                +" -Fecha de entrada: " +reservas.get(x).entrada+" \t\t\n"
                                +" -Fecha de salida : " +reservas.get(x).salida+" \t\t\n"
                                +" -Número de habitación(es) : " +" \t\t\n"
                                +" -Número de personas que cubre la reserva : "+" \t\t\n"
				+" **********************************************************************************************************************"+" \t\n"
				
				+" -Precio final: " +reservas.get(x).precio+" €";
                                archivo.write(mensaje);
        }
            archivo.close();
            return "Archivo Creado Con Exito";         
        }catch(IOException e){
            return  "Hubo un error";       
        }         
    }     
}
