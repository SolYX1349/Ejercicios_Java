package com.mis_ejercicios.parte_1.n1_programas_simples.recargas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int numeroOriginal , numeroVerificacion;

                System.out.print("Numero: ");
                numeroOriginal = inputScanner.nextInt();
                System.out.print("verifica el numero");
                numeroVerificacion = inputScanner.nextInt();
                mensajeSystema(numeroOriginal,numeroVerificacion);

    }
    public static void mensajeSystema(int arg1 , int arg2){
        if (arg1 == arg2){ System.out.println("Tu recarga fue echa con exito"); }
        else { System.out.println("Hay un error porfavor verrifica "); }
    }
}
