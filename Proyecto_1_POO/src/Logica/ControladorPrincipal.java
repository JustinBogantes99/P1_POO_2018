/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import UI.frmLogin;
import aplicacion.Tec;

/**
 *
 * @author SSDesth
 */
public class ControladorPrincipal {
    /*----------Variable(s) de la clase----------*/
    private Tec miTec;
    private frmLogin miVentanaLogeo;
    //private Tec miTec;
    
    /*----------Constructor(es)----------*/
    /**
     * contructor default de la clase
     */
    public ControladorPrincipal() {
        this.miTec= new Tec();
    }

    /*----------Setters y Getters----------*/
    /**
     * Get de la variable miTec
     * @return Tec
     */
    public Tec getMiTec() {
        return miTec;
    }
    
    /**
     * Set de la variable miTec
     * @param miTec:Tec
     */
    public void setMiTec(Tec miTec) {
        this.miTec = miTec;
    }
    
    /*----------Metodos Especiializados----------*/
    
    public void IniciarPrograma(){
        /*Cargar XML*/
        
        miVentanaLogeo= new frmLogin();
        miVentanaLogeo.CargadorVentana();
        miVentanaLogeo.setVisible(true);
    
    }
    
    
    /*----------Fin de la clase----------*/
}
