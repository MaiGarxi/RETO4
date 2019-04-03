
package Modelo;

public class reserva {
    protected int cod_reserva;
    protected double precio;

    public reserva(int cod_reserva) {
        this.cod_reserva = cod_reserva;
    }

    public reserva() {
    }

    public int getCod_reserva() {
        return cod_reserva;
    }

    public void setCod_reserva(int cod_reserva) {
        this.cod_reserva = cod_reserva;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
