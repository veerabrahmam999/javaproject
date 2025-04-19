import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightCalculatorTest {
    @Test
    void calculatingInches() {
        double inches = 2;
        double expected = inches * 2.5;

        assertEquals(expected,HeightCalculator.InchesIntoCentimeters(inches));

    }

    @Test
    void calculatingFeets() {
        double feets = 2;
        double expected = feets* 30.48;

        assertEquals(expected,HeightCalculator.feetsIntoCentimeters(feets));

    }


}