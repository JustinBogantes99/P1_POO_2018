package aplicacion;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Justin
 */
@XmlType()
public class Pasajero {
    
    private String nombreCompleto;
    private int cedula;
    private String direccion;
    private String correoElectronico;
    private int telefono;

    public Pasajero() {
    }
    
    
    public Pasajero(String nombreCompleto, int cedula, String direccion, String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * toString modificado para que despliegue los datos de una manera deseada
     * 
     * @return String
     */
    @Override
    public String toString() {
         String acum = "";
         acum += "Nombre: " + nombreCompleto; 
         acum += "\nCedula: " + cedula; 
         acum += "\nDireccion: " + direccion; 
         acum += "\nCorreo: " + correoElectronico; 
         acum += "\nTelefono: " + telefono; 
         return acum;
    }
    
    
    
}
