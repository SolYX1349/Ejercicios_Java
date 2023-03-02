package parte_1.n5_ejercicios_arreglos.insertar_en_posicion;

public class Main {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,9};
        numeros = agregarPos(numeros , 8,11);
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    private static int[] agregarPos (int [] array,int n , int pos){
        int [] newArray = new int[array.length + 1];
        if (pos > array.length){
            System.err.println("El indice [" + pos + "] esta fuera de el rango");
            return null;
        } else if (pos == array.length) {
            System.arraycopy(array,0,newArray,0,array.length);
            newArray [pos] = n;
        } else {
            for (int i = 0; i < newArray.length ; i++) {
                if ( i == pos){
                    int aux = array [i];
                    newArray [i] = n;
                    newArray [i+1] = aux;
                    if (newArray.length - (i + 1) >= 0)
                        System.arraycopy(array, i + 1 - 1, newArray, i + 1, newArray.length - (i + 1));
                    break;
                }else {
                    newArray [i] = array [i];
                }
            }
        }
        return newArray;
    }
}
