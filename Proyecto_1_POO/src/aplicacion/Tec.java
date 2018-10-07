package aplicacion;

import Graficos.datoGrafico;
import email.CreadorPDF;
import email.EnviarCorreoAdjunto;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Justin Bogantes  & Manuel Arias & Carlos Montero
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
     * Constructor Default de la clase pata pruebas
     */
    public Tec() {
        this.secretarias = new ArrayList();
        this.administradores = new ArrayList();
        this.vehiculos = new ArrayList();
        this.viajes = new ArrayList();
        this.choferes = new ArrayList();
        this.Usuarios = new ArrayList();
    }

    /*----------Setters y Getters----------*/
    /**
     * Metodo Get de la lista secretarias
     *
     * @return secretarias
     */
    public List<Secretaria> getSecretarias() {
        return secretarias;
    }

    /**
     * metodo Set de la lista secretarias
     *
     * @param secretarias:List
     */
    public void setSecretarias(List<Secretaria> secretarias) {
        this.secretarias = secretarias;
    }

    /**
     * Metodo Get de la lista administradores
     *
     * @return administradores
     */
    public List<Administrador> getAdministradores() {
        return administradores;
    }

    /**
     * Metodo Set de la lista administradores
     *
     * @param administradores:List
     */
    public void setAdministradores(List<Administrador> administradores) {
        this.administradores = administradores;
    }

    /**
     * Metodo Get de la lista vehiculos
     *
     * @return vehiculos
     */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Metodo Set de la lista vehiculos
     *
     * @param vehiculos:List
     */
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Metodo Get de la lista viajes
     *
     * @return viajes
     */
    public List<Viaje> getViajes() {
        return viajes;
    }

    /**
     * Metodo Set de la lista viajes
     *
     * @param viajes:List
     */
    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }

    /**
     * Metodo Get de la lista choferes
     *
     * @return choferes
     */
    public List<Chofer> getChoferes() {
        return choferes;
    }

    /**
     * Metodo Set de la lista choferes
     *
     * @param choferes:List
     */
    public void setChoferes(List<Chofer> choferes) {
        this.choferes = choferes;
    }

    /**
     * Metodo Get de la lista usuarios
     *
     * @return Usuarios
     */
    public List<Pasajero> getUsuarios() {
        return Usuarios;
    }

    /**
     * Metodo Set de la lista Usuarios
     *
     * @param Usuarios:List
     */
    public void setUsuarios(List<Pasajero> Usuarios) {
        this.Usuarios = Usuarios;
    }

    /*----------Metodos Especialisados Secretaria----------*/
 /*----------Registrar Pasajero----------*/
    /**
     * Metodo encargado de Agregar un Nuevo usuario y retornar un valor de tipo
     * boolean si se logro agregar exitosamente
     *
     * @param entrada:Pasajero
     * @return boolean
     */
    public boolean RegistrarPasajero(Pasajero entrada) {
        if (ValidarPasajero(entrada)) {
            Usuarios.add(entrada);
            main.miControlador.CrearXML();
            return true;
        }
        return false;
    }

    /**
     * Metodo encargado de validar si existe un pasajero con el mismo id del
     * parametro de entrada y si existiera retornaria false
     *
     * @param entrada:Pasajero
     * @return boolean
     */
    public boolean ValidarPasajero(Pasajero entrada) {
        for (Pasajero temp : Usuarios) {
            if (temp.getCedula() == entrada.getCedula()) {
                JOptionPane.showMessageDialog(null, "El pasajero: "
                        + entrada.getNombreCompleto() + "\n Cedula: "
                        + entrada.getCedula()
                        + "\nya Existe dentro del sistema",
                        "ALERTA", 2);
                return false;
            }
        }
        return true;
    }

    /*----------Solicitar Viaje----------*/
    /**
     * Metodo Que se encargara de agregar una propuesta bde viaje a la lista de
     * Viajes y de esta manera retornar un true si el viaje se pudo agregar
     *
     * @param entrada:Viaje
     * @return boolean
     */
    public boolean SolicitarViaje(Viaje entrada) {
        if (VaidarViaje(entrada)) {
            viajes.add(entrada);
            main.miControlador.CrearXML();
            return true;
        }
        System.out.println("AquiNo agrego");
        return false;
    }

    /**
     * Este Metodo Validara si el viaje se podra agregar si cumple todos los
     * requisitos de lo contrario retornara un falce haciendo que el metodo
     * Solicitar viaje NO agreque la peticion de viaje
     *
     * @param entrada:Viaje
     * @return boolean
     */
    public boolean VaidarViaje(Viaje entrada) {
        //Valida si algun pasajero tiene choque de Fechas con otro Viaje

        for (Viaje temp : viajes) {
            System.out.println("Bandera viajes");

            for (Pasajero pasajeroRegistrado : temp.getPasajeros()) {

                for (Pasajero pasajeroEntrada : entrada.getPasajeros()) {

                    if (pasajeroEntrada.getCedula() == pasajeroRegistrado.getCedula()) {

                        if (ValidarFechasPasajero(entrada, temp)) {
                            JOptionPane.showMessageDialog(null, "El pasajero: "
                                    + pasajeroEntrada.getNombreCompleto() + "\n Cedula: "
                                    + pasajeroEntrada.getCedula()
                                    + "\nPresenta choque con la fecha de otro viaje",
                                    "ALERTA", 2);
                            return false;
                        }
                    }
                }
            }

        }
        //fecha de inicio de solicitud tiene que tener porlomenos 24 horas antes
        if (ValidarFechaSolicitud(entrada)) {
            return false;
        }
        //Valida la cantidad de pasdajeros que tiene
        if (entrada.getPasajeros().size() < 1) {
            JOptionPane.showMessageDialog(null, "La cantidad minima de pasajeros\n"
                    + "tiene que ser de 1",
                    "ALERTA", 2);
            return false;
        }

        //Si se cumplieron todos los requisitos retorna true
        return true;
    }

    /**
     * Este metodo Valida las fechas de inicio de 2 viajes y revisa si alguna de
     * las fechas se traslapan
     *
     * @param viajeNuevo:Viaje
     * @param viajeExistente:Viaje
     * @return boolean
     */
    public boolean ValidarFechasPasajero(Viaje viajeNuevo, Viaje viajeExistente) {
        //SimpleDateFormat traductor = new SimpleDateFormat("dd/MM/YYYY");
        Date fechaInicioViajeNuevo = viajeNuevo.getFechaInicio();
        Date fechaFinViajeNuevo = viajeNuevo.getFechaFinalizacion();

        Date fechaInicioViajeExistente = viajeExistente.getFechaInicio();
        Date fechaFinViajeExistente = viajeExistente.getFechaFinalizacion();

        /*System.out.println(fechaInicioViajeNuevo);
        System.out.println(fechaFinViajeNuevo);
         */
        if ((fechaInicioViajeNuevo.after(fechaInicioViajeExistente)
                || fechaInicioViajeNuevo.equals(fechaInicioViajeExistente))
                && (fechaInicioViajeNuevo.before(fechaFinViajeExistente)
                || fechaInicioViajeNuevo.equals(fechaFinViajeExistente))) {
            System.out.println((fechaInicioViajeNuevo.after(fechaInicioViajeExistente)
                    || fechaInicioViajeNuevo.equals(fechaInicioViajeExistente)));
            System.out.println((fechaInicioViajeNuevo.before(fechaFinViajeExistente)
                    || fechaInicioViajeNuevo.equals(fechaFinViajeExistente)));
            return true;
        }

        if ((fechaFinViajeNuevo.after(fechaInicioViajeExistente)
                || fechaFinViajeNuevo.equals(fechaInicioViajeExistente))
                && (fechaFinViajeNuevo.before(fechaFinViajeExistente)
                || fechaFinViajeNuevo.equals(fechaFinViajeExistente))) {
            return true;
        }

        return false;
    }

    /**
     * Este metodo se encarga de sumarle 24 horas a la fecha de Solicitud y
     * revisa que no sea igual o quede despues de la fecha de Inicio
     *
     * @param entrada:Viaje
     * @return boolean
     */
    public boolean ValidarFechaSolicitud(Viaje entrada) {
        Date fechaMasHoras = entrada.getFechaSolicitud();
        //Se agregan 24 horas a la fecha de peticion
        fechaMasHoras.setHours(fechaMasHoras.getHours() + 24);
        if (fechaMasHoras.after(entrada.getFechaInicio())
                || fechaMasHoras.equals(entrada.getFechaInicio())) {
            JOptionPane.showMessageDialog(null, "No se puede Solicitar un viaje\n"
                    + "que no tenga minimo mas de 24 horas\n"
                    + "antes de su hora de salida",
                    "ALERTA", 2);
            return true;
        }
        return false;
    }

    /*----------Listar Solicitudes de Viaje----------*/
    /**
     * Metodo encargado de listar solicitudes de viaje de un solo usuario
     * mediante 3 tipos de Busqueda
     *
     * @param entradaSecretaria:Secretaria
     * @param tipoBusqueda:int
     * @param Busqueda:String
     * @return String
     */
    public String ListarSolicitudesViaje(Secretaria entradaSecretaria,
            int tipoBusqueda, String Busqueda) {
        List<Viaje> viajesSolicitados = BusquedaSolicitudesViajesUsuario(
                entradaSecretaria);
        if (viajesSolicitados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El usuario no ha creado\n"
                    + "ninguna Solicitud de Viaje",
                    "Alerta", 2);
            return "";
        }
        String salida = "";
        switch (tipoBusqueda) {
            case 0://Busqueda por Fecha(dd/MM/yyyy)
                System.out.println("bandera case o");
                salida = SolicitudesViajesPorFecha(viajesSolicitados, Busqueda);
                break;
            case 1://Busqueda por Estado(Confeccion/Aprobado/Cancelado/No Aprobado)

                salida = SolicitudesViajesPorEstado(viajesSolicitados, Busqueda);
                break;
            case 2://Busqueda por Destino
                salida = SolicitudesViajesPorDestino(viajesSolicitados, Busqueda);
                break;
        }
        return salida;
    }

    /**
     * Este metodo se encaga de buscar todos los viajes solicitados por un
     * usuario y retornarlos en una lista con todas sus solicitudes de viajes
     *
     * @param entrada:Secretaria
     * @return List
     */
    public List<Viaje> BusquedaSolicitudesViajesUsuario(Secretaria entrada) {
        List<Viaje> salida = new ArrayList();
        for (Viaje temporal : viajes) {

            if (temporal.getSolicitante().getNombreUsuario().equals(
                    entrada.getNombreUsuario())) {
                salida.add(temporal);
            }
        }
        return salida;
    }

    /**
     * Metodo encargado de recolectar todos los viajes que coinciden con la
     * fecha de entrada y retorna todos los viajes en un String ya con el
     * formato deseado
     *
     * @param listaSolicitudes:List
     * @param fecha:String
     * @return String
     */
    public String SolicitudesViajesPorFecha(List<Viaje> listaSolicitudes, String fecha) {
        String acumulador = "";
        try {
            SimpleDateFormat traductor = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaBusqueda = traductor.parse(fecha);
            for (Viaje temporal : listaSolicitudes) {
                if (temporal.getFechaSolicitud().equals(fechaBusqueda)) {
                    acumulador += temporal.ImprimidorlistarSolicitudes();
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
            JOptionPane.showMessageDialog(null, "La fecha No cumple\n"
                    + "con el Formato", "Alerta", 2);

        }
        return acumulador;
    }

    /**
     * Metodo encargado de recolectar todos los viajes que coinciden con el
     * estado de entrada y retorna todos los viajes en un String ya con el
     * formato deseado
     *
     * @param listaSolicitudes:List
     * @param estado:String
     * @return String
     */
    public String SolicitudesViajesPorEstado(List<Viaje> listaSolicitudes,
            String estado) {
        String acumulador = "";
        for (Viaje temporal : listaSolicitudes) {
            if (temporal.getEstado().equals(estado)) {
                acumulador += temporal.ImprimidorlistarSolicitudes();
            }
        }
        return acumulador;
    }

    /**
     * Metodo encargado de recolectar todos los viajes que coinciden con el
     * destino de entrada y retorna todos los viajes en un String ya con el
     * formato deseado
     *
     * @param listaSolicitudes:List
     * @param destino:String
     * @return String
     */
    public String SolicitudesViajesPorDestino(List<Viaje> listaSolicitudes,
            String destino) {
        String acumulador = "";
        System.out.println("Bandera 3");
        for (Viaje temporal : listaSolicitudes) {
            System.out.println("Destino: " + temporal.getDestino());
            if (temporal.getDestino().equals(destino)) {
                acumulador += temporal.ImprimidorlistarSolicitudes();
            }
        }
        return acumulador;
    }

    /*----------Consultar detalle de una solicitud----------*/
    /**
     * Metodo encargado de buscar un viaje en espesifico y retornar toda la
     * informacion de este
     *
     * @param consecutivo:String
     * @return String
     */
    public String ConsultarDetalleDeUnaSolicitud(String consecutivo) {
        for (Viaje temporal : viajes) {
            if (temporal.getConsecutivo().equals(consecutivo)) {
                return temporal.toString();
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontro Ningun viaje\n"
                + "con el consecutivo: " + consecutivo, "Alerta", 2);
        return "";
    }

    /*----------Cancelar Solicitud de viaje----------*/
    /**
     * Este metodo unsca un Viaje en especifico y cambia su estado a Cancelado y
     * si el viaje esta en Aprovado enviara mensajes a los interesados
     *
     * @param consecutivo:String
     * @return boolean
     */
    public boolean CancelarSolicitudViaje(String consecutivo) {
        for (Viaje temporal : viajes) {
            if (temporal.getConsecutivo().equals(consecutivo)) {
                if (temporal.getEstado().equals("Aprobado")) {
                    /*Aque irian el metodo de enviar mensaje a los interesados*/
                    main.miControlador.getBoyBot().setMensajeSalida(
                            "El viaje: "+temporal.getConsecutivo()+
                             " fue Cancelado");
                }

                temporal.setEstado("Cancelado");
                main.miControlador.CrearXML();
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontro Ningun viaje\n"
                + "con el consecutivo: " + consecutivo, "Alerta", 2);
        return false;
    }

    /*----------Metodos Especialisados Administrador----------*/
 /*----------Registrar Chofer Nuevo----------*/
    /**
     * este metodo se encaraga de llamar a otro metodo de validacion y si el
     * chofer es apto sera agregado a la base de datos
     *
     * @param entrada:Chofer
     * @return boolean
     */
    public boolean RegistrarChoferNuevo(Chofer entrada) {
        if (ValidarChoferNuevo(entrada)) {
            choferes.add(entrada);
            main.miControlador.CrearXML();
            return true;
        }
        return false;
    }

    /**
     * Metodo encargado de validar la variable de tipo Chofer para ver si se
     * podra registrar dentro de los datos
     *
     * @param entrada:Chofer
     * @return boolean
     */
    public boolean ValidarChoferNuevo(Chofer entrada) {
        // validacion de que el chofer tenga al menos una licencia
        if (entrada.getLicencias().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede agregar Chofer\n"
                    + "sin ninguna licencia", "Alerta", 2);
            return false;
        }
        // validacion de ficha de vencimiento de la(s) licencias
        for (Licencia temporal : entrada.getLicencias()) {
            try {
                SimpleDateFormat traductor = new SimpleDateFormat("dd-MM-yyyy");
                Date fechaActual = new Date();
                Date fechatemp = traductor.parse(temporal.getFechaExpiracion());
                if (fechatemp.before(fechaActual) && fechatemp.equals(fechaActual)) {
                    JOptionPane.showMessageDialog(null, "No se puede agregar Chofer\n"
                            + "con una licencia Vencida\n"
                            + "Licencia: " + temporal.getNumero(),
                            "Alerta", 2);
                    return false;
                }
            } catch (HeadlessException | ParseException e) {
                System.out.println("Error");
            }
        }
        for (Chofer auxiliar : choferes) {
            if (auxiliar.getCedula() == entrada.getCedula()) {
                JOptionPane.showMessageDialog(null, "No se puede agregar Chofer\n"
                        + "que ya esxixte en el sistema\n"
                        + "Licencia: " + entrada.getCedula(),
                        "Alerta", 2);
                return false;
            }
        }

        return true;
    }

    /*----------Registrar Nuevo Vehiculo----------*/
    /**
     * Este metodo se encarga de llamar al metodo ValidarVehiculoNuevo y si el
     * vehiculo es cumple con ntodos los requerimientos sera agregado al sistema
     *
     * @param entrada:Vehiculo
     * @return boolean
     */
    public boolean RegistrarVehiculoNuevo(Vehiculo entrada) {
        if (ValidarVehiculoNuevo(entrada)) {
            vehiculos.add(entrada);
            main.miControlador.CrearXML();
            return true;
        }
        return false;
    }

    /**
     * Metodo encargado de validar un Si un vehiculo nuevo es apto de ser
     * agregado al sistema
     *
     * @param entrada:Vehiculo
     * @return boolean
     */
    public boolean ValidarVehiculoNuevo(Vehiculo entrada) {
        //Valida si el vehiculo no tiene un numero VIN repetido
        for (Vehiculo temporal : vehiculos) {
            if (temporal.getNúmeroVin() == entrada.getNúmeroVin()) {
                JOptionPane.showMessageDialog(null, "No se puede agregar Vehiculo\n"
                        + "Con un nuemro VIN ya existente", "Alerta", 2);
                return false;
            }
        }
        return true;
    }

    /*----------Listar Viajes----------*/
    /**
     * Metodo encargado de ordenar y retornar en formato de String los datos de
     * las solicitudes
     *
     * @return String
     */
    public String ListarViajesAdministrador() {
        String salida = "";
        //primero se buscara acomodar las solicitudes de viaje por orden de fecha
        List<Viaje> viajesOrdenados = AcomodarViajesPorFecha();

        //Se valida que la lista no este sin ninguna solicitud
        if (viajesOrdenados.size() > 0) {
            //acumila los returnos en el formato deseado dentro de la variable salida
            for (Viaje temporal : viajesOrdenados) {
                salida += temporal.ImprimidorlistarSolicitudesAdministrador();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede Desplegar Solicitudes\n"
                    + "ya que no existe ninguna en el\n"
                    + "sistema actualmente", "Alerta", 2);
        }

        return salida;
    }

    /**
     * Este metodo es encargado de acomodar las fechas por orden de menor a
     * mayor
     *
     * @return List
     */
    public List<Viaje> AcomodarViajesPorFecha() {
        List<Viaje> temporal = viajes;
        Collections.sort(temporal, new Comparator<Viaje>() {
            @Override
            public int compare(Viaje objeto1, Viaje objeto2) {
                return objeto1.getFechaSolicitud().compareTo(objeto2.getFechaSolicitud());
            }
        });
        return temporal;

    }

    //----------Aprobar Solicitud de viaje----------//
    /**
     * Este metodo se llama de validar los datos de entrada para aprovar una
     * solicitud y luego envia un correo a los interesados;
     *
     * @param estradaChofer:Chofer
     * @param entradaVehiculo:Vehiculo
     * @param entradaIdViaje:String
     * @return boolean
     */
    public boolean AprobarSolicitudAdministrador(Chofer estradaChofer, Vehiculo entradaVehiculo,
            String entradaIdViaje) {
        /*Lo primero sera buscar el vijae que se desea aprobar*/
        Viaje ViajePorAprobar;
        for (Viaje temp : viajes) {

            if (temp.getConsecutivo().equals(entradaIdViaje)) {
                ViajePorAprobar = temp;
                /*Luego lo que se hara es Validar todas las condiciones nesesarias 
                antes de aprobar la solicitud*/
                if (ValidarAprovacionSolicitud(ViajePorAprobar, estradaChofer,
                        entradaVehiculo)) {
                    /*se procedera a aprovar el viaje y agregar la informacion
                    neseradia*/
                    ViajePorAprobar.setEstado("Aprobado");
                    ViajePorAprobar.setChoferAsignado(estradaChofer);
                    ViajePorAprobar.setVehiculoAsignado(entradaVehiculo);
                    /*Aqie se notificara por correo a los interesados que el viaje
                    fue Aprovado*/
                    //genera el pdf que se enviara
                    CreadorPDF generador = new CreadorPDF();
                    generador.crearPDF(ViajePorAprobar.SalidaPDFViajeAprovado());
                    // enviara el correo a los interesados
                    ViajePorAprobar.EnviarCorreoAprovacion();

                    /*actualizacion del XML*/
                    main.miControlador.CrearXML();

                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Este metodo llama la los metodos que validan tanto al chofer como al
     * Vehiculo
     *
     * @param entradaViaje:Viaje
     * @param estradaChofer:Chofer
     * @param entradaVehiculo:Vehiculo
     * @return boolean
     */
    public boolean ValidarAprovacionSolicitud(Viaje entradaViaje, Chofer estradaChofer, Vehiculo entradaVehiculo) {

        /*lo primero sera validar al chofer si cumpre todas las condiciones*/
        if (DescartarChoferAprobacion(entradaViaje, estradaChofer)) {
            return false;
        }
        if (DescartarVehiculoAprobacion(entradaViaje, entradaVehiculo)) {
            return false;
        }

        return true;
    }

    /**
     * Este metodo revisa si el chofer ya esta asignado a un vijae y si lo esta
     * que no tenga un choque de fechas
     *
     * @param entradaViaje:Viaje
     * @param entradaChofer:Chofer
     * @return boolean
     */
    public boolean DescartarChoferAprobacion(Viaje entradaViaje, Chofer entradaChofer) {
        for (Viaje temporal : viajes) {
            if (temporal.getEstado().equals("Aprobado")) {
                if (temporal.getChoferAsignado().getCedula() == entradaChofer.getCedula()) {
                    if (ValidarFechasSolicitudAdministrador(entradaViaje, temporal)) {
                        JOptionPane.showMessageDialog(null, "No se puede agregar Chofer\n"
                                + "que presente un choque de horario\n"
                                + "con el viaje: " + temporal.getConsecutivo(),
                                "Alerta", 2);
                        return true;
                    }

                }
            }
        }

        return false;
    }

    /**
     * Este metodo revisa si el Vahiculo ya esta asignado a un vijae y si lo
     * esta que no tenga un choque de fechas ademas de que la capasidad de este
     * sea la correcta para el viaje
     *
     * @param entradaViaje:Viaje
     * @param entradaVehiculo:Vehiculo
     * @return boolean
     */
    public boolean DescartarVehiculoAprobacion(Viaje entradaViaje, Vehiculo entradaVehiculo) {

        for (Viaje temporal : viajes) {
            if (temporal.getEstado().equals("Aprobado")) {
                if (temporal.getVehiculoAsignado().getNúmeroVin()
                        == entradaVehiculo.getNúmeroVin()) {
                    if (ValidarFechasSolicitudAdministrador(entradaViaje, temporal)) {
                        JOptionPane.showMessageDialog(null, "No se puede agregar Vehiculor\n"
                                + "que presente un choque de horario\n"
                                + "con el viaje: " + temporal.getConsecutivo(),
                                "Alerta", 2);
                        return true;
                    }
                    int totalPasajeros = (1 + entradaViaje.getPasajeros().size());
                    if (entradaVehiculo.getCapacidad() < totalPasajeros) {
                        JOptionPane.showMessageDialog(null, "No se puede agregar Vehiculor\n"
                                + "que presente una capacidad menor \n"
                                + "a la del viaje: " + totalPasajeros,
                                "Alerta", 2);
                        return true;
                    }
                }

            }

        }

        return false;
    }

    /**
     * Este metodo Valida las fechas de inicio de 2 viajes y revisa si alguna de
     * las fechas se traslapan
     *
     * @param viajeNuevo:Viaje
     * @param viajeExistente:Viaje
     * @return boolean
     */
    public boolean ValidarFechasSolicitudAdministrador(Viaje viajeNuevo, Viaje viajeExistente) {
        //SimpleDateFormat traductor = new SimpleDateFormat("dd/MM/YYYY");
        Date fechaInicioViajeNuevo = viajeNuevo.getFechaInicio();
        Date fechaFinViajeNuevo = viajeNuevo.getFechaFinalizacion();

        Date fechaInicioViajeExistente = viajeExistente.getFechaInicio();
        Date fechaFinViajeExistente = viajeExistente.getFechaFinalizacion();

        if ((fechaInicioViajeNuevo.after(fechaInicioViajeExistente)
                || fechaInicioViajeNuevo.equals(fechaInicioViajeExistente))
                && (fechaInicioViajeNuevo.before(fechaFinViajeExistente)
                || fechaInicioViajeNuevo.equals(fechaFinViajeExistente))) {
            return true;
        }
        if ((fechaFinViajeNuevo.after(fechaInicioViajeExistente)
                || fechaFinViajeNuevo.equals(fechaInicioViajeExistente))
                && (fechaFinViajeNuevo.before(fechaFinViajeExistente)
                || fechaFinViajeNuevo.equals(fechaFinViajeExistente))) {
            return true;
        }

        return false;
    }

    //----------Registrar nueva Secretaria----------//
    /**
     * Estre metodo agrena una nueva secretaria
     *
     * @param entrada
     * @return
     */
    public boolean AgregarSecretariaNUeva(Secretaria entrada) {
        if (ValidarSecretatiaNueva(entrada)) {
            secretarias.add(entrada);

            //genera el pdf que se enviara
            CreadorPDF generador = new CreadorPDF();
            generador.crearPDF(entrada.SalidaPDF());
            // enviara el correo a los interesados
            EnviarCorreoAdjunto enviador = new EnviarCorreoAdjunto();
            enviador.EnviarCorreo(entrada.getCorreoElectronico(),
                    "Nuevo Usuario Secretaria");

            main.miControlador.CrearXML();
            return true;
        }
        return false;
    }

    public boolean ValidarSecretatiaNueva(Secretaria entrada) {
        for (Secretaria temp : secretarias) {
            if (entrada.getNombreUsuario().equals(temp.getNombreUsuario())) {
                JOptionPane.showMessageDialog(null, "No se puede agregar una Secretariar\n"
                        + "que con ese Usuario: " + entrada.getNombreUsuario(),
                        "Alerta", 2);
                return false;
            }
        }

        return true;
    }
    /*----------Graficos----------*/
    public List<datoGrafico> infoGraficoCircular(){
        List<datoGrafico> salida = new ArrayList();
        boolean nuevo=true;
        for(Viaje auxiliar:viajes){
            System.out.println("aqui");
            for(datoGrafico temporal:salida){
                if(temporal.getInfo().equals(auxiliar.
                        getSolicitante().getDepartamento())){
                    temporal.setNumero(temporal.getNumero()+1);
                    nuevo=false;
                }
                
            }
            if(nuevo){
                datoGrafico agregarDato = new datoGrafico();
                agregarDato.setInfo(auxiliar.
                        getSolicitante().getDepartamento());
                agregarDato.setNumero(1);
                salida.add(agregarDato);
            }
            
        
        }
        
        return salida;
    }
    
    /*----------Metodos especialisados U.I----------*/
//----------Validar Usuario Administrador----------//
    /**
     * Este metodo valida si el usuario que quiere ingresar al sistema es
     * correcto
     *
     * @param usuario:String
     * @param password:String
     * @return boolean
     */
    public boolean ValidarUsuarioAdministrador(String usuario, String password) {
        for (Administrador temp : administradores) {
            if (temp.getNombreUsuario().equals(usuario)) {
                if (temp.getPassword().equals(password)) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña no es valida",
                            "Alerta", 2);

                }
            }

        }

        return false;
    }

    //----------Validar Usuario Secretaria----------//
    /**
     * Este metodo valida si el usuario que quiere ingresar al sistema es
     * correcto
     *
     * @param usuario:String
     * @param password:String
     * @return boolean
     */
    public boolean ValidarUsuarioSecretaria(String usuario, String password) {
        for (Secretaria temp : secretarias) {
            if (temp.getNombreUsuario().equals(usuario)) {
                System.out.println(temp.getPassword());
                System.out.println(password);
                if (temp.getPassword().equals(password)) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña no es valida",
                            "Alerta", 2);

                }
            }

        }

        return false;
    }

    //----------Cargador Secretaria----------//
    /**
     * Este metodo busca una secretaria en espesifico y la retorna
     *
     * @param usuario:String
     * @return Secretaria
     */
    public Secretaria CargarSecretaria(String usuario) {
        for (Secretaria temp : secretarias) {
            if (temp.getNombreUsuario().equals(usuario)) {
                return temp;
            }
        }
        return null;
    }

    //----------Cargador Administrador----------//
    /**
     * Este metodo busca un Adminitrador en espesifico y la retorna
     *
     * @param usuario:String
     * @return Administrador
     */
    public Administrador CargarAdministrador(String usuario) {
        for (Administrador temp : administradores) {
            if (temp.getNombreUsuario().equals(usuario)) {
                return temp;
            }
        }
        return null;
    }

    /*----------Fin de la clase---------*/
}
