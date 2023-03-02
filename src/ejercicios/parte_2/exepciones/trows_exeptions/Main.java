package com.mis_ejercicios.parte_2.exepciones.trows_exeptions;
public class Main {
    private static void metodo1()throws Exception{
        System.err.println("Metodo 1 arroja exception.");
        int resultado = 10 / 0;
        System.out.println(resultado);
    }
    private static void metodo2() throws Exception {
        System.err.println("Metodo 2 arroja exception.");
        metodo1();
    }
    private static void metodo3(){
        try {
            metodo2();
        }catch (Exception ex){
            System.err.println("Metodo 3 trata la exception.");
            System.err.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        metodo3();
    }
}