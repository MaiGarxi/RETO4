
package Controlador;

import Vista.Despedida;
import Vista.Destino;
import Vista.Lista;
import Vista.Pago;


public class PasarPagina {
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE BIENVENIDA A DESTINO
    public static void classBienvenidaaDestino(){
        //SE CREA EL OBJ DE LA CLASE DESTINO
        Destino obj= new Destino();
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE DESTINO A LISTA
    public static void classDestinoaLista(){
        //SE CREA EL OBJ DE LA CLASE LISTA
        Lista obj= new Lista();
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE DESTINO A LISTA
    public static void classListaaDestino(){
        Destino obj= new Destino();
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE LISTA A PAGO
    public static void classListaaPago(){
        //SE CREA EL OBJ DE LA CLASE PAGO
        Pago obj= new Pago();
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE PAGO A DESPEDIDA
    public static void classPagoaDespedida(){
        //SE CREA EL OBJ DE LA CLASE DESPEDIDA
        Despedida obj= new Despedida();
        obj.setVisible(true); 
    } 
}
