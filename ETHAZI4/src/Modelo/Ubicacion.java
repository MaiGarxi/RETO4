
package Modelo;

public class Ubicacion {
    
    
    protected int Cod_ubicacion,Cp, Cod_alojamiento;
    protected String Localidad, Direccion;

    public Ubicacion() {
    }

    public Ubicacion(int Cod_ubicacion, int Cp, int Cod_alojamiento, String Localidad, String Direccion) {
        this.Cod_ubicacion = Cod_ubicacion;
        this.Cp = Cp;
        this.Cod_alojamiento = Cod_alojamiento;
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

    public int getCod_alojamiento() {
        return Cod_alojamiento;
    }

    public void setCod_alojamiento(int Cod_alojamiento) {
        this.Cod_alojamiento = Cod_alojamiento;
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
