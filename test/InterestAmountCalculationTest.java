import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterestAmountCalculationTest {
    @Test
    void calculatingIntrest(){
        double expected = 20;

        assertEquals(expected,InterestAmountCalculation.findingIntrest(100.0,2.0,10));
    }
    @Test
    void calculatingIntrestFail(){
        double expected = 30;

        assertEquals(expected,InterestAmountCalculation.findingIntrest(100.0,3.0,10));
    }


}