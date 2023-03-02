package com.mis_ejercicios.parte_3.patrones_disenio.singleton.conexion_singleton.conexion;
public class Conexion {
    private static Conexion instanceConexion;
    private Conexion(){}
    public static Conexion getConexion(){
        if (instanceConexion == null){
            instanceConexion = new Conexion();
        }
        return instanceConexion;
    }
}
