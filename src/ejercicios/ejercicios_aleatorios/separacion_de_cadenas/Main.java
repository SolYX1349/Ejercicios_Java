package com.mis_ejercicios.ejercicios_aleatorios.separacion_de_cadenas;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String cadena = "nombre;apellido;ciudad;edad;pais;calle;hijos;padres;casa;algoritmos;estudios;peso;estatura;promedio";
        for (String element : splitString(cadena)) {
            System.out.println(element);
        }
    }

    private static String[] splitString(String arg) {
        Pattern pattern = Pattern.compile(";");
        return pattern.split(arg);
    }
}
