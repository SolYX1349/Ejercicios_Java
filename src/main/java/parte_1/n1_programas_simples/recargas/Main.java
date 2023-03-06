package parte_1.n1_programas_simples.recargas;

import java.util.Scanner;

public class Main {
    private Scanner scanner;

    //Codigo somple del ejercicio
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        int numberUser, numberToVerify;

        System.out.println("Number phone: ");
        numberUser = inputScanner.nextInt();

        System.out.println("Verify your number phone");
        numberToVerify = inputScanner.nextInt();

        if (numberUser == numberToVerify) {
            System.out.println("Recharge done");
        } else {
            System.out.println("The number phone isn't correct");
        }
    }

    //Codigo para test
    public String run() {
        String message = "";
        int numberUser, numberToVerify;

        System.out.println("Number phone: ");
        numberUser = scanner.nextInt();

        System.out.println("Verify your number phone");
        numberToVerify = scanner.nextInt();

        if (numberUser == numberToVerify) {
            message = "Recharge done";
        } else {
            message = "The number phone isn't correct";
        }
        return message;
    }
}
