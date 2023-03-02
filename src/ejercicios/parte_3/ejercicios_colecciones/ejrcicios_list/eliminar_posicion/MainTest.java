package com.mis_ejercicios.parte_3.ejercicios_colecciones.ejrcicios_list.eliminar_posicion;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        List <Integer> numeros = new ArrayList<>();
        numeros.add(17);
        numeros.add(256);
        numeros.add(3567);
        numeros.add(4345);
        numeros.add(47545);
        numeros.add(475);
        eliminarPos(numeros , 4345);
    }
    private static void eliminarPos (Collection<Integer> obj,int contents){
        if (isVoid(obj,contents)){
            obj.remove(contents);
            System.out.println("Objeto ("+contents+") eliminado");
            imprimir(obj);
        }else { System.err.println("Error no existe el objeto en la lista"); }
    }
    private static Boolean isVoid (Collection<Integer> obj, int content){
        return !obj.isEmpty() && obj.contains(content);
    }
    private static void imprimir(Collection<Integer> obj){
        obj.forEach(arr -> System.out.println("Array: " + arr));
    }
}
