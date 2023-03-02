package com.mis_ejercicios.parte_2.ejercicios_poo_abstract.zoo_abstract.domain;

public abstract class Mamifero {
    private String abitad;
    private double altura;
    private double largo;
    private double peso;
    public Mamifero() {
    }
    public Mamifero(String abitad, double altura, double largo, double peso) {
        this.abitad = abitad;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }
    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mamifero{");
        sb.append("abitad='").append(abitad).append('\'');
        sb.append(", altura=").append(altura);
        sb.append(", largo=").append(largo);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
}
