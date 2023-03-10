package parte_1_test.n1_programas_simples_tests.mis_notas_test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import parte_1.n1_programas_simples.mis_notas.Main;

import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MisNotasTest {

    @InjectMocks
    Main main;

    @Mock
    Scanner scanner;

    @Test
    public void should_return_a_good_grade_when_the_grades_are_passing() {
        when(scanner.nextDouble()).thenReturn(10.0).thenReturn(10.0).thenReturn(10.0);
        String messageExpected = "Exelencia con 10.0";
        Assert.assertEquals(messageExpected, main.Evaluation());
    }
    @Test
    public void should_return_a_standard_grade(){
        when(scanner.nextDouble()).thenReturn(7.0).thenReturn(7.0).thenReturn(7.0);
        String messageExpected = "Pasaste con 7.0";
        Assert.assertEquals(messageExpected, main.Evaluation());
    }
    @Test
    public void should_return_failed_when_the_grades_are_failing() {
        when(scanner.nextDouble()).thenReturn(5.0).thenReturn(5.0).thenReturn(5.0);
        String messageExpected = "Reprobaste con 5.0";
        Assert.assertEquals(messageExpected, main.Evaluation());
    }
}
