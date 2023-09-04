package upc.trabajo_final;

public interface IAdministrador extends IUsuario {
    boolean crearAdministrador();

    boolean listarUsuarios();

    boolean listarUsuario();

    void eliminarPedido();

    boolean eliminarUsuario();

    void eliminarCliente();

    void agregarOpcionComida();

    void editarOpcionComida();

    void eliminarOpcionComida();

    void agregarOpcionBebida();

    void editarOpcionBebida();

    void eliminarOpcionBebida();

    void cambiarEstadoDelPedido();

    void crearCliente();

    void listarCliente();

    void listarClientes();
}
