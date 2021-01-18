package Homework9;

abstract public class Computer {

    protected String name;
    protected String type;
    protected HDD hdd;
    protected RAM ram;
    protected CPU cpu;
    protected boolean state;
    protected int volumeLevel;

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HDD getHDD() {
        return hdd;
    }

    public void setHDD(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM getRAM() {
        return ram;
    }

    public void setRAM(RAM ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Computer(String name, String type, HDD hdd, RAM ram, CPU cpu) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.cpu = cpu;
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
