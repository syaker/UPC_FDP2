package upc.trabajo_final.interfaz_sistema;

import java.util.ArrayList;

public class Menu {
    private ArrayList<ElementoMenu> elementos;
    private String cabecera;

    public Menu (ArrayList<ElementoMenu> elementos, String cabecera) {
        this.elementos = elementos;
        this.cabecera = cabecera;
    }

    public void imprimirMenu() {
        System.out.println("-------------------------------\n" + this.cabecera + "\n" + "-------------------------------\n");
        for (int i=0; i < elementos.size(); i++) {
            ElementoMenu menu = elementos.get(i);
            System.out.println(menu.getIdElementoMenu() + ". " + menu.getTextoElementoMenu() + "");
        }
    }

    public Menu encontrarMenuPorId (int idABuscar) {
        Menu menuEncontrado = null;
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
