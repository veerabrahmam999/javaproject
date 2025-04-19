import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciSeriesTest {
    @Test
    void testFindingFibonacciSeries_printsFirst10Numbers() {
        int firstValue = 0;
        int secondValue = 1;
        String expectedOutput = "0 1 1 2 3 5 8 13 21 34 ";






        assertEquals(expectedOutput, FibonacciSeries.findingFibonacciSeries(firstValue, secondValue));
    }
}