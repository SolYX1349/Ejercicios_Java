package parte_1.n1_programas_simples.longitud_nombre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScann = new Scanner(System.in);

        System.out.print("Nombre = ");
        String nombre = inputScann.nextLine();

        int nombreLength = nombre.length();
        System.out.println("Nombre contiene " + nombreLength + " caracteres.");
    }
}
