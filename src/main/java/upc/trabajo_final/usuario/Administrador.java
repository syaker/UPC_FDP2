package upc.trabajo_final.usuario;

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

}
