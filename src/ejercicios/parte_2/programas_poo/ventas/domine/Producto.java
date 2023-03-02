package com.mis_ejercicios.parte_2.programas_poo.ventas.domine;

public class Producto {
    private String nombre;
    private double precio;
    private int idProducto;
    private static int contadorProductos;

    private Producto(){
    }
    public Producto (String nombre , double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = ++Producto.contadorProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", idProducto=").append(idProducto);
        sb.append('}');
        return sb.toString();
    }
}
