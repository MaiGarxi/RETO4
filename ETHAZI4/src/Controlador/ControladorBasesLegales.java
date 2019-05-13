
package Controlador;

import Modelo.Usuario;
import static ethazi4.ETHAZI4.consul;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class ControladorBasesLegales {
    
    public ControladorBasesLegales(JButton aceptar,JButton cancelar,JTextPane bases,String sexo, String apellidos, String contraseña, String dni, String fecha, String nombre, String password,String contraseña0){
        
        bases.setText("AVISO LEGAL\n" +
                        "\n" +
                        "De conformidad con lo dispuesto en los artículos 10 y 11 de la Ley 34/ 2002, de 11 de julio, de Servicios de la Sociedad de la Información y de Comercio Electrónico se pone a disposición de los usuarios y visitantes la información legal relativa a la Entidad propietaria del sitio web ubicado en la dirección de Internet www.Bidai-on.es.\n" +
                        "\n" +
                        "TITULAR DE LA PÁGINA WEB\n" +
                        "Denominación social: Bidai-on\n" +
                        "CIF: J-45896321\n" +
                        "Domicilio: Bilbao\n" +
                        "Dirección de correo electrónico: www.Bidai-on.es\n" +
                        "Teléfono: +34 911212121 Fax:  +34 911212121\n" +
                        "INSCRITO EN EL REGISTRO MERCANTIL de inventar Actividad: Hotel/Alojamiento Hotelero.\n" +
                        "\n" +
                        "a) Para navegar en esta página web como visitante o para registrarse y poder acceder a los servicios ofrecidos por www.villamarhotel.es, se deberán aceptar las siguientes condiciones de servicio:\n" +
                        "A) El usuario y el navegante asumen estas condiciones de servicio.\n" +
                        "B) Si el usuario o el navegante no aceptan estas condiciones, no podrán usar esta página web, ni acceder a los servicios que ofrece FUERTARA S.L.\n" +
                        "b) USO CORRECTO DE LA PÁGINA WEB\n" +
                        "c) Las presentes Condiciones de Uso regulan el acceso y utilización de la página web www.Bidai-on.es. La utilización de esta Web le atribuye la condición de usuario de la misma desde el acceso e inicio de la navegación por la misma. Desde el momento de acceso a cualquiera de sus contenidos el usuario acepta de manera expresa las presentes condiciones generales. El usuario acepta las condiciones particulares aplicables de los diferentes servicios que oferta la entidad en la web a la que accede.\n" +
                        "d) A través de la página web, Bidai-on facilita a los Usuarios el acceso y la utilización de diversa información y servicios.\n" +
                        "e) La página web tiene carácter gratuito para los Usuarios. El Usuario se compromete a utilizar la página web de conformidad con la Ley, con las disposiciones de estas Condiciones Generales, así como con la moral y buenas costumbres generalmente aceptadas y el orden público.\n" +
                        "f) Con carácter general para la prestación de los servicios y el acceso a la información de la página web no se exige la previa suscripción o registro de los Usuarios. No obstante, Bidai-on. condiciona la utilización de algunos de los Servicios a la previa cumplimentación del correspondiente registro o formulario de recogida de datos del Usuario. El citado registro se efectuará en la forma expresamente indicada en el propio servicio o en las Condiciones Particulares que, en su caso, lo regulen.\n" +
                        "g) El usuario se obliga desde la aceptación a realizar un uso de la página web www.Bidai-on .es los contenidos y sus servicios de conformidad con la ley, las buenas costumbres y el orden público, empleando la diligencia adecuada a la naturaleza del servicio del que disfruta a través de la página www.Bidai-on .es.\n" +
                        "PROTECCIÓN DE DATOS\n" +
                        "POLÍTICAS DE PRIVACIDAD\n" +
                        "\n" +
                        "\n" +
                        "1.1. A los efectos de lo dispuesto en el art. 13 y el art. 14 del RGPD se le facilita la siguiente información:\n" +
                        "Responsable bidai-on  NIF/CIF: J-45896321.\n" +
                        "Domicilio: INVENTAR DIRECCION Dirección de correo electrónico: www.Bidai-on.es Teléfono: +34 911212121 Fax: +34 911212121\n" +
                        "DELEGADO DE PROTECCIÓN DE DATOS PROTOCOLOS DE SEGURIDAD INFORMÁTICA\n" +
                        "Gertrudis DiMaggio García\n" +
                        "Contacto: www.Bidai-on .es\n" +
                        "Email: protecciondatos@Bidai-on.es\n" +
                        "Finalidad: En Bidai-on tratamos la información que nos facilita con el fin de prestarles los servicios contratados consistentes en la reserva de alojamiento en establecimientos Hoteleros y enviarle ofertas personalizadas sobres los productos y/o servicios de la empresa, y gestionar el envío de información y prospección comercial. Además, tratamos la información de nuestros clientes que han contratados nuestros productos y servicios con el fin de enviarle ofertas personalizadas sobres los productos y/o servicios de la empresa. Con el fin de poder ofrecerle nuestros productos y servicios de acuerdo con sus intereses, elaboraremos un perfil comercial en base a la información facilitada. No se tomarán decisiones automatizadas en base a dicho perfil. Los datos personales proporcionados se conservarán, mientras se mantenga su consentimiento expreso y no se solicite su supresión por el interesado, durante un plazo de 5 años a partir de la última contratación y/o compra efectuada por usted.\n" +
                        "Legitimación: La base legal para el tratamiento de sus datos es la ejecución del contrato mediante de la contratación del producto y/o servicio de conformidad Ley de Servicios de Sociedad de la Información 34/2002, artículos 20 y 21. La oferta prospectiva de productos y servicios está basada en el consentimiento que se le solicita sin que, en ningún caso, la retirada de este consentimiento condicione el contrato de adquisición de producto y/o prestación de servicio. Existe obligación de facilitar el consentimiento para gestionar el envío de información y prospección comercial.\n" +
                        "Destinatarios: No se cederán datos a terceros, salvo obligación legal. No hay previsión de transferencia de datos a terceros países. No se toman decisiones de adecuación, garantías, normas corporativas vinculantes o situaciones específicas aplicables.\n" +
                        "Derechos: Cualquier persona tiene derecho a obtener confirmación sobre si en Bidai-on estamos tratando datos personales que les conciernen o no. Las personas interesadas tienen derecho a acceder a sus datos personales, así como a solicitar la rectificación de los datos inexactos, o en su caso, solicitar la supresión cuando, entre otros motivos, los datos ya no sean necesarios para los fines que fueron recogidos. En determinadas circunstancias, los interesados podrán solicitar la limitación del tratamiento de sus datos, en cuyo caso únicamente lo conservaremos para el ejercicio o la defensa de reclamaciones. Usted tiene derecho a presentar una Reclamación ante la Autoridad de Control (Agencia Española de Protección Datos: WWW.AGPD.ES; procedencia: EL PROPIO INTERESADO).\n" +
                        "1.2. El cliente acepta expresamente la inclusión de los datos de carácter personal recabados durante la navegación por la página o proporcionados mediante la cumplimentación de cualquier formulario, así como los derivados de una posible relación comercial en los ficheros automatizados de datos de carácter personal referidos en el apartado primero. Durante el proceso de recogida de datos y en cada lugar de la Web en el que se soliciten datos de carácter personal, el cliente será informado, ya sea mediante un hipervínculo, ya sea mediante la inclusión de las menciones oportunas en el propio formulario, del carácter obligatorio o no de recogida de tales datos de carácter personal. A todo cliente que decide registrarse en la página web de nuestra empresa le solicitamos los datos de carácter personal necesarios para los fines del servicio solicitado, que no es otro que es la prestación de los servicios y/o venta de productos ofertados en la Web.\n" +
                        "1.3. El cliente/usuario podrá ejercitar, respecto de los datos recabados en la forma prevista en el apartado anterior, los derechos reconocidos en los artículos 15 a 21 del Reglamento (UE) 2016/679, y en particular los derechos de acceso, rectificación, supresión, limitación al tratamiento, portabilidad de los datos, oposición y decisiones individuales automatizadas, siempre que resultase pertinente. Los derechos referidos en el párrafo precedente podrán ejercitarse por cada cliente a través de un formulario de ejercicios de derechos que nos solicitará por correo electrónico. \n" +
                        "1.4. El tratamiento automatizado a que serán sometidos todos los datos de carácter personal recogidos como consecuencia de la solicitud, utilización, contratación de cualquier producto o servicio o de cualquier transacción u operación realizada a través de esta página web tiene como finalidad principal el mantenimiento de la relación contractual con el propietario de esta página web.\n" +
                        "1.5. Usted autoriza el envío de publicidad de nuestros servicios y productos. Sus datos de carácter personal serán utilizados para gestionar el envío de publicidad a través de medios tradicionales o electrónicos. Las direcciones de correo electrónico y los datos de carácter personal que usted nos proporcione a través del formulario de contacto de la página web serán utilizados exclusivamente para atender las consultas que nos plantee por este medio. Resulta de aplicación lo dispuesto en los art 22.1 y 22.2 de la ley 34/2002, de 11 de julio, de servicios de la sociedad de la información y de comercio electrónico que se modifica en virtud del art. 4 del Real Decreto-Ley 13/2012, respecto al uso y tratamiento de sus datos de carácter personal con el fin de gestionar el envío de publicidad.\n" +
                        "1.6. La entidad garantiza la confidencialidad de los datos de carácter personal. No obstante, la Empresa y/o Entidad revelará a las autoridades públicas competentes los datos personales y cualquier otra información que esté en su poder o sea accesible a través de sus sistemas y sea requerida de conformidad con las disposiciones legales y reglamentarias aplicables al caso. Los datos de carácter personal podrán ser conservados en los ficheros titularidad de FUERTARA, S.L. incluso una vez finalizadas las relaciones formalizadas a través de la página web de la empresa, exclusivamente a los fines indicados anteriormente y, en todo caso, durante los plazos legalmente establecidos, a disposición de autoridades administrativas o judiciales.");
        
        PasarPagina pasar = new PasarPagina();
        
        cancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {  
                int n= JOptionPane.showConfirmDialog(null, "¿Quiere aceptar las Condiciones de Uso?", "Bases Legales" , JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION) 
                {
                }else {
                    JOptionPane.showMessageDialog(null,"Usuario no registrado");
                    pasar.BasesLegalesaLogin();
                }             
            }
        });
        
        aceptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {               
                Usuario usu = new Usuario();
                try {
                    usu.InsertarUsuario(dni, nombre, apellidos, fecha, sexo, contraseña,password);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorBasesLegales.class.getName()).log(Level.SEVERE, null, ex);
                }                
            }
        });
    }
}
