package Homework6;

abstract public class Computer {

    protected String name;
    protected String type;
    protected int HDD;
    protected int RAM;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, int HDD, int RAM) {
        this.name = name;
        this.type = type;
        this.HDD = HDD;
        this.RAM = RAM;
        this.state = false;
        volumeLevel = 0;
    }

    public void switchOn() {
        state = true;
    }

    public void switchOff() {
        System.out.println(name + " is switched off.");
        state = false;
    }

    public boolean getState() {
        return state;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public abstract int volumeUp();

    public abstract int volumeDown();

    public abstract int volumeUp(int up);

    public abstract int volumeDown(int down);

    public void setVolumeLevel(int volumeLevel) {
        if ((volumeLevel > 0) && (volumeLevel <= 100)) {
            this.volumeLevel = volumeLevel;
        } else {
            System.out.println("Bad value");
        }
    }
}
