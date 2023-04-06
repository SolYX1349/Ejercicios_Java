package parte_1.n5_ejercicios_arreglos.ejercicios_unidimencionales.grafica_numeros;

public class Main {
    public static void main(String[] args) {
        Integer [] numeros = {1,2,3,4,2,5,6,7,8,9,1,4,8,3,8,0,9,6,4,6,2,5,0,4,8,3,6,3};
        showHistorigrama(numeros);
    }
    private static void showHistorigrama(Integer [] array){
        for (int i = 0; i < 10 ; i++) {
            System.out.print(i + ": ");
            for (Integer integer : array) {
                if (integer.equals(i)) { System.out.print("*"); }
            }
            System.out.println();
        }
    }
}
