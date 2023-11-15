package com.facturacion.sistema;

import com.facturacion.sistema.clientes.Cliente;
import com.facturacion.sistema.clientes.Estudiante;
import com.facturacion.sistema.productos.Dulce;
import com.facturacion.sistema.productos.Panaderia;
import com.facturacion.sistema.productos.Producto;
import com.facturacion.sistema.productos.bebidas.BebidaAzucarada;
import com.facturacion.sistema.productos.bebidas.TipoBebidaAzucarada;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Dulce("Chicle", 1.600, 15);
        Producto producto2 = new BebidaAzucarada("Mr.Tea", 2.500, TipoBebidaAzucarada.JUGO, 30);
        Producto producto3 = new Panaderia("pan", 1.600, true);
        Cliente cliente = new Estudiante(300, "Juan", "Betancourt", "juana@mail", 2);
        cliente.agregarProducto(producto1);
        cliente.agregarProducto(producto2);
        cliente.agregarProducto(producto3);

        Factura factura = new Factura(cliente);
    }
}