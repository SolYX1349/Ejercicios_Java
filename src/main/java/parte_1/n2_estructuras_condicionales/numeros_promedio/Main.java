package parte_1.n2_estructuras_condicionales.numeros_promedio;

import java.util.Scanner;

public class Main {
    //Codigo base del ejercicio
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int numerosNegativos = 0, contadorNumerosNegativos = 0, promedioNumerosNegativos = 0;
        int numerosPositivos = 0, contadorNumerosPositivos = 0, promedioNumerosPositivos = 0;
        int contadorNumerosNullos = 0, contadorIteraciones = 0;

        while (contadorIteraciones < 5) {

            System.out.print("Ingresa numeros: ");
            int numeros = inputScanner.nextInt();

            if (numeros < 0) {
                numerosNegativos = numeros + numerosNegativos;
                promedioNumerosNegativos = numerosNegativos / 2;
                contadorNumerosNegativos++;

            } else if (numeros > 0) {
                numerosPositivos = numeros + numerosPositivos;
                promedioNumerosPositivos = numerosPositivos / 2;
                contadorNumerosPositivos++;

            } else if (numeros == 0) {
                contadorNumerosNullos++;
            }
            contadorIteraciones++;
        }

        System.out.println("Numeros negativos = " + contadorNumerosNegativos + " y su promedio fue de: " + promedioNumerosNegativos);
        System.out.println("Numeros positivos = " + contadorNumerosPositivos + " y su promedio fue de: " + promedioNumerosPositivos);
        System.out.println("Numeros nulos = " + contadorNumerosNullos);
    }
}
