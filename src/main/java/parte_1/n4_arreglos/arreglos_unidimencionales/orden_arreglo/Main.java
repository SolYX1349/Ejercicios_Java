package parte_1.n4_arreglos.arreglos_unidimencionales.orden_arreglo;
public class Main {
    public static void main(String[] args) {
    Integer [] numeros = {1,2,3,7,1};
    ordemAr(numeros);
    }
    private static void ordemAr (Integer [] arreglo){
        boolean acend = false;
        boolean decend = false;
        for (int i = 0; i < arreglo.length-1 ; i++) {
            if (arreglo [i] < arreglo[i+1]){
                acend = true;
            }else {
                acend = false;
                break;
            }
        }
        if (!acend){
            for (int i = 0; i < arreglo.length-1 ; i++) {
                if (arreglo [i] > arreglo[i+1]){
                    decend = true;
                }else {
                    decend = false;
                    break;
                }
            }
        }
        if (acend){
            System.out.println("Acendente");
        }else if (decend) {
            System.out.println("Decendente");
        }else {
            System.out.println("Desordenado");
        }
    }
}
