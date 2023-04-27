package ejercicios_aleatorios.calculadora;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("N1 : ");
        double numero1 = inputScanner.nextDouble();
        System.out.print("N2 : ");
        double numero2 = inputScanner.nextDouble();
        System.out.println("Digita la operacion a realizar con los operadores(+ , - , * , / , % )");
        char opcion = inputScanner.next().charAt(0);
        double resultado = 0;
        switch (opcion){
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
               resultado = numero1 / numero2;
                break;
            case '%':
                resultado = ( numero1 * numero2 ) / 100;
                break;
            case ',':
                System.out.println("La comilla solo es para separar los operadores. :( ");
                break;
            default:
                System.out.println("Ocurrio un error. :((");
        }
        System.out.println(numero1 + " " + opcion + " "+ numero2 + " = " + resultado );
    }
}
