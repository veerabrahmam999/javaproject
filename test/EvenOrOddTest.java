import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {
    @Test
    void checkingNumber(){
        assertEquals(true,EvenOrOdd.findingEvenOrOdd(20));
    }

}