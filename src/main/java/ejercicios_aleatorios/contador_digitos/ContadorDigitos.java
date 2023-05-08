package ejercicios_aleatorios.contador_digitos;

public class ContadorDigitos {

    public static int countTheDigitsOfTheNumber(int number) {
        String conversorStr = String.valueOf(number);
        return conversorStr.length();
    }
}