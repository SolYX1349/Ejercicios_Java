package parte_1.n2_estructuras_condicionales.anios_bisiestos;

import javax.swing.*;

public class Main {
    //Codigo base del ejercicio
    public static void main(String[] args) {

        String dialogoEntrada = JOptionPane.showInputDialog(null, "Digita un año:");

        short anio = Short.parseShort(dialogoEntrada);
        byte anioBisiesto = (byte) (anio % 4);
        if (anioBisiesto == 0) {
            JOptionPane.showMessageDialog(null, anio + " si es año bisiesto");
        } else {
            JOptionPane.showMessageDialog(null, anio + " no es año bisiesto");
        }
    }

    //Codigo dirigido al testing
    public static String isItLeapYear(Integer year) {
        String outMessage = "Invalid Year";
        if (year != null && year >= 0) {
            outMessage = (year % 4) == 0 ? year + " It's Leap Year" : year + " Not a Leap Year";
        }
        return outMessage;
    }
}