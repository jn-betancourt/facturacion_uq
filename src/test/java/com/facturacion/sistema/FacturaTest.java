package com.facturacion.sistema;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.facturacion.sistema.clientes.Cliente;
import com.facturacion.sistema.clientes.Estudiante;
import com.facturacion.sistema.productos.Dulce;
import com.facturacion.sistema.productos.Producto;

public class FacturaTest {

    @Test
    void precioFinalCorrectoTest(){
        double totalFinal = 17280;
        Cliente estudiante =  new Estudiante(
            3300,
            "Juan",
            "Betancourt",
            "juana@mail",
            3
        );        
        Producto trululu = new Dulce(
            "Trululu",
            15000,
            60
        );
        estudiante.agregarProducto(trululu);
        Factura facutra1 = new Factura(
            estudiante
        );

        double totalFinalCalculado = facutra1.calcularPrecioFinal();
        assertEquals(totalFinal, totalFinalCalculado);
    }
}
