package com.facturacion.sistema.clientes;

public class Estudiante extends Cliente{
    private int semestre;

    public Estudiante(int cedula, String nombre, String apellido, String email, int semestre) {
        super(cedula, nombre, apellido, email);
        this.semestre = semestre;
    }

    @Override
    public int calcularDescuento() {
        int descuentoTotal = (int)Math.round(semestre*1.2);
        
        return descuentoTotal;
    }

    public int getSemestre() {
        return semestre;
    }
    
}
