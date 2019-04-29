
package Controlador;

import bbdd.Consultas;
import static ethazi4.ETHAZI4.consul;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class ControladorBienvenida {
    
    public ControladorBienvenida(JButton continuar){
        
        continuar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {  
                consul = new Consultas();
                PasarPagina pasar= new PasarPagina(); 
                pasar.BienvenidaaLogin();
            }
        });
    }
}
