package upc.trabajo_final.menu;

import upc.trabajo_final.menu.SubCategoriaCarta;

import java.util.ArrayList;
import java.util.List;

public class CategoriaCarta {
    public String nombre;
    private List<SubCategoriaCarta> subCategorias;

    public CategoriaCarta(String nombre) {
        this.nombre = nombre;
        this.subCategorias = new ArrayList<>();
    }

    public void agregarSubCategoria(SubCategoriaCarta subCategoriaCarta) {
        subCategorias.add(subCategoriaCarta);
    }

    public void mostrarCarta() {
        System.out.println("Categoría: " + nombre);
        for (SubCategoriaCarta subCategoria : subCategorias) {
            System.out.println("-------------");
            subCategoria.mostrarMenu();
        }
    }
}
