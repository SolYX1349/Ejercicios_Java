package parte_1.n2_estructuras_condicionales.probar_suerte;

import java.util.Scanner;

public class ProbarSuerte {

    //Codigo base del ejercicio-----------------------------------------------------------------------------------------
    protected static int contador = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean evaliacionSalida;
        int numero;

        System.out.println("Bienvenido a la loteria el premio de este dia es de $ 1_000_000" +
                "\n tienes que adivinar un numero de el > 0 al 100 <");

        do {

            System.out.println("Numero:");
            numero = scanner.nextInt();
            evaliacionSalida = evaluador(numero);

        } while (!evaliacionSalida);
        System.out.println("Para ganar tiviste que hacer " + contador + " intentos.");
    }

    protected static boolean evaluador(int numero) {
        int numeroGanador = 50;
        if (numero >= 0 && numero <= 100) {
            if (numero < numeroGanador) {
                System.out.println("Tu numero es muy pequenio.");
                contador++;
            } else if (numero > numeroGanador) {
                System.out.println("Tu numero es muy grande.");
                contador++;
            } else {
                System.out.println("Felicidades has ganado !!!!!!");
                contador++;
                return true;
            }
        } else {
            System.out.println("El numero ingresado no es valido para el juego.");
        }
        return false;
    }

    //Codigo dirigido al testing----------------------------------------------------------------------------------------
    private static final String WELCOME_AND_RULES_MESSAGE = "Bienvenido a la loteria el premio de este dia es de $ 1,000,000\ntienes que adivinar un numero de el > 0 al 100 < \n para terminar introduce -1.";
    private static final String OUT_MESSAGE = "Para ganar tuviste que hacer " + contador + " intentos.";
    private int winningNumber = 0;
    private int attemptCounter = 0;

    public void run() {
        System.out.println(WELCOME_AND_RULES_MESSAGE);
        OptionsOfThePlayer();
        System.out.println(OUT_MESSAGE);
    }

    private void OptionsOfThePlayer() {
        Scanner scanner = new Scanner(System.in);
        generateWinningNumber();
        int number;
        do {
            try {
                System.out.print("Numero:");
                number = scanner.nextInt();
                if (number == -1) {
                    break;
                }
            } catch (Exception ex) {
                break;
            }
        } while (!thePlayerWon(number));
    }

    private void generateWinningNumber() {
        this.winningNumber = (int) (Math.random() * 100);
    }

    private boolean thePlayerWon(int number) {
        boolean isWinner = false;
        if (number >= 0 && number <= 100) {
            if (number < this.winningNumber) {
                System.out.println("Tu numero es muy pequeño.");
                attemptCounter++;
            } else if (number > this.winningNumber) {
                System.out.println("Tu numero es muy grande.");
                attemptCounter++;
            } else {
                System.out.println("Felicidades has ganado !!!!");
                attemptCounter++;
                isWinner = true;
            }
        } else {
            System.out.println("El numero ingresado no es valido para el juego.");
        }
        return isWinner;
    }
}
