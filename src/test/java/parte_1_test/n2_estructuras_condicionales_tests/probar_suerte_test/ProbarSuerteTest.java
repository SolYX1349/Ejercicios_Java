package parte_1_test.n2_estructuras_condicionales_tests.probar_suerte_test;

import org.junit.Test;
import org.mockito.Mock;
import parte_1.n2_estructuras_condicionales.probar_suerte.ProbarSuerte;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProbarSuerteTest {
    @InjectMocks
    ProbarSuerte probarSuerte;

    @Mock
    Scanner scanner;

    @Test
    public void should_close_when_a_letter_is_entered() {
        when(scanner.nextInt()).thenReturn(-1);
        probarSuerte.run();
    }

}
