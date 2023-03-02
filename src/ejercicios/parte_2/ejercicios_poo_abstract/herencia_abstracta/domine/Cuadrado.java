package com.mis_ejercicios.parte_2.ejercicios_poo_abstract.herencia_abstracta.domine;

public class Cuadrado extends FiguraGeometrica{
    public Cuadrado(String tipoFigura){
        super(tipoFigura);
    }
    @Override
    public void dibujar() {
        System.out.println("Imprimiendo un " + getClass().getSimpleName());
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cuadrado{");
        sb.append('}');
        return sb.toString();
    }
}
