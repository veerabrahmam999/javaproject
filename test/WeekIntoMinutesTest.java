import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekIntoMinutesTest {
    @Test
    void weeksToMinutes(){
        assertEquals(10080,WeekIntoMinutes.findingMinutes());
    }

}