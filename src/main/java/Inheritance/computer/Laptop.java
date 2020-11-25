package Inheritance.computer;

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
}
