package com.nashiro.iamype.domain.model;

public class Invoice {
    private String transaccionId;
    private String rucProveedor;
    private String razonSocial;
    private String serie;
    private String numero;
    private String itemDescripcion;
    private double cantidad;
    private String unidadMedida;
    private double precioUnitario;
    private double montoTotal;
    private double igv;
    private double tasaDetraccion;
    private double montoDetraccion;
    private String nConstanciaDetraccion;
    private double confianzaIa;
    private String sede;

    //constructor
    public Invoice(String transaccionId, String rucProveedor, String razonSocial, String serie, String numero, String itemDescripcion, String unidadMedida, double cantidad, double precioUnitario, double montoTotal, double igv, double tasaDetraccion, double montoDetraccion, String nConstanciaDetraccion, double confianzaIa, String sede) {
        this.transaccionId = transaccionId;
        this.rucProveedor = rucProveedor;
        this.razonSocial = razonSocial;
        this.serie = serie;
        this.numero = numero;
        this.itemDescripcion = itemDescripcion;
        this.unidadMedida = unidadMedida;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.montoTotal = montoTotal;
        this.igv = igv;
        this.tasaDetraccion = tasaDetraccion;
        this.montoDetraccion = montoDetraccion;
        this.nConstanciaDetraccion = nConstanciaDetraccion;
        this.confianzaIa = confianzaIa;
        this.sede = sede;
    }


    // Getters y Setters
    public String getTransaccionId() {
        return transaccionId;
    }

    public void setTransaccionId(String transaccionId) {
        this.transaccionId = transaccionId;
    }

    public String getRucProveedor() {
        return rucProveedor;
    }

    public void setRucProveedor(String rucProveedor) {
        this.rucProveedor = rucProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getItemDescripcion() {
        return itemDescripcion;
    }

    public void setItemDescripcion(String itemDescripcion) {
        this.itemDescripcion = itemDescripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTasaDetraccion() {
        return tasaDetraccion;
    }

    public void setTasaDetraccion(double tasaDetraccion) {
        this.tasaDetraccion = tasaDetraccion;
    }

    public double getMontoDetraccion() {
        return montoDetraccion;
    }

    public void setMontoDetraccion(double montoDetraccion) {
        this.montoDetraccion = montoDetraccion;
    }

    public String getnConstanciaDetraccion() {
        return nConstanciaDetraccion;
    }

    public void setnConstanciaDetraccion(String nConstanciaDetraccion) {
        this.nConstanciaDetraccion = nConstanciaDetraccion;
    }

    public double getConfianzaIa() {
        return confianzaIa;
    }

    public void setConfianzaIa(double confianzaIa) {
        this.confianzaIa = confianzaIa;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
