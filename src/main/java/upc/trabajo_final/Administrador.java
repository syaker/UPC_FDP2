package upc.trabajo_final;

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
        /*Para que el método consultarMontoVentaTotal() de la clase Cajero funcione correctamente, necesitas tener acceso la lista
        : la lista de pedidos (listPedidos) . Con su respectivo Getter.*/
        // Obtener la lista de pedidos
        Main objetoMain = new Main();
        /*En donde esta subrayado Main, va la clase donde esta la lista de pedidos,*/
        List<Pedido> listaPedido = objetoMain.getListPedidos();
        /*Cuando se cree la lista de Pedidos y su get, dejara de votar error*/

        // Crear un mapa para contar la cantidad de pedidos por código de cliente
        Map<String, Integer> pedidosPorCliente = new HashMap<>();

        for (Pedido pedido : listaPedido) {
            String codigoCliente = pedido.getCodigoCliente();

            // Verificar si el cliente ya estahv en el mapa, si no, agregarlo con 1 pedido
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
            System.out.println("Posición " + posicion + ": Código de Cliente: " + entry.getKey() + ", Cantidad de Pedidos: " + entry.getValue());
            posicion++;
        }
    }

}
