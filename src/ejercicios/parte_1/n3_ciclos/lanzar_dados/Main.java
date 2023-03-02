package com.mis_ejercicios.parte_1.n3_ciclos.lanzar_dados;

public class Main {
    public static void main(String[] args) {
        for (int numeroCol = 1; numeroCol <= 6 ; numeroCol++) {
            System.out.println("Conjunto #" + numeroCol );
            for (int numeroFil = 1; numeroFil <= 6 ; numeroFil++) {
                System.out.println(numeroCol +""+ numeroFil);
            }
        }
    }
}
