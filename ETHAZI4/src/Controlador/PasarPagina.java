
package Controlador;

import Vista.Bienvenida;
import Vista.Despedida;
import Vista.Destino;
import Vista.Lista;
import Vista.Pago;


public class PasarPagina {
    
    public static int aux;
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE BIENVENIDA A DESTINO
    public void classBienvenidaaDestino(){
        //SE CREA EL OBJ DE LA CLASE DESTINO
        Destino obj= new Destino();
        obj.setVisible(true); 
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE DESTINO A LISTA
    public void classDestinoaLista(){
        //SE CREA EL OBJ DE LA CLASE LISTA
        Lista obj= new Lista();
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
    public void classListaaPago(){
        //SE CREA EL OBJ DE LA CLASE PAGO
        Pago obj= new Pago();
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
