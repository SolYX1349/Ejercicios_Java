package com.mis_ejercicios.parte_2.ejercicios_poo_herencia.cajero;
import com.mis_ejercicios.parte_2.ejercicios_poo_herencia.cajero.dominio.Cuenta;
import com.mis_ejercicios.parte_2.ejercicios_poo_herencia.cajero.dominio.Metodos;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerConsola = new Scanner(System.in);
        Metodos metodos ;
        int opcionConsola ;

        System.out.println("Bienvenido Ahora simularemos un cajero");
        System.out.print("Nombre: ");
        String nombre = scannerConsola.nextLine();
        System.out.print("Apellido: ");
        String apellido = scannerConsola.nextLine();
        System.out.print("N-cuenta: ");
        short numeroCuenta = scannerConsola.nextShort();

        Cuenta cuenta1 = new Cuenta(nombre,apellido,numeroCuenta);

        do {
            System.out.println("1-Depositar" +
                    "\n2-Retirar" +
                    "\n3-Salir");
            opcionConsola = scannerConsola.nextInt();

            switch (opcionConsola){
                case 1:
                    System.out.print("Cantidad a depositar :");
                    double cantidadDeposito = scannerConsola.nextDouble();
                    Metodos.depositoCuenta(cuenta1,cantidadDeposito);
                    break;
                case 2:
                    System.out.print("Cantidad a depositar :");
                    double cantidadRetiro = scannerConsola.nextDouble();
                    Metodos.retiroCuenta(cuenta1,cantidadRetiro);
                    break;
                case 3:
                    break;
            }
        }while (opcionConsola == 1 || opcionConsola == 2);
    }
}
