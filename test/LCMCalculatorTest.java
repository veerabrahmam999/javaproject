import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCMCalculatorTest {
    @Test
    void lcmCalculator(){
        assertEquals(5,LCMCalculator.findingGCD(5,10));
        assertEquals(10,LCMCalculator.findingLCM(5,5,10));
    }

}