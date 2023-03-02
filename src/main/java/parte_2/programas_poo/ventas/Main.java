package parte_2.programas_poo.ventas;
import parte_2.programas_poo.ventas.domine.*;
public class Main {
    public static void main(String[] args) {
        //Orden 1
        Orden orden1 = new Orden();

        Producto producto1 = new Producto("Papas",12.50);
        Producto producto2 = new Producto("peras",17.50);
        Producto producto3 = new Producto("chiles",10.70);
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();

        //Orden 2
        Orden orden2 = new Orden();
        Producto producto01 = new Producto("Cafe",32);
        Producto producto02 = new Producto("Azucar",78.9);
        orden2.agregarProducto(producto01);
        orden2.agregarProducto(producto02);
        orden2.mostrarOrden();
    }
}
