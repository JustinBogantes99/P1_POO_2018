package aplicacion;

import Graficos.datoGrafico;
import java.util.List;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Justin
 */
@XmlType()
public class Administrador {

    private String nombreCompleto;
    private String departamento;
    private String nombreUsuario;
    private int telefono;
    private String password;

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

    /*----------Metodos especialisados----------*/
    /**
     * este metodo se comunica con la clase tec e intenta registrar un nuevo
     * chofer
     *
     * @param entrada
     * @return boolean
     */
    public boolean RegistrarChoferNuevo(Chofer entrada) {
        return main.miControlador.getMiTec().RegistrarChoferNuevo(entrada);
    }

    public boolean RegistrarVehiculoNuevo(Vehiculo entrada) {
        return main.miControlador.getMiTec().RegistrarVehiculoNuevo(entrada);
    }

    public String ListarViajesAdministrador() {
        return main.miControlador.getMiTec().ListarViajesAdministrador();
    }
    
    public boolean AprobarSolicitudAdministrador(Chofer estradaChofer, Vehiculo entradaVehiculo,
            String entradaIdViaje) {
         return main.miControlador.getMiTec().AprobarSolicitudAdministrador(
                 estradaChofer, entradaVehiculo, entradaIdViaje);
    }
    
     public boolean AgregarSecretariaNUeva(Secretaria entrada) {
         return main.miControlador.getMiTec().AgregarSecretariaNUeva(entrada);
     }
     
     public List<datoGrafico> infoGraficoCircular(){
         return main.miControlador.getMiTec().infoGraficoCircular();
     }
     
    /*Consultar datos*/
    
}
