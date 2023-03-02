package com.mis_ejercicios.parte_1.n2_estructuras_condicionales.tienda;

public class Main {
    public static void main(String[] args) {
        int ventasAprovadas = 0;
        short limiteRandom = 3000;

        double ventas [] = new double[30];
        for (int i = 0; i < ventas.length; i++){
            ventas [i] =(short)(Math.random() * limiteRandom);
            if (ventas[i] >= 2000){
                System.out.println("Venta N# "+ (i+1) + " fue de: $" + ventas[i]);
                ventasAprovadas++;
            }
        }
        System.out.println("\nTotal de Ventas aprobadas = " + ventasAprovadas);
    }
}