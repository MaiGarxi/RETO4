
package ethazi4;

import Controlador.PasarPagina;
import Vista.Bienvenida;

public class ETHAZI4 {

    public static void main(String[] args) {
       //Se crea El objeto saludo1 Instanciandolo en la clase saludo (VISTA) 
       Bienvenida bien = new Bienvenida(); 
       //Se crea el objeto pasar de la clase Pasar_pagina (CONTROLADOR)
       PasarPagina pasar=new PasarPagina();
       bien.setTitle("¡BIENVENID@S!");
       bien.setVisible(true); // SE HACE VISIBLE LA VENTANA SALUDO
    }
    
}
