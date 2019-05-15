
package Modelo;

import static ethazi4.ETHAZI4.consul;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class reserva {
    
    protected int cod_reserva;
    protected String cod_alojamiento,cod_habitacion,dni;
    protected double precio;
    protected String entrada;
    protected String salida;

    public reserva() {
    }  
    
    public reserva(int cod_reserva, String entrada, String salida, String cod_alojamiento, double precio) {
        this.cod_reserva = cod_reserva;
        this.cod_alojamiento = cod_alojamiento;
        this.precio = precio;
        this.entrada = entrada;
        this.salida = salida;
    }
        
    public reserva(int cod_reserva, String entrada, String salida, String cod_alojamiento, String dni, double precio) {
        this.cod_reserva = cod_reserva;
        this.cod_alojamiento = cod_alojamiento;
        this.dni = dni;
        this.precio = precio;
        this.entrada = entrada;
        this.salida = salida;
    }
    
    public reserva(int cod_reserva, String entrada, String salida,String cod_alojamiento,String dni, String cod_habitacion, double precio) {
        this.cod_reserva = cod_reserva;
        this.cod_alojamiento = cod_alojamiento;
        this.cod_habitacion = cod_habitacion;
        this.dni = dni;
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

    public String getCod_alojamiento() {
        return cod_alojamiento;
    }

    public void setCod_alojamiento(String cod_alojamiento) {
        this.cod_alojamiento = cod_alojamiento;
    }

    public String getCod_habitacion() {
        return cod_habitacion;
    }

    public void setCod_habitacion(String cod_habitacion) {
        this.cod_habitacion = cod_habitacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public ArrayList<reserva> Crear_arrayHotel(String alojamiento,String fecha1, String fecha2, double precio, ArrayList<Cama> patron, ArrayList<Usuario> Users)
    {
        ArrayList<reserva> alojamientos_reserva = new ArrayList<reserva>();
        for (int i = 0; i < patron.size(); i++) {                
            try {
                
                ResultSet resultado = consul.hotel_para_reservar(alojamiento);
                for(int x=0;resultado.next();x++)
                {
                    reserva reser= new reserva((i+1),fecha1,fecha2,resultado.getString("codigo"),Users.get(x).getDni(),patron.get(i).getCod_habitacion(),precio);
                    alojamientos_reserva.add(reser);
                } 
            } catch (SQLException ex) {
                System.out.println("Hubo un error");
                return null;
            }
        }   
        return alojamientos_reserva;
    }
    
    public ArrayList<reserva> Crear_arrayCasaApartamento(String alojamiento,String fecha1, String fecha2, double precio, ArrayList<Usuario> Users,String Alojamiento)
    {
        ArrayList<reserva> alojamientos_reserva = new ArrayList<reserva>();               
        if(Alojamiento=="c%")
        {
                 try {
                
                ResultSet resultado = consul.casa_para_reservar(alojamiento);
                for(int x=0;resultado.next();x++)
                {
                    reserva reser= new reserva((x+1),fecha1,fecha2,resultado.getString("codigo"),Users.get(x).getDni(),precio);
                    alojamientos_reserva.add(reser);
                } 
            } catch (SQLException ex) {
                System.out.println("Hubo un error");
                return null;
            } 
        return alojamientos_reserva;
        }
        else{
                 try {
                
                ResultSet resultado = consul.apartamento_para_reservar(alojamiento);
                for(int x=0;resultado.next();x++)
                {
                    reserva reser= new reserva((x+1),fecha1,fecha2,resultado.getString("codigo"),Users.get(x).getDni(),precio);
                    alojamientos_reserva.add(reser);
                } 
            } catch (SQLException ex) {
                System.out.println("Hubo un error");
                return null;
            } 
        return alojamientos_reserva;
        }


    }
 
    public ArrayList <reserva> Crear_reservaHotel (ArrayList<Alojamiento> alojamientos)
    {
        ArrayList <reserva> reservas;
        reservas = new ArrayList<reserva>();
        for(int x=0;alojamientos.size()>x;x++)
        {            
            reserva reser= new reserva((x+1),reservas.get(x).entrada,reservas.get(x).salida,alojamientos.get(x).Cod_alojamiento,reservas.get(x).dni,reservas.get(x).cod_habitacion,reservas.get(x).precio);
            reservas.add(reser);             
        }
        return reservas;
    }
   
    public double calcular_total_pagar (ArrayList<reserva> reservas)
    {
        double precio_final =0;
        precio_final = precio_final + reservas.get(0).precio;       
        
        return precio_final;
    }
   
    public ArrayList <reserva> Reservas (ArrayList<Usuario> Users) throws SQLException
    {
        ArrayList<reserva> usuario_reserva = new ArrayList<reserva>(); 
        ResultSet rs = consul.ObtenerReserva(Users.get(0).dni);
        while (rs.next())
        {
            for(int x=0;rs.next();x++)
            {
                reserva reser= new reserva (rs.getInt("Cod_reserva"),rs.getString("Fecha_entrada"),rs.getString("Fecha_salida"),rs.getString("Cod_alojamiento"),rs.getDouble("Precio"));
                usuario_reserva.add(reser);
            }
        }              
        return usuario_reserva ;
    }
    
    public void Delete(String us){
                           
            int n= JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere eliminar sus reservas?", "Borrar Reserva" , JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) 
            {
                JOptionPane.showMessageDialog(null, "Reservas canceladas");               
                consul.BorrarReserva(us);
            }else {
                JOptionPane.showMessageDialog(null, "GRACIAS");
            }                                               
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
