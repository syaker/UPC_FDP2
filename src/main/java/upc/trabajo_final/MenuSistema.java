package upc.trabajo_final;

import java.awt.*;
import java.util.ArrayList;

public class MenuSistema {
    private ArrayList<ElementoMenu> elementos = new ArrayList<ElementoMenu>();

    public MenuSistema(ArrayList<ElementoMenu> elementos) {
        this.elementos = elementos;
    }

    public void imprimirMenu() {
        for (int i=0; i < elementos.size(); i++) {
            ElementoMenu menu = elementos.get(i);
            System.out.println(menu.getIdElementoMenu() + ". " + menu.getTextoElementoMenu() + "");
        }
    }

    public MenuSistema encontrarMenuPorId (int idABuscar) {
        MenuSistema menuEncontrado = null;
        for (int i=0; i < this.elementos.size(); i++) {
            ElementoMenu elementoMenu = this.elementos.get(i);

            if (elementoMenu.getIdElementoMenu() == idABuscar) {
                menuEncontrado = elementoMenu.getSubmenu();
            }
        }

        return menuEncontrado;
    }
}
