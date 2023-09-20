package upc.trabajo_final;
import java.util.ArrayList;
import java.util.Scanner;

public class InterfazSistema implements IInterfazSistema {
    private int opcionSeleccionada = 0;
    private MenuSistema menuActual = null;
    private MenuSistema menuIdioma;

    public InterfazSistema() {
        // Creando todos los menues con los submenues asociados

        // 1. Menu tipo de usuario

            ArrayList<ElementoMenu> elementosMenuTipoUsuario = new ArrayList<ElementoMenu>();
            elementosMenuTipoUsuario.add(new ElementoMenu(1, "Mozo", null));
            elementosMenuTipoUsuario.add(new ElementoMenu(2, "Administrador", null));
            elementosMenuTipoUsuario.add(new ElementoMenu(3, "Cajero", null));

            MenuSistema menuTipoUsuario = new MenuSistema(elementosMenuTipoUsuario);

        // 2. Menu idioma

            // Creando el menu idioma y asignandole el menu sistema tipo de usuario
            ArrayList<ElementoMenu> elementosMenuIdioma = new ArrayList<ElementoMenu>();
            elementosMenuIdioma.add(new ElementoMenu(1, "Espanol", menuTipoUsuario));
            elementosMenuIdioma.add(new ElementoMenu(2, "Ingles", menuTipoUsuario));

            this.menuIdioma = new MenuSistema(elementosMenuIdioma);
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
                // Ejecutar accion del menu
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

    @Override
    public boolean ingresarAlSistema() {
        return true;
    }
}
