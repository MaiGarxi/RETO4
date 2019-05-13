package Modelo;

import Controlador.PasarPagina;
import static ethazi4.ETHAZI4.consul;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public Usuario Login(String us, String pass) throws SQLException{
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
                  
                ResultSet resultado = consul.ObtenerUsuario(us, Cifrar(pass));

                while (resultado.next())
                {
                    usuario.setDni(resultado.getString("DNI"));
                    usuario.setNombre(resultado.getString("Nombre"));
                    usuario.setFecha(resultado.getString("Fecha_nac"));
                    usuario.setContraseña(Descifrar(resultado.getString("contraseña")));
                    usuario.setApellidos(resultado.getString("Apellidos"));
                    usuario.setSexo(resultado.getString("Sexo"));  
                }          
                if (usuario.dni==null && usuario.contraseña==null){
                    JOptionPane.showMessageDialog(null,"El usuario "+us+" no existe o has introducido mal la contraseña");
                } else{
                    JOptionPane.showMessageDialog(null,"Bienvenido "+usuario.nombre);
                    return usuario;
                }
            }
        }catch (SQLException ex) {
            System.out.println("Hubo un error");
            return null;
        }
        return null;
    }       
    
    public Usuario CrearUsuario(String dni,String nombre,String apellidos, String fecha, String sexo, String contraseña, String password) throws SQLException{
    
        try
        {
            Usuario usuario= new Usuario();
            Pattern dniPattern = Pattern.compile("\\d{8}[A-HJ-NP-TV-Z]");
            Matcher m = dniPattern.matcher(dni);
            Pattern nombrePattern = Pattern.compile("[a-zA-Z]*");
            Matcher n = nombrePattern.matcher(nombre);
            
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
            }else if ( contraseña.equals(password) && (!fecha.equals("")) && (!dni.equals("")) && (!nombre.equals("")) && (!apellidos.equals("")) && (!sexo.isEmpty())){
                
                ResultSet resultado = consul.ComprobarUsuario(dni);
                while (resultado.next())
                        {
                            usuario.setDni(resultado.getString("dni"));  
                        }
                if(usuario.dni!=null){
                    JOptionPane.showMessageDialog(null,"El usuario "+dni+" ya existe");
                }               
                else{
                    if(m.matches()){
                            if(n.matches()){ 
                                    JOptionPane.showMessageDialog(null,"Registro correcto");
                                    consul.InsertarUsuario(dni,nombre,apellidos,Cifrar(contraseña),sexo,fecha); 
                                    PasarPagina pasar = new PasarPagina();
                                    pasar.NewaBasesLegales();
                                }
                            else{
                                JOptionPane.showMessageDialog(null,"Nombre no válido! No puede contener números");
                            }                                
                        }else{
                            JOptionPane.showMessageDialog(null,"DNI no valido! introduzca por este formato: 12345678A");
                            } 
                }
            }
        }catch (SQLException ex) {
            System.out.println("Hubo un error");
            return null;
        }
        return null;
     
    }
        
    public void Delete(String us,String  pass){
           
        try
        {
            Usuario usuario= new Usuario();
            ResultSet resultado = consul.ObtenerUsuario(us,Cifrar(pass));
            while (resultado.next())
            {
                usuario.setDni(resultado.getString("DNI"));
                usuario.setNombre(resultado.getString("Nombre"));
                usuario.setFecha(resultado.getString("Fecha_nac"));
                usuario.setContraseña(Descifrar(resultado.getString("contraseña")));
                usuario.setApellidos(resultado.getString("Apellidos"));
                usuario.setSexo(resultado.getString("Sexo"));  
            }                             
            int n= JOptionPane.showConfirmDialog(null, "¿Quiere borrar su usuario?", "Borrar Usuario" , JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) 
            {
                JOptionPane.showMessageDialog(null, "Deseamos que vuelva pronto");
                consul.BorrarUsuario(us,pass); 
            }else {
                JOptionPane.showMessageDialog(null, "GRACIAS");
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
                    JOptionPane.showMessageDialog(null,"Usuario actualizado");
                                       
                    consul.ActualizarUsuario(dni,nombre,apellidos,fecha,sexo,Cifrar(contraseña)); 
                    PasarPagina pasar = new PasarPagina();
                    pasar.ActualizaraUsuarios();
                }
            else{
                JOptionPane.showMessageDialog(null,"Nombre no valido! No puede contener numeros");
            }                                 
        }
    }
    
    public ArrayList<Usuario> crear_Array(Usuario usuario)
    {
        ArrayList<Usuario> users= new ArrayList<Usuario>();
        users.add(usuario);
        return users;
    }
    
    public static String Cifrar(String mensaje)
    {
        //Texto a salir (cfrado)
        String cipher = "";
        //Posiciones a adelantar
        int adelantar = 3;
                
        //Convertimos el mansaje en un array de caracteres
        char [] letras = mensaje.toCharArray();
 
        //Vamos por cada caracter sumandole 3
        for(int i=0;i<letras.length;i++){
            // de esta manera obtenemos el codigo ascii del caracter
            //  ((int) letras[i]) y luego a ese numero le sumamos 3
            // ( ((int) letras[i])+ adelantar) <- quedaria asi
            // y luego convertimos ese numero en la letra a la que hace
            // referencia en el codigo ascii solo casteando el numero a (char)           
                        
            cipher += (char)( ((int) letras[i])+ adelantar) ; 
        }
        //Texto cifrado
        return cipher;
    }
     
    public static String Descifrar(String cipher){
                
        String mensaje = "";
        //Posiciones a atrasar
        int adelantar = 3;
        //Caracteres del mensaje
        char [] letras = cipher.toCharArray();
        for(int i=0;i<letras.length;i++){
            mensaje += (char)( ((int) letras[i])- adelantar) ; 
        }
        return mensaje;
    }
}
