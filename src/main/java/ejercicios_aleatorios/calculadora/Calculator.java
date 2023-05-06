package ejercicios_aleatorios.calculadora;

import ejercicios_aleatorios.libs.BasicOperations;

public class Calculator {

    public static String Calculate(double n1, double n2, String option) {
        double result;
        String message;
        try {
            result = evalOptionAndResults(n1, n2, option);
            message = printInformation(n1, n2, option, result);
        } catch (Exception e) {
            message = "No exist this operator.";
        }
        return message;
    }

    private static double evalOptionAndResults(double n1, double n2, String option) throws Exception {
        double result;
        switch (option) {
            case "+":
                result = BasicOperations.sum(n1, n2);
                break;
            case "-":
                result = BasicOperations.subtract(n1, n2);
                break;
            case "*":
                result = BasicOperations.multiply(n1, n2);
                break;
            case "/":
                result = BasicOperations.division(n1, n2);
                break;
            case "%":
                result = BasicOperations.percent(n1, n2);
                break;
            default:
                throw new Exception();
        }
        return result;
    }

    private static String printInformation(double n1, double n2, String option, double result) {
        return n1 + " " + option + " " + n2 + " = " + result;
    }
}
