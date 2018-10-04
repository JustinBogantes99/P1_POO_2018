/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.Random;

/**
 *
 * @author Carlos Andres Montero
 * @author Justin
 */
public class Secretaria {
    //----------Variables de la Clase----------//
    
    private String nombreCompleto;
    private String departamento;
    /*El nombre del usuario corresponde al nombre 
    utilizado en el correo electrónico*/
    private String nombreUsuario;
    private int telefono;
    private String password;
    private String CorreoElectronico;
    
    //----------Contructor(es)----------//
    /**
     * Contructor default de la clase
     */
    public Secretaria() {
        this.password = GeneradorContrasena();
    
    }

    //----------Setters y Getters----------//
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }
    
    

    /*----------Metodos Especialisados----------*/
 /*----------RegistrarPasajero----------*/
    /**
     * Este metodo se comunica con la clase Tec dentro de controlador Principal
     * y ejecuta el metodo de RegistrarPasajero Nuevo
     *
     * @param entrada:Pasajero
     * @return boolean
     */
    public boolean RegistrarPasajero(Pasajero entrada) {
        return implementacion.miControlador.getMiTec().RegistrarPasajero(entrada);
    }

    /*----------Solicitar Viaje----------*/
    /**
     * Este metodo se comunica con la clase Tec dentro de controlador Principal
     * y ejecuta el metodo de SolicitarViaje
     *
     * @param entrada:Viaje
     * @return boolean
     */
    public boolean SolicitarViaje(Viaje entrada) {
        return implementacion.miControlador.getMiTec().SolicitarViaje(entrada);
    }

    /*----------Listar Solicitudes de viaje----------*/
    /**
     * Este metodo se comunica con la clase Tec dentro de controlador Principal
     * y ejecuta el metodo de ListarSolicitudesViaje
     *
     * @param entradaSecretaria:Secretaria
     * @param tipoBusqueda:int
     * @param Busqueda:String
     * @return String
     */
    public String ListarSolicitudesViaje(Secretaria entradaSecretaria,
            int tipoBusqueda, String Busqueda) {
        return implementacion.miControlador.getMiTec().ListarSolicitudesViaje(
                entradaSecretaria, tipoBusqueda, Busqueda);
    }

    /*----------Consultar detalle de una solicitud----------*/
    /**
     * Este metodo se comunica con la clase Tec dentro de controlador Principal
     * y ejecuta el metodo de ConsultarDetalleDeUnaSolicitud
     *
     * @param consecutivo:String
     * @return String
     */
    public String ConsultarDetalleDeUnaSolicitud(String consecutivo) {
        return implementacion.miControlador.getMiTec().
                ConsultarDetalleDeUnaSolicitud(consecutivo);
    }

    /*----------Cancelar Solicitud de viaje----------*/
    /**
     * Este metodo se comunica con la clase Tec dentro de controlador Principal
     * y ejecuta el metodo de CancelarSolicitudViaje
     *
     * @param consecutivo
     * @return
     */
    public boolean CancelarSolicitudViaje(String consecutivo) {
        return implementacion.miControlador.getMiTec().
                CancelarSolicitudViaje(consecutivo);
    }
    
     /**
      * Este metodo genera una contrasena de 8 a 12 caracteres aleatorios 
      * alternando con mayusculas y minusculas numeros y un caracter especial
      * 
      * @return String 
      */
    public String GeneradorContrasena(){
        String acum = "";
        
        /*Cuerpo de la contrasena de 8 a 12
        1: carater especial( ! # $ ? @ ^ ~)
        3: numeros
        4 a 8: caracteres normales Alternando en MAyuscylas y minusculas
        */
        
        //generador de numero random
        Random rand = new Random();
        //Genera un random de 8 a 12 para ver el tamano de la contrasena
        int numeroRandom = rand.nextInt( 12 - 8 )+8;
        int iteraciones = numeroRandom - 4;
        // Genera de 4 a 8 caracters aleatorios alternando en Mayusculas y Minusculas
        for(int i = 0 ; i < iteraciones;i++ ){
            numeroRandom  = rand.nextInt(25);
            if( (i % 2) == 0){
                acum += GeneradorMayuscula(numeroRandom);
            }
            else{
                acum += GeneradorMisnuscula(numeroRandom);
            }
        }
        
        //Genera 3 numeros aleatorios 
        numeroRandom  = rand.nextInt(999);
        acum += numeroRandom+"";
        //Genera un caracter especial aleatorio
        numeroRandom  = rand.nextInt(6);
        acum += GeneradorCaracterEspecial(numeroRandom);
        
        return acum;
    }
    
    /**
     * Genera una letra Minuscula aleatoria
     * @param munero:int
     * @return String
     */
    public String GeneradorMisnuscula(int munero){
       String salida="";
       String Alfabeto="abcdefghijklmnopqrstuvwxyz";
       salida=Alfabeto.charAt(munero)+"";
       return salida;
    }
    
    /**
     * Genera una letra Mayuscula aleatoria
     * @param munero:
     * @return String
     */
    public String GeneradorMayuscula(int munero){
       String salida="";
       String Alfabeto="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       salida=Alfabeto.charAt(munero)+"";
       return salida;
    }
    
    /**
     * Genera un caracter especial; aleatorio
     * @param munero:int
     * @return String
     */
    public String GeneradorCaracterEspecial(int munero){
       String salida="";
       String Alfabeto="!#$?@^~";
       salida=Alfabeto.charAt(munero)+"";
       return salida;
    }

    //----------Fin de la clase----------//
}
