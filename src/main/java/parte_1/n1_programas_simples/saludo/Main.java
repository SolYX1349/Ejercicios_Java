package parte_1.n1_programas_simples.saludo;

import java.util.*;

public class Main {
    private Scanner scanner;

    //Codigo simple del ejercicio
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Cual es tu nombre: ");
        String nombre = inputScanner.nextLine();
        System.out.println("Hola, " + nombre);
    }

    //Codigo para test
    public String sayHello() {
        System.out.print("Cual es tu nombre: ");
        String name = scanner.nextLine();
        System.out.println("Hola " + name);
        return "Hola " + name;
    }
}
