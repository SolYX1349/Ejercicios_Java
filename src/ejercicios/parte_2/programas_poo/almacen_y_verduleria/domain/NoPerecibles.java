package com.mis_ejercicios.parte_2.programas_poo.almacen_y_verduleria.domain;

public class NoPerecibles extends Producto{
    private int contenido;
    private int calorias;
    public NoPerecibles(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append(", contenido = ").append(this.contenido);
        sb.append(", calorias = ").append(this.calorias);
        return sb.toString();
    }
}
