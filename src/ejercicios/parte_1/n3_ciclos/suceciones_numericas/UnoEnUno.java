package com.mis_ejercicios.parte_1.n3_ciclos.suceciones_numericas;

public class UnoEnUno {
    public static void main(String[] args) {
        int rango = 99 , salto = 10;
        for (int i = 0; i <= rango ; i++) {
            if (i == salto){
                System.out.println();
                salto += 10;
            }
            System.out.print(i + " ");
        }
    }
}
