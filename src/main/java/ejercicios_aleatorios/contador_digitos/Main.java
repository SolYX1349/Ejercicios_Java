package ejercicios_aleatorios.contador_digitos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imputScanner = new Scanner(System.in);

        System.out.println("Digita numero");
        int numero  = imputScanner.nextInt();
        contarNumeros(numero);
    }
    public static void contarNumeros(int numero){
        String conversorStr = String.valueOf(numero);
        int contadorDigitos = conversorStr.length();
        System.out.println(numero + " tiene " + contadorDigitos + " digitos.");
    }
}
