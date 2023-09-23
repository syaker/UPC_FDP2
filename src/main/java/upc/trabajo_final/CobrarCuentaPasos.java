package upc.trabajo_final;

import java.util.Scanner;

public class CobrarCuentaPasos {
    private CartaGeneral cartaGeneral;
    String elegirPedido;
    String pedidoElegido;
    String pedidoMesa;
    String pedidoCliente;

    // Aqui hacemos validaciones segun el tipo de usuario
    //1. Pedir nombre de la mesa/cliente y mostrar pedido.

   /* public void seleccionarPedido() {

        System.out.println("¿Desea cobrar un pedido por Mesa o por Cliente?");
        System.out.println("Mesa = 1");
        System.out.println("Cliente = 2");
        System.out.println("Salir = 0");
        Scanner sc = new Scanner(System.in);
        elegirPedido = sc.nextLine();
        switch(elegirPedido){
            case 1:
                System.out.println("Ingresa el número de la mesa: ");
                Scanner sc = new Scanner(System.in);
                pedidoMesa = sc.nextLine();
                buscarPedidoMesa();

                break;
            case 2:
                buscarPedidoCliete();
                break;
            case 0:
                break;
            default:
                System.out.println("Ingresaste un valor invalido");
        }
        System.out.println("Seleccionaste el pedido: " + elegirPedido.toString());
    }
*/
   /* public void buscarPedidoMesa(){
        if(pedidoMesa.equals(cartaGeneral.getListaMenus())){
            pedidoElegido =
        }
    }*/

  /*  public void buscarPedidoCliete(){
        for(cartaGeneral.getListaMenus().equals(elegirPedido)){

        }
    }*/


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
