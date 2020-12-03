package Homework6;

public class MainApp {

    public static void main(String[] args) {

        Computer officeComputer1 = new Homework6.PC("OC1", "HP", 500, 128);
        Computer officeComputer2 = new Homework6.PC("OC2", "HP", 500, 128);
        Computer officeComputer3 = new Homework6.PC("OC3", "HP", 500, 128);
        Computer officeComputer4 = new Homework6.PC("OC4", "HP", 500, 128);
        Computer gamingLaptop = new Homework6.Laptop("Lap", "HP", 500, 256, 10);
        Computer mac = new Homework6.Laptop("Apple", "AP", 500, 256, 60);


        // System.out.println(officeComputer1); - Homework5.computer.PC@17c68925 - gets reference (object's address)
        // int[] array = {1,2,3};
        // System.out.println(array); - [I@17c68925 - gets reference (array's address)

        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, officeComputer4, gamingLaptop, mac};

        for (Computer computer : computers) {
            computer.switchOff();

            // officeComputer
            System.out.println(officeComputer1.volumeUp(20)); // 20
            System.out.println(officeComputer1.volumeUp(20)); // 40
            System.out.println(officeComputer1.volumeUp(50)); // 90
            System.out.println(officeComputer1.volumeUp(20)); // 100
            System.out.println(officeComputer1.volumeDown(60)); // 40
            System.out.println(officeComputer1.volumeDown(60)); // 0

            // gamingLaptop
            System.out.println(((Laptop) gamingLaptop).volumeUp(20));  // 20
            System.out.println(((Laptop) gamingLaptop).volumeUp(50));  // 70
            System.out.println(((Laptop) gamingLaptop).volumeUp(40));  // 100
            System.out.println(((Laptop) gamingLaptop).volumeDown(10)); // 90
            System.out.println(((Laptop) gamingLaptop).volumeDown(30)); // 60
            System.out.println(((Laptop) gamingLaptop).volumeDown(100)); // 0

        }

    }
}
