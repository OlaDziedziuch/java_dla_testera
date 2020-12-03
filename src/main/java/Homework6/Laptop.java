package Homework6;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int HDD, int RAM, int batteryLevel) {
        super(name, type, HDD, RAM);
        this.batteryLevel = batteryLevel;

    }

    @Override
    public void switchOn() {
        System.out.println("Check battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level is too low.");
        }
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeUp(int up) {
        this.volumeLevel = volumeLevel + up;
        if (volumeLevel >= 100)
            volumeLevel = 100;
        return volumeLevel;
    }

    @Override
    public int volumeDown(int down) {
        this.volumeLevel = volumeLevel - down;
        if (volumeLevel <= 0)
            volumeLevel = 0;
        return volumeLevel;
    }

    public int volumeDown() {
        volumeLevel -= 5;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }
}

