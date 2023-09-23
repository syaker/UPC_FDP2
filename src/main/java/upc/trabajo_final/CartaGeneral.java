package upc.trabajo_final;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CartaGeneral {
    //Atributos generales
    private List<Producto> listaProductos;
    int eleccionNumero;




    //Constructor
    public CartaGeneral() {
        this.listaProductos = new ArrayList<>();
    }

    //Getter
    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void registrarProducto(String codigo, String nombre, String descripcion, SeccionCarta seccionCarta, double precio, Date fechaCreacion) {
        Producto producto = new Producto (codigo, nombre, descripcion, seccionCarta,precio, fechaCreacion);
        listaProductos.add(producto);
    }





           /* for (Producto producto : listaProductos) {
            String[] seccionesCartaGeneral = {"Desayunos","Entradas","Sanguches","Fondos","Cafés","Especiales","Cócteles Clásicos","Jugos y Frios","Cócteles de Autor","Vinos"};
            if (producto.getSeccionCarta().getNombreCarta().equals(seccionesCartaGeneral[contador])){
                System.out.println("------------------------------------------------------");
                System.out.println("            " + producto.getSeccionCarta().getNombreCarta() + " - " + producto.getSeccionCarta().getHorario());
                System.out.println("------------------------------------------------------\n");

                int i = 0;
                for (Producto food: listaProductos) {
                    if (producto.getSeccionCarta().getNombreCarta().equals(seccionesCartaGeneral[contador])) {
                        i++;
                        System.out.println(i + ". Código: " + food.getCodigo() + " Plato: " + food.getNombre() + ". Descripción: " + food.getDescripcion() + " Precio: " + food.getPrecio() + "\n");
                    }
                }
                contador++;
            }
        }*/





    //Métodos
    /*//Método para definir si es un producto solicitado por su código de producto
    public boolean productoSolicitado(String coodigo) {
        for(SeccionCarta seccionCarta : listaMenus) {
            for(Producto food: seccionCarta.getPlatos()) {
                if(food.getCoodigo().equals(coodigo)){
                    return true;
                }
            }
            return false;
        }*/


}
