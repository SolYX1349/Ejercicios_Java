package parte_1.n1_programas_simples.longitud_nombre;

import java.util.Scanner;

public class Main {
    //Codigo base del ejercicio
    public static void main(String[] args) {
        Scanner inputScann = new Scanner(System.in);

        System.out.print("Nombre = ");
        String nombre = inputScann.nextLine();

        int nombreLength = nombre.length();
        System.out.println("Nombre contiene " + nombreLength + " caracteres.");
    }

    // Codigo dirigido al testing
    private Scanner scanner;

    public String nameLength() {
        String name = getUserName();
        return !name.equals("Invalid Argument")?"Nombre contiene " + name.length() + " caracteres.":"Invalid Argument";
    }

    private boolean validText(String text) {
        boolean isValid = false;
        if (text != null) {
            if (!text.isBlank()) {
                isValid = true;
            }
        }
        return isValid;
    }

    private String getUserName() {
        System.out.print("Nombre = ");
        String nombre = scanner.nextLine();
        if (!validText(nombre)) {
            nombre = "Invalid Argument";
        }
        return nombre;
    }
}
