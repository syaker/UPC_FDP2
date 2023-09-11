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
        System.out.println("3. Mozo");
        System.out.println("4. Administrador");
        System.out.println("5. Cajero");
    }

    static void opcionesMozo() {
        System.out.println("--------------------\n  Escoger opcion \n--------------------");
        System.out.println("6. Registrar y cobrar pedido");
        System.out.println("7. Cobrar pedido mesa");
        System.out.println("8. Consultar carta bebidas");
        System.out.println("9. Consultar carta comidas");
        System.out.println("10. Consultar monto de venta total por cajero");
        System.out.println("11. Crear clientes");
        System.out.println("-1. Salir");
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
