package Homework5.computer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerTests {

    @Test
    void shouldPCBeSwitchedOn() {
        PC officePC = new PC("XYZ", "HP", 500, 128);
        {
            officePC.getState();
            assertEquals(true, officePC.getIsPluggedIn());
        }
    }

    @Test
    void shouldPCBeSwitchedOff() {
        PC officePC = new PC("XYZ", "HP", 500, 128);
        {
            officePC.setIsPluggedIn(false);
            boolean isPluggedIn = officePC.getState();
            assertEquals(false, isPluggedIn);
        }
    }

    @Test
    void shouldLaptopBeSwitchedOn() {
        Laptop gamingComputer = new Laptop("SZA", "HP", 500, 256, 50);
        {
            gamingComputer.switchOn();
            boolean newState = gamingComputer.getState();
            gamingComputer.getState();
            assertEquals(true, newState);
        }
    }

    @Test
    void shouldLaptopBeSwitchedOff() {
        Laptop gamingComputer = new Laptop("SZA", "HP", 500, 256, 50);
        {
            gamingComputer.setBatteryLevel(-9);
            gamingComputer.switchOn();
            boolean newState = gamingComputer.getState();
            gamingComputer.getState();
            assertEquals(false, newState);

        }
    }

}
