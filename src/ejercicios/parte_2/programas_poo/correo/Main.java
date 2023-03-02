package com.mis_ejercicios.parte_2.programas_poo.correo;
import com.mis_ejercicios.parte_2.programas_poo.correo.dominio.MetodosImp;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws InputMismatchException {

        Scanner inputScannerConsol = new Scanner(System.in);
        MetodosImp metodos = new MetodosImp();

        System.out.print("Correo : ");
        String correo = inputScannerConsol.nextLine();

        System.out.print("contrasenia : ");
        String password = inputScannerConsol.nextLine();

        boolean datos_agregados = metodos.agregarDatos(correo,password);

        if (datos_agregados != false){
            System.out.print("Correo : ");
            correo = inputScannerConsol.nextLine();

            System.out.print("contrasenia : ");
            password = inputScannerConsol.nextLine();
            metodos.verificarInformacion(correo , password);

        }else {
            System.out.println("Hay problemas en la evaluacion.");
        }
    }
}
