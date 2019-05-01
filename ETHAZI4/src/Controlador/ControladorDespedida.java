
package Controlador;

import Modelo.Conexion;
import java.util.Timer;
import java.util.TimerTask;

public class ControladorDespedida {
    
    public void ControladorDespedida(){
        
        Timer timer = new Timer();
        TimerTask task;
        task = new TimerTask() {
            @Override
            public void run() {
                Conexion con = new Conexion();
                con.Desconexion();
                PasarPagina pasar = new PasarPagina();
                pasar.DespedidaaBienvenida();
            }
        };
         timer.schedule(task, 5000); 
    }
}
