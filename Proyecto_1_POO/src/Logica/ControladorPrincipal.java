/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import BotTelegram.MyAmazingBot;
import UI.frmAdministrados;
import UI.frmLogin;
import UI.frmSecretaria;
import aplicacion.*;
import java.io.File;
import java.util.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 *
 * @author SSDesth
 */
public class ControladorPrincipal {

    /*----------Variable(s) de la clase----------*/
    private Tec miTec;
    private frmLogin miVentanaLogeo;
    private frmSecretaria miVentanaSecretaria;
    private frmAdministrados miVentanaAdministrador;
    private TelegramBotsApi botsApi = new TelegramBotsApi();
    private MyAmazingBot boyBot = new MyAmazingBot();
    /*----------Constructor(es)----------*/
    /**
     * contructor default de la clase
     */
    public ControladorPrincipal() {
        this.miTec = new Tec();
    }

    /*----------Setters y Getters----------*/
    /**
     * Get de la variable miTec
     *
     * @return Tec
     */
    public Tec getMiTec() {
        return miTec;
    }

    /**
     * Set de la variable miTec
     *
     * @param miTec:Tec
     */
    public void setMiTec(Tec miTec) {
        this.miTec = miTec;
    }

    public TelegramBotsApi getBotsApi() {
        return botsApi;
    }

    public void setBotsApi(TelegramBotsApi botsApi) {
        this.botsApi = botsApi;
    }

    public MyAmazingBot getBoyBot() {
        return boyBot;
    }

    public void setBoyBot(MyAmazingBot boyBot) {
        this.boyBot = boyBot;
    }
    
    
    
    /*----------Metodos Especiializados----------*/
    /**
     * Este metodo Carga la primera ventana del programa junto con la carga de
     * archivos
     */
    public void IniciarPrograma() {
        /*Cargar XML*/
        leerXML("src/XML/Datos.xml");
        
       /* ApiContextInitializer.init();
        
        // Instantiate Telegram Bots API
       
         try {
            botsApi.registerBot(new MyAmazingBot());
        } 
        catch (TelegramApiException e) {e.printStackTrace();
        }*/
        
        CargarVentanaloggin();

    }

    /**
     * este metodo Carga el frm de loggin
     */
    public void CargarVentanaloggin() {

        miVentanaLogeo = new frmLogin();
        miVentanaLogeo.CargadorVentana();
        miVentanaLogeo.setVisible(true);

    }

    /**
     * este metodo carga el frmSecretaria
     *
     * @param entrada:Secretaria
     */
    public void CargarVentanaSecretaria(Secretaria entrada) {
        miVentanaLogeo.dispose();
        miVentanaSecretaria = new frmSecretaria();
        miVentanaSecretaria.CargadorVentana(entrada);
        miVentanaSecretaria.setVisible(true);

    }

    /**
     * este metodo carga el frmAdministrador
     *
     * @param entrada:Administrador
     */
    public void CargarVentanaAdministrador(Administrador entrada) {
        miVentanaLogeo.dispose();
        miVentanaAdministrador = new frmAdministrados();
        miVentanaAdministrador.CargadorVentana(entrada);
        miVentanaAdministrador.setVisible(true);

    }

    /*----------Metodos especialisados U.I----------*/
 /*----------Validar Usuario Administrador----------*/
    /**
     * Este metofo se encarga de hacer un llamado a mitec y validar si el
     * usuario y la contrasena son correctas
     *
     * @param usuario:String
     * @param password:String
     * @return boolean
     */
    public boolean ValidarUsuarioAdministrador(String usuario, String password) {
        return miTec.ValidarUsuarioAdministrador(usuario, password);
    }

    /*----------Validar Usuario Secretaria----------*/
    /**
     * Este metofo se encarga de hacer un llamado a mitec y validar si el
     * usuario y la contrasena son correctas
     *
     * @param usuario:String
     * @param password:String
     * @return boolean
     */
    public boolean ValidarUsuarioSecretaria(String usuario, String password) {
        return miTec.ValidarUsuarioSecretaria(usuario, password);
    }

    /**
     * este metodo Carga una secretaria para su uso en el frm Secretaria
     *
     * @param usuario:String
     * @return Secretaria
     */
    public Secretaria CargarSecretaria(String usuario) {
        return miTec.CargarSecretaria(usuario);
    }

    /**
     * este metodo Carga una secretaria para su uso en el frm Secretaria
     *
     * @param usuario:String
     * @return Secretaria
     */
    public Administrador CargarAdministrador(String usuario) {
        return miTec.CargarAdministrador(usuario);
    }

    /**
     * este metodo obtiene los pasajeros que existen dentro del programa
     *
     * @return List
     */
    public List<Pasajero> ObtenerListaUsuarios() {
        return miTec.getUsuarios();
    }

    /*----------lectura y escritura Archivos----------*/
    /**
     * Este metodo genera un xml con los datos del programa
     *
     * @param URL:String
     */
    public void leerXML(String URL) {
        try {
            //--------Crea el contexto JAXB--------//
            JAXBContext ctx = JAXBContext.newInstance(Tec.class);
            //--------Crea la clase que permite leer archivo XML
            Unmarshaller ums = ctx.createUnmarshaller();

            miTec = (Tec) ums.unmarshal(new File(URL)); //error

        } catch (JAXBException ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Este metodo lee un xml con los datos del programa
     */
    public void CrearXML() {
        //Contexto de JAXB
        try {
            JAXBContext ctx = JAXBContext.newInstance(Tec.class);
            Marshaller ms = ctx.createMarshaller();

            ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ms.marshal(miTec, new File("src/XML/Datos.xml"));

        } catch (JAXBException ex) {
            System.out.println("Error");
        }
    }

    /*----------Fin de la clase----------*/
}
