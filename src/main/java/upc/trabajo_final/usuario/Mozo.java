package upc.trabajo_final.usuario;

import upc.trabajo_final.interfaz_sistema.IAccionMenu;
import upc.trabajo_final.usuario.Usuario;

public class Mozo extends Usuario implements IAccionMenu {
    public Mozo(String tipoUsuario, String numeroDocumento, String nombre, String primerApellido, String segundoApellido, String edad, String fechaIngreso, String inicioSesion, String correoElectronico, int telefono, double salario) {
        super(tipoUsuario, numeroDocumento, nombre, primerApellido, segundoApellido, edad, fechaIngreso, inicioSesion, correoElectronico, telefono, salario);
    }

    public Mozo() {
        // super();
    }

    /*@Override
    public void ejecutarAccion(int accionId) {

    }*/
}
