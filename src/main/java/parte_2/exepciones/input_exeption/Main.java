package parte_2.exepciones.input_exeption;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        sumar();
    }
    private static void sumar (){
        try {
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("++++++Suma++++++ \nIngresa un numero: ");
            double a = inputScanner.nextDouble();
            System.out.print("Ingresa un numero: ");
            double b = inputScanner.nextDouble();
            System.out.println("Suma = " + (a + b));
        }catch (InputMismatchException imex){
            System.err.println(Arrays.toString(imex.getStackTrace()));
            System.err.println(imex.getCause());
            System.err.println("Error de entrada de valor.");
        }
    }
}
