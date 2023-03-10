package parte_1_test.n1_programas_simples_tests.saludo_test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import parte_1.n1_programas_simples.saludo.Main;
import java.util.Scanner;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SaludoTest {

    @InjectMocks
    Main main;

    @Mock
    Scanner scanner;

    @Test
    public void should_return_a_message() {
        String expectedMessage = "Hola Solyx";
        when(scanner.nextLine()).thenReturn("Solyx");
        Assert.assertEquals(expectedMessage,main.sayHello());
    }
}
