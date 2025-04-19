import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastElementsTest {
    @Test
    void firstAndLast() {
        List<Integer> expectation = new ArrayList<>();
        expectation.add(10);
        expectation.add(30);
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30));
        assertEquals(expectation, FirstAndLastElements.findingFirstAndLast(list));

    }
}