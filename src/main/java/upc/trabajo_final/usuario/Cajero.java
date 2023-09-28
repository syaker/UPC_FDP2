
package upc.trabajo_final.usuario;


import upc.trabajo_final.pedido.Pedido;
import upc.trabajo_final.pedido.PedidosDB;
import upc.trabajo_final.usuario.Usuario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Cajero extends Usuario {
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

    public void consultarMontoVentaTotal() {

        /*Para que el método consultarMontoVentaTotal() de la clase Cajero funcione correctamente, necesitas tener acceso a dos listas
        : la lista de pedidos (listPedidos) y la lista de cajeros (listCajeros). Con sus respectivos Getters.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su contraseña (DNI): ");
        String contraseña = scanner.nextLine();
        // Crear la dniLista para almacenar los DNI
        List<String> dniLista = new ArrayList<>();
        //Agregando la lista de Cajeros:
        UsuarioDB objetoMain1 = new UsuarioDB();
        List<Usuario> listUsuarios = objetoMain1.getUsuarios();

        /*En donde esta subrayado Main, va la clase donde esta la lista de cajeros y pedidos,*/
        //Creo una lista de cajeros que extragia solo los cajeros de la lista de usuarios
        List<Usuario> listaCajeros = new ArrayList<>();
        for (Usuario usuarios : listUsuarios) {
            if ("cajero".equalsIgnoreCase(getTipoUsuario())) {
                // Si la persona es un Cajero, la agregamos a la lista de futbolistas
                listaCajeros.add(usuarios);
            }
        }

        List<Usuario> listaCajero = new ArrayList<>(listaCajeros);
        /*Cuando se cree la lista de Cajeros y su get, dejara de votar error*/

        for (Usuario datosCajeros : listaCajero) {
            //la listaDatosCajeros será la lista que crearemos para añadir a los cajeros y sus datos
            dniLista.add(datosCajeros.getNumeroDocumento());
        }
        if (dniLista.contains(contraseña)) {
            //Agregando la lista de pedidos
            PedidosDB objetoMain = new PedidosDB();
            List<Pedido> listaPedido = objetoMain.getListPedidos();
            /*Cuando se cree la lista de Pedidos y su get, dejara de votar error*/

            // Crear un mapa para almacenar los montos totales agrupados por fecha
            Map<String, Double> montosPorFecha = new HashMap<>();

            for (Pedido pedido : listaPedido) {
                String fechaPedido = pedido.getFechaPedido();
                double montoTotal = pedido.getMontoTotal();

                // Si la fecha ya existe en el mapa, suma el monto total al valor existente
                if (montosPorFecha.containsKey(fechaPedido)) {
                    double montoExistente = montosPorFecha.get(fechaPedido);
                    montosPorFecha.put(fechaPedido, montoExistente + montoTotal);
                } else {
                    montosPorFecha.put(fechaPedido, montoTotal);
                }
            }

            // Convertir el mapa en una lista de entradas para ordenar por fecha
            List<Map.Entry<String, Double>> listaMontosPorFecha = new ArrayList<>(montosPorFecha.entrySet());

            // Ordenar la lista por fecha en orden cronológico
            Collections.sort(listaMontosPorFecha, new Comparator<Map.Entry<String, Double>>() {
                @Override
                public int compare(Map.Entry<String, Double> entry1, Map.Entry<String, Double> entry2) {
                    try {
                        Date fecha1 = new SimpleDateFormat("dd/MM/yyyy").parse(entry1.getKey());
                        Date fecha2 = new SimpleDateFormat("dd/MM/yyyy").parse(entry2.getKey());
                        return fecha1.compareTo(fecha2);
                    } catch (ParseException e) {
                        e.printStackTrace();
                        return 0; // Manejo de error
                    }
                }
            });

            // Imprimir los montos totales agrupados por fecha en orden cronológico
            for(Map.Entry<String, Double> entry : listaMontosPorFecha) {
                    System.out.println("Fecha: " + entry.getKey() + ", Monto Total: " + entry.getValue());
                }

        } else {
                System.out.println("Contraseña incorrecta. No tiene acceso.");
            }
    }
}

