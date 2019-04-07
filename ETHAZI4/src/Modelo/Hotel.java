
package Modelo;

import bbdd.Consultas;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;

public class Hotel {

    protected int cod_hotel,estrellas,num_habitaciones,num_camas,cp;
    protected String nombre,localidad;   

    public Hotel() {
    }

    public Hotel(int cod_hotel, int estrellas, int num_habitaciones, int num_camas, int cp, String nombre, String localidad) {
        this.cod_hotel = cod_hotel;
        this.estrellas = estrellas;
        this.num_habitaciones = num_habitaciones;
        this.num_camas = num_camas;
        this.cp = cp;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public int getCod_hotel() {
        return cod_hotel;
    }

    public void setCod_hotel(int cod_hotel) {
        this.cod_hotel = cod_hotel;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    public void setNum_habitaciones(int num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
    }

    public int getNum_camas() {
        return num_camas;
    }

    public void setNum_camas(int num_camas) {
        this.num_camas = num_camas;
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public ArrayList <Hotel>  buscar_hoteles(String salida,String destino,String entrada)
    {
        ArrayList<Hotel> hoteles = new ArrayList<Hotel>();
    return hoteles;
    }
    
    public ArrayList <String>  ordenar_destinos(ArrayList<String> Destinos,String localidad)
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
       
    public void obtener_destinos(JComboBox<String> destino,String locali)
    {              
        Consultas dest = new Consultas ();      
        Hotel ex=new Hotel();
      
        for(int x=0; ex.ordenar_destinos(dest.ConsultaDestino(), locali).size()>x;x++)
        {
           destino.addItem(ex.ordenar_destinos(dest.ConsultaDestino(), locali).get(x));       
        }      
    }
   
     public void obtener_destinos(JComboBox<String> destino)
    {
        destino.removeAllItems();
        Consultas dest = new Consultas ();      
        Hotel ex=new Hotel();
        for(int x=0; dest.ConsultaDestino().size()>x;x++)
        {
            destino.addItem( dest.ConsultaDestino().get(x));       
        }      
    }
   
    public void obtener_hoteles(JList<String> hotel,String localidad)
    {           
        DefaultListModel listModel;
        listModel = new DefaultListModel();
        hotel.setModel(listModel);
        Consultas dest = new Consultas ();    
        System.out.println(localidad);
        for(int x=0;dest.ConsultaHoteles_Nombre(localidad).size()>x;x++)
        {                      
            listModel.addElement(dest.ConsultaHoteles_Nombre(localidad).get(x));       
        }      
    }
    
    public ArrayList<reserva> Crear_array(JList<String> hotel)
    {
        ArrayList<reserva> hoteles_reserva = new ArrayList<reserva>();
        String Des= (String) hotel.getSelectedValue();
        System.out.println(Des);
        Consultas dest = new Consultas (); 
        for(int x=0;dest.hotel_para_reservar(Des).size()>x;x++)
        {
            System.out.println(Des);
            reserva reser= new reserva( Integer.parseInt(dest.hotel_para_reservar(Des).get(x)),(x+1),100.0);
            hoteles_reserva.add(reser);
        } 
           return hoteles_reserva; 
    }
    
}
