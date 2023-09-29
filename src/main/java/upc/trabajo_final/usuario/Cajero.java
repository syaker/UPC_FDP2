
package upc.trabajo_final.usuario;


import upc.trabajo_final.Cliente;
import upc.trabajo_final.interfaz_sistema.IAccionMenu;
import upc.trabajo_final.pedido.Pedido;
import upc.trabajo_final.pedido.PedidosDB;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Cajero extends Usuario implements IAccionMenu {
    //Atributos
    private int numeroCaja;

    private ClienteDB clienteDB;

    private Scanner scanner;

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public Cajero(String tipoUsuario, String numeroDocumento, String nombre, String primerApellido, String segundoApellido, String edad, String fechaIngreso, String inicioSesion, String correoElectronico, int telefono, double salario, int numeroCaja) {
        super(tipoUsuario, numeroDocumento, nombre, primerApellido, segundoApellido, edad, fechaIngreso, inicioSesion, correoElectronico, telefono, salario);
        this.numeroCaja = numeroCaja;
        this.clienteDB = new ClienteDB();
        this.scanner = new Scanner(System.in);

    }

    public Cajero() {
        super();
        this.clienteDB = new ClienteDB();
    }

        /*
        public static class CobrarCuenta {
                     CobrarCuentaPasos cobrarCuentaPasos = new CobrarCuentaPasos();
                     cobrarCuentaPasos.pedirMesa();
        }
        */


    public void cobrarCuenta() {

        // -------> editar el accionar del metodo en el word en caso se cambie la fucion <------
        //   Obtiene el pedido pendiente del usuario por DNI y muestra el monto a cobrar,
        //     demás espera un input para saldar la cuenta y muestra el vuelto en el caso de que hubiese una diferencia,
        //     caso contrario marca la cuenta como “pagado”.

    }

    public void editarCuenta() {

        // Aqui hacemos validaciones segun el tipo de usuario

    }


    public void crearCliente() {

        System.out.println("Ingrese el número de documento del cliente:");
        String numeroDocumento = scanner.nextLine();

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el primer apellido del cliente:");
        String primerApellido = scanner.nextLine();

        System.out.println("Ingrese el segundo apellido del cliente:");
        String segundoApellido = scanner.nextLine();

        System.out.println("Ingrese la edad del cliente:");
        String edad = scanner.nextLine();

        System.out.println("Ingrese la fecha de registro del cliente (en formato YYYY-MM-DD):");
        String fechaRegistro = scanner.nextLine();

        System.out.println("Ingrese el correo electrónico del cliente:");
        String correoElectronico = scanner.nextLine();

        System.out.println("Ingrese el número de teléfono del cliente:");
        String telefono = scanner.nextLine();

        System.out.println("Ingrese el numero de codigo del cliente");
        String codigoCliente = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(numeroDocumento, nombre, primerApellido, segundoApellido, edad, fechaRegistro, correoElectronico, telefono, codigoCliente);
        System.out.println("Cliente creado y agregado con éxito.");

    }


    public void listarClientesTotales() {

        List<Cliente> clientes = clienteDB.getListaClientes();

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados");
        } else {
            System.out.println("Datos de clientes registrados hasta la fecha: \n");
            for (Cliente cliente : clientes) {
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Primer Apellido: " + cliente.getPrimerApellido());
                System.out.println("Segundo Apellido: " + cliente.getSegundoApellido());
                System.out.println("Número de Documento (DNI): " + cliente.getNumeroDocumento());
                System.out.println("Fecha de Registro: " + cliente.getFechaRegistro());
                System.out.println("Correo Electrónico: " + cliente.getCorreoElectronico());
                System.out.println("Teléfono: " + cliente.getTelefono());
                System.out.println("Edad: " + cliente.getEdad() + "\n");

            }
        }
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
        //Cuando se cree la lista de Cajeros y su get, dejara de votar error/

        for (Usuario datosCajeros : listaCajero) {
            //la listaDatosCajeros será la lista que crearemos para añadir a los cajeros y sus datos
            dniLista.add(datosCajeros.getNumeroDocumento());
        }
        if (dniLista.contains(contraseña)) {
            //Agregando la lista de pedidos
           PedidosDB objetoMain = new PedidosDB();
            List<Pedido> listaPedido = objetoMain.getListPedidos();
            //Cuando se cree la lista de Pedidos y su get, dejara de votar error/

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


    @Override
    public void ejecutarAccion(int accionId) {

            switch (accionId){
                case 1:
                    this.cobrarCuenta();
                    break;
                case 2:
                    this.editarCuenta();
                    break;
                case 3:
                    this.crearCliente();
                    break;
                case 4:
                    this.listarClientesTotales();
                    break;
                case 5:
                    this.cambiarEstadoDelPedido();
                    break;
                case 6:
                    this.consultarMontoVentaTotal();
                    break;
                case 7:
                    break;
            }
    }



    // ARREGLAR ESTA PARTE DEL CODIGO Y MOVERLO QUIZA A USUARIO
        /*@Override
        public void consultarMontoVentaTotal() {
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

