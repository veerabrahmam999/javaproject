import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondsInADayTest {
    @Test
    void seconds(){
        assertEquals(86400,SecondsInADay.findingSeconds(1));
    }

}