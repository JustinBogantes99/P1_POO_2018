package aplicacion;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author Justin
 */
@XmlType()
public class Vehiculo {
    
    private int placa;
    private int anioFabricación;
    private String color;
    private String marca;
    private int capacidad;
    private double kilometraje;
    private int númeroVin;
    private String sedePertenenciaVehículo;
    private String estado;
    private ArrayList<Mantenimiento>Mantenimientos;

    public Vehiculo(int placa, int anioFabricación, String color, String marca, int capacidad, double kilometraje, int númeroVin, String sedePertenenciaVehículo, String estado, ArrayList<Mantenimiento> Mantenimientos) {
        this.placa = placa;
        this.anioFabricación = anioFabricación;
        this.color = color;
        this.marca = marca;
        this.capacidad = capacidad;
        this.kilometraje = kilometraje;
        this.númeroVin = númeroVin;
        this.sedePertenenciaVehículo = sedePertenenciaVehículo;
        this.estado = estado;
        this.Mantenimientos = Mantenimientos;
    }

        
    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getAnioFabricación() {
        return anioFabricación;
    }

    public void setAnioFabricación(int anioFabricación) {
        this.anioFabricación = anioFabricación;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getNúmeroVin() {
        return númeroVin;
    }

    public void setNúmeroVin(int númeroVin) {
        this.númeroVin = númeroVin;
    }

    public String getSedePertenenciaVehículo() {
        return sedePertenenciaVehículo;
    }

    public void setSedePertenenciaVehículo(String sedePertenenciaVehículo) {
        this.sedePertenenciaVehículo = sedePertenenciaVehículo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Mantenimiento> getMantenimientos() {
        return Mantenimientos;
    }

    public void setMantenimientos(ArrayList<Mantenimiento> Mantenimientos) {
        this.Mantenimientos = Mantenimientos;
    }

    
    
}