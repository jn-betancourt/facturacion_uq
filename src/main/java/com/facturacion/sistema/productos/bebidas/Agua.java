package com.facturacion.sistema.productos.bebidas;

public class Agua extends Bebida{
    public Agua(String nombre, double valor){
        super(nombre, valor);
        this.calcularIva();
        this.calcularPrecioFinal();
    }

    @Override
    public void calcularIva() {
        this.setIvaBase(0);    
    }
    
}
