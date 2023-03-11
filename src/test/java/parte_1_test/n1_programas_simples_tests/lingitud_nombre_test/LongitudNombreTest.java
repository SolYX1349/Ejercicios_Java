package parte_1_test.n1_programas_simples_tests.lingitud_nombre_test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import parte_1.n1_programas_simples.longitud_nombre.Main;

import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LongitudNombreTest {
    @InjectMocks
    Main main;
    @Mock
    Scanner scanner;
    @Test
    public void should_return_invalid_message_for_null_argument(){
        when(scanner.nextLine()).thenReturn(null);
        String messageExpected = "Invalid Argument";
        assertEquals(messageExpected,main.nameLength());
    }
    @Test
    public void should_return_invalid_message_for_void_argument(){
        when(scanner.nextLine()).thenReturn("");
        String messageExpected = "Invalid Argument";
        assertEquals(messageExpected,main.nameLength());
    }
    @Test
    public void should_return_a_valid_message_for_name(){
        when(scanner.nextLine()).thenReturn("Soly");
        String messageExpected = "Nombre contiene 4 caracteres.";
        assertEquals(messageExpected,main.nameLength());
    }
}
