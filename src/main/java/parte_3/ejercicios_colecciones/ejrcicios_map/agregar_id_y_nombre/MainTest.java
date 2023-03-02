package parte_3.ejercicios_colecciones.ejrcicios_map.agregar_id_y_nombre;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        Map <Integer, String> personal = new HashMap<>();
        personal.put(generadorId() , "Simeon lamas Cardozo");
        personal.put(generadorId() , "Camila Cartan Perez");
        personal.put(generadorId() , "Pablo Filsos Cuevas");
        imprimirRaw(personal.entrySet());
    }
    private static void imprimirRaw(Collection obj){
        obj.forEach(object -> {System.out.println(object);});
    }
    private static int generadorId (){
        return  (int) (Math.random() * 12345);
    }
}
