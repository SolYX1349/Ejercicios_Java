package parte_1.n2_estructuras_condicionales.conversor_notas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        String nombreNota;
        int opc = 0;

        try{
            do {

                System.out.println("Nombre de la nota ___D,E,B,G,A,D,F___ si quieres salir digita --> salir <--" );
                nombreNota = inputScanner.nextLine();

                if (nombreNota.equalsIgnoreCase("E")) {
                    System.out.println("Mi");
                } else if (nombreNota.equalsIgnoreCase("B")) {
                    System.out.println("SI");
                } else if (nombreNota.equalsIgnoreCase("G")) {
                    System.out.println("Sol");
                } else if (nombreNota.equalsIgnoreCase("D")) {
                    System.out.println("Re");
                } else if (nombreNota.equalsIgnoreCase("A")) {
                    System.out.println("La");
                }else if (nombreNota.equalsIgnoreCase("F")) {
                    System.out.println("Fa");
                }else if (nombreNota.equalsIgnoreCase("C")) {
                    System.out.println("Do");
                }
                else if (nombreNota.equalsIgnoreCase("salir")){
                    opc = -1;
                    break;
                }
            }while (opc != -1);


        }catch (InputMismatchException ex){
            System.out.println("Hay problema a el leer datos.");
        }
    }
}
