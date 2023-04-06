package parte_1.n1_programas_simples.mis_notas;

import java.util.Scanner;

public class Main {
    //Codigo base del ejercicio
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double espaniol, matematicas, ficica, quimica, resultado;

        System.out.print("Español : ");
        espaniol = inputScanner.nextDouble();
        System.out.print("Matematicas : ");
        matematicas = inputScanner.nextDouble();
        System.out.print("Fisica : ");
        ficica = inputScanner.nextDouble();
        System.out.print("Quimica : ");
        quimica = inputScanner.nextDouble();

        double sumaMaterias = espaniol + matematicas + ficica + quimica;
        resultado = sumaMaterias / 4;

        if (resultado >= 6) {
            if (resultado >= 9) {
                System.out.println("Exelencia con " + resultado);
            } else {
                System.out.println("Pasaste con " + resultado);
            }
        } else {
            System.out.println("Reprobaste con " + resultado);
        }
    }


    //CodigoDirigido al testing
    private Scanner scanner;

    public String Evaluation() {
        String message = "";
        double resultado = mathematicalFormulation(obtenerInformacion());
        if (resultado >= 6) {
            message = resultado >= 9? "Exelencia con " + resultado:"Pasaste con " + resultado;
        } else {
            message = "Reprobaste con " + resultado;
        }
        return message;
    }

    private Double[] obtenerInformacion() {
        double materia1, materia2, materia3, materia4;
        System.out.print("Español : ");
        materia1 = scanner.nextDouble();
        System.out.print("Matematicas : ");
        materia2 = scanner.nextDouble();
        System.out.print("Fisica : ");
        materia3 = scanner.nextDouble();
        System.out.print("Quimica : ");
        materia4 = scanner.nextDouble();
        return new Double[]{materia1, materia2, materia3, materia4};
    }

    private Double mathematicalFormulation(Double[] arregloDeMaterias) {
        Double resultado = 0.0;
        int contadorMaterias = 0;
        for (Double materia : arregloDeMaterias) {
            resultado += materia;
            contadorMaterias++;
        }
        return resultado/contadorMaterias;
    }
}
