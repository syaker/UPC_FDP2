package upc.trabajo_final.pedido;

import java.util.Scanner;

public class CobrarCuentaPasos {

    public void pedirMesa() {
        String metodoElegido;

        System.out.println("¿Desea cobrar un pedido en Mesa o a un Cliente?");
        System.out.println("Mesa = 1");
        System.out.println("Cliente = 2");
        Scanner sc = new Scanner(System.in);
        metodoElegido = sc.nextLine();
        System.out.println("Ingresaste: " + metodoElegido);
    }

    // Aqui hacemos validaciones segun el tipo de usuario
    //1. Pedir nombre de la mesa/cliente y mostrar pedido.


    //2. Preguntar que metodo de pago quiere usar. [Hay efectivo, tarjeta, Yape y Plin]
    public static void pedirMetodo() {
        System.out.println("¿Qué método de pago desea usar?");
        Scanner sc = new Scanner(System.in);
        String metodoElegido = sc.nextLine();
    }


    //3. Efectivo - Preguntar con cuanto paga y regresar el vuelto
    //4. Preguntar si el pago fué realizado con éxito
    //5. Pago exitoso pulsa "s" para salir.
}
