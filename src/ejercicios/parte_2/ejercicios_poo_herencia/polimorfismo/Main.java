package com.mis_ejercicios.parte_2.ejercicios_poo_herencia.polimorfismo;
import com.mis_ejercicios.parte_2.ejercicios_poo_herencia.polimorfismo.clases.*;
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("salumon",1.200);
        imprimir(empleado);
        empleado = new Gerente("Carla",1.200,"copias");
        imprimir(empleado);
    }
    private static void imprimir (Empleado empleado) {
        System.out.println(empleado.obtenerDetalles());
        }
    }
