
package upc.trabajo_final;


import com.sun.tools.javac.Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



public class Cajero extends Usuario{
    //Atributos
    private int numeroCaja;


    public int getNumeroCaja() {
        return numeroCaja;
    }

    public Cajero(String tipoUsuario, String numeroDocumento, String nombre, String primerApellido, String segundoApellido, String edad, String fechaIngreso, String inicioSesion, String correoElectronico, int telefono, double salario, int numeroCaja) {
            super(tipoUsuario, numeroDocumento, nombre, primerApellido, segundoApellido, edad, fechaIngreso, inicioSesion, correoElectronico, telefono, salario);
            this.numeroCaja = numeroCaja;

    }






        /*public static class CobrarCuenta {
            CobrarCuentaPasos cobrarCuentaPasos = new CobrarCuentaPasos();
            cobrarCuentaPasos.pedirMesa();
        }*/



        public void editarCuenta() {

            // Aqui hacemos validaciones segun el tipo de usuario

        }


        public void crearCliente() {

        }


        public void listarCliente() {

        }


        public void listarClientes() {

        }


        public void cambiarEstadoDelPedido() {

        }


        // ARREGLAR ESTA PARTE DEL CODIGO Y MOVERLO QUIZA A USUARIO
        /*@Override
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
        }*/

}

