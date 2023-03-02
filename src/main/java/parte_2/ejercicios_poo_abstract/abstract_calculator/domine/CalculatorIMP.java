package parte_2.ejercicios_poo_abstract.abstract_calculator.domine;

public class CalculatorIMP implements Calculator{
    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    @Override
    public double sumar(double a, double b) {
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        return a - b;
    }

    @Override
    public double restar(double a, double b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public int dividir(int a, int b) {
        try {
           return a / b;
        }catch (ArithmeticException arex){
            System.err.println("No se puede dividir -> 0");
            arex.printStackTrace();
        }
        return 0;
    }

    @Override
    public double dividir(double a, double b) {
        try {
            return a / b;
        }catch (ArithmeticException arex){
            System.err.println("No se puede dividir -> 0");
            arex.printStackTrace();
        }
        return 0;
    }
}
