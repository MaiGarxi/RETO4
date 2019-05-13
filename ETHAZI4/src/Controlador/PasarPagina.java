
package Controlador;

import Modelo.reserva;
import Modelo.Usuario;
import Vista.Actualizar;
import Vista.Bienvenida;
import Vista.Despedida;
import Vista.Destino;
import Vista.Lista;
import Vista.Login;
import Vista.NoRegistrado;
import Vista.Pago;
import java.sql.SQLException;
import java.util.ArrayList;

public class PasarPagina{
    
    public static Bienvenida obj1;
    public static Login obj2; 
    public static Destino obj3;
    public static Actualizar obj4; 
    public static NoRegistrado obj5; 
    public static Lista obj6; 
    public static Pago obj7;
    public static Despedida obj8;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A BIENVENIDA
    public void Bienvenida(){
        //SE CREA EL OBJ DE LA CLASE BIENVENIDA
        obj1= new Bienvenida();
        //CON ESTO ABRIMOS LAS VENTANAS
        obj1.setVisible(true); 
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE DESPEDIDA A BIENVENIDA
    public void DespedidaaBienvenida(){
        obj1= new Bienvenida();
        obj1.setVisible(true); 
        obj8.setVisible(false);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE DESTINO A BIENVENIDA
    public void DestinoaBienvenida(){
        obj1.setVisible(true); 
        obj3.setVisible(false);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE LISTA A BIENVENIDA
    public void ListaaBienvenida(){
        obj1.setVisible(true); 
        obj6.setVisible(false);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE PAGO A BIENVENIDA
    public void PagoaBienvenida(){
        obj1.setVisible(true); 
        obj7.setVisible(false);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE BIENVENIDA A LOGIN
    public void BienvenidaaLogin(){
        //SE CREA EL OBJ DE LA CLASE LOGIN   
        obj2= new Login();        
        obj2.setVisible(true); 
        //CON ESTO CERRAMOS LAS VENTANAS        
        obj1.setVisible(false);
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A DESTINO
    public void LoginaDestino(ArrayList<Usuario> Users){
        //SE CREA EL OBJ DE LA CLASE DESTINO   
        obj3= new Destino(Users);
        obj3.setVisible(true); 
        obj2.setVisible(false);
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE DESTINO A LOGIN
    public void DestinoaLogin(){
        obj2.setVisible(true); 
        obj3.setVisible(false);
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA LOGIN A ACTUALIZAR
    public void LoginaActualizar(ArrayList<Usuario> Users){
        //SE CREA EL OBJ DE LA CLASE ACTUALIZAR
        obj4= new Actualizar(Users);
        obj4.setVisible(true);
        obj2.setVisible(false);
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE ACTUALIZAR A LOGIN
    public void ActualizaraLogin(){
        obj2.setVisible(true);
        obj4.setVisible(false);
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE LOGIN A NUEVO USUARIO
    public void LoginaNew(){
        //SE CREA EL OBJ DE LA CLASE NUEVO USUARIO
        obj5= new NoRegistrado();
        obj5.setVisible(true);
        obj2.setVisible(false);
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE NUEVO USUARIO A LOGIN
    public void NewaLogin(){
        //SE CREA EL OBJ DE LA CLASE NUEVO USUARIO
        obj2.setVisible(true);
        obj5.setVisible(false);
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE DESTINO A LISTA
    public void DestinoaLista(String localidad,String Alojamiento,ArrayList<Usuario> Users, String entradas, String salidas,ArrayList<ArrayList> patron,int dias , double precioTemp,double precioFestivo,int personas,int habitaciones,int ninos) throws SQLException {
        //SE CREA EL OBJ DE LA CLASE LISTA
        obj6= new Lista(localidad,Alojamiento,Users, entradas, salidas,patron,dias,personas,habitaciones,ninos,precioTemp,precioFestivo);
        obj6.setVisible(true);
        obj3.setVisible(false);
    }  
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE LISTA A DESTINO
    public void ListaaDestino() {
        obj3.setVisible(true);
        obj6.setVisible(false);
    }  
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE LISTA A PAGO
    public void ListaaPago(ArrayList<reserva>reservas,ArrayList<Usuario> Users,String alojamiento){
        //SE CREA EL OBJ DE LA CLASE PAGO
        obj7= new Pago(reservas,Users,alojamiento);
        obj7.setVisible(true); 
        obj6.setVisible(false);
    }  
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE PAGO A DESPEDIDA
    public void classPagoaDespedida(){
        //SE CREA EL OBJ DE LA CLASE DESPEDIDA
        obj8= new Despedida();
        obj8.setVisible(true);
        obj7.setVisible(false); 
    } 
}
