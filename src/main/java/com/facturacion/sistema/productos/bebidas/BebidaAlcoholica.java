package com.facturacion.sistema.productos.bebidas;

public class BebidaAlcoholica extends Bebida{
    private TipoBebidaAlcoholica tipoBebida;
    private int porcentajeAlcohol;

    public BebidaAlcoholica(String nombre, double valor, TipoBebidaAlcoholica tipoBebida, int porcentajeAlcohol) {
        super(nombre, valor);
        this.tipoBebida = tipoBebida;
        this.porcentajeAlcohol = porcentajeAlcohol;
        this.calcularIva();
        this.calcularPrecioFinal();
    }

    @Override
    public void calcularIva() {
        int ivaTotal;
        if(tipoBebida.equals(TipoBebidaAlcoholica.NACIONAL)){
            ivaTotal = porcentajeAlcohol*2;
            if (ivaTotal > 50){
                this.setIvaBase(50);
            }else{
                this.setIvaBase(ivaTotal);
            }
        }else{
            ivaTotal = (int)Math.round(((this.getValor() * 1.3) * (1 + (0.3 * this.getPorcentajeAlcohol()))));
        }
    }

    public TipoBebidaAlcoholica getTipoBebida() {
        return tipoBebida;
    }

    public int getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }
    
}
