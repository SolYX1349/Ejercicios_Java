package parte_3.ejercicios_colecciones.ejrcicios_map.exist_id;

import com.mis_ejercicios.parte_3.ejercicios_colecciones.ejrcicios_map.exist_id.antity.Persona;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona(1, "Carlos Vargas", 25);
        Persona persona1 = new Persona(4, "Maria Zoto", 29);
        Persona persona2 = new Persona(7, "Ernesto Usma", 22);
        Persona persona3 = new Persona(2, "Erick Solar", 23);
        Map<Integer, Persona> personaMap = new TreeMap<>();

        agregar(personaMap, persona);
        agregar(personaMap, persona);
        agregar(personaMap, persona1);
        agregar(personaMap, persona2);
        agregar(personaMap, persona2);
        agregar(personaMap, persona3);
        agregar(personaMap, persona3);

        for (Map.Entry<Integer, Persona> element : personaMap.entrySet()) {
            System.out.println(element);
        }
    }

    private static void agregar(Map<Integer, Persona> personaMap, Persona persona) {
        if (personaMap.containsKey(persona.getId())) {
            System.err.println("Tu elemento con ID = " + persona.getId() + " ya existe verifica para no remplazar el valor anterior.");
        } else {
            personaMap.put(persona.getId(), persona);
        }
    }
}
