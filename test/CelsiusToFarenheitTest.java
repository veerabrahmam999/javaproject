import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelsiusToFarenheitTest {

    @Test
    void result  (){
        double celsius =36;
        assertEquals(96.8,CelsiusToFarenheit.convertIntoFarenheit(celsius));
    }

}