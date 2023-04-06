package parte_1_test.n1_programas_simples_tests.circulos_test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import parte_1.n1_programas_simples.circulos.Main;

import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CirculosTest {
    @InjectMocks
    Main main;

    @Mock
    Scanner scanner;

    @Test
    public void should_return_the_values_in_zero() {
        String expectedMessage = "Perimetro = 0.0 Area = 0.0 Diametro = 0.0";
        Assert.assertEquals(expectedMessage,main.calculateCircles());
    }
    @Test
    public void should_return_valid_values() {
        when(scanner.nextDouble()).thenReturn(8.4);
        String expectedMessage = "Perimetro = 52.77888 Area = 221.671296 Diametro = 16.8";
        Assert.assertEquals(expectedMessage,main.calculateCircles());
    }
}
