package com.mis_ejercicios.parte_2.ejercicios_poo_abstract.zoo_abstract.domain.animales;
import com.mis_ejercicios.parte_2.ejercicios_poo_abstract.zoo_abstract.domain.Canino;
public class Lobo extends Canino {
    private Integer numeroCamada;
    private String especie;
    public Lobo(double tamanoColmillos, String color, String abitad, double altura, double largo, double peso, Integer numeroCamada, String especie) {
        super(tamanoColmillos, color, abitad, altura, largo, peso);
        this.numeroCamada = numeroCamada;
        this.especie = especie;
    }
    @Override
    public String comer() {
        return "Los lobos comen carne de algunos seres vivos.";
    }
    @Override
    public String dormir() {
        return "Los lobos normalmente duermen en camadas.";
    }
    @Override
    public String correr() {
        return "Los lobos corren muy rapido apesar de su peso.";
    }
    @Override
    public String comunicarse() {
        return "Los lobos comunican con su manada.";
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Lobo{numeroCamada=").append(numeroCamada);
        sb.append(", especie='").append(especie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
