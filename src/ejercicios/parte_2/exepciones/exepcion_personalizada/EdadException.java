package com.mis_ejercicios.parte_2.exepciones.exepcion_personalizada;

public class EdadException extends Exception{
    public EdadException(String mensaje){
        System.err.println(mensaje);
    }
}
