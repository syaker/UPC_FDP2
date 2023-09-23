package upc.trabajo_final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    //Atributos
    private String codigoPedido;
    private double montoTotal;
    private String fechaPedido;
    private String horaPedido;
    private String codigoCliente;
    private boolean cobrado;
    private boolean anulado;
    private List<Producto> listaProductosPedido;
    private int contadorPedido;//Para método generarCodigo




    //Constructor
    public Pedido(String codigoPedido, double montoTotal, String fechaPedido, String horaPedido, String codigoCliente, boolean cobrado, boolean anulado) {
        this.codigoPedido = codigoPedido;
        this.montoTotal = montoTotal;
        this.fechaPedido = fechaPedido;
        this.horaPedido = horaPedido;
        this.codigoCliente = codigoCliente;
        this.cobrado = cobrado;
        this.anulado = anulado;
    }


    //Getter y Setters
    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {

        this.montoTotal = montoTotal;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(String horaPedido) {
        this.horaPedido = horaPedido;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public boolean isCobrado() {
        return cobrado;
    }

    public void setCobrado(boolean cobrado) {
        this.cobrado = cobrado;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }



    //Métodos

    //0. Generar código de pedido
    public String generarCodigoPedido(){
        String codigo = "COD-" + contadorPedido;
        contadorPedido++;//Incrementa el contador
        return codigoPedido;
    }


    //1. Método para registrar pedido con código generado
    public static List<String> solicitarPedido(){
        Scanner scanner = new Scanner(System.in);
        List<String> codigosProductosPedidos = new ArrayList<>();
        String codigoProductoSolicitado;


        System.out.println("Bienvenid@, solicita tus productos teniendo en cuenta los siguientes puntos:\n*Si quieres registrarlo 2 o más veces ingresa el mismo código esa cantidad de veces*\n*No dejes espacios al ingresar un codigo. Ejm: 'SG03'*\n*Pulsa '0' cu ando hayas terminado de ingresar todos los codigos del pedido*\n");


        do {
            codigoProductoSolicitado = scanner.nextLine();

            if(!codigoProductoSolicitado.equals("0")){
                System.out.println("Agregaste: '"  + codigoProductoSolicitado + "' a tu pedido");
                System.out.println("Ingresa el código del producto que quieras registrar : \nPulsa 0 para concluir tu solicitud");
                codigosProductosPedidos.add(codigoProductoSolicitado);
            }
        } while (!codigoProductoSolicitado.equals("0"));

        if (codigosProductosPedidos.size() > 0) {
            System.out.println("Lista de codigos");
            System.out.println("Los codigos agregados fueron: ");
            for(String codigo : codigosProductosPedidos){
                System.out.println("Código: " + codigo);
            }
        } else{
            System.out.println("No se agregaron códigos.");
        }
        return codigosProductosPedidos;
    }


/*    public static List<String> solicitarPedido(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenid@, solicita tus productos teniendo en cuenta los siguientes puntos:\n*Si quieres registrarlo 2 o más veces ingresa el mismo codigo esa cantidad de veces*\n*No dejes espacios al ingresar un codigo. Ejm: 'SG03'*\n*Pulsa '0' cu  ando hayas terminado de ingresar todos los codigos del pedido*\n");
        List<String> codigosProductosPedidos = new ArrayList<>();
        String codigoProductoSolicitado;
        do {
            System.out.println("Ingresa el código del producto que quieras registrar :");
            codigoProductoSolicitado = scanner.nextLine();
            if(!codigoProductoSolicitado.equals("0")){
                codigosProductosPedidos.add(codigoProductoSolicitado);
                System.out.println("Agregaste: '"  + codigoProductoSolicitado + "' a tu pedido");
            } else {
                System.out.println("Lista de codigos");
                System.out.println("Los codigos agregados fueron: ");
                for(String codigo : codigosProductosPedidos){
                    System.out.println("Código: " + codigo);
                }
            }
        } while(!codigoProductoSolicitado.equals("0"));
        return codigosProductosPedidos;
    }*/



    //2. Comparar códigos/ Contara repetidos y convertirlos en una lista de productos
    public static List<Producto> listaProductosSolicitados(){
        CartaGeneral cartaGeneral = new CartaGeneral();
        List<Producto> listaProductosSolicitadoCodigo = new ArrayList<>();
        List<String> productosSolicitados = solicitarPedido();

        for (String codigoSolicitado : productosSolicitados){
            for (Producto producto : cartaGeneral.getListaProductos()){
                if (producto.getCodigo().equals(codigoSolicitado)){
                    listaProductosSolicitadoCodigo.add(producto);
                }
            }
        }
        return listaProductosSolicitadoCodigo;
    }

    //2.1. Indicar Mesa

    //2.2. Indicar Cliente

    //3.  Agregar código de pedido

    //4. Solicitar usuario y contraseña

    //5. Agregar usuario al pedido y agregarlo a la lista de pedidos



     public static Producto buscarProductoSolicitado(String codigo){
        CartaGeneral cartaGeneral = new CartaGeneral();
        for (Producto producto: cartaGeneral.getListaProductos()){
            if (producto.getCodigo().equals(codigo)){
                return producto;
            }
        }
        return null;
    }

    //Asignar producto a pedido


    //2. Buscar pedido por código y agregar a una lista
  /*  public List<SeccionCarta> productosSolicitados(String coodigo){
        List<SeccionCarta>  productoSolicitadoPedido = new ArrayList<>();
        for (SeccionCarta seccionCarta : listaProductosPedido){
            if (seccionCarta.)
        }
    }*/

    /*public boolean productoSolicitado(String coodigo) {
        for(MenuTipo menuTipo: listaMenus) {
            for(Producto food: menuTipo.getPlatos()) {
                if(food.getCoodigo().equals(coodigo)){
                    return true;
                }
            }
            return false;
        }*/



    //Método calcular monto total


}
