package com.mis_ejercicios.parte_2.programas_poo.almacen_y_verduleria.domain;

public class Fruta extends Producto{
    private double peso;
    private String color;
    public Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append(", peso = ").append(this.peso);
        sb.append(", color = ").append(this.color);
        return sb.toString();
    }
}
