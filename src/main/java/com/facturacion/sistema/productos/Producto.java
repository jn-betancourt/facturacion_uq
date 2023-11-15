package com.facturacion.sistema.productos;

public abstract class Producto {
    private String nombre;
    private double valor;
    private int ivaBase;
    private double valorConIva;

    public Producto(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public abstract void calcularIva();

    public void calcularPrecioFinal(){
        this.valorConIva = (valor*ivaBase)/100;
        this.valorConIva += valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getIvaBase() {
        return ivaBase;
    }

    public void setIvaBase(int ivaBase) {
        this.ivaBase = ivaBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValorConIva() {
        return valorConIva;
    }
    
}