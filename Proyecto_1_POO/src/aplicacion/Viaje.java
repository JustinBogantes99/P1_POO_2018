package aplicacion;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Carlos Andres Montero
 * @author Justin
 */
public class Viaje {

    private String puntoSalida;
    private String destino;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private Chofer choferAsignado;
    private Vehiculo vehiculoAsignado;
    private double kilometrajeInicial;
    private double kilometrajeFinal;
    private String estado;//(Confeccion/Aprobado/Cancelado/No Aprobado)
    private List<Pasajero> pasajeros;
    private Date fechaSolicitud;
    private String consecutivo; //IVA-XXX
    private Secretaria solicitante;

    /*----------Contructor(es)----------*/
    /**
     * Contructor default
     */
    public Viaje() {
    }

    public String getPuntoSalida() {
        return puntoSalida;
    }

    public void setPuntoSalida(String puntoSalida) {
        this.puntoSalida = puntoSalida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
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

    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {
        this.vehiculoAsignado = vehiculoAsignado;
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

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Secretaria getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Secretaria solicitante) {
        this.solicitante = solicitante;
    }

    /**
     * Metodo que imprime la informacion de varias variables de la clase
     *
     * @return String
     */
    public String ImprimidorlistarSolicitudes() {
        SimpleDateFormat traductor = new SimpleDateFormat("dd-MM-yyyy");
        String acum = "";
        acum += "ID: " + consecutivo;
        acum += "\nFecha de ingreso: " + traductor.format(fechaSolicitud);
        acum += "\nEstado: " + estado;
        acum += "\nDestino: " + destino;
        acum += "\nFecha de inicio: " + traductor.format(fechaInicio);
        acum += "\n";

        return acum;
    }

    /**
     * toString de la clase acomodado con un formato deseado
     *
     * @return String
     */
    @Override
    public String toString() {
        SimpleDateFormat traductor = new SimpleDateFormat("dd-MM-yyyy");
        String acum = "";
        acum += "ID: " + consecutivo;
        acum += "\nFecha de ingreso: " + traductor.format(fechaSolicitud);
        acum += "\nEstado: " + estado;
        acum += "\nDestino: " + destino;
        acum += "\nFecha de inicio: " + traductor.format(fechaInicio);
        acum += "\nFecha de Finalizacion: " + traductor.format(fechaFinalizacion);
        if (choferAsignado == null) {
            acum += "\nChofer: Sin Asignar";
        } else {
            acum += "\nChofer:\n" + choferAsignado.toString();
        }
        if (vehiculoAsignado == null) {
            acum += "\nVehiculo: Sin Asignar";
        } else {
            acum += "\nVehiculo:\n" + vehiculoAsignado.toString();
        }
        acum += "\nPunto de Salida: " + puntoSalida;
        acum += "\nKilometraje Inicial: " + kilometrajeInicial;
        acum += "\nKilometraje Final: " + kilometrajeFinal;
        acum += "\nSolicitante:\n" + solicitante.toString();
        acum += "\nPasajero(s):\n";
        for (Pasajero temp : pasajeros) {
            acum += temp.toString();
            acum += "\n";
        }
        return acum;
    }
    
    /**
     * Este metodo se encarga de retornar un String con los datos en un formato
     * deseado en el proyecto
     * 
     * @return String 
     */
     public String ImprimidorlistarSolicitudesAdministrador() {
        SimpleDateFormat traductor = new SimpleDateFormat("dd-MM-yyyy");
        String acum = "";
        acum += "ID: " + consecutivo;
        acum += "\nFecha de ingreso: " + traductor.format(fechaSolicitud);
        acum += "\nEstado: " + estado;
        acum += "\nDestino: " + destino;
        acum += "\nEscuela o Departamento: " + getSolicitante().getDepartamento();
        acum += "\n";

        return acum;
    }

}
