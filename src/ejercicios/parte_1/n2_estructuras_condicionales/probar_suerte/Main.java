package com.mis_ejercicios.parte_1.n2_estructuras_condicionales.probar_suerte;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entradaConsola = new Scanner(System.in);
        boolean evaliacionSalida;
        int numero;

        System.out.println("Bienvenido a la loteria el premio de este dia es de $ 1_000_000"+
                "\n tienes que adivinar un numero de el > 0 al 100 <");

        do {

            System.out.println("Numero:");
            numero = entradaConsola.nextInt();
            evaliacionSalida = evaluador(numero);

        }while (!evaliacionSalida);
        System.out.println("Para ganar tiviste que hacer " + contador + " intentos.");
    }

    protected static int contador = 0;
    protected static boolean evaluador(int numero){
        int numeroGanador = 50;
        if (numero >= 0 && numero <= 100){
            if (numero < numeroGanador){
                System.out.println("Tu numero es muy pequenio.");
                contador++;
            }else if (numero > numeroGanador){
                System.out.println("Tu numero es muy grande.");
                contador++;
            }else if (numero == numeroGanador){
                System.out.println("Felicidades has ganado !!!!!!");
                contador++;
                return true;
            }
        }else {System.out.println("El numero ingresado no es valido para el juego.");}
        return false;}
}
