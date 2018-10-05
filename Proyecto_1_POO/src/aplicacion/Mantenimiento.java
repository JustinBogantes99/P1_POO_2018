package aplicacion;
import java.util.Date;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author Justin
 */
@XmlType()
public class Mantenimiento {
    
    private String Tipo;
    private static  int identificiador;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private double montoPagado;
    private String detalleActividad;
    private Empresa empresa;

    public Mantenimiento(String Tipo, Date fechaInicio, Date fechaFinalizacion, double montoPagado, String detalleActividad, Empresa empresa) {
        this.Tipo = Tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.montoPagado = montoPagado;
        this.detalleActividad = detalleActividad;
        this.empresa = empresa;
    }

        
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public static int getIdentificiador() {
        return identificiador;
    }

    public static void setIdentificiador(int identificiador) {
        Mantenimiento.identificiador = identificiador;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getDetalleActividad() {
        return detalleActividad;
    }

    public void setDetalleActividad(String detalleActividad) {
        this.detalleActividad = detalleActividad;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    
}
