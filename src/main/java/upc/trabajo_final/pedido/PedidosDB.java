package upc.trabajo_final.pedido;

import java.util.ArrayList;

public class PedidosDB {
    ArrayList<Pedido> pedidos = new ArrayList<>();
    public PedidosDB() {
        Pedido p1 = new Pedido("000001", new String[]{"1"}, 100.5, "12/09/2023", "09:13", "01", true, false);
        Pedido p2 = new Pedido("000001",new String[]{"1"}, 100.5, "29/09/2023", "09:13", "01",  true, false);
        Pedido p3 = new Pedido("000002",new String[]{"1"}, 13.0, "12/09/2023", "13:13", "01",  true, false);
        Pedido p4 = new Pedido("000003",new String[]{"1"}, 123.8, "12/09/2023", "17:13", "02",  true, false);
        Pedido p5 = new Pedido("000004",new String[]{"1"}, 55.90, "29/09/2023", "06:13", "02",  true, false);
        Pedido p6 = new Pedido("000005",new String[]{"1"}, 27.30, "12/09/2023", "21:13", "03",  true, false);
        this.pedidos.add(p1);
        this.pedidos.add(p2);
        this.pedidos.add(p3);
        this.pedidos.add(p4);
        this.pedidos.add(p5);
        this.pedidos.add(p6);
    }

    public ArrayList<Pedido> getListPedidos() {
        return pedidos;
    }
}
