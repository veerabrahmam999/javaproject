import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearOrNotTest {
    @Test
    void findingYear2020(){
        assertEquals(true,LeapYearOrNot.isLeapYear(2020));

    }

    @Test
    void findingYear2021(){
        assertEquals(false,LeapYearOrNot.isLeapYear(2021));

    }

}