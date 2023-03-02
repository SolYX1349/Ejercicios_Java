package com.mis_ejercicios.parte_2.programas_poo.contador_objetos;

public class MainTest {
    public static void main(String[] args) {
        Animal animal = null;
        for (int i = 0; i <10; i++) {
            animal = new Animal(i);
            System.out.println(animal.toString());
        }
        System.out.println("Total de objetos tipo clase creados = "+animal.getContador());
    }
}
