package com.mis_ejercicios.parte_1.n5_ejercicios_arreglos.eliminar_una_posicion;

public class Main {
    public static void main(String[] args) {
        String [] nombres = {"Carlos","Humberto","Hall","Stephen","William"};
        eliminarPos(nombres,"HAll");
    }
    private static void eliminarPos (String [] array, String palabra){
        if (exist(array,palabra)){
            String [] cadenas = new String[array.length-1];
            for (int i = 0; i < array.length ; i++) {
                if (array[i].toLowerCase().contains(palabra.toLowerCase())){
                    for (int j = i; j < cadenas.length; j++) {
                        cadenas [j] = array[j+1];
                    }
                    break;
                }else{
                    cadenas [i] = array[i];
                }
            }
            for (Object x: cadenas) {
                System.out.println(x);
            }
        }else {
            System.err.println("Tu arreglo no contiene ese contenido (" + palabra +")");
        }
    }
    private static boolean exist(String [] array , String word){
        for (String s : array) {
            if (s.toLowerCase().contains(word.toLowerCase())) { return true; }
        }return false;
    }
}
