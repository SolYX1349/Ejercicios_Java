package parte_1.n3_ciclos.multiplicar_sumando;

import java.util.Scanner;

public class MultiplicarSumando {

    //Codigo base del ejercicio
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int total = 0;

        System.out.println("Numero: ");
        int numero = inputScanner.nextInt();
        System.out.println("Multiplo: ");
        int multiplo = inputScanner.nextInt();

        for (int i = 0; i < multiplo; i++) {
            total += numero;
        }
        System.out.println("total = " + total);
    }

    //Codigo dirigido al testing

    public static int multiplicaSumando(int multiplicador, int multiplicando) {
        return evaluateMultiplication(multiplicador, multiplicando);
    }

    private static int evaluateMultiplication(int multiplicador, int multiplicando) {
        int total = 0;
        for (int i = 0; i < multiplicando; i++) {
            total += multiplicador;
        }
        return total;
    }
}
