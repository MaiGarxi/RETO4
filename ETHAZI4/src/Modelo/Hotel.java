
package Modelo;

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
}
