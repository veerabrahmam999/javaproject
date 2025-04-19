import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DivisorsCalculationTest {
    @Test
    void divisorsCalculation(){
        int number = 12;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);

        assertEquals(list,DivisorsCalculation.findingDivisors(number));


    }

}