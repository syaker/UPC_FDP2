package upc.trabajo_final;

public class Cajero extends Usuario implements ICajero {
    public Cajero(String tipoUsuario, String numeroDocumento, String nombre, String primerApellido, String segundoApellido, String edad, String fechaIngreso, String inicioSesion, String correoElectronico, String telefono, String salario) {
        super(tipoUsuario, numeroDocumento, nombre, primerApellido, segundoApellido, edad, fechaIngreso, inicioSesion, correoElectronico, telefono, salario);
    }

    @Override
    public void cobrarCuenta() {

        // Aqui hacemos validaciones segun el tipo de usuario
    }

    @Override
    public void editarCuenta() {

        // Aqui hacemos validaciones segun el tipo de usuario

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

    @Override
    public void cambiarEstadoDelPedido() {

    }

}
