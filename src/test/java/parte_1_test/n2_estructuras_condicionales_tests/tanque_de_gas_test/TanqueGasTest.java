package parte_1_test.n2_estructuras_condicionales_tests.tanque_de_gas_test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import parte_1.n2_estructuras_condicionales.tanque_de_gas.Main;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TanqueGasTest {

    @InjectMocks
    Main main;

    @Mock
    Scanner scanner;

    @Test
    public void should_return_an_message_for_low_gas() {
        String expectedMessage = "Tanque Casi Vacio";
        when(scanner.nextInt()).thenReturn(5);
        Assert.assertEquals(expectedMessage, Main.calcularGasolinaIngresada());
    }
}
