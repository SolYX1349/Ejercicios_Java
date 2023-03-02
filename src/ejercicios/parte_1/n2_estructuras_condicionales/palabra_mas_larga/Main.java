package com.mis_ejercicios.parte_1.n2_estructuras_condicionales.palabra_mas_larga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Palabra 1: ");
        String palabra1 = inputScanner.nextLine();
        System.out.print("Palabra 2: ");
        String palabra2 = inputScanner.nextLine();

        palabraMasLarga(palabra1,palabra2);

    }
    private static void palabraMasLarga(String palabra1 , String palabra2){
        if (palabra1.length() > palabra2.length()){
            int diferencia_palabras = palabra1.length() - palabra2.length();
            System.out.println("La palabra " + palabra1 + " tiene " + diferencia_palabras + " letras mas que " + palabra2);
        }else if (palabra1.length() < palabra2.length()){
            int diferencia_palabras = palabra2.length() - palabra1.length();
            System.out.println("La palabra " + palabra2 + " tiene " + diferencia_palabras + " letras mas que " + palabra1);
        }else{ System.out.println("La palabra " + palabra1 + " y la palabra " + palabra2 + " son de el mismo tamanio."); }
    }
}
