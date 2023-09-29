package upc.trabajo_final.usuario;

import upc.trabajo_final.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDB {


    private static List<Cliente> listClientes = new ArrayList<>();
    public ClienteDB() {

        Cliente cliente1 = new Cliente("70472354", "Ash", "Ketchum", "Mamani", "18", "11-06-2013", "Ashmamani@yahoo.com", "3456523");
        Cliente cliente2 = new Cliente("10451478", "Luke", "Skywalker", "Quispe", "23", "11-12-2016", "LukeSky@hotmail.com", "4561245");
        Cliente cliente3 = new Cliente("4578589", "Steve" , "Jobs", "Yupanqui", "35", "10-08-2019", "Stivyob@gmail.com.", "2567889");

        listClientes.add(cliente1);
        listClientes.add(cliente2);
        listClientes.add(cliente3);
    }



    public void agregarCliente(Cliente cliente) {
        listClientes.add(cliente);
    }

    public List<Cliente> getListaClientes() {
        return listClientes;
    }





}
