import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeCalculatorTest {
    @Test
    void calculatingAge22(){
        int currentAge =22;
        assertEquals(2103,AgeCalculator.gettingHundredYears(currentAge));
    }

    @Test
    void calculatingAge23(){
        int currentAge =23;
        assertEquals(2102,AgeCalculator.gettingHundredYears(currentAge));
    }


}