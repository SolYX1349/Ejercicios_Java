package ejercicios_aleatorios_test.the_number_is_palindrome_test;

import ejercicios_aleatorios.palindromo_de_numeros.PalindromeNumber;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void should_return_false_when_the_number_be_negative() {
        Assert.assertFalse(PalindromeNumber.isPalindrome(-123));
    }

    @Test
    public void should_return_false_when_the_number_not_be_palindrome() {
        Assert.assertFalse(PalindromeNumber.isPalindrome(123));
    }

    @Test
    public void should_return_true_when_the_number_be_palindrome() {
        Assert.assertTrue(PalindromeNumber.isPalindrome(121));
    }
}
