package com.mis_ejercicios.parte_3.patrones_disenio.singleton.conexion_singleton;
import com.mis_ejercicios.parte_3.patrones_disenio.singleton.conexion_singleton.conexion.Conexion;
public class MainTest {
    public static void main(String[] args) {
        Conexion conexion = Conexion.getConexion();
        System.out.println(conexion.getClass().getSimpleName());
    }
}
