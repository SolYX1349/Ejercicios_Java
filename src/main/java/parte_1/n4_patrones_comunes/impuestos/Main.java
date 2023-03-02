package parte_1.n4_patrones_comunes.impuestos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner (System.in);

        double precio1 = 0, precio2 = 0 ,montoTotal , inpuesto , montoTotalConInpuesto;
        String nombreFactura1  = "";

        try{
            System.out.print("Nombre factura: ");
            nombreFactura1 = inputScanner.nextLine();

            System.out.print("Precio: ");
            precio1 = inputScanner.nextDouble();

            System.out.print("Precio: ");
            precio2 = inputScanner.nextDouble();

        }catch (Exception ex){
            System.out.println();
            main(args);
            System.exit(0);
        }
        montoTotal = precio1 + precio2;
        inpuesto = (montoTotal * 19) / 100;
        montoTotalConInpuesto = montoTotal + inpuesto;

        System.out.println("Nombre factura: " + nombreFactura1 + " \nTotal = " + precio1);
        System.out.println("Inpuesto: " + inpuesto);
        System.out.println("Total mas inpuesto: " + montoTotalConInpuesto);
    }
}
