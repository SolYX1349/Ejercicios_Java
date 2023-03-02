package com.mis_ejercicios.parte_1.n1_programas_simples.circulos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner =  new Scanner(System.in);

        System.out.print("Ingresa el radio de el circulo : ");
        double radio = inputScanner.nextDouble();

        double diametro = radio * 2 ;
        double perimetro = (diametro * 3.1416);
        double area = ( 3.1416 * radio ) * radio;

        System.out.print("Perimetro = " + perimetro + "\nArea = " + area + "\nDiametro = " + diametro);
    }
}
