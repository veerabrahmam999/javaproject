import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckingTest {
    @Test
    void checkingNumber(){
        assertEquals("positive",NumberChecking.checkNumber(20));
    }


}