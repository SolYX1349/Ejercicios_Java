package parte_1.n4_arreglos.arreglos_unidimencionales.arreglos_merged;

public class Main {
    public static void main(String[] args) {
        Integer [] numeros = {1,2,3,4,5};
        Character [] letras = {'a','r','h','m','s'};
        merged(numeros,letras);
        System.gc();
        System.exit(0);
    }
    private static void merged (Object [] array1 , Object [] array2 ){
        int mergedLength = array1.length + array2.length;
        int auxiliar = 0;
        Object [] arreglosMerged = new Object[mergedLength];

        for (int i = 0; i < arreglosMerged.length/2 ; i++) {
            arreglosMerged[auxiliar++] = array1[i];
            arreglosMerged[auxiliar++] = array2[i];
        }
        for (int i = 0; i <arreglosMerged.length ; i++) {
            System.out.println("["+i+"] = " + arreglosMerged [i]);
        }
    }
}
