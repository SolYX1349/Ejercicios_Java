package com.mis_ejercicios.parte_2.programas_poo.proyecto_caja.domain;
public class Caja {
    private int ancho;
    private int profundo;
    private int alto;
    public Caja (){}
    public Caja (int ancho , int profundo , int alto){
        this.ancho = ancho;
        this.profundo = profundo;
        this.alto = alto;
    }
    public int calcular_volumen (){
         return (this.ancho * this.profundo * this.alto);
    }
}
