package upc.trabajo_final;


import java.util.Date;

public class Producto {

    //Atributos
    private String codigo;
    private String nombre;
    private String descripcion;
    private SeccionCarta seccionCarta; //Instancia de categoría
    private double precio;
    private Date fechaCreacion;




    //Constructor
    public Producto(String codigo, String nombre, String descripcion, SeccionCarta seccionCarta, double precio, Date fechaCreacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.seccionCarta = seccionCarta;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
    }

    //Getter
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public SeccionCarta getSeccionCarta() {
        return seccionCarta;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }


    //Métodos



    //Sobrescribir para retornar datos
    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", seccionCarta=" + seccionCarta +
                ", precio=" + precio +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}


