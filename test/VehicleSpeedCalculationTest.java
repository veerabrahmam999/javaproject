import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleSpeedCalculationTest {
    @Test
    void speedCalculation(){
        assertEquals(3,VehicleSpeedCalculation.findingVehicleSpeed(9,3));
    }



}