package ejercicios_aleatorios_test.the_number_is_palindrome_test;

import ejercicios_aleatorios.the_number_is_palindrome.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void should_return_false_when_the_number_be_negative() {
        Assert.assertFalse(Solution.isPalindrome(-123));
    }

    @Test
    public void should_return_false_when_the_number_not_be_palindrome() {
        Assert.assertFalse(Solution.isPalindrome(123));
    }

    @Test
    public void should_return_true_when_the_number_be_palindrome() {
        Assert.assertTrue(Solution.isPalindrome(121));
    }
}
