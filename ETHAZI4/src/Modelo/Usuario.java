
package Modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Usuario {
    
    public String dni,nombre,apellidos,contraseña, sexo, fecha, administrador;

    public Usuario() {
    }

    public Usuario(String dni, String nombre, String apellidos, String contraseña, String sexo, String fecha, String administrador) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.sexo = sexo;
        this.fecha = fecha;
        this.administrador = administrador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

       
    
    public void Login(String us, String pass){
        
        if ( (us == null) || (us.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el DNI");
        }
             else if ( (pass == null) || (pass.equals("")) )
             {
                JOptionPane.showMessageDialog(null,"No has ingresado la Contraseña");
             }
              /* else if ( (pass != null) || us != null )
                {
                    Consultas cone = new Consultas();
                    cliente cliente;
                    cliente= cone.ObtenerCliente(us, pass);
                    if (cliente==null){
                        JOptionPane.showMessageDialog(null,"El usuario "+us+" no existe o has introducido mal la contraseña");
                    }
                    JOptionPane.showMessageDialog(null,"Bienvenido "+cliente.nombre);
                    registro_a_actualizar(cliente);
                  
            }
        }  */     
    }
        
    public void Delete(String us,String  pass){

        if ( (us == null) || (us.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Nombre del usuario");
        }
             else if ( (pass == null) || (pass.equals("")) )
             {
                JOptionPane.showMessageDialog(null,"No has ingresado la Contraseña");
             }
                else if ( (pass != null) || us != null )
                {                                           
                        /*Consultas conex =new Consultas(); 
                        cliente clientex; 
                        clientex = conex.ObtenerCliente(us,pass); 
                        if (clientex==null){
                                JOptionPane.showMessageDialog(null,"No se ha podido borrar el usuario "+us+" porque no existe o has introducido mal la contraseña");
                        } else {     
                        int n= JOptionPane.showConfirmDialog(null, "¿Quiere borrar su usuario?", "Borrar Usuario" , JOptionPane.YES_NO_OPTION);
                        if (n == JOptionPane.YES_OPTION) 
                        {
                            JOptionPane.showMessageDialog(null, "Deseamos que vuelva pronto");
                            Consultas cone =new Consultas(); 
                            cliente cliente;                            
                            cliente = cone.BorrarCliente(us,pass); 
                        }
                            else {
                                JOptionPane.showMessageDialog(null, "GRACIAS");
                            }
                        }*/
                }                       
    }
    
    public void Actualizar(String dni,String nombre,String apellidos, String fecha, String sexo, String contraseña, String password){
       
        if ( (nombre == null) || (nombre.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Nombre del usuario");
        }else if ( (apellidos == null) || (apellidos.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado los Apellidos"); 
        }else if ( (sexo.isEmpty()) || (sexo.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Sexo"); 
        }else if ( (contraseña == null) || (contraseña.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado la contraseña");
        }else if ( (password == null) || (password.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado la contraseña");
        }else if (contraseña.equals(password)==false)
        {
            JOptionPane.showMessageDialog(null,"No coinciden las contraseñas");           
        }
        
        Pattern nombrePattern = Pattern.compile("[a-zA-Z]*");
	Matcher n = nombrePattern.matcher(nombre);
        
        if (contraseña.equals(password) && (!dni.equals("")) && (!nombre.equals("")) && (!apellidos.equals("")) && (!sexo.equals("")))
        {
            if(n.matches()){
                    /*JOptionPane.showMessageDialog(null,"Usuario actualizado");
                    Consultas cone =new Consultas(); 
                    cliente cliente;
                    cone.ActualizarCliente(dni,nombre,apellidos,fecha,sexo,contraseña);                   
                    noregistrado_a_registrado();  
                     */                  
                }
            else{
                JOptionPane.showMessageDialog(null,"Nombre no valido! No puede contener numeros");
            }                                 
        }
    }
    
}
