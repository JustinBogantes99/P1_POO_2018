package aplicacion;

import Logica.ControladorPrincipal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Abdres Montero
 * @author Justin
 */
public class main {
    
    public static ControladorPrincipal miControlador=new ControladorPrincipal();

    public static void main(String args[]) {
        /* Secretaria nuevaSecretaria = new Secretaria();
         nuevaSecretaria.setNombreCompleto("qwerty");
         nuevaSecretaria.setNombreUsuario("a");
         nuevaSecretaria.setDepartamento("Computacion");
         nuevaSecretaria.setCorreoElectronico("qwerty@dominio.com");
         nuevaSecretaria.setTelefono(22222222);
        miControlador.getMiTec().getSecretarias().add(nuevaSecretaria);
       
         
         Administrador nuevoAdmin= new Administrador();
         nuevoAdmin.setNombreCompleto("SSDesth");
         nuevoAdmin.setNombreUsuario("q");
         nuevoAdmin.setDepartamento("Computacion");
         nuevoAdmin.setTelefono(72907236);
         nuevoAdmin.setPassword("q");
        
        
         miControlador.getMiTec().getAdministradores().add(nuevoAdmin);
        
          miControlador.CrearXML();*/
       miControlador.IniciarPrograma();
        
    }
}
