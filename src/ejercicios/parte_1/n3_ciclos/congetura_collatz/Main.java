package com.mis_ejercicios.parte_1.n3_ciclos.congetura_collatz;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            String cadena = JOptionPane.showInputDialog(null,"Digita un numero.");
            int numero = Integer.parseInt(cadena);
            congetura3n(numero);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Digita un numero!!");
            main(args);
            System.exit(0);
        }
    }
    public static void congetura3n (int numero){
        int modulo, siNumeroPar,siNumeroInpar;
        System.out.print(numero + " ");
        for (int i = 0; i < 50 ; i++) {
            modulo = numero % 2;
            if (modulo == 0){
                siNumeroPar = numero / 2;
                System.out.print(siNumeroPar + " ");
                numero = siNumeroPar;
                if (numero == 1) { System.out.println(); }
            }else {
                siNumeroInpar = numero * 3 + 1;
                System.out.print(siNumeroInpar + " ");
                numero = siNumeroInpar;
                if (numero == 1) { System.out.println(); }
            }
        }
    }
}
