package upc.trabajo_final.usuario;

import upc.trabajo_final.interfaz_sistema.IAccionMenu;
import upc.trabajo_final.menu.MenuManager;
import upc.trabajo_final.menu.CategoriaCarta;

public class Usuario implements IUsuario, IAccionMenu {

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

    public Usuario() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getInicioSesion() {
        return inicioSesion;
    }

    public void setInicioSesion(String inicioSesion) {
        this.inicioSesion = inicioSesion;
    }

    public String getTipoUsuario() { return tipoUsuario; }

    public void setTipoUsuario(String tipoUsuario) { this.tipoUsuario = tipoUsuario; }

    public String getNumeroDocumento() { return numeroDocumento; }

    public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento;}




    @Override
    public void consultarMenuBebidas() {
        MenuManager menuManager = new MenuManager();
        System.out.println("Menú de Bebidas:");
        CategoriaCarta categoriaBebidas = menuManager.getMenuCarta().getCategoriaPorNombre("Bebidas");
        if (categoriaBebidas != null) {
            categoriaBebidas.mostrarCarta();
        } else {
            System.out.println("Categoría de Bebidas no encontrada.");
        }
    }
    @Override
    public void consultarMenuComidas() {
        MenuManager menuManager = new MenuManager();
        System.out.println("Menú de Comidas:");
        CategoriaCarta categoriaComidas = menuManager.getMenuCarta().getCategoriaPorNombre("Comidas");
        if (categoriaComidas != null) {
            categoriaComidas.mostrarCarta();
        } else {
            System.out.println("Categoría de Comidas no encontrada.");
        }
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
            case 2:
                this.consultarMenuBebidas();
                System.out.println();
                break;
            case 3:
                this.consultarMenuComidas();
                System.out.println();
                break;
        }
    }
}
