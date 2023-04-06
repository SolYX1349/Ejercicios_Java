package parte_1_test.n1_programas_simples_tests.promedio_test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import parte_1.n1_programas_simples.promedio.Main;

import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PromedioTest {

    @InjectMocks
    Main mainPromedio;

    @Mock
    Scanner scanner;

    @Test
    public void should_return_a_message_invalid_for_a_very_large_argument(){
        when(scanner.nextDouble()).thenReturn(10.1).thenReturn(5.5).thenReturn(4.8).thenReturn(9.0);
        String messageExpected = "Invalid data error";
        Assert.assertEquals(messageExpected , mainPromedio.evaluaResultadoEscolar());
    }
    @Test
    public void should_return_an_invalid_message_for_a_negative_argument(){
        when(scanner.nextDouble()).thenReturn(10.0).thenReturn(-8.9).thenReturn(4.8).thenReturn(9.0);
        String messageExpected = "Invalid data error";
        Assert.assertEquals(messageExpected , mainPromedio.evaluaResultadoEscolar());
    }

    @Test
    public void should_return_a_passing_message_for_good_notes(){
        when(scanner.nextDouble()).thenReturn(10.0).thenReturn(7.0).thenReturn(8.0).thenReturn(9.0);
        String messageExpected = "Resultado aprobatorio";
        Assert.assertEquals(messageExpected , mainPromedio.evaluaResultadoEscolar());
    }
    @Test
    public void should_return_a_falling_message_for_bad_notes(){
        when(scanner.nextDouble()).thenReturn(5.0).thenReturn(5.0).thenReturn(5.0).thenReturn(5.0);
        String messageExpected = "Resultado reprobatorio";
        Assert.assertEquals(messageExpected , mainPromedio.evaluaResultadoEscolar());
    }
}
