package parte_3.ejercicios_colecciones.ejercicios_set.ordena_nombres;

import com.mis_ejercicios.parte_3.ejercicios_colecciones.ejercicios_set.ordena_nombres.clase_y.Persona;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Persona> strHashSet = new TreeSet<>();
        strHashSet.add(new Persona(4, "Carlos", 44));
        strHashSet.add(new Persona(5, "Jasmin", 48));
        strHashSet.add(new Persona(2 ,"Orlando" ,20 ));

        for(Persona element : strHashSet){
            System.out.println(element.toString());
        }

    }
}
