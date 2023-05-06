package parte_1.n3_ciclos.potencias;

import java.util.Scanner;

public class Potencias {

    //Codigo base del ejercicio
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);


        System.out.print("Ingresa un numero:");
        int numero = inputScanner.nextInt();

        System.out.print("Ingresa el exponente:");
        int exponente = inputScanner.nextInt();

        int resultado = numero;
        String mensajeString = "";
        for (int i = 0; i < exponente; i++) {
            if (i > 0) {
                resultado = resultado * numero;
                mensajeString += " X ";
            }
            mensajeString += numero;
        }
        System.out.println(mensajeString + " = " + resultado);
    }

    //Codigo dirigido al testing
    public static int potenciar(int numero , int exponente) {
        int resultado = numero;
        for (int i = 0; i < exponente; i++) {
            if (i > 0) {
                resultado = resultado * numero;
            }
        }
        return resultado;
    }
}
