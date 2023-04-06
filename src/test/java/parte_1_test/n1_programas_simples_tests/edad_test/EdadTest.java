package parte_1_test.n1_programas_simples_tests.edad_test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import parte_1.n1_programas_simples.edad.Main;

import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EdadTest {
    @InjectMocks
    Main main;

    @Mock
    Scanner scanner;

    @Test
    public void should_return_an_invalid_message_because_the_year_of_birth_is_too_small() {
        when(scanner.nextInt()).thenReturn(-1).thenReturn(2030);
        String expectedMessage = "Error Invalid Dates";
        Assert.assertEquals(expectedMessage, main.determinarEdad());
    }

    @Test
    public void should_return_a_valid_message_for_a_valid_year() {
        when(scanner.nextInt()).thenReturn(1999).thenReturn(2021);
        String expectedMessage = "Tu edad es de 22";
        Assert.assertEquals(expectedMessage, main.determinarEdad());
    }
}
