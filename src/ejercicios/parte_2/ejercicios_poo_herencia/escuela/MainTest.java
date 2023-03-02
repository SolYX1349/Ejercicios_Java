package com.mis_ejercicios.parte_2.ejercicios_poo_herencia.escuela;

import com.mis_ejercicios.parte_2.ejercicios_poo_herencia.escuela.domain.Alumno;
import com.mis_ejercicios.parte_2.ejercicios_poo_herencia.escuela.domain.Persona;
import com.mis_ejercicios.parte_2.ejercicios_poo_herencia.escuela.domain.Profesor;

public class MainTest {
    public static void main(String[] args) {
        Persona persona = new Alumno("Piter","Perez",19,6);
        Persona persona1 = new Profesor("Albert","Martinez",30,'M');
        print(persona);
        print(persona1);
    }
    private static void print(Persona persona){
        System.out.println( persona.toString());
    }
}
