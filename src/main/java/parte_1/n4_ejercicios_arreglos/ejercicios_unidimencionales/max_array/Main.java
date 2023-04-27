package parte_1.n4_ejercicios_arreglos.ejercicios_unidimencionales.max_array;

public class Main {
    public static void main(String[] args) {
        Integer [] numeros = {1,6,4,6,2,7,2,4};
        arrayMax(numeros);
    }
    private static void arrayMax(Integer [] array){
        int max = 0;
        for (int i = 1; i < array.length ; i++) {
         max = array [max] > array [i]? max : i;
        }
        System.out.println("ArrayMax [" + max +"] = " + array [max]);
    }
}
