import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class VariablesSwappingTest {

    @Test
    void testSwappingPositiveNumbers() {
        int variable1 = 10;
        int variable2 = 5;
        int[] expected = {5, 10};
        assertArrayEquals(expected, VariablesSwapping.swappingVariables(variable1, variable2));
    }
}