package com.mis_ejercicios.parte_2.ejercicios_poo_herencia.persona_de_una_compania.domain;

public class Empleado extends Persona{
    private int empleadoId;
    private double remuneracion;
    public Empleado(int empleadoId, double remuneracion, String numeroFiscal, String nombre, String apellido, String direccion) {
        super(numeroFiscal, nombre, apellido, direccion);
        this.empleadoId = empleadoId;
        this.remuneracion = remuneracion;
    }
    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += remuneracion * porcentaje/100;
    }
    @Override
    public String toString() {
        return "empleadoId=" + empleadoId + ", remuneracion=" + remuneracion + ", " + super.toString();
    }
}
