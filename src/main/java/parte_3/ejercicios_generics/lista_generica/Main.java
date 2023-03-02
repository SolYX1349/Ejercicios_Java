package parte_3.ejercicios_generics.lista_generica;

import parte_3.ejercicios_generics.lista_generica.clase_x.GenericClass;

public class Main {
    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.agregarDatos("Carlos Garcia", "Pedro Cortez", "Camila Hernandez").forEach(System.out::println);

        GenericClass<Integer> genericClass2 = new GenericClass<>();
        genericClass2.agregarDatos(100, 999, 564).forEach(System.out::println);
    }
}
