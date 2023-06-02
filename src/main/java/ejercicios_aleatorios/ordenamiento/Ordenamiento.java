package ejercicios_aleatorios.ordenamiento;
import java.util.*;

public class Ordenamiento {
    public static void main(String[] args) {
        Scanner inputConsole = new Scanner(System.in);
        int [] numeros = new int[1];

        for (int i = 0; i <numeros.length ; i++) {
            System.out.print("Digita un numero: ");
            int numero = inputConsole.nextInt();
            numeros [i] = numero;
        }
        Arrays.sort(numeros);
        for (int numerosSort:numeros) {
            System.out.println("numerosSort = " + numerosSort);
        }
    }
}
