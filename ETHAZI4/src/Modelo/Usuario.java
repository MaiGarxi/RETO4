package Modelo;

import Controlador.PasarPagina;
import bbdd.Consultas;
import java.awt.TextField;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Usuario {
    
    public String dni,nombre,apellidos,contraseña, sexo, fecha;

    public Usuario() {
    }

    public Usuario(String dni, String nombre, String apellidos, String contraseña, String sexo, String fecha) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.sexo = sexo;
        this.fecha = fecha;
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
    
    public void Login(String us, String pass) throws SQLException{
        try
        {
            Usuario usuario= new Usuario();
            if ( (us == null) || (us.equals("")) )
            {
                JOptionPane.showMessageDialog(null,"No has ingresado el DNI");
            }else if ( (pass == null) || (pass.equals("")) )
            {
                JOptionPane.showMessageDialog(null,"No has ingresado la contraseña");
            }
            else if ( (pass != null) || us != null )
            {   
                Consultas cone = new Consultas();
                ResultSet resultado = cone.ObtenerUsuario(us, pass);
                while (resultado.next())
                {
                    usuario.setDni(resultado.getString("DNI"));
                    usuario.setNombre(resultado.getString("Nombre"));
                    usuario.setFecha(resultado.getString("Fecha_nac"));
                    usuario.setContraseña(resultado.getString("contraseña"));
                    usuario.setApellidos(resultado.getString("Apellidos"));
                    usuario.setSexo(resultado.getString("Sexo"));  
                }          
                if (usuario.dni==null && usuario.contraseña==null){
                    JOptionPane.showMessageDialog(null,"El usuario "+us+" no existe o as introducido mal la contraseña");
                } else{
                JOptionPane.showMessageDialog(null,"Bienvenido "+usuario.nombre);
                PasarPagina pasar = new PasarPagina();
                pasar.LoginaDestino();
            }
        }
        }catch (SQLException ex) {
            System.out.println("Hubo un error");
        }
    }       
    
    public void CrearUsuario(String dni,String nombre,String apellidos, String fecha, String sexo, String contraseña, String password){

        if ( (dni == null) || (dni.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el DNI");
        }else if ( (nombre == null) || (nombre.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Nombre");
        }else if ( (apellidos == null) || (apellidos.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado los Apellidos"); 
        }else if ( (contraseña == null) || (contraseña.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado la Contraseña");
        }else if ( (password == null) || (password.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado la Contraseña");
        }else if ( (sexo.isEmpty()))
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Sexo");
        }else if ( (fecha == null) || (fecha.equals(""))  )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado la Fecha de Nacimiento");
        }else if (contraseña.equals(password)==false)
        {
            JOptionPane.showMessageDialog(null,"No coincide la contraseña");           
        }
        Pattern dniPattern = Pattern.compile("\\d{8}[A-HJ-NP-TV-Z]");
	Matcher m = dniPattern.matcher(dni);
        Pattern nombrePattern = Pattern.compile("[a-zA-Z]*");
	Matcher n = nombrePattern.matcher(nombre);
        
        if (contraseña.equals(password) && (!fecha.equals("")) && (!dni.equals("")) && (!nombre.equals("")) && (!apellidos.equals("")) && (!sexo.isEmpty()))
        {
	if(m.matches()){
            if(n.matches()){
                    JOptionPane.showMessageDialog(null,"Registro correcto");
                    Consultas cone =new Consultas(); 
                    cone.InsertarCliente(dni,nombre,apellidos,contraseña,sexo,fecha); 
                    PasarPagina pasar = new PasarPagina();
                    pasar.NewaLogin();
                }
            else{
                JOptionPane.showMessageDialog(null,"Nombre no válido! No puede contener números");
            }                                
        }
        else{
            JOptionPane.showMessageDialog(null,"DNI no valido! introduzca por este formato: 12345678A");
            }
        }  
    }
        
    public void Delete(String us,String  pass){
           
        try
        {
            Usuario usuario= new Usuario();
            if ( (us == null) || (us.equals("")) )
            {
               JOptionPane.showMessageDialog(null,"No has ingresado el DNI");
            }
                 else if ( (pass == null) || (pass.equals("")) )
                 {
                    JOptionPane.showMessageDialog(null,"No has ingresado la Contraseña");
                 }
                    else if ( (pass != null) || us != null )
                    {                                           
                        Consultas cone =new Consultas(); 
                        ResultSet resultado = cone.ObtenerUsuario(us, pass);
                        while (resultado.next())
                        {
                            usuario.setDni(resultado.getString("DNI"));
                            usuario.setNombre(resultado.getString("Nombre"));
                            usuario.setFecha(resultado.getString("Fecha_nac"));
                            usuario.setContraseña(resultado.getString("contraseña"));
                            usuario.setApellidos(resultado.getString("Apellidos"));
                            usuario.setSexo(resultado.getString("Sexo"));  
                        }
                            if (usuario.dni==null && usuario.contraseña == null){
                                    JOptionPane.showMessageDialog(null,"No se ha podido borrar el usuario "+us+" porque no existe o has introducido mal la contraseña");
                            } else {     
                            int n= JOptionPane.showConfirmDialog(null, "¿Quiere borrar su usuario?", "Borrar Usuario" , JOptionPane.YES_NO_OPTION);
                            if (n == JOptionPane.YES_OPTION) 
                            {
                                JOptionPane.showMessageDialog(null, "Deseamos que vuelva pronto");
                                Consultas con =new Consultas();                          
                                con.BorrarUsuario(us,pass); 
                            }
                                else {
                                    JOptionPane.showMessageDialog(null, "GRACIAS");
                                }
                            }
                    } 
        }catch (SQLException ex) {
            System.out.println("Hubo un error");
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
