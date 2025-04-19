import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AscendingOrderTest {
    @Test
    void ascendingOrder(){
        int array[] = {1,11,2,33,4,55,22};
        int sortArray[] = {1,2,4,11,22,33,55};
        String expected =Arrays.toString(sortArray);


         assertEquals(expected,AscendingOrder.sortingAscendingOrder(array));


    }

}