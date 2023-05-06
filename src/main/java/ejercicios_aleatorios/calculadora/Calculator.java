package ejercicios_aleatorios.calculadora;

public class Calculator {

    private static final Integer DEFAULT_PERCENT = 100;

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
                result = sum(n1, n2);
                break;
            case "-":
                result = subtract(n1, n2);
                break;
            case "*":
                result = multiply(n1, n2);
                break;
            case "/":
                result = division(n1, n2);
                break;
            case "%":
                result = percent(n1, n2);
                break;
            default:
                throw new Exception();
        }
        return result;
    }

    private static double percent(double n1, double n2) {
        double result;
        result = (n1 * n2) / DEFAULT_PERCENT;
        return result;
    }

    private static double division(double n1, double n2) {
        double result;
        result = n1 / n2;
        return result;
    }

    private static double multiply(double n1, double n2) {
        double result;
        result = n1 * n2;
        return result;
    }

    private static double subtract(double n1, double n2) {
        double result;
        result = n1 - n2;
        return result;
    }

    private static double sum(double n1, double n2) {
        double result;
        result = n1 + n2;
        return result;
    }

    private static String printInformation(double n1, double n2, String option, double result) {
        return n1 + " " + option + " " + n2 + " = " + result;
    }
}
