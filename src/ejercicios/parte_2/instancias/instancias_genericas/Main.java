package com.mis_ejercicios.parte_2.instancias.instancias_genericas;

public class Main {
    public static void main(String[] args) {
        verInstancias(10.2);
    }
    private static void verInstancias (Object object){
        if (object != null){
            if (object instanceof String){
                System.out.println("Tu objeto es -> String");
            }else if (object instanceof Number){
                System.out.println("Tu objeto es -> Number");
            }else if (object instanceof Boolean){
                System.out.println("Tu objeto es -> Boolean");
            } else {
                System.out.println("Tu objeto es -> Object");
            }
        }
    }
}
