
package Controlador;

import Modelo.reserva;
import Vista.Actualizar;
import Vista.Bienvenida;
import Vista.Despedida;
import Vista.Lista;
import Vista.Login;
import Vista.NoRegistrado;
import Vista.Pago;
import java.sql.SQLException;
import java.util.ArrayList;


public class PasarPagina{
    
    public static Bienvenida obj1;
    public static Login obj2; 
    public static Actualizar obj3; 
    public static NoRegistrado obj4; 
    public static Lista obj5; 
    public static Pago obj6;
    public static Despedida obj7;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A BIENVENIDA
    public void Bienvenida(){
        //SE CREA EL OBJ DE LA CLASE BIENVENIDA
        obj1= new Bienvenida();
        obj1.setVisible(true); 
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A LOGIN
    public void Login(){
        //SE CREA EL OBJ DE LA CLASE LOGIN   
        obj2= new Login();
        obj2.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A ACTUALIZAR
    public void LoginaActualizar(){
        //SE CREA EL OBJ DE LA CLASE ACTUALIZAR
        obj3= new Actualizar();
        obj3.setVisible(true);
        obj2.setVisible(false);
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A NUEVO USUARIO
    public void LoginaNew(){
        //SE CREA EL OBJ DE LA CLASE NUEVO USUARIO
        obj4= new NoRegistrado();
        obj4.setVisible(true);
        obj2.setVisible(false);
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A LISTA
    public void LoginaLista() throws SQLException {
        //SE CREA EL OBJ DE LA CLASE LISTA
        obj5= new Lista();
        obj5.setVisible(true);
        obj2.setVisible(false);
    }  
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A PAGO
    public void Pago(ArrayList<reserva>reservas){
        //SE CREA EL OBJ DE LA CLASE PAGO
        obj6= new Pago(reservas);
        obj6.setVisible(true); 
    }  
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A DESPEDIDA
    public void classPagoaDespedida(){
        //SE CREA EL OBJ DE LA CLASE DESPEDIDA
        obj7= new Despedida();
        obj7.setVisible(true); 
    }   
}
