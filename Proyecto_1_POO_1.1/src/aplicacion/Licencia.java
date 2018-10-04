package aplicacion;

/**
 *
 * @author Justin
 */
public class Licencia {
    private int numero;
    private String fechaEmision;
    private String tipo;
    private String fechaExpiracion;

    public Licencia(int numero, String fechaEmision, String tipo , String fechaExpiracion) {
        this.numero=numero;
        this.fechaEmision=fechaEmision;
        this.tipo=tipo;
        this.fechaExpiracion=fechaExpiracion;
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
