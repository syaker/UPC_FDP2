package upc.trabajo_final.interfaz_sistema;
import upc.trabajo_final.usuario.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfazSistema {
    private int opcionSeleccionada = 0;
    private MenuSistema menuActual = null;
    private MenuSistema menuIdioma;

    public InterfazSistema() {
        // Creando todos los menues con los submenues asociados
            this.menuIdioma = new MenuEstatico().getMenuIdioma();
    }

    public static void main(String[] args) {
        InterfazSistema in = new InterfazSistema();
        in.iniciarSistema();
    }

    public void iniciarSistema() {
        Scanner sc = new Scanner(System.in);
        do {
            this.mostrarMenu(this.menuActual);
            this.opcionSeleccionada = sc.nextInt();
            MenuSistema menuEncontrado = this.menuActual.encontrarMenuPorId(this.opcionSeleccionada);
            if (menuEncontrado == null) {
                this.menuActual.encontrarYEjecutarAccionPorId(this.opcionSeleccionada);
            } else {
                this.menuActual = menuEncontrado;
            }
        } while (this.opcionSeleccionada != -1);
    }

    public void mostrarMenu(MenuSistema menu) {
        if (menu == null) {
            this.menuActual = menuIdioma;
        }
        menuActual.imprimirMenu();
    }
}
