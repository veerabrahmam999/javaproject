import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilliLitresCalculatorTest {
    @Test
    void calculatingMilliLitres(){
        assertEquals(2000,MilliLitresCalculator.litresIntoMilliLitres(2));

    }

}