package ejercicios_aleatorios_test.contador_digitos_test;

import org.junit.Assert;
import org.junit.Test;
import ejercicios_aleatorios.contador_digitos.ContadorDigitos;

public class ContadorDigitosTest {

    @Test
    public void should_return_the_length_of_the_digits_of_the_number() {
        Assert.assertEquals(5, ContadorDigitos.countTheDigitsOfTheNumber(16385));
    }
}
