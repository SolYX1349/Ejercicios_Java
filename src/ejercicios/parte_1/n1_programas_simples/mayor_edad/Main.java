package com.mis_ejercicios.parte_1.n1_programas_simples.mayor_edad;

public class Main {
    public static void main(String[] args) {

        int edad = 21;
        boolean evaluacionEdad = (edad >= 18? true : false);
        if (evaluacionEdad == true){
            System.out.println("Mayor de edad.");
        }else {
            System.out.println("Menor de edad.");
        }

        /*
        if (edad >= 18){
            System.out.println("Mayor de edad.");
        }else {
            System.out.println("Menor de edad.");
        }
         */
    }
}
