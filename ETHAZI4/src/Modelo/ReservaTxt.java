
package Modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReservaTxt {
    
   /*   public ArrayList<billete> billetex;
        public ArrayList<String> Insertar;
        String ruta= "src\\reto3\\modelo\\Reserva.txt";
        
    public ArchivoTxtBillete(ArrayList<billete> billete){
       
        billetex =new ArrayList();
        for(int x=0;x<billete.size();x++)
        {
        billetex.add(billete.get(x));
        String mensaje =         " \n"
				+"                                                             TERMIBUS BILBAO S.L.                        "+" \t\n"
				+" **********************************************************************************************************************"+" \t\n"
				
				+" -Número del billete:"+(x+1)+"  \t\t"+"-Cantidad de viajes: " +billete.size()+" \n\n"  
				+" -Linea: " +billete.get(x).Cod_Linea+" \t\t"+ "-Autobus: " + billete.get(x).Cod_Bus+" \t\n"
				+" **********************************************************************************************************************"+" \t\n"
				
				+" -Parada de salida: " + billete.get(x).inicio+"     "+ "-Parada de destino: " + billete.get(x).finale+" \t\n"+" \t\n" 
				+" -Fecha de ida: " + billete.get(x).fecha+"                  \t\n" 
				+" **********************************************************************************************************************"+" \t\n"
				
				+" -Precio final: " + billete.get(x).precio+" €";
        Insertar =new ArrayList();
        Insertar.add(mensaje);
        generarTXT();
        }
    }
	
    public void generarTXT(){
            try{
                FileWriter archivo = new FileWriter(this.ruta);
                for(int x=0;x<Insertar.size();x++){
                archivo.write(Insertar.get(x));
                }
                archivo.close();
            }catch(IOException e){
                e.getMessage();
            }
        }
*/
}
