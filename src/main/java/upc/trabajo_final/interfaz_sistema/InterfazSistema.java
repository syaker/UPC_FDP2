package upc.trabajo_final.interfaz_sistema;
import upc.trabajo_final.usuario.Administrador;
import upc.trabajo_final.usuario.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfazSistema {
    private int opcionSeleccionada = 0;
    private Menu menuActual = null;
    private Menu menuIdioma;

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
        String contrasena;
        System.out.print("Ingrese su contraseña (DNI): ");
        contrasena = sc.nextLine();

        if (contrasena.length() > 0) {
            do {
                this.mostrarMenu(this.menuActual);
                this.opcionSeleccionada = sc.nextInt();
                Menu menuEncontrado = this.menuActual.encontrarMenuPorId(this.opcionSeleccionada);
                if (opcionSeleccionada == -1) {
                    System.out.println("   _____                _                                                                                                     _ _ \n" +
                            "  / ____|              (_)                                                                                                   | | |\n" +
                            " | |  __ _ __ __ _  ___ _  __ _ ___   _ __   ___  _ __   _   _ ___  __ _ _ __   _ __ ___   ___ _ __  _   _   _   _ _ __   ___| | |\n" +
                            " | | |_ | '__/ _` |/ __| |/ _` / __| | '_ \\ / _ \\| '__| | | | / __|/ _` | '__| | '_ ` _ \\ / _ \\ '_ \\| | | | | | | | '_ \\ / __| | |\n" +
                            " | |__| | | | (_| | (__| | (_| \\__ \\ | |_) | (_) | |    | |_| \\__ \\ (_| | |    | | | | | |  __/ | | | |_| | | |_| | |_) | (__|_|_|\n" +
                            "  \\_____|_|  \\__,_|\\___|_|\\__,_|___/ | .__/ \\___/|_|     \\__,_|___/\\__,_|_|    |_| |_| |_|\\___|_| |_|\\__,_|  \\__,_| .__/ \\___(_|_)\n" +
                            "                                     | |                                                                          | |             \n" +
                            "                                     |_|                                                                          |_|             \n" +
                            "\n");
                }
                if (menuEncontrado == null) {
                    this.menuActual.encontrarYEjecutarAccionPorId(this.opcionSeleccionada);
                } else {
                    this.menuActual = menuEncontrado;
                }
            } while (this.opcionSeleccionada != -1);
        }
    }

    public void mostrarMenu(Menu menu) {
        if (menu == null) {
            this.menuActual = menuIdioma;
        }
        menuActual.imprimirMenu();
    }
}
