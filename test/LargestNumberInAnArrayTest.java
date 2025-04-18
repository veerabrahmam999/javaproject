import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberInAnArrayTest {
    int array [] = {1,2,3,8,9,4};

    @Test
    void largeNumber(){
        assertEquals(9,LargestNumberInAnArray.findingLargest(array));
    }

}