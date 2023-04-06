package parte_1.n1_programas_simples.edad;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    //Codigo base del ejercicio
    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);
        System.out.println("¿Cual es tu año de nacimiento?");
        int anioNacimiento = inputSc.nextInt();
        System.out.println("¿En que año te encuentras?");
        int fechaActual = inputSc.nextInt();
        int anios = fechaActual - anioNacimiento;
        System.out.println("Tu edad es de " + anios);
    }

    //Codigo dirigido al testing
    private Scanner scanner;

    public String determinarEdad() {
        final String invalidMessage = "Error Invalid Dates";
        System.out.println("¿Cual es tu año de nacimiento?");
        int birthYear = scanner.nextInt();
        System.out.println("¿En que año te encuentras?");
        int yearToCalculate = scanner.nextInt();
        String validMessage = "Tu edad es de " + (yearToCalculate - birthYear);
        return birthYear >= 0 ? validMessage : invalidMessage;
    }
}
