package ejercicios_aleatorios.the_number_is_palindrome;

public class Main {
    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }

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
