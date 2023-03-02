package parte_1.n1_programas_simples.mis_notas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double espaniol ,matematicas, ficica, quimica ,resultado;

        System.out.print("Espaniol : ");
        espaniol = inputScanner.nextDouble();
        System.out.print("Matematicas : ");
        matematicas = inputScanner.nextDouble();
        System.out.print("Fisica : ");
        ficica = inputScanner.nextDouble();
        System.out.print("Quimica : ");
        quimica = inputScanner.nextDouble();
        
        double sumaMaterias = espaniol + matematicas + ficica + quimica ;
        resultado = sumaMaterias / 4;

        if (resultado >= 6){
            if (resultado >= 9){
                System.out.println("Exelencia con " + resultado);
            }else {
                System.out.println("Pasaste con " + resultado);
            }
        }else{
            System.out.println("Reprobaste con " + resultado);
        }
    }
}
