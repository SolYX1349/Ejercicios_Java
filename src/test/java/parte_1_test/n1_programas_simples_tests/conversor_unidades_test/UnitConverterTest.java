package parte_1_test.n1_programas_simples_tests.conversor_unidades_test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import parte_1.n1_programas_simples.conversor_centimetros_a_pulgadas.Main;

import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UnitConverterTest {
    @InjectMocks
    Main main;
    @Mock
    Scanner scanner;
    @Test
    public void should_return_an_invalid_message_for_invalid_argument(){
        String expectedMessage = "Invalid Argument or Argument Equals Zero";
        Assert.assertEquals(expectedMessage,main.unitConverter());
    }
    @Test
    public void should_return_the_measurement_in_inches(){
        when(scanner.nextDouble()).thenReturn(12.5);
        String expectedMessage = "12.5 cm = 4.921259842519685 in";
        Assert.assertEquals(expectedMessage,main.unitConverter());
    }
}
