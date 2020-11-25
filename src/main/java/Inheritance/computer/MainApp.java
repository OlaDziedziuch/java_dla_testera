package Inheritance.computer;

public class MainApp {

    public static void main(String[] args) {

        PC officeComputer = new PC("XYZ", "HP", 500, 128, true);
        Laptop gamingComputer = new Laptop("SZA", "HP", 500, 256, 50);

        officeComputer.setIsPluggedIn(false);
        officeComputer.switchOn();
        System.out.println("Is your computer plugged in: " + officeComputer.getState());

        //officeComputer.switchOn();
        //System.out.println(officeComputer.getState());

        /*gamingComputer.setBatteryLevel(0);
        gamingComputer.switchOn();
        System.out.println(gamingComputer.getState());*/

        /*officeComputer.switchOn();
        System.out.println("Is your computer plugged in: " + officeComputer.getState());*/

    }
}
