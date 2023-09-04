package upc.trabajo_final;

public interface ICajero extends IUsuario {
    void cobrarCuenta();

    void editarCuenta();

    void crearCliente();

    void listarCliente();

    void listarClientes();

    void cambiarEstadoDelPedido();
}
