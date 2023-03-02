package parte_3.ejercicios_colecciones.ejercicios_set.agregar_productos;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        Set<String> productos = new HashSet<>();
        productos.add("Bolígrafo");
        productos.add("Cama");
        productos.add("Celular");
        productos.add("Audifonos");
        productos.add("Calculadora");
        imprimir(productos);
    }
    private static void imprimir(Collection<String> obj){
        obj.forEach(producto ->{System.out.println("Producto: " + producto);});
    }
}
