package ejercicios_aleatorios.palindromo_de_numeros;

public class PalindromeNumber {
    public static boolean isPalindrome(int numberToInverse) {
        boolean numberIsPalindrome = false;
        int originalNumber = numberToInverse;
        int invertedNumber = 0;
        if (numberToInverse >= 0) {
            while (numberToInverse != 0) {
                invertedNumber = (invertedNumber * 10) + (numberToInverse % 10);
                numberToInverse /= 10;
            }
            if (originalNumber == invertedNumber) {
                numberIsPalindrome = true;
            }
        }
        return numberIsPalindrome;
    }
}
