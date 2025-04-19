import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearsCalculationTest {
    @Test
    void yearsCalculation(){
        assertEquals(2102,YearsCalculation.findingYear(23));
    }

}