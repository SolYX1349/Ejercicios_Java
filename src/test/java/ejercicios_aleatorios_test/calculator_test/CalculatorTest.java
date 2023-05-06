package ejercicios_aleatorios_test.calculator_test;

import ejercicios_aleatorios.calculadora.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void should_return_a_sum_when_the_plus_operator_is_entered() {
        Assert.assertEquals("10.0 + 10.0 = 20.0", Calculator.Calculate(10, 10, "+"));
    }

    @Test
    public void should_return_a_subtract_when_the_minus_operator_is_entered() {
        Assert.assertEquals("10.0 - 10.0 = 0.0", Calculator.Calculate(10, 10, "-"));
    }

    @Test
    public void should_return_a_division_when_the_division_operator_is_entered() {
        Assert.assertEquals("10.0 / 10.0 = 1.0", Calculator.Calculate(10, 10, "/"));
    }

    @Test
    public void should_return_a_multiply_when_the_multiplication_operator_is_entered() {
        Assert.assertEquals("10.0 * 10.0 = 100.0", Calculator.Calculate(10, 10, "*"));
    }

    @Test
    public void should_return_a_percent_when_the_percent_operator_is_entered() {
        Assert.assertEquals("10.0 % 10.0 = 1.0", Calculator.Calculate(10, 10, "%"));
    }

    @Test
    public void should_return_an_error_message_for_entering_an_invalid_operator() {
        Assert.assertEquals("No exist this operator.", Calculator.Calculate(10, 10, "&´ç"));
    }

    @Test
    public void should_return_zero_by_dividing_by_zero() {
        Assert.assertEquals("10.0 / 0.0 = Infinity", Calculator.Calculate(10, 0, "/"));
    }
}
