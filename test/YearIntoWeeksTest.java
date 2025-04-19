import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearIntoWeeksTest {
    @Test
    void yearsToWeeks(){
        assertEquals(52,YearIntoWeeks.findingWeeks());
    }

}