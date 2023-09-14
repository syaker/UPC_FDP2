package upc.trabajo_final;

import java.util.Scanner;


public class Cajero extends Usuario implements ICajero {
    public Cajero(String tipoUsuario, String numeroDocumento, String nombre, String primerApellido, String segundoApellido, String edad, String fechaIngreso, String inicioSesion, String correoElectronico, int telefono, double salario) {
        super(tipoUsuario, numeroDocumento, nombre, primerApellido, segundoApellido, edad, fechaIngreso, inicioSesion, correoElectronico, telefono, salario);
    }

    @Override
    public void cobrarCuenta() {
        // Aqui hacemos validaciones segun el tipo de usuario
        //1. Pedir nombre de la mesa/cliente y mostrar pedido.


        //2. Preguntar que metodo de pago quiere usar. [Hay efectivo, tarjeta, Yape y Plin]

        public void elegirMetodo(){
            //Atributos
            static class metodoPago(){
                System.out.println("¿Qué método de pago desea usar?");
                Scanner sc = new Scanner(System.in);
                metodoPago = sc.nextLine();

            }*//*




        }

        //3. Efectivo - Preguntar con cuanto paga y regresar el vuelto
        //4. Preguntar si el pago fué realizado con éxito
        //5. Pago exitoso pulsa "s" para salir.
    }

    @Override
    public void editarCuenta() {

        // Aqui hacemos validaciones segun el tipo de usuario

    }

    @Override
    public void crearCliente() {

    }

    @Override
    public void listarCliente() {

    }

    @Override
    public void listarClientes() {

    }

    @Override
    public void cambiarEstadoDelPedido() {

    }

}

