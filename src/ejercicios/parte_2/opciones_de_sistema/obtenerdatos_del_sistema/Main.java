package com.mis_ejercicios.parte_2.opciones_de_sistema.obtenerdatos_del_sistema;

public class Main {
    public static void main(String[] args) {
        System.out.println(especificacionesSistema());
    }
    private static String especificacionesSistema (){
        StringBuilder stringBuilder = new StringBuilder();

        String userName = System.getProperty("user.name");
        stringBuilder.append("Nombre de usuario: " + userName + "\n");
        String userContry = System.getProperty("user.country");
        stringBuilder.append("Pais de origen: " + userContry + "\n");
        String userLanguage = System.getProperty("user.language");
        stringBuilder.append("Lenguaje: " + userLanguage + "\n");
        String arquitectura = System.getProperty("os.arch");
        stringBuilder.append("Arquitectura del sistema: " + arquitectura + "\n");
        String systemVercion = System.getProperty("os.version");
        stringBuilder.append("Version del sistema = " + systemVercion + "v");

        return stringBuilder.toString();
    }
}
