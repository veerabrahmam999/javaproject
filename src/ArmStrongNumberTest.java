import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmStrongNumberTest {

    @Test
    void checkingArmStrong(){
        int arm =153;
        int temp=arm;
        ArmStrongNumber number = new ArmStrongNumber();
        assertEquals(true,ArmStrongNumber.isArmStrong(153,3,temp));

    }

}