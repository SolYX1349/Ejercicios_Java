package ejercicios_aleatorios.math_libs;

public class BasicOperations {
    private static final Integer DEFAULT_PERCENT = 100;
    private static final Double DEFAULT_PI = 3.1416;
    public static double percent(double n1, double n2) {
        double result;
        result = (n1 * n2) / DEFAULT_PERCENT;
        return result;
    }

    public static double division(double n1, double n2) {
        double result;
        result = n1 / n2;
        return result;
    }

    public static double multiply(double n1, double n2) {
        double result;
        result = n1 * n2;
        return result;
    }

    public static double subtract(double n1, double n2) {
        double result;
        result = n1 - n2;
        return result;
    }

    public static double sum(double n1, double n2) {
        double result;
        result = n1 + n2;
        return result;
    }
}
