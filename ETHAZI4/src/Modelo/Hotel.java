
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
import javax.swing.table.TableColumn;

public class Hotel extends Alojamiento{

    protected int estrellas; 
    protected String cod_hotel;

    public Hotel() {
    }

    public Hotel(String cod_hotel, int estrellas, String Cod_alojamiento, String Nombre, int habitacion_disponible) {
        super(Cod_alojamiento, Nombre, habitacion_disponible);
        this.cod_hotel = cod_hotel;
        this.estrellas = estrellas;
    }

    public String getCod_hotel() {
        return cod_hotel;
    }

    public void setCod_hotel(String cod_hotel) {
        this.cod_hotel = cod_hotel;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public ArrayList <Hotel>  buscar_hoteles(String salida,String destino,String entrada)
    {
        ArrayList<Hotel> hoteles = new ArrayList<Hotel>();
        return hoteles;
    }
  
    
    public ArrayList<reserva> Crear_array(String alojamiento,String fecha1, String fecha2, double precio)
    {
        try {
            ArrayList<reserva> hoteles_reserva = new ArrayList<reserva>();
            ResultSet resultado = consul.alojamiento_para_reservar(alojamiento);
            for(int x=0;resultado.next();x++)
            {
                reserva reser= new reserva((x+1),resultado.getString("codigo"),precio,fecha1,fecha2);
                hoteles_reserva.add(reser);
            } 
            return hoteles_reserva;
        } catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
