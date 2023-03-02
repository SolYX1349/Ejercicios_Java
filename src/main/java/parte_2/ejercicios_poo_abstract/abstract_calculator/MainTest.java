package parte_2.ejercicios_poo_abstract.abstract_calculator;

import parte_2.ejercicios_poo_abstract.abstract_calculator.domine.Calculator;
import parte_2.ejercicios_poo_abstract.abstract_calculator.domine.CalculatorIMP;

public class MainTest {
    public static void main(String[] args) {
        Calculator calcular = new CalculatorIMP();
        System.out.println(calcular.dividir(1.2,34.4));
        System.out.println(calcular.sumar(10,654));
        System.out.println(calcular.dividir(10,0));
    }
}
