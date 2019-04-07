
package Controlador;

import Modelo.reserva;
import Vista.Bienvenida;
import Vista.Despedida;
import Vista.Destino;
import Vista.Lista;
import Vista.Pago;
import java.util.ArrayList;


public class PasarPagina{

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE BIENVENIDA A DESTINO
    public static void classBienvenidaaDestino(){
        //SE CREA EL OBJ DE LA CLASE DESTINO
        Destino obj= new Destino();
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE DESTINO A LISTA
    public void classDestinoaLista(String localidad){
        //SE CREA EL OBJ DE LA CLASE LISTA
        Lista obj= new Lista(localidad);
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE DESTINO A LISTA
    public void classListaaDestino(){
        Destino obj= new Destino();
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE LISTA A PAGO
    public void classListaaPago(ArrayList<reserva>reservas){
        //SE CREA EL OBJ DE LA CLASE PAGO
        Pago obj= new Pago(reservas);
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE PAGO A DESPEDIDA
    public void classPagoaDestino(){
        //SE CREA EL OBJ DE LA CLASE DESTINO
        Destino obj= new Destino();
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE PAGO A DESPEDIDA
    public void classPagoaDespedida(){
        //SE CREA EL OBJ DE LA CLASE DESPEDIDA
        Despedida obj= new Despedida();
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE DESPEDIDA A BIENVENIDA
    public static void classDespedidaABienvenida(){
        //SE CREA EL OBJ DE LA CLASE BIENVENIDA
        Bienvenida obj= new Bienvenida();
        obj.setVisible(true); 
    }  
}
