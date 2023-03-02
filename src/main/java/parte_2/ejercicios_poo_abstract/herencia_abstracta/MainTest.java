package parte_2.ejercicios_poo_abstract.herencia_abstracta;
import com.mis_ejercicios.parte_2.ejercicios_poo_abstract.herencia_abstracta.domine.*;
public class MainTest {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
        figura = new Cuadrado("Cuadrado");
        figura.dibujar();
    }
}
