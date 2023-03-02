package com.mis_ejercicios.parte_1.n5_ejercicios_arreglos.pares_inpares;

public class Main {
    public static void main(String[] args) {
        Integer [] numeros = {1,2,7,3,8,3,9,4,6};
        difArreglo(numeros);
    }
    private static void difArreglo(Integer [] arreglo){
        int contPares = 0, contInpares = 0;
        for (Integer integer : arreglo) {
            if (integer % 2 == 0) {
                ++contPares;
            } else { ++contInpares; }
        }
        Integer [] numerosPar = new Integer[contPares];
        Integer [] numerosInp = new Integer[contInpares];

        int auxPar = 0 , auxInp = 0;
        for (Integer integer : arreglo) {
            if (integer % 2 == 0) {
                numerosPar[auxPar++] = integer;
            } else { numerosInp[auxInp++] = integer; }
        }
        for (Object par:numerosPar) { System.out.println("Numero Par = " + par); }
        System.out.println("//////////////////");
        for (Object inp:numerosInp) { System.out.println("Numero Inpar = " + inp); }
    }
}
