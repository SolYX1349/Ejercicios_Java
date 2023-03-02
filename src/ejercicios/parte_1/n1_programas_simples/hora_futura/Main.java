package com.mis_ejercicios.parte_1.n1_programas_simples.hora_futura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputConsol = new Scanner(System.in);

        System.out.print("Hora actual : ");
        int horaActual = inputConsol.nextInt();

        System.out.print("Cantidad de horas : ");
        int cantidadHoras = inputConsol.nextInt();

        tiempoFuturo(horaActual , cantidadHoras);

    }
    private static void tiempoFuturo (int horaActual , int cantidadHoras ){
        for (int i = 0; i < cantidadHoras ; i++) {
            ++ horaActual ;
            if (horaActual == 12){
                horaActual = 0;
            }
        }
        int dias = cantidadHoras / 24;
        if (horaActual == 0 ){horaActual = 12;}
        System.out.println("En " + cantidadHoras + " horas, el relor marcara las " + horaActual + " horas y habran pasado " + dias + " dias." );
    }
}
