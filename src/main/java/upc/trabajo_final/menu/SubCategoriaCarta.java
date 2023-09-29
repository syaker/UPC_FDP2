package upc.trabajo_final.menu;

import java.util.ArrayList;
import java.util.List;

public class SubCategoriaCarta {
    private String nombre;
    private List<MenuPadre> menuPadres;

    public SubCategoriaCarta(String nombre) {
        this.nombre = nombre;
        this.menuPadres = new ArrayList<>();
    }

    public void agregarMenu(MenuPadre menuPadre) {
        menuPadres.add(menuPadre);
    }

    public void mostrarMenu() {
        System.out.println("Subcategoría: " + nombre);
        for (MenuPadre menuPadre : menuPadres) {
            System.out.println("-------------");
            System.out.println(menuPadre);
        }
    }
}
