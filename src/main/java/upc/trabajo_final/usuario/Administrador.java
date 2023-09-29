package upc.trabajo_final.usuario;

import upc.trabajo_final.Cliente;
import upc.trabajo_final.interfaz_sistema.IAccionMenu;

import java.util.*;

public class Administrador extends Usuario implements IAdministrador, IAccionMenu {

    private ClienteDB clienteDB;
    private Scanner scanner;

    private List<Cliente> clientesCreadosPorCrearCliente;


    public Administrador(String tipoUsuario, String numeroDocumento, String nombre, String primerApellido, String segundoApellido, String edad, String fechaIngreso, String inicioSesion, String correoElectronico, int telefono, double salario) {
        super(tipoUsuario, numeroDocumento, nombre, primerApellido, segundoApellido, edad, fechaIngreso, inicioSesion, correoElectronico, telefono, salario);
        this.clienteDB = new ClienteDB();
        this.scanner = new Scanner(System.in);

    }

    public Administrador() {
        super();
        this.clienteDB = new ClienteDB();
        this.clientesCreadosPorCrearCliente = new ArrayList<>();
    }

    @Override
    public boolean crearAdministrador() {

        // Aqui hacemos validaciones segun el tipo de usuario
        return true;
    }
    @Override
    public boolean listarUsuarios() {

        // Aqui hacemos validaciones segun el tipo de usuario
    return true;
    }
    @Override
    public boolean listarUsuario() {

        // Aqui hacemos validaciones segun el tipo de usuario
        return true;
    }

    @Override
    public void eliminarPedido(){

        // Se marca como anulado, solo admin

    }

    @Override
    public boolean eliminarUsuario() {

        // Aqui hacemos validaciones segun el tipo de usuario

        // Se marca como anulado, solo admin
        return true;
    }

    @Override
    public void eliminarCliente(){

        System.out.print("Ingrese el número de DNI del cliente que desea eliminar: ");
        String numeroDocumento = scanner.nextLine();

        List<Cliente> clientes = clienteDB.getListaClientes();
        Cliente clienteAEliminar = null;

        for (Cliente cliente : clientes) {
            if (cliente.getNumeroDocumento().equals(numeroDocumento)) {
                clienteAEliminar = cliente;
                break;
            }
        }

        if (clienteAEliminar != null) {
            clientes.remove(clienteAEliminar);
            System.out.println("Cliente eliminado con éxito.");
        } else {
            System.out.println("Cliente no encontrado.");
        }

    }

    @Override
    public void agregarOpcionComida() {

    }

    @Override
    public void editarOpcionComida() {

    }

    @Override
    public void eliminarOpcionComida() {

        // Se marca como anulado, solo admin
    }

    @Override
    public void agregarOpcionBebida() {

    }

    @Override
    public void editarOpcionBebida() {

    }

    @Override
    public void eliminarOpcionBebida() {

        // Se marca como anulado, solo admin
    }

    @Override
    public void cambiarEstadoDelPedido() {

    }

    @Override
    public void crearCliente() {

        System.out.println("Ingrese el número de documento del cliente:");
        String numeroDocumento = scanner.nextLine();

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el primer apellido del cliente:");
        String primerApellido = scanner.nextLine();

        System.out.println("Ingrese el segundo apellido del cliente:");
        String segundoApellido = scanner.nextLine();

        System.out.println("Ingrese la edad del cliente:");
        String edad = scanner.nextLine();

        System.out.println("Ingrese la fecha de registro del cliente (en formato YYYY-MM-DD):");
        String fechaRegistro = scanner.nextLine();

        System.out.println("Ingrese el correo electrónico del cliente:");
        String correoElectronico = scanner.nextLine();

        System.out.println("Ingrese el número de teléfono del cliente:");
        String telefono = scanner.nextLine();



        Cliente nuevoCliente = new Cliente(numeroDocumento, nombre, primerApellido, segundoApellido, edad, fechaRegistro, correoElectronico, telefono);


        clientesCreadosPorCrearCliente.add(nuevoCliente);

        System.out.println("Cliente creado y agregado con éxito.");


    }

    @Override
    public void listarClientesCreados() {
      //  List<Cliente> clientes = clienteDB.getListaClientes();

        if (clientesCreadosPorCrearCliente.isEmpty()){
            System.out.println("No hay clientes registrados");
        } else {
            System.out.println("Datos de clientes registrados hasta la fecha: \n");
            for (Cliente cliente: clientesCreadosPorCrearCliente){
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Primer Apellido: " + cliente.getPrimerApellido());
                System.out.println("Segundo Apellido: " + cliente.getSegundoApellido());
                System.out.println("Número de Documento (DNI): " + cliente.getNumeroDocumento());
                System.out.println("Fecha de Registro: " + cliente.getFechaRegistro());
                System.out.println("Correo Electrónico: " + cliente.getCorreoElectronico());
                System.out.println("Teléfono: " + cliente.getTelefono());
                System.out.println("Edad: " + cliente.getEdad() + "\n");
            }
        }
    }


    @Override
    public void listarClientesTotales() {

        List<Cliente> clientes = clienteDB.getListaClientes();

        if (clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
        } else {
            System.out.println("Datos de clientes registrados hasta la fecha: \n");
            for (Cliente cliente: clientes){
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Primer Apellido: " + cliente.getPrimerApellido());
                System.out.println("Segundo Apellido: " + cliente.getSegundoApellido());
                System.out.println("Número de Documento (DNI): " + cliente.getNumeroDocumento());
                System.out.println("Fecha de Registro: " + cliente.getFechaRegistro());
                System.out.println("Correo Electrónico: " + cliente.getCorreoElectronico());
                System.out.println("Teléfono: " + cliente.getTelefono());
                System.out.println("Edad: " + cliente.getEdad() + "\n");
            }
        }

    }

    @Override
    public void ejecutarAccion(int accionId) {

        switch (accionId){
            case 1:this.crearAdministrador();break;
            case 2:this.listarUsuarios(); break;
            case 3:this.listarUsuario();break;
            case 4:this.eliminarPedido();break;
            case 5:this.eliminarUsuario();break;
            case 6:this.eliminarCliente();break;
            case 7:this.agregarOpcionComida();break;
            case 8:this.editarOpcionComida();break;
            case 9:this.eliminarOpcionComida();break;
            case 10:this.agregarOpcionBebida();break;
            case 11:this.crearCliente();break;
            case 12:this.listarClientesCreados();break;
            case 13:this.listarClientesTotales();break;
            case 14:this.editarOpcionBebida();break;
            case 15:this.eliminarOpcionBebida();break;
            case 16:this.cambiarEstadoDelPedido();break;
        }
    }
}
