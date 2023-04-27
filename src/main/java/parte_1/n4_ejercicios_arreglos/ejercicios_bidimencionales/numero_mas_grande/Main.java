package parte_1.n4_ejercicios_arreglos.ejercicios_bidimencionales.numero_mas_grande;

public class Main {
    public static void main(String[] args) {
        int columnas = 5;
        int filas = 5;
        int [][] arreglo = new int[filas][columnas];

        for (int i = 0; i < filas ; i++) {
            for (int j = 0; j < columnas ; j++) {
                arreglo [i][j] = (int)(Math.random() * 100);
                System.out.println("["+i+"]" + "[" + j + "]" + "=" + arreglo [i][j]);
            }
        }
        int numeroMax = 0;
        int auxiliar;
        for (int i = 0; i < filas ; i++) {
            for (int j = 0; j < columnas ; j++) {
                auxiliar = arreglo [i][j];
                numeroMax = auxiliar > numeroMax? auxiliar:numeroMax;
            }
        }
        System.out.println("\n" + numeroMax);
    }
}
