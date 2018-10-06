package aplicacion;
//import java.util.Scanner;

import java.util.*;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Justin
 */
@XmlType()
public class Chofer {

    private String nombreCompleto;
    private int telefono;
    private String correo;
    private int cedula;
    private List<Licencia> licencias;

    public Chofer() {
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

    public List<Licencia> getLicencias() {
        return licencias;
    }

    public void setLicencias(List<Licencia> licencias) {
        this.licencias = licencias;
    }

  

}
