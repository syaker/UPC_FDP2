package upc.trabajo_final.usuario;

import upc.trabajo_final.interfaz_sistema.IAccionMenu;

public class Usuario implements IUsuario, IAccionMenu {
    String[][] usuarios = {
            {"mozo","9882985", "Ana", "Perez", "Rodriguez", "20", "04/09/2023", "si", "anaperez@gmail.com", "999324235", "2000", "0"},
            {"administrador","3298798", "Juan", "Martinat", "Chavez", "20", "19/11/2022", "si", "jmarti@gmail.com", "999767675", "2000", "0"},
            {"cajero","3634643", "Nelly", "Tapia", "Ballena", "20", "28/02/2023", "si", "nellytb@gmail.com", "934534534", "1300", "0"},
            {"mozo","3563456", "Gonzalo", "Lastra", "Fernandez", "20", "23/05/2023", "si", "gonza9899@gmail.com", "999435334", "5000", "0"},
            {"mozo","5675675", "Carola", "Quintanilla", "Rodriguez", "20", "04/06/2023", "si", "caroquinta@gmail.com", "96977798", "2000", "0"},
    };

    private String tipoUsuario;
    private String numeroDocumento;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String edad;
    private String fechaIngreso;
    private String inicioSesion;
    private String correoElectronico;
    private int telefono;
    private double salario;
    private boolean anulado;

    public Usuario() {}

    public Usuario(String tipoUsuario, String numeroDocumento, String nombre, String primerApellido, String segundoApellido, String edad, String fechaIngreso, String inicioSesion, String correoElectronico, int telefono, double salario) {
        this.tipoUsuario = tipoUsuario;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
        this.inicioSesion = inicioSesion;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.salario = salario;
        this.anulado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean salirSistema() {
        return true;
    }
    @Override
    public void crearPedido() {
        // Aqui se crea una nueva instancia de objeto a partir de la clase Pedido
        System.out.println("Pedido creadooooooo FYI");
    }
    @Override
    public void editarPedido() {
    }
    @Override
    public void consultarMenu() {
    }

    @Override
    public void ejecutarAccion(int accionId) {
        switch (accionId) {
            case 1:
                this.crearPedido();
                break;
        }
    }
}
