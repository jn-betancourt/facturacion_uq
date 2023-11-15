package com.facturacion.sistema.productos;

public class Fruta extends Producto{
    private double libras;

    public Fruta(String nombre, double valor, double libras) {
        super(nombre, valor*libras);
        this.libras = libras;
        this.setIvaBase(7);
        this.calcularPrecioFinal();
    }
    
    @Override
    public void calcularIva() {
        int kilos = calcularKilos()-3;
        if(kilos >= 0 && kilos <= 7){
            this.setIvaBase(this.getIvaBase()-kilos);
        }else{
            this.setIvaBase(0);
        }
    }

    private int calcularKilos(){
        int kilos = (int)Math.round(libras/0.4);
        return kilos;
    }

}
