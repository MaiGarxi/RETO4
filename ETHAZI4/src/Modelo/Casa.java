
package Modelo;

public class Casa extends Alojamiento {
    
    protected String Cod_casa;
    protected int Baños;
    protected float Tamaño_total;

    public Casa() {
    }

    public Casa(String Cod_casa, int Baños, float Tamaño_total, String Cod_alojamiento, String Nombre, int habitacion_disponible) {
        super(Cod_alojamiento, Nombre, habitacion_disponible);
        this.Cod_casa = Cod_casa;
        this.Baños = Baños;
        this.Tamaño_total = Tamaño_total;
    }

    public String getCod_casa() {
        return Cod_casa;
    }

    public void setCod_casa(String Cod_casa) {
        this.Cod_casa = Cod_casa;
    }

    public int getBaños() {
        return Baños;
    }

    public void setBaños(int Baños) {
        this.Baños = Baños;
    }

    public float getTamaño_total() {
        return Tamaño_total;
    }

    public void setTamaño_total(float Tamaño_total) {
        this.Tamaño_total = Tamaño_total;
    }

    
    
}
