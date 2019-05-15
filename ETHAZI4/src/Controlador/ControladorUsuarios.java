
package Controlador;

import Modelo.Usuario;
import Modelo.reserva;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorUsuarios {
    
    public ControladorUsuarios(JButton actualizar,JButton cancelar, JButton delete,ArrayList<Usuario> Users,ArrayList<reserva> usuario_reserva,JButton CancelarReserva,JLabel apellidos,JLabel dni,JLabel fechanac,JLabel nombre,JLabel sexo,JLabel name,JTable inforeservas) throws SQLException {
        
        nombre.setText(Users.get(0).nombre);
        dni.setText(Users.get(0).dni);
        apellidos.setText(Users.get(0).apellidos);
        sexo.setText(Users.get(0).sexo);
        fechanac.setText(Users.get(0).fecha);
        
        DefaultTableModel modelo = new DefaultTableModel();
        inforeservas.setModel(modelo);
        modelo.addColumn("Cod_reserva");
        modelo.addColumn("Entrada");
        modelo.addColumn("Salida");
        modelo.addColumn("Alojamiento");        
        modelo.addColumn("Precio");
        for(int i=0;i<usuario_reserva.size();i++){
            modelo.addRow(new Object[] {usuario_reserva.get(i).getCod_reserva(), usuario_reserva.get(i).getEntrada(), usuario_reserva.get(i).getSalida(),usuario_reserva.get(i).getCod_alojamiento(), usuario_reserva.get(i).getPrecio()});
        }
        
        PasarPagina pasar = new PasarPagina();
        Usuario usu = new Usuario();
        reserva reser = new reserva();
        
        delete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                usu.Delete(Users.get(0).getDni());
                pasar.UsuariosaLogin();               
            }
        });    
        
        actualizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { 
                pasar.UsuariosaActualizar(Users, nombre,apellidos,sexo,fechanac);
            } 
        }); 
        
        cancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                pasar.UsuariosaDestino(Users);   
                name.setText(nombre.getText());
            }
        });  
        
        CancelarReserva.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
                reser.Delete(Users.get(0).getDni());
            }
        });        
    }
}
