package aplicacion;

import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author Justin Bogantes  & Manuel Arias & Carlos Montero
 */
@XmlType()
public class Empresa {
    //----------Variables de la Clase----------//
    
    private String razonSocial;
    private int numeroCedulaJuridica;
    private int telefono;
    private String dirrecion;
    
    public Empresa(String razonSocial, int numeroCedulaJuridica, int telefono, String dirrecion) {
        this.razonSocial = razonSocial;
        this.numeroCedulaJuridica = numeroCedulaJuridica;
        this.telefono = telefono;
        this.dirrecion = dirrecion;
    }

    
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getNumeroCedulaJuridica() {
        return numeroCedulaJuridica;
    }

    public void setNumeroCedulaJuridica(int numeroCedulaJuridica) {
        this.numeroCedulaJuridica = numeroCedulaJuridica;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }
    
    
}
