package upc.trabajo_final.interfaz_sistema;

import java.util.ArrayList;

public class MenuSistema {
    private ArrayList<ElementoMenu> elementos;

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

    public void encontrarYEjecutarAccionPorId(int idABuscar) {
        for (int i=0; i < this.elementos.size(); i++) {
            ElementoMenu opcion = this.elementos.get(i);

            if (opcion.getIdElementoMenu() == idABuscar) {
                opcion.ejecutarAccion(idABuscar);
            }
        }
    }
}
