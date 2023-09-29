package upc.trabajo_final.usuario;

import upc.trabajo_final.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDB {


    private static List<Cliente> listClientes = new ArrayList<>();
    //getClientes:
    public List<Cliente> getListaClientes() {
        return listClientes;
    }
    public ClienteDB() {

        Cliente cliente1 = new Cliente("70472354", "Ash", "Ketchum", "Mamani", "18", "11/06/2013", "Ashmamani@yahoo.com", "3456523","01");
        Cliente cliente2 = new Cliente("10451478", "Luke", "Skywalker", "Quispe", "23", "11/12/2016", "LukeSky@hotmail.com", "4561245","02");
        Cliente cliente3 = new Cliente("4578589", "Steve" , "Jobs", "Yupanqui", "35", "10/08/2019", "Stivyob@gmail.com.", "2567889","03");
        Cliente cliente4 = new Cliente("9982319","Walter", "White","Apellido2" ,"60",  "04/09/2023", "ww@gmail.com", "999324235","04");
        Cliente cliente5 = new Cliente("9982319","Jesse", "Pinkman", "Apellido2","28", "19/11/2022", "jp@gmail.com", "999767675","05");
        Cliente cliente6 = new Cliente("9982319","Nelly", "Caceres","Apellido2" ,"39", "28/02/2023", "nc@gmail.com", "934534534","06");
        Cliente cliente7 = new Cliente("9982319","Alex", "Bunny", "Apellido2","40",  "23/05/2023", "ab@gmail.com", "999435334","07");
        Cliente cliente8 = new Cliente("9982319","Stephanie", "Sanchez","Apellido2" ,"60", "04/06/2023", "ss@gmail.com", "96977798","08");

        listClientes.add(cliente1);
        listClientes.add(cliente2);
        listClientes.add(cliente3);
        listClientes.add(cliente4);
        listClientes.add(cliente5);
        listClientes.add(cliente6);
        listClientes.add(cliente7);
        listClientes.add(cliente8);
    }



    public void agregarCliente(Cliente cliente) {
        listClientes.add(cliente);
    }

}