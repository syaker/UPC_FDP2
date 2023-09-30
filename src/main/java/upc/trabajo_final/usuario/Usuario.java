package upc.trabajo_final.usuario;

import upc.trabajo_final.interfaz_sistema.IAccionMenu;
import upc.trabajo_final.menu.MenuManager;
import upc.trabajo_final.menu.CategoriaCarta;
import upc.trabajo_final.pedido.Pedido;
import upc.trabajo_final.pedido.PedidosDB;

import java.util.ArrayList;
import java.util.Scanner;

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

    public String getTipoUsuario() { return tipoUsuario; }


    public String getNumeroDocumento() { return numeroDocumento; }

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
    public void crearPedido() {
        ArrayList<Pedido> totalPedidos = new PedidosDB().getListPedidos();

        String codigoPedido;
        String[] idsProductoRelacionado;
        double montoTotal;
        String fechaPedido;
        String codigoCliente;

        Scanner scPedido = new Scanner(System.in);

        System.out.println("Ingresa el codigo del pedido:");
        codigoPedido = scPedido.nextLine();
        System.out.println("Ingresa el id del producto relacionado:");
        idsProductoRelacionado = new String[]{scPedido.nextLine()};
        System.out.println("Ingresa el monto total:");
        montoTotal = scPedido.nextInt();
        System.out.println("Ingresa el fecha del pedido en formato (dd/MM/yyyy):");
        fechaPedido = scPedido.nextLine();
        System.out.println("Ingresa el codigo del cliente:");
        codigoCliente = scPedido.nextLine();

        totalPedidos.add(new Pedido(codigoPedido, idsProductoRelacionado, montoTotal, fechaPedido, "", codigoCliente, false, false));

        Pedido pedidoCreado = this.obtenerPedidoPorCodigo(totalPedidos, codigoPedido);

        System.out.println("\nEl pedido ha sido creado!!!!!");

        System.out.println("\nLos datos del pedido son los siguientes:");

        System.out.println("Codigo del pedido: " + pedidoCreado.getCodigoPedido() + "\nMonto Total: " + pedidoCreado.getMontoTotal());
    }

    public Pedido obtenerPedidoPorCodigo (ArrayList<Pedido> pedidos, String codigoPedido) {
        Pedido pedido = null;
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getCodigoPedido() == codigoPedido) {
                pedido = pedidos.get(i);
            }
        }
        return pedido;
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
