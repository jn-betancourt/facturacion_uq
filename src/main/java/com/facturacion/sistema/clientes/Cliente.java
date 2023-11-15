package com.facturacion.sistema.clientes;

import java.util.Collection;
import java.util.ArrayList;

import com.facturacion.sistema.productos.Producto;

public abstract class Cliente {
    private int cedula;
    private String nombre;
    private String apellido;
    private String email;
    private Collection<Producto> productos;

    public Cliente(int cedula, String nombre, String apellido, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.productos = new ArrayList<>();
    }

    public abstract int calcularDescuento();

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void agregarProductos(Collection<Producto> productos){
        productos.addAll(productos);
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public Collection<Producto> getProductos() {
        return productos;
    }
    
    
}
