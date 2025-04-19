import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfRectangleTest {

    @Test
    void calculatingArea(){
        int length =10; int breadth =10;
        assertEquals(100,AreaOfRectangle.CalculatingArea(length,breadth));

    }

    @Test
    void calculatingArea1(){
        int length =10; int breadth =11;
        assertEquals(110,AreaOfRectangle.CalculatingArea(length,breadth));

    }


}