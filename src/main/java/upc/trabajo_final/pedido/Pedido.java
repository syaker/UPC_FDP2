package upc.trabajo_final.pedido;

import java.util.ArrayList;

public class Pedido {

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
