package ejercicios_aleatorios.multiplicaciones;

import java.util.Scanner;

public class Multiplicaciones {

    public static void main(String[] args) {
        Multiplicaciones mul = new Multiplicaciones();
        mul.Run();
    }

    Scanner scanner = new Scanner(System.in);
    private static int asserts = 0;
    private static int notCorrect = 0;

    public void Run() {
        do {
            Integer[] array = generadorDePregunta();
            String muliplicacion = array[0] + " X " + array[1];
            System.out.println(muliplicacion + " = ?");

            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("close")) {
                break;
            }
            if (option.equals(String.valueOf(array[2]))) {
                System.out.println(muliplicacion + " = " + array[2] + " Correcto");
                Multiplicaciones.asserts++;
            } else {
                System.err.println(muliplicacion + " = " + array[2] + " Incorrecto");
                Multiplicaciones.notCorrect++;
            }
        } while (true);
        System.out.println("Correctas = " + asserts);
        System.out.println("Incorrectas = " + notCorrect);
    }

    private Integer[] generadorDePregunta() {
        int numero1 = (int) (Math.random() * 10) + 1;
        int numero2 = (int) (Math.random() * 10) + 1;
        int resulatado = numero1 * numero2;
        return new Integer[]{numero1, numero2, resulatado};
    }
}
