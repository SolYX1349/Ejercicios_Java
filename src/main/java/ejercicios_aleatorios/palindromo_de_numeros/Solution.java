package ejercicios_aleatorios.palindromo_de_numeros;

public class Solution {
    public static void main(String[] args) {
        //System.out.println(isPalindrome(121));
        System.out.println(contadorCifras(1200));
    }
    public static boolean isPalindrome(int x) {
        boolean isPal = false;
        if (x >= 0) {
            if (x <= 9) {
                isPal = true;
            }
            int cifras = 0;
            for (int i = 0; i <= x ; i++) {
                cifras = contadorCifras(x);
            }

            
            if (x == x) {
                isPal = true;
            }
        }
        return isPal;
    }
    private static Integer contadorCifras(int x){
        int contadorcifras = 1;
        int contadorConjuntos = 0;
        int ne = 0;
        for (int i = 0; i <= x ; i++) {
            if (ne <= 9){
                ne++;
            }else {
                ne = 0;
            }
            if (i == contadorConjuntos){
                contadorcifras++;
                if (contadorcifras == 1){
                    contadorConjuntos += 10;
                }
                if (contadorcifras == 2){
                    contadorConjuntos += 100;
                }
                if (contadorcifras == 3){
                    contadorConjuntos += 1000;
                }
            }
        }
        return contadorcifras;
    }
}
