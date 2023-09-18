package upc.trabajo_final;

import java.util.ArrayList;
import java.util.List;

public class MenuManager {
    private MenuCarta menuCarta;

    public MenuManager() {
        this.menuCarta = new MenuCarta();
        //Estos son las categorias Bebidas y Comidas
        CategoriaCarta categoriaComidas = new CategoriaCarta("Comidas");
        CategoriaCarta categoriaBebidas = new CategoriaCarta("Bebidas");

        //Por cada Categoria de Comidas o Bebidas, se crea una subCategoria especificando que tipo de plato es
        SubCategoriaCarta subcategoriaPlatosPrincipales = new SubCategoriaCarta("Platos Principales");
        subcategoriaPlatosPrincipales.agregarMenu(new Comida("001", "Espagueti", "Delicioso espagueti con salsa de tomate", 12.99));
        subcategoriaPlatosPrincipales.agregarMenu(new Comida("002", "Lasagna", "Lasagna casera con queso y carne", 15.99));

        SubCategoriaCarta subcategoriaEntradas = new SubCategoriaCarta("Entradas");
        subcategoriaEntradas.agregarMenu(new Comida("003", "Ensalada César", "Ensalada fresca con aderezo César", 8.99));

        SubCategoriaCarta subcategoriaBebidas = new SubCategoriaCarta("Aguas frias");
        subcategoriaBebidas.agregarMenu(new Bebida("101", "Refresco", "Refresco de cola", 2.99));
        subcategoriaBebidas.agregarMenu(new Bebida("102", "Agua mineral", "Agua mineral sin gas", 1.99));

        categoriaComidas.agregarSubCategoria(subcategoriaPlatosPrincipales);
        categoriaComidas.agregarSubCategoria(subcategoriaEntradas);

        categoriaBebidas.agregarSubCategoria(subcategoriaBebidas);

        menuCarta.agregarCategoria(categoriaComidas);
        menuCarta.agregarCategoria(categoriaBebidas);
    }

    public MenuCarta getMenuCarta() {
        return menuCarta;
    }
}
