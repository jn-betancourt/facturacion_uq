package com.facturacion.sistema.productos.bebidas;

public class BebidaAzucarada extends Bebida{
    private TipoBebidaAzucarada tipoBebida;
    private int porcentajeAzucar;
    
    public BebidaAzucarada(String nombre, double valor, TipoBebidaAzucarada tipoBebida, int porcentajeAzucar) {
        super(nombre, valor);
        this.tipoBebida = tipoBebida;
        this.porcentajeAzucar = porcentajeAzucar;
        this.setIvaBase(5);
        this.calcularIva();
        this.calcularPrecioFinal();
    }

    @Override
    public void calcularIva() {
        if (porcentajeAzucar > 35){
            this.setIvaBase(this.getIvaBase()+20);
        }
    }

    public TipoBebidaAzucarada getTipoBebida() {
        return tipoBebida;
    }

    public int getPorcentajeAzucar() {
        return porcentajeAzucar;
    }
    
}
