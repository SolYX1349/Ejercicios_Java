package ejercicios_aleatorios.separacion_de_cadenas;

import java.util.regex.Pattern;

public class Main {
    public String[] splitString(String text, String regEx) {
        if (validationOfArguments(text, regEx)) {
            Pattern pattern = Pattern.compile(regEx);
            return pattern.split(text);
        }
        return new String[1];
    }

    public static boolean validationOfArguments(String txt, String regEx) {
        boolean isValid = false;
        if (validText(txt)){
            if (valRegEx(regEx, txt)){
                isValid = true;
            }
        }
        return isValid;
    }

    public static boolean validText(String text) {
        boolean isValid = true;
        if (text == null) {
            isValid = false;
        } else {
            if (text.isBlank()) {
                isValid = false;
            }
            if (text.length() <= 1) {
                isValid = false;
            }
        }
        return isValid;
    }

    public static boolean valRegEx(String regEx, String text) {
        boolean isValid = true;
        if (regEx == null) {
            isValid = false;
        } else {
            if (regEx.isBlank()) {
                isValid = false;
            }
            if (!text.contains(regEx)) {
                isValid = false;
            }
        }
        return isValid;
    }
}
