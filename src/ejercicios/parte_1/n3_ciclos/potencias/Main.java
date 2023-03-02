package com.mis_ejercicios.parte_1.n3_ciclos.potencias;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int resultado = 1;

        System.out.print("Ingresa un num de longitud:");
        int numero = inputScanner.nextInt();

        System.out.print("Ingresa un num de potencia:");
        int potencia = inputScanner.nextInt();

        for (int i = 0; i < numero ; i++) {
            resultado = resultado * potencia ;
            System.out.println(resultado);
        }
    }
}
