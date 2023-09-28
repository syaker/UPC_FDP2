package upc.trabajo_final;

import java.util.ArrayList;
import java.util.List;

public class ClienteDB {
    //listaClientes:
    private static List<Cliente> listClientes = new ArrayList<>();
        //getClientes:
        public static List<Cliente> getListClientes() { return listClientes; }
    public ClienteDB(){
        Cliente c1 = new Cliente("9982319","Walter", "White","Apellido2" ,"60",  "04/09/2023", "ww@gmail.com", "999324235","01");
        Cliente c2 = new Cliente("9982319","Jesse", "Pinkman", "Apellido2","28", "19/11/2022", "jp@gmail.com", "999767675","02");
        Cliente c3 = new Cliente("9982319","Nelly", "Caceres","Apellido2" ,"39", "28/02/2023", "nc@gmail.com", "934534534","03");
        Cliente c4 = new Cliente("9982319","Alex", "Bunny", "Apellido2","40",  "23/05/2023", "ab@gmail.com", "999435334","04");
        Cliente c5 = new Cliente("9982319","Stephanie", "Sanchez","Apellido2" ,"60", "04/06/2023", "ss@gmail.com", "96977798","05");

        listClientes.add(c1);
        listClientes.add(c2);
        listClientes.add(c3);
        listClientes.add(c4);
        listClientes.add(c5);
    }
}
