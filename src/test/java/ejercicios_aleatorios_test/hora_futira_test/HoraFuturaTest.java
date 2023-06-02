package ejercicios_aleatorios_test.hora_futira_test;

import org.junit.Assert;
import org.junit.Test;
import ejercicios_aleatorios.hora_futura.HoraFutura;

public class HoraFuturaTest {

    @Test
    public void should() {
        Assert.assertEquals("Horas: 11 hrs, Dias: 0", HoraFutura.tiempoFuturo(1, 10));
    }
}
