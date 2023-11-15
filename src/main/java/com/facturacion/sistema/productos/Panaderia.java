package com.facturacion.sistema.productos;

public class Panaderia extends Producto{
    private Boolean conservantes;

    public Panaderia(String nombre, double valor, Boolean conservantes) {
        super(nombre, valor);
        this.conservantes = conservantes;
        this.calcularIva();
    }

    @Override
    public void calcularIva() {
        if (conservantes){
            this.setIvaBase(18);
        }
    }
    
}
