package com.mis_ejercicios.parte_2.programas_poo.ventas.domine;

public class Orden {
    private static final int MAX_PRODUCTOS = 10;
    private Producto productos [];
    private int idOrden;
    private static int contadorOrdenes;
    private static int contadorProductos;
    private static int reinicio = 1;

    public Orden () {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
        if (reinicio != this.idOrden){
            reinicio = this.idOrden;
            contadorProductos = 0;
        }
    }
    public void agregarProducto (Producto producto){
            if (contadorProductos < MAX_PRODUCTOS){
                this.productos [contadorProductos] = producto;
                ++contadorProductos;
            }else {
                System.out.println("El producto supera la cantidad maxima.");
        }
    }
    public double calcularTotal (){
        double total = 0;
        for (int i = 0; i < contadorProductos ; i++) {
            total += productos [i].getPrecio();
        }
        return total;
    }
    public void mostrarOrden (){
        System.out.println("Oreden #" + idOrden);
        for (int i = 0; i < contadorProductos ; i++) {
            System.out.println(productos [i]);
        }
        System.out.println("Total = $" + calcularTotal());
    }
}
