package parte_1.n1_programas_simples.promedio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Primera nota: ");
        float primeraNota = inputScanner.nextFloat();
        System.out.print("Segunda nota: ");
        float segundaNota = inputScanner.nextFloat();
        System.out.print("Tercera nota: ");
        float terceraNota = inputScanner.nextFloat();
        System.out.print("Cuarta nota: ");
        float cuartaNota = inputScanner.nextFloat();

        float resultadoFinal = (primeraNota + segundaNota + terceraNota + cuartaNota) / 4;

        if (resultadoFinal >= 6 || resultadoFinal <= 10){
            System.out.println("Resultado aprobatorio = " + resultadoFinal);
        }else {
            System.out.println("Resultado reprobatorio = " + resultadoFinal);
        }
    }
}
