package aplicacion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Justin
 */
public class implementacion {
    public static void main(String args[]){
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
        SimpleDateFormat traductor = new SimpleDateFormat("dd-mm-yyyy");
        Date fechaActrual= new Date();
        Date fechatemp; 
        try {
            fechatemp = traductor.parse("02-10-2018");
        
        System.out.println(traductor.format(fechaActrual));
        System.out.println(fechatemp);
        System.out.println(fechaActrual.equals(fechatemp));
        System.out.println(fechaActrual.before(fechatemp));
        System.out.println(fechaActrual.after(fechatemp));
        } catch (ParseException ex) {
            Logger.getLogger(implementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

