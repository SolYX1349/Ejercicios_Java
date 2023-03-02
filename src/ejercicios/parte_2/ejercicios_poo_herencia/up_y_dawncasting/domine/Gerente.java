package com.mis_ejercicios.parte_2.ejercicios_poo_herencia.up_y_dawncasting.domine;

public class Gerente extends Empleado {
    private String areaTrabajo;

    public Gerente(String nombre , double sueldo ,String areaTrabajo) {
        super(nombre,sueldo);
        this.areaTrabajo = areaTrabajo;
    }
    @Override
    public String mostrarDetalles (){
        return super.mostrarDetalles() + " Area de Tabajo : " + this.areaTrabajo;
    }
}
