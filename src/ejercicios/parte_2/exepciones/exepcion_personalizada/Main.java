package com.mis_ejercicios.parte_2.exepciones.exepcion_personalizada;

public class Main {
    public static void main(String[] args) throws EdadException {
        edadVal(-1);
    }
    private static void edadVal(int edad) throws EdadException {
        final int EDAD_MIN = 1;
        final  int EDAD_MAX = 110;
        if (edad < EDAD_MAX && edad >= EDAD_MIN){
            System.out.println("Edad valida");
        }else {
            throw new EdadException("Edad no valida");
        }
    }
}
