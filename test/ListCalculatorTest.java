import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCalculatorTest {
    @Test
    void calculatingList() {
        List<Integer> lessThan5 = new ArrayList<>();
        List<Integer> list = new ArrayList<>(List.of(2,3,44,5,88,1));
        lessThan5.add(2);
        lessThan5.add(3);
        lessThan5.add(1);
        assertEquals(lessThan5,ListCalculator.findingLessThanFive(list));


    }


}