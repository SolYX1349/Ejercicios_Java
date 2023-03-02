package com.mis_ejercicios.parte_3.ejercicios_colecciones.ejercicios_queue.ejercicio_stack;

import com.mis_ejercicios.parte_3.ejercicios_colecciones.ejercicios_queue.ejercicio_stack.entity.Cliente;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Stack<Cliente> pila = new Stack<>();
        pila.push(new Cliente(1,"Jorge luis","Trabajador"));
        pila.push(new Cliente(4,"Maria Hernandez","Soltera"));
        pila.push(new Cliente(7,"Ulises escampilla","Estudiante"));

        while (!pila.empty()){
            System.out.println("Atendiendo al cliente -> " + pila.pop());
            Thread.sleep(1000);
        }
        System.gc();
    }
}
