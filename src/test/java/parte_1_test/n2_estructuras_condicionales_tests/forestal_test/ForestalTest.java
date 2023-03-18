package parte_1_test.n2_estructuras_condicionales_tests.forestal_test;

import org.junit.Assert;
import org.junit.Test;
import parte_1.n2_estructuras_condicionales.forestal.Main;


public class ForestalTest {

    @Test
    public void should_return_an_error_for_negative_current_measurement() {
        String expectedMessage = "Error to calculate";
        Assert.assertEquals(expectedMessage, Main.treeGrowthCalculator(-10.0, 0.23));
    }

    @Test
    public void should_return_an_error_for_negative_measure_to_reach() {
        String expectedMessage = "Error to calculate";
        Assert.assertEquals(expectedMessage, Main.treeGrowthCalculator(0.0, -0.23));
    }

    @Test
    public void should_return_a_message_because_the_argument_are_zero() {
        String expectedMessage = "Error the argument are zero";
        Assert.assertEquals(expectedMessage, Main.treeGrowthCalculator(0.0, 0.0));
    }
    @Test
    public void should_return_the_size_of_the_tree_when_everything_is_valid(){
        String expectedMessage = "El arbor tardara aproximadamente 44 años en llegar a los 10.13 metros.";
        Assert.assertEquals(expectedMessage, Main.treeGrowthCalculator(0.01, 10.0));
    }
}
