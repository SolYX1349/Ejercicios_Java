package parte_2.exepciones.out_bounds_exeption;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] numeros = {14, 25, 38, 42, 50};
        try {
           fori(numeros , 9);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private static void fori(Integer[] array , int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.println("Numeros " + i + " = " + array[i]);
        }
    }
}
