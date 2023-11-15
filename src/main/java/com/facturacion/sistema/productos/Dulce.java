package com.facturacion.sistema.productos;

public class Dulce extends Producto{
    private int porcentajeAzucar;

    public Dulce(String nombre, double valor, int porcentajeAzucar) {
        super(nombre, valor);
        this.porcentajeAzucar = porcentajeAzucar;
        this.setIvaBase(10);
        this.calcularIva();
        this.calcularPrecioFinal();
    }

    @Override
    public void calcularIva() {
        if(porcentajeAzucar > 50){
            this.setIvaBase(this.getIvaBase()+10);
        }
    }
    public int getPorcentajeAzucar() {
        return porcentajeAzucar;
    }
}
