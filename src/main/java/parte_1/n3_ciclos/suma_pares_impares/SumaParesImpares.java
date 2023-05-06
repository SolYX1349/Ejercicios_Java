package parte_1.n3_ciclos.suma_pares_impares;

public class SumaParesImpares {

    //Codigo base del ejercicio
    public static void main(String[] args) {
        int valorRandom = 0, sumaEnteros = 0, sumaNoEntero = 0;
        for (int i = 0; i < 10; i++) {
            valorRandom = (int) (Math.random() * 27);
            if (valorRandom % 2 == 0) {
                sumaEnteros += valorRandom;
            } else {
                sumaNoEntero += valorRandom;
            }
        }
        System.out.println("sumaEnteros = " + sumaEnteros);
        System.out.println("sumaNoEntero = " + sumaNoEntero);
    }

    //Codigo dirigido al testing
    public static int sumPair(int[] array) {
        int resultado = 0;
        for (int element : array) {
            if (element % 2 == 0) resultado += element;
        }
        return resultado;
    }

    //Una función extra
    public static int sumOdd(int[] array) {
        int resultado = 0;
        for (int element : array) {
            if (element % 2 != 0) resultado += element;
        }
        return resultado;
    }
}
