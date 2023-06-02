package ejercicios_aleatorios.numero_invertido;

import java.util.Scanner;

public class NumeroInvalido {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero = inputScanner.nextInt();
        reversoInt(numero);

        /*
        System.out.println("Ingresa un texto: ");
        String cadena = inputScanner.nextLine();
        reversoString(cadena);
        */
    }
    private static void reversoInt(int numero){
        String conversorCadena = String.valueOf(numero);
        StringBuilder cadena = new StringBuilder(conversorCadena);
        cadena.reverse();
        System.out.println("Numero invertido : " + cadena);
    }
    private static void reversoString(String texto){
        StringBuilder cadena = new StringBuilder(texto);
        cadena.reverse();
        System.out.println("Numero invertido : " + cadena);
    }
}
