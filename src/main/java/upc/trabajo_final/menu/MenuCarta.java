package upc.trabajo_final.menu;

import java.util.ArrayList;
import java.util.List;

public class MenuCarta {
    private List<CategoriaCarta> categorias;

    public MenuCarta() {
        this.categorias = new ArrayList<>();
    }

    public void agregarCategoria(CategoriaCarta categoriaCarta) {
        categorias.add(categoriaCarta);
    }

    public CategoriaCarta getCategoriaPorNombre(String nombre) {
        for (CategoriaCarta categoria : categorias) {
            if (categoria.nombre.equals(nombre)) {
                return categoria;
            }
        }
        return null;
    }

    public void mostrarCarta() {
        for (CategoriaCarta categoria : categorias) {
            categoria.mostrarCarta();
        }
    }
}
