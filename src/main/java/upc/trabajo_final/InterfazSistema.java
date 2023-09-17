package upc.trabajo_final;
import java.util.Scanner;

public class InterfazSistema implements IInterfazSistema {

    public static void main(String[] args) {
        int opcionSeleccionada = 0;
        Scanner sc = new Scanner(System.in);

        do {
            mostrarMenu(opcionSeleccionada);
            opcionSeleccionada = sc.nextInt();
        } while (opcionSeleccionada != -1);
    }

    static void mostrarMenu(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 0:
                escogerLenguaje();
                break;

            case 1:
                escogerTipoDeUsuario();
                break;

            case 2:
                opcionesMozo();
                break;

            case 3:
                opcionesAdministrador();
                break;

            case 4:
                opcionesCajero();
                break;
        }
    }

    static void escogerLenguaje() {
        System.out.println("--------------------\n  Escoger lenguaje \n--------------------");
        System.out.println("1. Español");
        System.out.println("2. Inglés");
    }

    static void escogerTipoDeUsuario() {
        System.out.println("--------------------\n  Escoger tipo de usuario \n--------------------");
        System.out.println("2. Mozo");
        System.out.println("3. Administrador");
        System.out.println("4. Cajero");
    }

    static void opcionesMozo() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------\n  Escoger opcion \n--------------------");
            System.out.println("6. Registrar y cobrar pedido");
            System.out.println("7. Cobrar pedido mesa");
            System.out.println("8. Consultar carta bebidas");
            System.out.println("9. Consultar carta comidas");
            System.out.println("10. Consultar monto de venta total por cajero");
            System.out.println("11. Crear clientes");
            System.out.println("-1. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea

            MenuManager menuManager = new MenuManager();

            switch (opcion) {
                case 8:
                    // Consultar carta de bebidas
                    System.out.println("Menú de Bebidas:");
                    CategoriaCarta categoriaBebidas = menuManager.getMenuCarta().getCategoriaPorNombre("Bebidas");
                    if (categoriaBebidas != null) {
                        categoriaBebidas.mostrarCarta();
                    } else {
                        System.out.println("Categoría no encontrada.");
                    }
                    break;
                case 9:
                    // Consultar carta de comidas y preguntar por alergias
                    System.out.println("Menú de Comidas:");
                    CategoriaCarta categoriaComidas = menuManager.getMenuCarta().getCategoriaPorNombre("Comidas");
                    if (categoriaComidas != null) {
                        categoriaComidas.mostrarCarta();
                    } else {
                        System.out.println("Categoría no encontrada.");
                    }

                    // Preguntar por alergias
                    System.out.println("----------------------------------------------");
                    System.out.println("\n¿Tiene alguna alergia con respecto de los ingredientes usados en su comida? (Sí/No)");
                    String respuesta = scanner.nextLine().trim().toLowerCase();
                    if (respuesta.equals("sí") || respuesta.equals("si")) {
                        System.out.println("\nPor favor, indique sus alergias con respecto a los ingredientes encontrados en el menú:");
                        String alergias = scanner.nextLine();
                        System.out.println("\nAlergias registradas: " + alergias);
                        System.out.println("\nGracias por confiar en nosotros, ahora solo le mostraremos solo los platos que no lleven ese ingrediente");
                    }
                    break;
                case -1:
                    // Salir del menú del mozo
                    return;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println("Presiona Enter para continuar...");
            scanner.nextLine();
        }
    }

    static void opcionesAdministrador() {
        System.out.println("--------------------\n  Escoger opcion \n--------------------");
        System.out.println("13. Consultar total de pedidos");
        System.out.println("14. Consultar total de ventas del dia");
        System.out.println("15. Consultar ranking de clientes frecuentes");
        System.out.println("16. Consultar lista general de pedidos");
        System.out.println("17. Editar pedidos");
        System.out.println("18. Agregar productos al menu");
        System.out.println("-1. Salir");
    }

    static void opcionesCajero() {
        System.out.println("--------------------\n  Escoger opcion \n--------------------");
    }

    @Override
    public boolean ingresarAlSistema() {
        return true;
    }
}
