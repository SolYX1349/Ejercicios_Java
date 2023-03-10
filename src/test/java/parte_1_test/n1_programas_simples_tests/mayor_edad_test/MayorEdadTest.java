package parte_1_test.n1_programas_simples_tests.mayor_edad_test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import parte_1.n1_programas_simples.mayor_edad.Main;

import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MayorEdadTest {
    @InjectMocks
    Main main;

    @Mock
    Scanner scanner;

    @Test
    public void should_return_a_fail_message_for_invalid_age_minor_one(){
        when(scanner.nextInt()).thenReturn(-1);
        String messageExpected = "Invalid Age";
        Assert.assertEquals(messageExpected,main.evalMyAge());
    }
    @Test
    public void should_return_a_fail_message_for_invalid_age_mayor_one_hundred_twenty(){
        when(scanner.nextInt()).thenReturn(120);
        String messageExpected = "Invalid Age";
        Assert.assertEquals(messageExpected,main.evalMyAge());
    }
    @Test
    public void should_return_a_message_for_minor_of_age(){
        when(scanner.nextInt()).thenReturn(15);
        String messageExpected = "Your not in age";
        Assert.assertEquals(messageExpected,main.evalMyAge());
    }
    @Test
    public void should_return_a_message_for_mayor_of_age(){
        when(scanner.nextInt()).thenReturn(21);
        String messageExpected = "Your in age";
        Assert.assertEquals(messageExpected,main.evalMyAge());
    }
}
