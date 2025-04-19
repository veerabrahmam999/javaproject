import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfitCalculationTest {
    @Test
    void profitCalculation(){
        assertEquals(100,ProfitCalculation.calculatingProfit(900,1000));
    }

}