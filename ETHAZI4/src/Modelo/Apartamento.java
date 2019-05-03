
package Modelo;

public class Apartamento extends Alojamiento {
    
    protected String Cod_apartamento;
    protected int Piso;
    protected String Cod_casa;

    public Apartamento() {
    }

    public Apartamento(String Cod_apartamento, int Piso, String Cod_casa, String Cod_alojamiento, String Nombre, int habitacion_disponible) {
        super(Cod_alojamiento, Nombre, habitacion_disponible);
        this.Cod_apartamento = Cod_apartamento;
        this.Piso = Piso;
        this.Cod_casa = Cod_casa;
    }

    public String getCod_apartamento() {
        return Cod_apartamento;
    }

    public void setCod_apartamento(String Cod_apartamento) {
        this.Cod_apartamento = Cod_apartamento;
    }

    public int getPiso() {
        return Piso;
    }

    public void setPiso(int Piso) {
        this.Piso = Piso;
    }

    public String getCod_casa() {
        return Cod_casa;
    }

    public void setCod_casa(String Cod_casa) {
        this.Cod_casa = Cod_casa;
    }
    
    
    
}
