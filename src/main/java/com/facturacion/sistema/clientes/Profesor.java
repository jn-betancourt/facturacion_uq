package com.facturacion.sistema.clientes;

public class Profesor extends Cliente{
    private CategoriaProfesor categoria;

    public Profesor(int cedula, String nombre, String apellido, String email, CategoriaProfesor categoria) {
        super(cedula, nombre, apellido, email);
        this.categoria = categoria;
    }

    @Override
    public int calcularDescuento() {
        int descuentoTotal = 0;
        if (categoria.equals(CategoriaProfesor.AUXILIAR)){
            descuentoTotal = 3;
        }else if(categoria.equals(CategoriaProfesor.ASISTENTE)){
            descuentoTotal = 5;
        }else if (categoria.equals(CategoriaProfesor.ASOCIADO)) {
            descuentoTotal = 10;
        }else if(categoria.equals(CategoriaProfesor.TITULAR)){
            descuentoTotal = 16;
        }
        return descuentoTotal;
    }

    public CategoriaProfesor getCategoria() {
        return categoria;
    }
    
}
