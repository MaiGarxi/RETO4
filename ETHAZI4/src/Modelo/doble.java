package Modelo;

public class doble extends Cama {
    
  
    protected String Tipo_cama;

    public doble() {
    }

    public doble(String Tipo_cama, String Cod_cama, int Capacidad, int Capacidad_inf, String Cod_habitacion) {
        super(Cod_cama, Capacidad, Capacidad_inf, Cod_habitacion);
        this.Tipo_cama = Tipo_cama;
    }

    public String getTipo_cama() {
        return Tipo_cama;
    }

    public void setTipo_cama(String Tipo_cama) {
        this.Tipo_cama = Tipo_cama;
    }
    
}
