package parte_2.programas_poo.orden_compra;

import com.mis_ejercicios.parte_2.programas_poo.orden_compra.domain.Orden;
import com.mis_ejercicios.parte_2.programas_poo.orden_compra.domain.Producto;

public class TestMain {
    public static void main(String[] args) {
        Orden orden1= new Orden();
        Producto producto1;
        Producto producto2;
        Producto producto3;

        orden1.nombreOrden("Semillas Plantation");
        orden1.nuevoCliente("Carlos" , "Rodriguez");
        orden1.agregarProducto(producto1 = new Producto("Tecnofabrics","Abeto",10.00));
        orden1.agregarProducto(producto2 = new Producto("Plantanicos","Elechos",87.00));
        orden1.agregarProducto(producto3 = new Producto("Hidrogenicas","Agua en gel",45.00));
        orden1.showOrden();
    }
}
