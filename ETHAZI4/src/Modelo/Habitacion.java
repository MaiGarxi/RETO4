
package Modelo;

public class Habitacion {
    
    protected int Cod_habitacion, Capacidad_niños, Cod_hotel,cantidad_ninos;
    

    public Habitacion() {
    }

    public Habitacion(int Cod_habitacion, int Capacidad_niños, int Cod_hotel) {
        this.Cod_habitacion = Cod_habitacion;
        this.Capacidad_niños = Capacidad_niños;
        this.Cod_hotel = Cod_hotel;
    }

    public int getCod_habitacion() {
        return Cod_habitacion;
    }

    public void setCod_habitacion(int Cod_habitacion) {
        this.Cod_habitacion = Cod_habitacion;
    }



    public int getCapacidad_niños() {
        return Capacidad_niños;
    }

    public void setCapacidad_niños(int Capacidad_niños) {
        this.Capacidad_niños = Capacidad_niños;
    }

    public int getCod_hotel() {
        return Cod_hotel;
    }

    public void setCod_hotel(int Cod_hotel) {
        this.Cod_hotel = Cod_hotel;
    }

 
    
    
    
    
}
