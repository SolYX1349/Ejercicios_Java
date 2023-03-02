package parte_1.n4_patrones_comunes.pate_decimal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Digita un numero con parte decimal : ");
        double numeroDecimal = inputScanner.nextDouble();

        String numeroString = String.valueOf(numeroDecimal);
        String [] partes  = numeroString.split("\\.");
        int parteEnteros = partes [0].length();

        System.out.print("Parte decimal = ");
        for (int i = 0; i < parteEnteros ; i++) {
            System.out.print(0);
        }
        System.out.print("." + partes [1]);
    }
}
