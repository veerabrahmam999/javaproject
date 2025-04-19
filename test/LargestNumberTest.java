import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {
    @Test
    void largestTest(){

        assertEquals(30,LargestNumber.findingLargest(10,20,30));
    }

    @Test
    void largestTest1(){

        assertEquals(40,LargestNumber.findingLargest(20,22,40));
    }

}