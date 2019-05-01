
package ethazi4;

import Controlador.PasarPagina;
import bbdd.Consultas;

public class ETHAZI4 {
    
    public static int aux;
    public static Consultas consul;
    
    public static void main(String[] args) {
       //Se crea el objeto pasar de la clase PasarPagina (CONTROLADOR)
       PasarPagina pasar=new PasarPagina();
       //Llamar al metodo que abre la vista Bienvenida
       pasar.Bienvenida();
    }
    
}
