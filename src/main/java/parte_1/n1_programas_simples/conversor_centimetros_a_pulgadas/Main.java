package parte_1.n1_programas_simples.conversor_centimetros_a_pulgadas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //Codigo base del ejercicio
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Medida cm : ");
        float medida_cm = inputScanner.nextFloat();
        float resultadoPulgadas = (float) (medida_cm / 2.54);

        System.out.println(medida_cm + " cm = " + resultadoPulgadas + " in");
    }

    //Codigo dirigido al testing
    private Scanner scanner = new Scanner(System.in);

    public String unitConverter() {
        String message = "Invalid Argument or Argument Equals Zero";
        double centimeters = getUserMeasurement();
        if (centimeters != 0) {
            message = centimeters + " cm = " + mathematicalFormulation(centimeters) + " in";
        }
        return message;
    }

    private Double getUserMeasurement() {
        double centimeters = 0.0;
        try {
            System.out.print("Medida cm : ");
            centimeters = scanner.nextDouble();
        } catch (InputMismatchException ex) {
            centimeters = 0;
        }
        return centimeters;
    }

    private Double mathematicalFormulation(double value) {
        return value / 2.54;
    }
}
