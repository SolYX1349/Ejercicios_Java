package parte_1.n5_ejercicios_arreglos.ejercicios_unidimencionales.comparar_arreglos;

public class Main {
    public static void main(String[] args) {
      Integer [] p = {1,2,3};
      Integer [] q = {1,2,3};
      if (areEquals(p,q)){
          System.out.println("Are identical.");
      }else {
          System.out.println("Are different.");
      }
    }
    private static boolean areEquals (Object [] array1 , Object [] array2){
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1 [i] != array2 [i]){
                    return false;
                }
            }
        }else {
            return false;
        }
        return true;
    }
}
