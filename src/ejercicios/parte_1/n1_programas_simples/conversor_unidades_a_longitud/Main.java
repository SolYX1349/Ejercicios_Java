package com.mis_ejercicios.parte_1.n1_programas_simples.conversor_unidades_a_longitud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Medida cm : ");
        float medida_cm = inputScanner.nextFloat();

        float resultadoPulgadas = (float) (medida_cm / 2.54);
        float resultadoYardas = (float) (medida_cm / 91.44);
        float resultadoKilometros = (float) (medida_cm / 1000);

        System.out.println(medida_cm + " cm = " + resultadoPulgadas + " in"
                            + "\n" + medida_cm + " cm = " + resultadoYardas + " yd"
                            + "\n" + medida_cm + " cm = " + resultadoKilometros + " klm" );

    }
}
