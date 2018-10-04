package aplicacion;

import Logica.ControladorPrincipal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Abdres Montero
 * @author Justin
 */
public class implementacion {
    
    public static ControladorPrincipal miControlador=new ControladorPrincipal();

    public static void main(String args[]) {
        /*  
        Licencia nuevaLicencia = new Licencia(201815465,"3/10/18", "B", "3/10/38");
        ArrayList <Licencia> nuevaLicencias = new ArrayList <Licencia>();
        nuevaLicencias.add(nuevaLicencia);
        Chofer Chofe = new Chofer ( "Justin Bogantes" , 2017110613 , "Justin.bogantes99@gmail.com",  207950816, nuevaLicencias ); 
        System.out.println(Chofe.getNombreCompleto());
        System.out.println(Chofe.getTelefono());
        System.out.println(Chofe.getCorreo());
        System.out.println(Chofe.getCedula());
        for (int i=0;i!=nuevaLicencias.size();i++) {
            //nuevo = Chofe.getLicencias();
            System.out.println(Chofe.getLicencias());
        }*/
        SimpleDateFormat traductor = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaActrual = new Date();
        Date fechatemp;
        try {
            
            fechatemp = traductor.parse("02-10-2018");
            fechaActrual = traductor.parse(traductor.format(fechaActrual));
            fechaActrual.setHours(fechaActrual.getHours()+24);//Agrega 24 Horas
            System.out.println(fechatemp.getDay());
            System.out.println(fechatemp.getMonth());
            System.out.println(fechatemp.getYear());
            System.out.println(fechaActrual);
            System.out.println(traductor.format(fechaActrual));
            System.out.println(fechatemp);
            System.out.println(traductor.format(fechatemp));
            System.out.println(fechaActrual.equals(fechatemp));//actual
            System.out.println(fechaActrual.before(fechatemp));//fecha actual esta Antes que fechatemp
            System.out.println(fechaActrual.after(fechatemp));// fecha actual esta Despues que fechatemp
        } catch (ParseException ex) {
            Logger.getLogger(implementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
