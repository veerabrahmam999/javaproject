import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerimeterOfTriangleTest {
    @Test
    void perimeterTriangle(){
        assertEquals(40,PerimeterOfTriangle.calculatePerimeter(10,20,10));

    }

}