package upc.trabajo_final.usuario;

import upc.trabajo_final.Cliente;
import upc.trabajo_final.ClienteDB;
import upc.trabajo_final.pedido.Pedido;
import upc.trabajo_final.pedido.PedidosDB;

import java.text.SimpleDateFormat;
import java.util.*;

public class Administrador extends Usuario implements IAdministrador {

    public Administrador(String tipoUsuario, String numeroDocumento, String nombre, String primerApellido, String segundoApellido, String edad, String fechaIngreso, String inicioSesion, String correoElectronico, int telefono, double salario) {
        super(tipoUsuario, numeroDocumento, nombre, primerApellido, segundoApellido, edad, fechaIngreso, inicioSesion, correoElectronico, telefono, salario);
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

        // Se marca como anulado, solo admin

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

    }

    @Override
    public void listarCliente() {

    }

    @Override
    public void listarClientes() {

    }
    public void consultarRankingClientesFrecuentes() {
        /*Para que el método consultarRankingClientesFrecuentes() de la clase Administrador funcione correctamente, necesitas tener acceso a dos listas
        : la lista de pedidos (listPedidos) y la lista clientes (listClientes). Con sus respectivos Getters.*/
        // Obtener la lista de pedidos
        PedidosDB objetoMain = new PedidosDB();
        /*En donde esta subrayado Main, va la clase donde esta la lista de pedidos y clientes, en caso estas listas esten en diferentes clases, crear una para cada clase.*/
        List<Pedido> listaPedido = objetoMain.getListPedidos();
        /*Cuando se cree la lista de Pedidos y su get, dejara de votar error, en donde dice "objetoMain." poner en base a como lo nombraste en el new de arriba*/

        // Obtener la lista de clientes
        ClienteDB objetoMain2 = new ClienteDB();
        List<Cliente> clientes = objetoMain2.getListClientes();
        /*Cuando se cree la lista de Clientes y su get, dejara de votar error, en donde dice "objetoMain." poner en base a como lo nombraste en el new del principio del metodo*/

        // Crear un mapa para contar la cantidad de pedidos por código de cliente
        Map<String, Integer> pedidosPorCliente = new HashMap<>();

        for (Pedido pedido : listaPedido) {
            String codigoCliente = pedido.getCodigoCliente();

            // Verificar si el cliente ya está en el mapa, si no, agregarlo con 1 pedido
            if (pedidosPorCliente.containsKey(codigoCliente)) {
                int pedidosPrevios = pedidosPorCliente.get(codigoCliente);
                pedidosPorCliente.put(codigoCliente, pedidosPrevios + 1);
            } else {
                pedidosPorCliente.put(codigoCliente, 1);
            }
        }

        // Convertir el mapa en una lista de entradas
        List<Map.Entry<String, Integer>> listaClientesFrecuentes = new ArrayList<>(pedidosPorCliente.entrySet());

        // Ordenar la lista
        Collections.sort(listaClientesFrecuentes, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });

        // Imprimir
        System.out.println("Ranking de Clientes Frecuentes:");
        int posicion = 1;
        for (Map.Entry<String, Integer> entry : listaClientesFrecuentes) {
            System.out.println("-------------------------------");
            System.out.println("Posición " + posicion + ":");

            // Mostrar los datos del cliente
            for (Cliente cliente : clientes) {
                if (cliente.getCodigoCliente().equals(entry.getKey())) {
                    /*Cuando se cree la lista Clientes y su get, dejara de votar error*/
                    System.out.println("[Nombre: " + cliente.getNombre());
                    System.out.println("Primer Apellido: " + cliente.getPrimerApellido());
                    System.out.println("Segundo Apellido: " + cliente.getSegundoApellido());
                    System.out.println("Edad: " + cliente.getEdad());
                    System.out.println("Fecha de Registro: " + cliente.getFechaRegistro());
                    System.out.println("Correo Electrónico: " + cliente.getCorreoElectronico());
                    System.out.println("Teléfono: " + cliente.getTelefono());
                    break; // Salir después de encontrar al cliente
                }
            }

            System.out.println("Cantidad de Pedidos: " + entry.getValue()+"]");
            System.out.println("-------------------------------");
            posicion++;
        }
    }
    public void consultarListaGeneralPedidos() {
        // Obtener la lista de pedidos
        PedidosDB objetoMain = new PedidosDB();
        List<Pedido> listaPedidos = objetoMain.getListPedidos();

        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Formatear la fecha actual en el formato "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActualStr = dateFormat.format(fechaActual);

        // Verificar si la lista de pedidos está vacía
        if (listaPedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados.");
        } else {
            System.out.println("Pedidos del día " + fechaActualStr + ":");

            for (Pedido pedido : listaPedidos) {
                // Verificaciom si la fecha del pedido coincide con la fecha actual
                if (pedido.getFechaPedido().equals(fechaActualStr)) {
                    System.out.println("---------------------------------------------");
                    System.out.println("IDs de Productos Relacionados: " + String.join(", ", pedido.getIdsProductoRelacionado()));
                    System.out.println("Monto Total: " + pedido.getMontoTotal());
                    System.out.println("Fecha de Pedido: " + pedido.getFechaPedido());
                    System.out.println("Hora de Pedido: " + pedido.getHoraPedido());
                    System.out.println("Código de Pedido: " + pedido.getCodigoPedido());
                    System.out.println("Código de Cliente: " + pedido.getCodigoCliente());
                    System.out.println("Cobrado: " + pedido.isCobrado());
                    System.out.println("Anulado: " + pedido.isAnulado());
                    System.out.println("---------------------------------------------");
                }
            }
        }
    }
}
