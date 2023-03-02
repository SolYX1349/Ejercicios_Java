package com.mis_ejercicios.parte_1.n4_patrones_comunes.uper_y_lower;

public class Main {
    public static void main(String[] args) {
        convercion("hola mundo" , "minus");
    }
    private static void convercion (String texto , String tipoLetra){
        String tipo = tipoLetra.toLowerCase();
        String cadena;
        switch (tipo){
            case "mayus":
                cadena = texto.toUpperCase();
                break;
            case  "minus":
                cadena = texto.toLowerCase();
                break;
            default:
                cadena = "No se encontro ninguna opcion = " + tipoLetra;
        }
        System.out.println(cadena);
    }
}
