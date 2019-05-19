
package Modelo;

import static ethazi4.ETHAZI4.consul;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class Ubicacion {
    
    
    protected int Cod_ubicacion,Cp, Cod_alojamiento;
    protected String Localidad, Direccion;

    public Ubicacion() {
    }

    public Ubicacion(int Cod_ubicacion, int Cp, int Cod_alojamiento, String Localidad, String Direccion) {
        this.Cod_ubicacion = Cod_ubicacion;
        this.Cp = Cp;
        this.Cod_alojamiento = Cod_alojamiento;
        this.Localidad = Localidad;
        this.Direccion = Direccion;
    }

    public int getCod_ubicacion() {
        return Cod_ubicacion;
    }

    public void setCod_ubicacion(int Cod_ubicacion) {
        this.Cod_ubicacion = Cod_ubicacion;
    }

    public int getCp() {
        return Cp;
    }

    public void setCp(int Cp) {
        this.Cp = Cp;
    }

    public int getCod_alojamiento() {
        return Cod_alojamiento;
    }

    public void setCod_alojamiento(int Cod_alojamiento) {
        this.Cod_alojamiento = Cod_alojamiento;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

     public void obtener_destinos(JComboBox<String> destino)
    {
        try {
            destino.removeAllItems();
            
            ResultSet resultado=consul.ConsultaDestino();
            
            while (resultado.next())
            {
                destino.addItem(resultado.getString("Localidad"));
            }      
        } catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void obtener_destinos(JComboBox<String> destino,String locali)
    {              
        try {
           System.out.println("------------"+locali);
            Ubicacion ex=new Ubicacion();
            ArrayList<String> Destinos = new ArrayList<String>();
            ResultSet resultado=consul.ConsultaDestino();
            while (resultado.next())
            {                 
                Destinos.add(resultado.getString("Localidad"));
            }
            for (int x=0;Destinos.size()>x;x++)
            {
                destino.addItem(ex.ordenar_destinos(Destinos,locali).get(x));      
            }
        } catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
          
    public ArrayList <String>  ordenar_destinos(ArrayList <String> Destinos,String localidad)
    {                 
        String auxe;              
        for(int f=0;f<Destinos.size();f++)
        {                 
            if(Destinos.get(f).equals(localidad))
            {
                auxe=Destinos.get(f);
                Destinos.set(f,Destinos.get(0));
                Destinos.set(0,auxe);                    
            }
        }
        return Destinos;       
    } 
}
