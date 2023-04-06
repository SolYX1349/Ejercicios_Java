package parte_1.n1_programas_simples.mayor_edad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //Codigo base del ejercicio
    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        int edad = inputSc.nextInt();
        if (edad >= 18) {
            System.out.println("Mayor de edad.");
        } else {
            System.out.println("Menor de edad.");
        }
    }

    //Codigo dirigido al testing
    private Scanner scanner = new Scanner(System.in);
    private static final String ADULT_AGE_MESSAGE = "Your in age";
    private static final String MINOR_AGE_MESSAGE = "Your not in age";
    final static String INVALID_AGE_MESSAGE = "Invalid Age";

    public String evalMyAge() {
        int age = getUserAge();
        String message = "";
        if (age > 0 && age < 120) {
            message = age >= 18 ? ADULT_AGE_MESSAGE : MINOR_AGE_MESSAGE;
        } else {
            message = INVALID_AGE_MESSAGE;
        }
        return message;
    }

    private int getUserAge() {
        int age = 0;
        try {
            System.out.println("Digita tu edad");
            age = scanner.nextInt();
        } catch (InputMismatchException ex) {
            age = -1;
        }
        return age;
    }
}