package aplicacion;
import java.util.ArrayList;
/**
 *
 * @author Justin
 */
public class implementacion {
    public static void main(String args[]){
        
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
        }
    }
}

