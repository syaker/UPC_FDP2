package upc.trabajo_final;

public class Bebida extends Menu {
    private String cantidad;

    public Bebida(String nombre, String precio, String fechaCreacion, String descripcion, String coodigo, String[] ingredientes, String cantidad) {
        super(nombre, precio, fechaCreacion, descripcion, coodigo, ingredientes);
        this.cantidad = cantidad;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
