package aplicacion;

import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author Justin Bogantes  & Manuel Arias & Carlos Montero
 */
@XmlType()
public class Licencia {
    //----------Variables de la Clase----------//
    private int numero;
    private String fechaEmision;
    private String tipo;
    private String fechaExpiracion;
     //----------Contructor(es)----------//
    /**
     * Contructor default de la clase
     */
    public Licencia() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
}
