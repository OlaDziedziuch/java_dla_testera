package Homework5.computer;


public class PC extends Computer {

    private boolean isPluggedIn;


    public PC(String name, String type, int HDD, int RAM) {
        super(name, type, HDD, RAM);
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
}

