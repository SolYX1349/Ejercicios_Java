package parte_3.ejercicios_colecciones.ejrcicios_list.agregar_nombres;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Carlos Hainz");
        listaNombres.add("Perdro Marcelo");
        listaNombres.add("Mauricio Nascar");
        imprimir(listaNombres);
    }
    private static void imprimir(Collection<String> obj){
        obj.forEach(cadena -> {System.out.println("Nombre : " + cadena);});
    }
}
