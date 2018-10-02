package aplicacion;
//import java.util.ArrayList;
/**
 *
 * @author Justin
 */
public class implementacion {
    public static void main(String args[]){
        //String nombreCompleto, int telefono, String correo, int cedula, ArrayList<Licencia> licencias
        //int numero, String fechaEmision, String tipo , String fechaExpiracion
        Licencia nuevaLicencia = new Licencia(201815465,"3/10/18", "B", "3/10/38");
        //Arraylist<Licencia> listaLicencias = new Arraylist<Licencia>();
        //Chofer Chofe = new Chofer ( "Justin Bogantes" , 2017110613 , "Justin.bogantes99@gmail.com",  207950816, Arraylist[] )
        //funcionario = new Funcionario("Carlos Rojas", 1847500);
         //System.out.println ("Empezamos la ejecución del programa");
        System.out.println(nuevaLicencia.getNumero());
        System.out.println(nuevaLicencia.getTipo());
        System.out.println("");
        //System.out.println(funcionario.toString());
    }
}

