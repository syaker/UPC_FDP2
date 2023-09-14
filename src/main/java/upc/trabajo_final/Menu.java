package upc.trabajo_final;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu {

    //Atributos
    private String nombre;
    private double precio;
    private Date fechaCreacion;
    private String descripcion;
    private String codigo;
    private String ingredientes;


    //Constructor
    public Menu(String nombre, double precio, Date fechaCreacion, String descripcion, String codigo, String ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.ingredientes = ingredientes;
    }

    //Getter & Setter
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getPrecio() {

        return  "S/." + String.format("%.2f",precio);//2 decimales
    }

    public void setPrecio(double precio) {

        this.precio = precio;
    }

    public Date getFechaCreacion() {

        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {

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

    public String getIngredientes() {

        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {

        this.ingredientes = ingredientes;
    }
}
