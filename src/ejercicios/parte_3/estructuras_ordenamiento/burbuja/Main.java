package com.mis_ejercicios.parte_3.estructuras_ordenamiento.burbuja;

public class Main {
    public static void main(String[] args) {
        String [] productos = new String[6];
        productos [0] = "sacos";
        productos [1] = "botellas";
        productos [2] = "aparatos electronicos";
        productos [3] = "chatarra";
        productos [4] = "pintura";
        productos [5] = "guantes";

        metodoBurbuja(productos);
        for (String pr: productos) {System.out.println(pr);}
    }
    protected static void metodoBurbuja (String [] arreglo){
        int indexLength = arreglo.length;
        try {
            for (int i = 0; i < indexLength -1; i++) {
                for (int j = 0; j < indexLength -1 ; j++) {
                    if (arreglo [j + 1].compareTo(arreglo[j]) < 0){
                        String auxiliar = arreglo[j];
                        arreglo [j] = arreglo[j + 1];
                        arreglo [j + 1] = auxiliar;
                    }
                }
            }
        }catch (NullPointerException npex){
            System.err.println("Deves inicializar los campos. " + npex.getMessage());
        }
    }
}
