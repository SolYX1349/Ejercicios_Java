package parte_1_test.n1_programas_simples.recargas;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import parte_1.n1_programas_simples.recargas.Main;

import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RecargasTest {

    @InjectMocks
    Main main;

    @Mock
    Scanner scanner;

    @Test
    public void should_return_good_message() {
        String messageExpected = "Recharge done";
        when(scanner.nextInt()).thenReturn(123456789).thenReturn(123456789);
        Assert.assertEquals(messageExpected, main.run());
    }

    @Test
    public void should_return_bad_message() {
        String message_expected = "The number phone isn't correct";
        when(scanner.nextInt()).thenReturn(123456789).thenReturn(123456788);
        Assert.assertEquals(message_expected, main.run());
    }
}
