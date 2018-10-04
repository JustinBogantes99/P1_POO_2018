package aplicacion;
/**
 *
 * @author Justin
 */
public class Administrador {
    
    private String nombreCompleto;
    private String departamento;
    private String nombreUsuario;
    private int telefono;
    private String password;

    public Administrador(String nombreCompleto, String departamento, String nombreUsuario, int telefono, String password) {
        this.nombreCompleto = nombreCompleto;
        this.departamento = departamento;
        this.nombreUsuario = nombreUsuario;
        this.telefono = telefono;
        this.password = password;
    }

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
    
    
}
