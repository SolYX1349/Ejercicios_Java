package com.mis_ejercicios.parte_2.ejercicios_poo_herencia.polimorfismo.clases;

public class Gerente extends Empleado{
    private String area;

    public Gerente(){}
    public Gerente(String nombre , double sueldo ,String area){
        super(nombre,sueldo);
        this.area = area;
    }
    @Override
    public String obtenerDetalles (){
        return (super.obtenerDetalles() + " , Area : " + this.area);
    }
}
