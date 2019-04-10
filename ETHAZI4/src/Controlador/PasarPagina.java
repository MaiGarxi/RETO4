
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

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A BIENVENIDA
    public void Bienvenida(){
        //SE CREA EL OBJ DE LA CLASE BIENVENIDA
        Bienvenida obj= new Bienvenida();
        obj.setVisible(true); 
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A LOGIN
    public void Login(){
        //SE CREA EL OBJ DE LA CLASE LOGIN
        Login obj= new Login();
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A ACTUALIZAR
    public void Actualizar(){
        //SE CREA EL OBJ DE LA CLASE ACTUALIZAR
        Actualizar obj= new Actualizar();
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A NUEVO USUARIO
    public void New(){
        //SE CREA EL OBJ DE LA CLASE NUEVO USUARIO
        NoRegistrado obj= new NoRegistrado();
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A LISTA
    public void Lista() throws SQLException {
        //SE CREA EL OBJ DE LA CLASE LISTA
        Lista obj= new Lista();
        obj.setVisible(true); 
    }  
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A PAGO
    public void Pago(ArrayList<reserva>reservas){
        //SE CREA EL OBJ DE LA CLASE PAGO
        Pago obj= new Pago(reservas);
        obj.setVisible(true); 
    }  
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR A DESPEDIDA
    public void classPagoaDespedida(){
        //SE CREA EL OBJ DE LA CLASE DESPEDIDA
        Despedida obj= new Despedida();
        obj.setVisible(true); 
    }   
}
