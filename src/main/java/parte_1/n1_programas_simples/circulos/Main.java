package parte_1.n1_programas_simples.circulos;

import java.util.*;

public class Main {
    //Codigo base del ejercicio
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Ingresa el radio de el circulo : ");
        double radio = inputScanner.nextDouble();

        double diametro = radio * 2;
        double perimetro = (diametro * 3.1416);
        double area = (3.1416 * radio) * radio;

        System.out.print("Perimetro = " + perimetro + "\nArea = " + area + "\nDiametro = " + diametro);
    }

    //Codigo dirigido al testing
    private Scanner scanner = new Scanner(System.in);

    public String calculateCircles() {
        Double [] datos = mathematicalFormulation(obtenerDatos());
        return "Perimetro = " + datos[1] + " Area = " + datos[2] + " Diametro = " + datos[0];
    }
    private double obtenerDatos(){
        double radio;
        try {
            System.out.print("Ingresa el radio de el circulo : ");
            radio = scanner.nextDouble();
        }catch (InputMismatchException ex){
            radio = 0;
        }
        return radio;
    }
    private Double[] mathematicalFormulation(double value) {
        double diametro = value * 2;
        double perimetro = (diametro * 3.1416);
        double area = (3.1416 * value) * value;
        return new Double[]{diametro, perimetro, area};
    }
}
