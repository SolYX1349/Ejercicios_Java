package parte_1_test.n1_programas_simples_tests.pitagoras_test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import parte_1.n1_programas_simples.pitagoras.Main;

import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PitagorasTest {

    @InjectMocks
    Main main;

    @Mock
    Scanner scanner;

    @Test
    public void should_return_the_result(){
        String message = "Hipotenusa = 14.142135623730951";
        when(scanner.nextDouble()).thenReturn(10.0).thenReturn(10.0);
        Assert.assertEquals(message , main.runExercise());
    }
}
