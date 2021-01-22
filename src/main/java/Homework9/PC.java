package Homework9;

public class PC extends Computer {

    private boolean isPluggedIn;

    public PC(String name, String type, HDD hdd, RAM ram, CPU cpu) {
        super(name, type, hdd, ram, cpu);
        this.isPluggedIn = true;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPluggedIn) {
            super.switchOn();
        } else {
            System.out.println("Connect your PC to the power supply.");
        }
    }

    public void setIsPluggedIn(boolean newIsPluggedIn) {
        isPluggedIn = newIsPluggedIn;
    }

    public boolean getIsPluggedIn() {
        return isPluggedIn;
    }

    public String showComputerName() {
        return name;
    }

    public int volumeUp() {
        return volumeLevel++;
    }

    @Override
    public int volumeUp(int up) {
        throw new UnsupportedOperationException("This method is not supported for PC");
    }

    @Override
    public int volumeDown(int down) {
        this.volumeLevel = volumeLevel - down;
        if (volumeLevel <= 0)
            volumeLevel = 0;
        return volumeLevel;
    }

    public int volumeDown() {
        volumeLevel--;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }
}

