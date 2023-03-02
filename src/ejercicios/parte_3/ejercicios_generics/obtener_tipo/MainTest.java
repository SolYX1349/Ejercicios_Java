package com.mis_ejercicios.parte_3.ejercicios_generics.obtener_tipo;

public class MainTest {
    public static void main(String[] args) {
        ClaseGenerica<Integer> generic = new ClaseGenerica<>(1);
        System.out.println(generic.getObjeto());

        ClaseGenerica<String> generic1 = new ClaseGenerica<>("Hola");
        System.out.println(generic1.getObjeto());

        System.exit(0);
    }
}
