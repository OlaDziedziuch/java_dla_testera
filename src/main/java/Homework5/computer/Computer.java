package Homework5.computer;

public class Computer {

    protected String name;
    protected String type;
    protected int HDD;
    protected int RAM;
    protected boolean state;

    public Computer(String name, String type, int HDD, int RAM) {
        this.name = name;
        this.type = type;
        this.HDD = HDD;
        this.RAM = RAM;
        this.state = false;
    }

    public void switchOn() {
        state = true;
    }

    public void switchOff() {
        state = false;
    }

    public boolean getState() {
        return state;
    }
}
