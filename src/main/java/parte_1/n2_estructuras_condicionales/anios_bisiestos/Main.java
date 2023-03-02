package parte_1.n2_estructuras_condicionales.anios_bisiestos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String dialogoEntrada = JOptionPane.showInputDialog(null,"Digita un año:");

        short anio = Short.parseShort(dialogoEntrada);
        byte anioBisiesto = (byte) (anio % 4);
        if (anioBisiesto == 0){
            JOptionPane.showMessageDialog(null,anio + " si es año bisiesto");
        }else {
            JOptionPane.showMessageDialog(null,anio + " no es año bisiesto");
        }
    }
}
