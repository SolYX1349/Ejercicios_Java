package parte_2.ejercicios_poo_abstract.herencia_abstracta;

import parte_2.ejercicios_poo_abstract.herencia_abstracta.domine.Cuadrado;
import parte_2.ejercicios_poo_abstract.herencia_abstracta.domine.FiguraGeometrica;
import parte_2.ejercicios_poo_abstract.herencia_abstracta.domine.Rectangulo;

public class MainTest {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
        figura = new Cuadrado("Cuadrado");
        figura.dibujar();
    }
}
