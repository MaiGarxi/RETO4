
package Modelo;

public class Habitacion {
    
    protected int individual,doble,infantil;

    public Habitacion(int individual, int doble, int infantil) {
        this.individual = individual;
        this.doble = doble;
        this.infantil = infantil;
    }

    public int getIndividual() {
        return individual;
    }

    public void setIndividual(int individual) {
        this.individual = individual;
    }

    public int getDoble() {
        return doble;
    }

    public void setDoble(int doble) {
        this.doble = doble;
    }

    public int getInfantil() {
        return infantil;
    }

    public void setInfantil(int infantil) {
        this.infantil = infantil;
    }
    
    
}
