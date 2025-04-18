import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;

class SmallestNumberInAnArrayTest {

        int array [] = {1,2,3,8,9,4};

        @Test
        void smallNumber(){
            assertEquals(1,SmallestNumberInAnArray.findingSmallest(array));
        }
}