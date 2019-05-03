
package Modelo;

public class Habitacion {
    
    protected String Cod_habitacion;
    protected float Tamaño;
    protected String Descripcion;
    protected String Tipo;
    protected String Cod_alojamiento;

    public Habitacion() {
    }

    public Habitacion(String Cod_habitacion, float Tamaño, String Descripcion, String Tipo, String Cod_alojamiento) {
        this.Cod_habitacion = Cod_habitacion;
        this.Tamaño = Tamaño;
        this.Descripcion = Descripcion;
        this.Tipo = Tipo;
        this.Cod_alojamiento = Cod_alojamiento;
    }

    public String getCod_habitacion() {
        return Cod_habitacion;
    }

    public void setCod_habitacion(String Cod_habitacion) {
        this.Cod_habitacion = Cod_habitacion;
    }

    public float getTamaño() {
        return Tamaño;
    }

    public void setTamaño(float Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getCod_alojamiento() {
        return Cod_alojamiento;
    }

    public void setCod_alojamiento(String Cod_alojamiento) {
        this.Cod_alojamiento = Cod_alojamiento;
    }

    
}
