package com.mis_ejercicios.parte_1.n2_estructuras_condicionales.par_inpar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Ingrese un numero : ");
        int numero = inputScanner.nextInt();

        int residuo = numero % 2;

        if (residuo != 1){
            System.out.println("Tu numero es par");
        }else {
            System.out.println("Tu numero es inpar.");
        }
    }
}
