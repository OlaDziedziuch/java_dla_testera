package Interface.Homework7;


public class MainApp {

    public static void main(String[] args) {

        HDD hdd = new HDD("Seagate", 500);
        RAM ram = new RAM("Hyper", 16);

        Computer comp = new Laptop("My comp", "laptop", new HDD("Seagate", 500),
                new RAM("Hyper", 16), 18);
        System.out.println(comp.getRAM().getBrand());

        Computer anotherComp = new Laptop("My comp", "laptop", hdd, ram,18);
        System.out.println(comp.getRAM().getCapacity());




    }
}