package parte_1.n2_estructuras_condicionales.tanque_de_gas;

import java.util.Scanner;

public class Main {

    public Main() {
    }

    //Codigo base del ejercicio
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        StringBuilder strB = new StringBuilder();

        System.out.println("Cantidad de litros requerida? ");
        int cantidadLitrosRequerida = inputScanner.nextInt();

        if (cantidadLitrosRequerida >= 1 && cantidadLitrosRequerida < 20) {
            strB.append("gasolina insuficiente.");
        } else if (cantidadLitrosRequerida > 20 && cantidadLitrosRequerida < 35) {
            strB.append("gasolina suficiente.");
        } else if (cantidadLitrosRequerida > 35 && cantidadLitrosRequerida < 40) {
            strB.append("Tanque medio.");
        } else if (cantidadLitrosRequerida > 40 && cantidadLitrosRequerida < 60) {
            strB.append("Tanque a 3/4.");
        } else if (cantidadLitrosRequerida > 60 && cantidadLitrosRequerida < 70) {
            strB.append("Tanque casi lleno.");
        } else {
            strB.append("Tanque lleno.");
        }
        System.out.println(strB);
    }

    //Codigo dirigido al testing
    private Scanner scanner;

    public String calcularGasolinaIngresada() {

        System.out.println("Cantidad de litros requerida? ");
        int cantidadGas = scanner.nextInt();

        String message = "Error Verifica La cantidad";
        if (cantidadGas >= 1 && cantidadGas <= 70) {
            if (cantidadGas <= 20) {
                message = "Tanque Casi Vacio";
            } else if (cantidadGas <= 35) {
                message = "Gasolina Insuficiente";
            } else if (cantidadGas <= 40) {
                message = "Tanque Medio";
            } else if (cantidadGas <= 60) {
                message = "Tanque a 3/4";
            } else if (cantidadGas < 70) {
                message = "Tanque Casi lleno";
            } else {
                message = "Tanque lleno";
            }
        }
        return message;
    }
}
