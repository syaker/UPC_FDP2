package upc.trabajo_final.menu;

import upc.trabajo_final.menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class SubCategoriaCarta {
    private String nombre;
    private List<Menu> menus;

    public SubCategoriaCarta(String nombre) {
        this.nombre = nombre;
        this.menus = new ArrayList<>();
    }

    public void agregarMenu(Menu menu) {
        menus.add(menu);
    }

    public void mostrarMenu() {
        System.out.println("Subcategoría: " + nombre);
        for (Menu menu : menus) {
            System.out.println("-------------");
            System.out.println(menu);
        }
    }
}
