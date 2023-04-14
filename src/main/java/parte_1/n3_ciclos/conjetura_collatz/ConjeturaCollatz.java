package parte_1.n3_ciclos.conjetura_collatz;

import javax.swing.*;

public class ConjeturaCollatz {

    //    Codigo base del ejercicio
    public static void main(String[] args) {
        try {
            String cadena = JOptionPane.showInputDialog(null, "Digita un numero.");
            int numero = Integer.parseInt(cadena);
            conjetura3n(numero);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Digita un numero!!");
            main(args);
            System.exit(0);
        }
    }

    private static void conjetura3n(int numero) {
        int modulo, siNumeroPar, siNumeroInpar;
        System.out.print(numero + " ");
        for (int i = 0; i < 50; i++) {
            modulo = numero % 2;
            if (modulo == 0) {
                siNumeroPar = numero / 2;
                System.out.print(siNumeroPar + " ");
                numero = siNumeroPar;
                if (numero == 1) {
                    System.out.println();
                }
            } else {
                siNumeroInpar = numero * 3 + 1;
                System.out.print(siNumeroInpar + " ");
                numero = siNumeroInpar;
                if (numero == 1) {
                    System.out.println();
                }
            }
        }
    }

    //    Codigo dirigido al testing
    public static String formula3n(int number, int findNumber) {
        StringBuilder cadena = new StringBuilder(number + " ");
        int limiteIteraciones = 30;

        for (int i = 0; i < limiteIteraciones; i++) {
            number = number % 2 == 0 ? number / 2 : number * 3 + 1;
            cadena.append(number).append(" ");
            if (number == findNumber) break;
            if (number == 1) cadena.append("\n");
        }

        return String.valueOf(cadena).trim();
    }
}
