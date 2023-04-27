package parte_1.n4_ejercicios_arreglos.ejercicios_unidimencionales.notas_y_promedios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double [] alumnos = new Double[3];
        promedios(alumnos);
    }
    private static void promedios(Double [] array){
        Scanner inputScanner = new Scanner(System.in);
        double matematicas , historia , geografia , promedio;
        int cont = 1;

        for (int i = 0; i < array.length ; i++) {
            System.out.print("Alumno #" + cont++ + "\nMatematicas: ");
            matematicas = inputScanner.nextDouble();
            System.out.print("Historia: ");
            historia = inputScanner.nextDouble();
            System.out.print("Geografia: ");
            geografia = inputScanner.nextDouble();
            array[i] = (double) Math.round((matematicas + historia + geografia) / 3);
            System.out.println("......................");
        }
        System.out.println("......................");
        for (Object promedios:array) {
            System.out.println("Alumno #" + promedios);
        }
        double nota, total = 0;
        for (Double aDouble : array) {
            nota = aDouble;
            total = nota + total;
        }
        System.out.println("......................");
        promedio = total / array.length;
        System.out.println("Promedio Del Curso = " + Math.round(promedio));
    }
}
