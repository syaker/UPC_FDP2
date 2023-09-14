package upc.trabajo_final;


import com.sun.tools.javac.Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


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


    // ARREGLAR ESTA PARTE DEL CODIGO Y MOVERLO QUIZA A USUARIO
    @Override
    public void consultarMontoVentaTotal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su contraseña (DNI): ");
        String contraseña = scanner.nextLine();
        // Crear la dniLista para almacenar los DNI
        List<String> dniLista = new ArrayList<>();
        //Agregando la lista de Cajeros:
        Main objetoMain = new Main();
        List<Cajero> listaCajero = objetoMain.getListCajeros();

        for (Cajero datosCajeros : listaCajero) {
            //la listaDatosCajeros será la lista que crearemos para añadir a los cajeros y sus datos
            dniLista.add(datosCajeros.getNumeroDocumento());
        }

        if (dniLista.contains(contraseña)) {
            //Agregando la lista de pedidos
            List<Pedido> listaPedido = objetoMain.getListPedidos();

            // Crear la lista para almacenar los pedidos ordenados cronológicamente
            List<Pedido> pedidosOrdenados = new ArrayList<>(listaPedido);

            // Ordenar los pedidos por fecha en orden ascendente (cronológico)
            Collections.sort(pedidosOrdenados, new Comparator<Pedido>() {
                public int compare(Pedido pedido1, Pedido pedido2) {
                    // Parsear las fechas y compararlas
                    try {
                        Date fecha1 = new SimpleDateFormat("yyyy-MM-dd").parse(pedido1.getFechaPedido());
                        Date fecha2 = new SimpleDateFormat("yyyy-MM-dd").parse(pedido2.getFechaPedido());
                        return fecha1.compareTo(fecha2);
                    } catch (ParseException e) {
                        e.printStackTrace();
                        return 0; // Manejo de error
                    }
                }
            });

            // Imprimir los pedidos ordenados por fecha
            for (Pedido pedido : pedidosOrdenados) {
                System.out.println("Fecha: " + pedido.getFechaPedido() + ", Monto Total: " + pedido.getMontoTotal());
            }
        } else {
            System.out.println("Contraseña incorrecta. No tiene acceso.");
        }
    }

}

