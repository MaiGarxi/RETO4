
package Modelo;

public class Alojamiento {
    
    protected String Cod_alojamiento; 
    protected String Nombre;
    protected int habitacion_disponible;

    public Alojamiento() {
    }

    public Alojamiento(String Cod_alojamiento, String Nombre, int habitacion_disponible) {
        this.Cod_alojamiento = Cod_alojamiento;
        this.Nombre = Nombre;
        this.habitacion_disponible = habitacion_disponible;
    }

    public String getCod_alojamiento() {
        return Cod_alojamiento;
    }

    public void setCod_alojamiento(String Cod_alojamiento) {
        this.Cod_alojamiento = Cod_alojamiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getHabitacion_disponible() {
        return habitacion_disponible;
    }

    public void setHabitacion_disponible(int habitacion_disponible) {
        this.habitacion_disponible = habitacion_disponible;
    }
    
    
}
