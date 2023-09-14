package upc.trabajo_final;

public class Menu {
    private String nombre;
    private String precio;
    private String fechaCreacion;
    private String descripcion;
    private String codigo;
    private String[] ingredientes;

    public Menu(String nombre, String precio, String fechaCreacion, String descripcion, String codigo, String[] ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCoodigo() {
        return codigo;
    }

    public void setCoodigo(String coodigo) {
        this.codigo = coodigo;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
}