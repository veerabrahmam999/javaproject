import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerReverseTest {
    int reverse =321;

    @Test
    void reverseNumber(){
        assertEquals(321,IntegerReverse.reverseInteger(reverse));
    }

}