package aplicacion;
//import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Justin
 */
public class Chofer {
    
    private String nombreCompleto;
    private int telefono;
    private String correo;
    private int cedula;
    private ArrayList<Licencia>licencias;

    public Chofer(String nombreCompleto, int telefono, String correo, int cedula, ArrayList<Licencia> licencias) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.correo = correo;
        this.cedula = cedula;
        this.licencias = licencias;
    }
    
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Licencia> getLicencias() {
        return licencias;
    }

    public void setLicencias(ArrayList<Licencia> licencias) {
        this.licencias = licencias;
    }
    
    
}
