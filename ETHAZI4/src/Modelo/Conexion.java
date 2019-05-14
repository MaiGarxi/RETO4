
package Modelo;

import bbdd.Consultas;
import static bbdd.Consultas.reg;
import static ethazi4.ETHAZI4.consul;
import java.sql.SQLException;

public class Conexion {
    
    public void Conexion(){
        
        consul = new Consultas();
    }
    
    public void Desconexion(){
        try {
            reg.close();
            if(reg.isClosed())
            {
                System.out.print("Conexion Cerrada");
            }                   
        } catch (SQLException ex) {
            System.out.println("Hubo un error");
        }
    }
}
