package parte_1_test.n2_estructuras_condicionales_tests.tanque_de_gas_test;

import org.junit.After;
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

    @After
    public void inicializar() {
        main = new Main();
    }

    @Test
    public void should_return_an_invalid_message_for_negative_argument() {
        String expectedMessage = "Error Verifica La cantidad";
        when(scanner.nextInt()).thenReturn(-1);
        Assert.assertEquals(expectedMessage, main.calcularGasolinaIngresada());
    }
    @Test
    public void should_return_an_invalid_message_for_big_argument() {
        String expectedMessage = "Error Verifica La cantidad";
        when(scanner.nextInt()).thenReturn(1000);
        Assert.assertEquals(expectedMessage, main.calcularGasolinaIngresada());
    }
    @Test
    public void should_return_an_message_for_low_gas() {
        String expectedMessage = "Tanque Casi Vacio";
        when(scanner.nextInt()).thenReturn(5);
        Assert.assertEquals(expectedMessage, main.calcularGasolinaIngresada());
    }

    @Test
    public void should_return_me_a_message_for_insufficient_gas() {
        String expectedMessage = "Gasolina Insuficiente";
        when(scanner.nextInt()).thenReturn(23);
        Assert.assertEquals(expectedMessage, main.calcularGasolinaIngresada());
    }

    @Test
    public void should_return_me_a_message_for_half_tank() {
        String expectedMessage = "Tanque Medio";
        when(scanner.nextInt()).thenReturn(37);
        Assert.assertEquals(expectedMessage, main.calcularGasolinaIngresada());
    }

    @Test
    public void should_return_a_message_by_tank_to_three_quarters() {
        String expectedMessage = "Tanque a 3/4";
        when(scanner.nextInt()).thenReturn(50);
        Assert.assertEquals(expectedMessage, main.calcularGasolinaIngresada());
    }

    @Test
    public void should_return_a_message_for_tank_almost_full() {
        String expectedMessage = "Tanque Casi lleno";
        when(scanner.nextInt()).thenReturn(69);
        Assert.assertEquals(expectedMessage, main.calcularGasolinaIngresada());
    }

    @Test
    public void should_return_a_tank_full_message() {
        String expectedMessage = "Tanque lleno";
        when(scanner.nextInt()).thenReturn(70);
        Assert.assertEquals(expectedMessage, main.calcularGasolinaIngresada());
    }
}
