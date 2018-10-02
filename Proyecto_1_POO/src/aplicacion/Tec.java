/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SSDesth
 */
@XmlRootElement
public class Tec {
    /*----------Variables----------*/
    private List<Secretaria> secretarias;
    private List<Administrador> administradores;
    private List<Vehiculo> vehiculos;
    private List<Viaje> viajes;
    private List<Chofer> choferes;
    private List<Pasajero> Usuarios;

    /*----------Contructor(es)----------*/
    /**
     * Constructor Default de la clase
     */
    public Tec() {
    }

    /*----------Setters y Getters----------*/
    /**
     * Metodo Get de la lista secretarias
     * @return secretarias
     */
    public List<Secretaria> getSecretarias() {
        return secretarias;
    }

    /**
     * metodo Set de la lista secretarias
     * @param secretarias:List 
     */
    public void setSecretarias(List<Secretaria> secretarias) {
        this.secretarias = secretarias;
    }

    /**
     * Metodo Get de la lista administradores
     * @return administradores
     */
    public List<Administrador> getAdministradores() {
        return administradores;
    }

    /**
     * Metodo Set de la lista administradores
     * @param administradores:List
     */
    public void setAdministradores(List<Administrador> administradores) {
        this.administradores = administradores;
    }

    /**
     * Metodo Get de la lista vehiculos
     * @return vehiculos
     */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    /**
     * Metodo Set de la lista vehiculos
     * @param vehiculos:List 
     */
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Metodo Get de la lista viajes
     * @return viajes
     */
    public List<Viaje> getViajes() {
        return viajes;
    }

    /**
     * Metodo Set de la lista viajes
     * @param viajes:List 
     */
    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }

    /**
     * Metodo Get de la lista choferes
     * @return choferes
     */
    public List<Chofer> getChoferes() {
        return choferes;
    }

    /**
     * Metodo Set de la lista choferes
     * @param choferes:List 
     */
    public void setChoferes(List<Chofer> choferes) {
        this.choferes = choferes;
    }

    /**
     * Metodo Get de la lista usuarios
     * @return Usuarios
     */
    public List<Pasajero> getUsuarios() {
        return Usuarios;
    }

    /**
     * Metodo Set de la lista Usuarios
     * @param Usuarios:List 
     */
    public void setUsuarios(List<Pasajero> Usuarios) {
        this.Usuarios = Usuarios;
    }
    
    /**
     * Metodo encargado de Agregar un Nuevo usuario y retornar un valor de tipo
     * boolean si se logro agregar exitosamente
     * @param entrada:Pasajero
     * @return boolean
     */
    public boolean RegistrarPasajero(Pasajero entrada){
        if(ValidarPasajero(entrada)){
            Usuarios.add(entrada);
            return true;
        }
        return false;
    }
    
    /**
     * Metodo encargado de validar si existe un pasajero con el mismo id del
     * parametro de entrada y si existiera retornaria false
     * @param entrada:Pasajero
     * @return boolean
     */
    public boolean ValidarPasajero(Pasajero entrada){
        for(Pasajero temp:Usuarios){
            if(temp.getCedula()==entrada.getCedula()){
                return false;
            }
        }
        return true;
    }
    
    
    public boolean SolicitarViaje(Viaje entrada){
    
        return false;
    }
}

