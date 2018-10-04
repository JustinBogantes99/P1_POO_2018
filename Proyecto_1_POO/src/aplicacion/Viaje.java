package aplicacion;
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.Date;
import java.util.ArrayList;
=======
import java.util.*;
>>>>>>> parent of e528ac8... Agregacion de metodos
=======
import java.util.*;
>>>>>>> parent of e528ac8... Agregacion de metodos
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
<<<<<<< HEAD
<<<<<<< HEAD
    private ArrayList<Pasajero>pasajeros;
=======
    private List<Pasajero>pasajeros;
>>>>>>> parent of e528ac8... Agregacion de metodos
=======
    private List<Pasajero>pasajeros;
>>>>>>> parent of e528ac8... Agregacion de metodos
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

<<<<<<< HEAD
        
=======
    /**
     * Contructor Sobrecargado
     * 
     * @param puntoSalida:String
     * @param fechaInicio:Date
     * @param fechaFinalizacion:Date
     * @param choferAsignado:Chofer
     * @param kilometrajeInicial:double
     * @param kilometrajeFinal:double
     * @param estado:String
     * @param pasajeros:List
     * @param fechaSolicitud:Date
     * @param consecutivo:String
     * @param solicitante:Secretaria
     */
    public Viaje(String puntoSalida, Date fechaInicio, 
            Date fechaFinalizacion, Chofer choferAsignado, 
            double kilometrajeInicial, double kilometrajeFinal, 
            String estado, List<Pasajero> pasajeros, 
            Date fechaSolicitud, String consecutivo, 
            Secretaria solicitante) {
        this.puntoSalida = puntoSalida;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.choferAsignado = choferAsignado;
        this.kilometrajeInicial = kilometrajeInicial;
        this.kilometrajeFinal = kilometrajeFinal;
        this.estado = estado;
        this.pasajeros = pasajeros;
        this.fechaSolicitud = fechaSolicitud;
        this.consecutivo = consecutivo;
        this.solicitante = solicitante;
    }

<<<<<<< HEAD
>>>>>>> parent of e528ac8... Agregacion de metodos
=======
    /**
     * Contructor Sobrecargado
     * 
     * @param puntoSalida:String
     * @param fechaInicio:Date
     * @param fechaFinalizacion:Date
     * @param choferAsignado:Chofer
     * @param kilometrajeInicial:double
     * @param kilometrajeFinal:double
     * @param estado:String
     * @param pasajeros:List
     * @param fechaSolicitud:Date
     * @param consecutivo:String
     * @param solicitante:Secretaria
     */
    public Viaje(String puntoSalida, Date fechaInicio, 
            Date fechaFinalizacion, Chofer choferAsignado, 
            double kilometrajeInicial, double kilometrajeFinal, 
            String estado, List<Pasajero> pasajeros, 
            Date fechaSolicitud, String consecutivo, 
            Secretaria solicitante) {
        this.puntoSalida = puntoSalida;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.choferAsignado = choferAsignado;
        this.kilometrajeInicial = kilometrajeInicial;
        this.kilometrajeFinal = kilometrajeFinal;
        this.estado = estado;
        this.pasajeros = pasajeros;
        this.fechaSolicitud = fechaSolicitud;
        this.consecutivo = consecutivo;
        this.solicitante = solicitante;
    }

>>>>>>> parent of e528ac8... Agregacion de metodos
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
<<<<<<< HEAD
    
    
=======

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
<<<<<<< HEAD
>>>>>>> parent of e528ac8... Agregacion de metodos
=======
>>>>>>> parent of e528ac8... Agregacion de metodos
    
}