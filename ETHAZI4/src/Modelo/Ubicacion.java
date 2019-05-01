
package Modelo;

public class Ubicacion {
    
    
    protected int Cod_ubicacion,Cp, Cod_hotel;
    protected String Localidad, Direccion;

    public Ubicacion() {
    }

    public Ubicacion(int Cod_ubicacion, int Cp, int Cod_hotel, String Localidad, String Direccion) {
        this.Cod_ubicacion = Cod_ubicacion;
        this.Cp = Cp;
        this.Cod_hotel = Cod_hotel;
        this.Localidad = Localidad;
        this.Direccion = Direccion;
    }

    public int getCod_ubicacion() {
        return Cod_ubicacion;
    }

    public void setCod_ubicacion(int Cod_ubicacion) {
        this.Cod_ubicacion = Cod_ubicacion;
    }

    public int getCp() {
        return Cp;
    }

    public void setCp(int Cp) {
        this.Cp = Cp;
    }

    public int getCod_hotel() {
        return Cod_hotel;
    }

    public void setCod_hotel(int Cod_hotel) {
        this.Cod_hotel = Cod_hotel;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
}
