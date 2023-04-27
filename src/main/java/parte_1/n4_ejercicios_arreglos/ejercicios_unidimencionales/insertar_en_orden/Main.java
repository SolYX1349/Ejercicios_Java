package parte_1.n4_ejercicios_arreglos.ejercicios_unidimencionales.insertar_en_orden;

public class Main {
    public static void main(String[] args) {
        Integer [] numeros = {1,2,6,8,9};
        insertarNumeroOrdenado(numeros,3);
    }
    private static void insertarNumeroOrdenado(Integer [] array,int n){
        Integer [] numeros = new Integer [array.length+1];
        int ultimaPosicion = numeros.length-1;
        int aux , cont = 0 ;
        if (n > array[array.length-1]){
            System.arraycopy(array, 0, numeros, 0, ultimaPosicion);
            numeros[ultimaPosicion] = n;
        }else {
            for (int i = 0; i < ultimaPosicion ; i++) {
                if (array[i] < n){
                    numeros[i] = array[i];
                }else {
                    if (cont++ == 0){
                        aux = array[i];
                        numeros[i] = n;
                        numeros [ultimaPosicion] = aux;
                    }else {
                        aux = array[i];
                        numeros [i] = numeros [ultimaPosicion];
                        numeros [ultimaPosicion] = aux;
                    }
                }
            }
        }
        for (Object x:numeros) {
            System.out.println(x);
        }
    }
}
