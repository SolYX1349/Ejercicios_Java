package parte_1.n3_ciclos.escalera_iterador;

import java.util.Scanner;

public class EscaleraFor {
    //Codigo base del ejercicio
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int longitudEscalera, x = 1, b = 1;

        System.out.println("Digita la longitud de tu piramide.");
        longitudEscalera = inputScanner.nextInt();

        for (int numeroAparente = 1; numeroAparente <= longitudEscalera; numeroAparente++) {
            System.out.print(b);

            for (int j = 0; j < numeroAparente; j++) {
                if (j >= 1) {
                    x++;
                    System.out.print(x);
                }
            }

            x = 1;
            System.out.println();
        }
    }

    //Codigo dirigido al testing
    public static String escaleraFor(int longitud) {
        StringBuilder sb = new StringBuilder();
        int x = 1;
        for (int columnas = 1; columnas <= longitud; columnas++) {
            sb.append(x);

            for (int filas = 0; filas < columnas; filas++) {
                if (filas >= 1) {
                    sb.append(++x);
                }
            }

            x = 1;
            sb.append("\n");
        }
        return String.valueOf(sb).trim();
    }
}
