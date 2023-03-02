package parte_1.n1_programas_simples.saludo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
            System.out.print("Cual es tu nombre: ");
            String nombre = inputScanner.nextLine();
            System.out.println("Hola, " + nombre);
    }
}
