package parte_1_test.n3_ciclos_test.potencias_test;
import parte_1.n3_ciclos.potencias.Potencias;
import org.junit.Assert;
import org.junit.Test;

public class PotenciasTest {

 @Test
 public void should_return_25_when_introduce_te_exponent_two_in_five(){
     Assert.assertEquals(25,Potencias.potenciar(5,2));
 }
}
