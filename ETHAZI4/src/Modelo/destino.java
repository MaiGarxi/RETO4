
package Modelo;


public class destino {
    protected int cod_destino,cod_reserva,cp;
    protected String nombre,provincia;

    public destino(int cod_destino, int cod_reserva, int cp, String nombre, String provincia) {
        this.cod_destino = cod_destino;
        this.cod_reserva = cod_reserva;
        this.cp = cp;
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public destino() {
    }

    public int getCod_destino() {
        return cod_destino;
    }

    public void setCod_destino(int cod_destino) {
        this.cod_destino = cod_destino;
    }

    public int getCod_reserva() {
        return cod_reserva;
    }

    public void setCod_reserva(int cod_reserva) {
        this.cod_reserva = cod_reserva;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
}
