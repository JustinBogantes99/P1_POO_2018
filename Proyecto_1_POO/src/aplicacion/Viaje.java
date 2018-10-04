package aplicacion;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Justin
 */
public class Viaje {
    
    private String puntoSalida;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private Chofer choferAsignado;
    private double kilometrajeInicial;
    private double kilometrajeFinal;
    private String estado;
    private ArrayList<Pasajero>pasajeros;
    private Date fechaSolicitud;

    public Viaje(String puntoSalida, Date fechaInicio, Date fechaFinalizacion, Chofer choferAsignado, double kilometrajeInicial, double kilometrajeFinal, String estado, ArrayList<Pasajero> pasajeros, Date fechaSolicitud) {
        this.puntoSalida = puntoSalida;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.choferAsignado = choferAsignado;
        this.kilometrajeInicial = kilometrajeInicial;
        this.kilometrajeFinal = kilometrajeFinal;
        this.estado = estado;
        this.pasajeros = pasajeros;
        this.fechaSolicitud = fechaSolicitud;
    }

        
    public String getPuntoSalida() {
        return puntoSalida;
    }

    public void setPuntoSalida(String puntoSalida) {
        this.puntoSalida = puntoSalida;
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

    public Chofer getChoferAsignado() {
        return choferAsignado;
    }

    public void setChoferAsignado(Chofer choferAsignado) {
        this.choferAsignado = choferAsignado;
    }

    public double getKilometrajeInicial() {
        return kilometrajeInicial;
    }

    public void setKilometrajeInicial(double kilometrajeInicial) {
        this.kilometrajeInicial = kilometrajeInicial;
    }

    public double getKilometrajeFinal() {
        return kilometrajeFinal;
    }

    public void setKilometrajeFinal(double kilometrajeFinal) {
        this.kilometrajeFinal = kilometrajeFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
    
    
    
}