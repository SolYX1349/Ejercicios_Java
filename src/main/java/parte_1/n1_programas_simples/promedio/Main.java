package parte_1.n1_programas_simples.promedio;

import java.util.Scanner;

public class Main {
    private Scanner scanner;

    //Codigo simple del ejercicio
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Primera nota: ");
        float primeraNota = inputScanner.nextFloat();
        System.out.print("Segunda nota: ");
        float segundaNota = inputScanner.nextFloat();
        System.out.print("Tercera nota: ");
        float terceraNota = inputScanner.nextFloat();
        System.out.print("Cuarta nota: ");
        float cuartaNota = inputScanner.nextFloat();

        float resultadoFinal = (primeraNota + segundaNota + terceraNota + cuartaNota) / 4;

        if (resultadoFinal >= 6 && resultadoFinal <= 10) {
            System.out.println("Resultado aprobatorio = " + resultadoFinal);
        } else {
            System.out.println("Resultado reprobatorio = " + resultadoFinal);
        }
    }

    //Codigo dirigido al testing
    public String evaluaResultadoEscolar() {
        String message = "";
        Double[] arrayNotes = getUserNotes();
        if (validArguments(arrayNotes)) {
            double result = mathematicallyFormulateNotes(arrayNotes);
            message = result >= 6.0 && result <= 10.0 ? "Resultado aprobatorio" : "Resultado reprobatorio";
        } else {
            message = "Invalid data error";
        }
        return message;
    }

    private Double[] getUserNotes() {
        System.out.print("First note: ");
        double note1 = scanner.nextDouble();
        System.out.print("Second note: ");
        double note2 = scanner.nextDouble();
        System.out.print("Third note: ");
        double note3 = scanner.nextDouble();
        System.out.print("Fourth note: ");
        double note4 = scanner.nextDouble();
        return new Double[]{note1, note2, note3, note4};
    }

    private boolean validArguments(Double[] arrayNotes) {
        boolean theyAreValid = true;
        for (Double contentOfAnArray : arrayNotes) {
            if (contentOfAnArray == null) {
                theyAreValid = false;
                break;
            }
        }
        if (theyAreValid) {
            for (Double contentOfAnArray : arrayNotes) {
                if (contentOfAnArray < 0.0 || contentOfAnArray > 10.0) {
                    theyAreValid = false;
                    break;
                }
            }
        }
        return theyAreValid;
    }

    private double mathematicallyFormulateNotes(Double[] arrayNotes) {
        double sumOfNotes = 0.0;
        for (Double contentOfAnArray : arrayNotes) {
            sumOfNotes += contentOfAnArray;
        }
        return sumOfNotes / 4;
    }
}
