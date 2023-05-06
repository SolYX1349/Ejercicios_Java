package ejercicios_aleatorios.unidades;

import ejercicios_aleatorios.unidades.dominio.Metodos;

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
