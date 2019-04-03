
package Modelo;

public class reserva {
    protected int cod_reserva,cod_hotel;
    protected double precio;

    public reserva(int cod_reserva, int cod_hotel, double precio) {
        this.cod_reserva = cod_reserva;
        this.cod_hotel = cod_hotel;
        this.precio = precio;
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



    public reserva() {
    }


    
}
