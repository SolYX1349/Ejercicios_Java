package ejercicios_aleatorios.separacion_de_cadenas;

import java.util.regex.Pattern;

public class Main {
    public static String[] splitString(String text, String regEx) {
        Pattern pattern = Pattern.compile(regEx);
        return pattern.split(text);
    }
}
