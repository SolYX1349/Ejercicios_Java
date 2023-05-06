package parte_1.n3_ciclos.multiplos;

import java.util.Scanner;

public class Multiplos {

    //Codigo base del ejercicio
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Ingresa un numero :");
        int numero = inputScanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }

    //Codigo dirigido al testing
    public static String getMultiplos(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int resultado = number * i;
            sb.append(number).append(" X ").append(i).append(" = ").append(resultado).append("\n");
        }
        return String.valueOf(sb).trim();
    }
}
