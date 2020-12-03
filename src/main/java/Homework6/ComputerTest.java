package Homework6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {

    @Test
    void shouldPCBeSwitchedOn() {
        Computer officePC = new PC("XYZ", "HP", 500, 128);
        {
            officePC.getState();
            assertEquals(true, ((PC) officePC).getIsPluggedIn());
        }

    }

    @Test
    void shouldPCBeSwitchedOff() {
        Computer officePC = new PC("XYZ", "HP", 500, 128);
        {
            ((PC) officePC).setIsPluggedIn(false);
            boolean isPluggedIn = officePC.getState();
            assertEquals(false, isPluggedIn);
        }
    }

    @Test
    void shouldLaptopBeSwitchedOn() {
        Computer gamingComputer = new Laptop("SZA", "HP", 500, 256, 50);
        {
            gamingComputer.switchOn();
            boolean newState = gamingComputer.getState();
            gamingComputer.getState();
            assertEquals(true, newState);
        }
    }

    @Test
    void shouldLaptopBeSwitchedOff() {
        Computer gamingComputer = new Laptop("SZA", "HP", 500, 256, 50);
        {
            ((Laptop) gamingComputer).setBatteryLevel(-9);
            gamingComputer.switchOn();
            boolean newState = gamingComputer.getState();
            gamingComputer.getState();
            assertEquals(false, newState);

        }
    }

    @Test
    void shouldPCVolumeUpBy1() {
        Computer officePC = new PC("XYZ", "HP", 500, 128);
        {
            ((PC) officePC).volumeUp();
            int isVolumeUp = officePC.getVolumeLevel();
            assertEquals(1, isVolumeUp);
        }
    }

    @Test
    void shouldPCVolumeUpBy20() {
        Computer officePC = new PC("XYZ", "HP", 500, 128);
        {
            ((PC) officePC).volumeUp(20);
            int isVolumeUp = officePC.getVolumeLevel();
            assertEquals(20, isVolumeUp);
        }
    }

    @Test
    void shouldPCNotVolumeUpOver100() {
        Computer officePC = new PC("XYZ", "HP", 500, 128);
        {
            ((PC) officePC).volumeUp(120);
            int isVolumeUp = officePC.getVolumeLevel();
            assertEquals(100, isVolumeUp);
        }
    }

    @Test
    void shouldPCVolumeDownBy1() {
        Computer officePC = new PC("XYZ", "HP", 500, 128);
        {
            ((PC) officePC).volumeDown();
            int isVolumeDown = officePC.getVolumeLevel();
            assertEquals(-1, isVolumeDown);
        }
    }

    @Test
    void shouldLaptopVolumeUpBy5() {
        Computer gamingComputer = new Laptop("SZA", "HP", 500, 256, 50);
        {
            ((Laptop) gamingComputer).volumeUp();
            int isVolumeUp = gamingComputer.getVolumeLevel();
            assertEquals(5, isVolumeUp);
        }
    }

    @Test
    void shouldLaptopVolumeDownBy5() {
        Computer gamingComputer = new Laptop("SZA", "HP", 500, 256, 50);
        {
            ((Laptop) gamingComputer).volumeDown();
            int isVolumeDown = gamingComputer.getVolumeLevel();
            assertEquals(-5, isVolumeDown);
        }
    }

}

