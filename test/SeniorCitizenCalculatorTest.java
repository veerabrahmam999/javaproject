import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeniorCitizenCalculatorTest {
    @Test
    void ageCalculation(){
        assertEquals("Person is Senior Citizen",SeniorCitizenCalculator.calculatingAge(65));
    }

}