package upc.trabajo_final.pedido;

public class Pedido {
    String[][] pedidos = {
            {"000001","1", "100.5", "12/09/2023", "09:13", "9882985", "04/09/2023", "true", "0"},
            {"000002","1", "13.0", "12/09/2023", "13:13", "9882985", "19/11/2022", "true", "0"},
            {"000003","1", "123.8", "12/09/2023", "17:13", "9882985", "28/02/2023", "true", "0"},
            {"000004","1", "55.90", "12/09/2023", "06:13", "9882985", "23/05/2023", "true", "0"},
            {"000005","1", "27.30", "12/09/2023", "21:13", "9882985", "04/06/2023", "true", "0"},
    };

    private String codigoPedido;
    private String[] idsProductoRelacionado;
    private double montoTotal;
    private String fechaPedido;
    private String horaPedido;
    private String codigoCliente;
    private boolean cobrado;
    private boolean anulado;

    public Pedido(String codigoPedido, String[] idsProductoRelacionado, double montoTotal, String fechaPedido, String horaPedido, String codigoCliente, boolean cobrado, boolean anulado) {
        this.codigoPedido = codigoPedido;
        this.idsProductoRelacionado = idsProductoRelacionado;
        this.montoTotal = montoTotal;
        this.fechaPedido = fechaPedido;
        this.horaPedido = horaPedido;
        this.codigoCliente = codigoCliente;
        this.cobrado = cobrado;
        this.anulado = anulado;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String[] getIdsProductoRelacionado() {
        return idsProductoRelacionado;
    }

    public void setIdsProductosRelacionados(String[] idsProducto) {
        this.idsProductoRelacionado = idsProducto;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {

        this.montoTotal = montoTotal;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(String horaPedido) {
        this.horaPedido = horaPedido;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public boolean isCobrado() {
        return cobrado;
    }

    public void setCobrado(boolean cobrado) {
        this.cobrado = cobrado;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }
}
