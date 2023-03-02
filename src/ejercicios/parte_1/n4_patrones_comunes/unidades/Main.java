package com.mis_ejercicios.parte_1.n4_patrones_comunes.unidades;
import com.mis_ejercicios.parte_1.n4_patrones_comunes.unidades.dominio.Metodos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = inputScanner.nextInt();
        metodos.determinarForma(numero);

     }
   }
