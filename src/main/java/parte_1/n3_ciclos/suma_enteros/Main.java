package parte_1.n3_ciclos.suma_enteros;

public class Main {
    public static void main(String[] args) {
        int valorRandom = 0 , sumaEnteros = 0 , sumaNoEntero = 0;
        for (int i = 0; i <10 ; i++) {
            valorRandom = (int) (Math.random() * 27);
            if (valorRandom % 2 == 0){
                sumaEnteros += valorRandom;
            }else {
                sumaNoEntero += valorRandom;
            }
        }
        System.out.println("sumaEnteros = " + sumaEnteros);
        System.out.println("sumaNoEntero = " + sumaNoEntero);
    }
}
