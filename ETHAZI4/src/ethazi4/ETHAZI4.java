
package ethazi4;

import Controlador.PasarPagina;
import Vista.Bienvenida;

public class ETHAZI4 {
public static int aux;
    public static void main(String[] args) {
        
       //Se crea el objeto bien instanciandolo en la clase Bienvenida (VISTA) 
       Bienvenida bien = new Bienvenida(); 
       //Se crea el objeto pasar de la clase PasarPagina (CONTROLADOR)
       PasarPagina pasar=new PasarPagina();
       bien.setVisible(true); // SE HACE VISIBLE LA VENTANA SALUDO
    }
    
}
