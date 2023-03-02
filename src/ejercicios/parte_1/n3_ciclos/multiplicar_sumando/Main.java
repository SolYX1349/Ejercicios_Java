package com.mis_ejercicios.parte_1.n3_ciclos.multiplicar_sumando;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner inputScanner = new Scanner(System.in);
            int total = 0;

            System.out.println("Numero: ");
            int numero = inputScanner.nextInt();
            System.out.println("Multiplo: ");
            int multiplo = inputScanner.nextInt();

            for (int i = 0; i < multiplo ; i++) {
                total += numero;
            }
            System.out.println("total = " + total);
        }
}
