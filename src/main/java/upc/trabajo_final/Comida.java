package upc.trabajo_final;

public class Comida extends Menu {
    private String paraCompartir;

    public Comida(String nombre, String precio, String fechaCreacion, String descripcion, String coodigo, String[] ingredientes, String paraCompartir) {
        super(nombre, precio, fechaCreacion, descripcion, coodigo, ingredientes);
        this.paraCompartir = paraCompartir;
    }

    public String getParaCompartir() {
        return paraCompartir;
    }

    public void setParaCompartir(String paraCompartir) {
        this.paraCompartir = paraCompartir;
    }
}
