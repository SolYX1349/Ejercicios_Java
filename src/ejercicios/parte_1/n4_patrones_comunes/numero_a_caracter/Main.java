package com.mis_ejercicios.parte_1.n4_patrones_comunes.numero_a_caracter;

public class Main {
    public static void main(String[] args) {
        numero_caracter(64);
    }
    private static void numero_caracter (int number){
        Character caracter = (char) number;
        System.out.println("Tu numero " + number + " es = " + caracter);
    }
}
