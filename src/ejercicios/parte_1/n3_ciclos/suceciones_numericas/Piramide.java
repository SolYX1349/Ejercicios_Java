package com.mis_ejercicios.parte_1.n3_ciclos.suceciones_numericas;

public class Piramide {
    public static void main(String[] args) {
        int rango = 9 , cantidadEspacios = 0 , cantidadNumeros = 1;
        cantidadEspacios = rango;
        for (int i = 0; i <= rango ; i++) {
            for (int j = 0; j <cantidadEspacios ; j++) {
                System.out.print(" ");
            }
            cantidadEspacios -= 1;
            for (int j = 0; j <cantidadNumeros ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            ++cantidadNumeros;
        }
    }
}
