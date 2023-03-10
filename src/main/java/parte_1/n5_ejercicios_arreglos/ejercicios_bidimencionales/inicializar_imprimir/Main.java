package parte_1.n5_ejercicios_arreglos.ejercicios_bidimencionales.inicializar_imprimir;

public class Main {
    public static void main(String[] args) {
        int [][]numeros = new int[2][2];
        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros [0].length ; j++) {
                numeros [i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros [0].length ; j++) {
                System.out.println("numeros [" +i+ "]["+j+"]"+" = "+ numeros [i][j]);
            }
        }
    }
}
