package com.facturacion.sistema;

import java.util.Collection;

import com.facturacion.sistema.clientes.Cliente;
import com.facturacion.sistema.productos.Producto;

public class Factura {
    private Cliente cliente;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double calcularTotalBruto(){
        Collection<Producto> productos = cliente.getProductos();
        double totalBruto = 0;
        for(Producto producto: productos){
            totalBruto += producto.getValorConIva();
        }
        return totalBruto;
    }

    public double calcularDescuento(){
        int descuento = cliente.calcularDescuento();
        double totalBruto = calcularTotalBruto();
        double totalConDescuento = ((totalBruto*descuento)/100);
        return totalConDescuento;
    }

    public double calcularPrecioFinal(){
        double totalBruto = calcularTotalBruto();
        double totalDescuento = calcularDescuento();
        return totalBruto-totalDescuento;
    }

}
