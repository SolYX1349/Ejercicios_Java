package parte_1.n5_ejercicios_arreglos.desplazar_una_pasicion;

public class Main {
    private static void desplazarArreglo (Integer [] array){
        for (int i = 0; i < array.length-1 ; i++) {
            int aux = array[i+1];
            array[i+1] = array[0];
            array[0] = aux;
        }
        for (Object obj: array) {
            System.out.println("Numero = " + obj);
        }
    }
    public static void main(String[] args) {
        Integer [] numeros = {1,2,3,4,5,6,7,8,9,10};
        desplazarArreglo(numeros);
    }
}
