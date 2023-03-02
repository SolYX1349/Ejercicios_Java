package parte_1.n5_ejercicios_arreglos.desplazar_con_indice;

public class Main {
    private static void agregarPosicion (String [] array , String palabra , int posicion){
        String [] palabras = new String[array.length + 1];
        String aux;
        for (int i = 0; i < palabras.length ; i++) {
            if (i < posicion){
                palabras [i] = array [i];
            }else if (i == posicion){
                aux = array [posicion];
                palabras [i] = palabra;
                palabras [i+1] = aux;
            }else {
                try {
                    palabras[i+1] = array[i];
                }catch (ArrayIndexOutOfBoundsException ex){
                 palabras[i] = array[i-1];
                }
            }
        }
        for (int i = 0; i < palabras.length ; i++) {
            System.out.println("Palabra [" + i + "] = " + palabras [i]);
        }
    }
    public static void main(String[] args) {
        String [] palabras = {"carlos","lorem","vaso","mesa","basura","casco"};
        agregarPosicion(palabras,"hola",2);
    }
}
