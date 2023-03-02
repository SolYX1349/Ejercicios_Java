package parte_1.n3_ciclos.multiplos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Ingresa un numero :");
        int numero = inputScanner.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}
