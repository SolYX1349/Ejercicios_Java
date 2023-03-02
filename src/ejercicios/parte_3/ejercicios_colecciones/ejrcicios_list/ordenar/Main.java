package com.mis_ejercicios.parte_3.ejercicios_colecciones.ejrcicios_list.ordenar;
import com.mis_ejercicios.parte_3.ejercicios_colecciones.ejrcicios_list.ordenar.clases_x.Persona;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Persona> personaList = new ArrayList<>();

        personaList.add(new Persona(1, "Carlos", 19));
        personaList.add(new Persona(2, "Maria", 45));
        personaList.add(new Persona(3, "Diana", 22));

//        ordenarPorId(personaList);
//        ordenarPorNombre(personaList);
        ordenarPorEdad(personaList);

        personaList.forEach(System.out::println);

    }

    private static void ordenarPorId(List<Persona> personaList) {
        Collections.sort(personaList, new Comparator<>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                if (persona1.getId() > persona2.getId()) {
                    return 1;
                } else if (persona1.getId() == persona2.getId()) {
                    return 0;
                }
                return -1;
            }
        });
    }

    private static void ordenarPorNombre(List<Persona> personaList) {
        Collections.sort(personaList, new Comparator<>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona1.getNombre().compareTo(persona2.getNombre());
            }
        });
    }

    private static void ordenarPorEdad(List<Persona> personaList) {
        Collections.sort(personaList, new Comparator<>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                if (persona1.getEdad() > persona2.getEdad()) {
                    return 1;
                } else if (persona1.getEdad() == persona2.getEdad()) {
                    return 0;
                }
                return -1;
            }
        });
    }
}
