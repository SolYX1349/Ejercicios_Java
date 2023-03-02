package com.mis_ejercicios.parte_1.n3_ciclos.escalera_iterador;
import java.util.Scanner;
public class EscaleraFor {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int longitudEscalera , x = 1 , b = 1;

        System.out.println("Digita la longitud de tu piramide.");
        longitudEscalera = inputScanner.nextInt();

        for (int numeroAparente = 1; numeroAparente <= longitudEscalera; numeroAparente++) {
            System.out.print(b);

            for (int j = 0; j < numeroAparente ;j++) {
                if (j >= 1) {
                    x++;
                    System.out.print(x);
                }
            }

            x = 1;
            System.out.println();
        }
    }
}
