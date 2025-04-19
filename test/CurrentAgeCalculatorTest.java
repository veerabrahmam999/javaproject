import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CurrentAgeCalculatorTest {
    @Test
    void testFindingCurrentAge_bornInPast() {
        // Simulate current date as April 18, 2025
        LocalDate currentDate = LocalDate.of(2025, 4, 18);

        // Born on January 1, 1990
        int bornYear = 1990;
        int bornMonth = 1;
        int bornDate = 1;
        LocalDate dob = LocalDate.of(bornYear, bornMonth, bornDate);
        Period expectedPeriod = Period.between(currentDate, dob);

        // Use a custom method to set the current date for testing
        Period actualPeriod = CurrentAgeCalculator.findingCurrentAge(bornYear, bornMonth, bornDate);
         // Reset after testing

        assertEquals(expectedPeriod, actualPeriod);
    }

}