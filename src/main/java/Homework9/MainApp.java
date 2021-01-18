package Homework9;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();

        computers.add(new PC("Amiga", "TypeA", new HDD("QA", 250), new RAM("A",
                128), new CPU("AMD Ryzen", 3.2, 6)));
        computers.add(new PC("Amiga", "TypeZ", new HDD("QA", 250), new RAM("A",
                128), new CPU("Intel Core I5", 2.9, 6)));
        computers.add(new PC("Amiga", "TypeQ", new HDD("QA", 250), new RAM("A",
                128), new CPU("Intel Core I3", 4.0, 12)));
        computers.add(new PC("Atari", "TypeB", new HDD("QA", 500), new RAM("A",
                128), new CPU("Intel Xeon", 3.6, 4)));
        computers.add(new PC("PC", "TypeC", new HDD("QA", 500), new RAM("A",
                128), new CPU("Intel Core 2", 2.9, 3)));
        computers.add(new Laptop("Lenovo", "TypeD", new HDD("A", 500), new RAM("B",
                128), new CPU("Intel Core 2", 2.9, 2), 80));
        computers.add(new Laptop("Lestaro", "TypeE", new HDD("A", 500), new RAM("B",
                64), new CPU("AMD Ryzen", 3.2, 6), 90));
        computers.add(new Laptop("Toshiba", "TypeF", new HDD("A", 500), new RAM("B",
                64), new CPU("AMD Ryzen", 3.2, 6), 90));
        computers.add(new Laptop("Asus", "TypeG", new HDD("A", 500), new RAM("B",
                264), new CPU("Intel Core 2", 2.9, 2), 20));
        computers.add(new Laptop("Lenovo", "TypeH", new HDD("A", 250), new RAM("B",
                128), new CPU("AMD Ryzen", 1.4, 6), 60));

        // 1. displaying quantity of computers with > 128 GB RAM
        // TEST1 - shouldDisplayQuantityOfComputerWithRAMAbove128Gb()

        long computersAbove128GB = computers.stream()
                .filter(computer -> computer.getRAM().getCapacity() > 128)
                .count();

        System.out.println(computersAbove128GB);

        // 2. displaying all types of computers

        computers.stream()
                .map(computer -> computer.getType())
                .forEach(computer -> System.out.println(computer));

        // 3. displaying the computer with the highest RAM
        // TEST2 - shouldDisplayMaxValueOfRAMCapacity()

        Optional<Computer> maxRAM = computers.stream()
                .max(Comparator.comparingInt(Computer -> Computer.getRAM().getCapacity()));

        System.out.println(maxRAM.get());

        // 4. computer's collection with HDD < 500GB

        List<Computer> hddUnder500GB = computers.stream()
                .filter(computer -> computer.getHDD().getCapacity() < 500)
                .collect(Collectors.toList());

        for (Computer comp : hddUnder500GB
        ) {
            System.out.println(comp.getName() + " " + comp.getType()
                    + " " + comp.getRAM() + " " + comp.getHDD());
        }

        // 5. sorted comps by name && type

        List<Computer> sortedComps = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        for (Computer sortedComp : sortedComps
        ) {
            System.out.println(sortedComp.getName() + " " + sortedComp.getType()
                    + " " + sortedComp.getRAM() + " " + sortedComp.getHDD());

        }

        // 6. Optional

        // 6a - get()
        // 6b - isPresent()
        //TEST3 - shouldDisplayTheHighestCPUClockSpeed()

        Optional<Computer> maxCpuClockSpeed = computers.stream()
                .min(Comparator.comparingDouble(Computer -> Computer.getCpu().getClockSpeed()));

        if (maxCpuClockSpeed.isPresent()) {
            System.out.println(maxCpuClockSpeed.get().getName() + " "
                    + maxCpuClockSpeed.get().getCpu().getClockSpeed() + " Hz");
        } else {
            System.out.println("The computer with the maximum clock speed does not exist.");
        }

        // 6a - get()
        // 6c - isEmpty()
        // TEST4 - shouldCheckAllComputersHaveAtLeast2Cores()

        Optional<CPU> compsWithLessThan2Cores = computers.stream()
                .map(Computer::getCpu)
                .filter(CPU -> CPU.getCores() < 1)
                .findFirst();

        if (compsWithLessThan2Cores.isEmpty()) {
            System.out.println("All computers have at least 2 cores in the processor.");
        }


        // 6d - orElse()
        //TEST5 - shouldDisplayAmigaAfterFilteringStream()

        String isAmigaExist = computers.stream()
                .map(computer -> computer.getName())
                .filter(c -> c.equals("Amiga"))
                .findFirst()
                .orElse("Amiga is not exist");

        System.out.println(isAmigaExist);


        // 6e - orElseGet()
        //TEST6 - shouldCreateNewUserInCaseWhenCPUClockSpeedIsBelow5()

        CPU isAdminComp = computers.stream()
                .map(computer -> computer.getCpu())
                .filter(clock -> clock.getClockSpeed() > 5)
                .findFirst()
                .orElseGet(() -> new CPU("Adminowski'brand", 6.0, 10));

        System.out.println(isAdminComp);

        //TEST7 - shouldCreateNewUserInCaseWhenCPUCoreIsUnder10()

        CPU isSuperAdminComp = computers.stream()
                .map(computer -> computer.getCpu())
                .filter(clock -> clock.getCores() > 10)
                .findFirst()
                .orElseGet(() -> new CPU("Adminowski'brand", 6.0, 12));

        System.out.println(isSuperAdminComp);


        // 6f - isPresent()
        // TEST8 - shouldDisplayComputersNameWithHDDCapacityAbove250()

        computers.stream()
                .filter(computer -> computer.getHDD().getCapacity() > 250)
                .findFirst()
                .ifPresent(computer -> System.out.println(computer.getName()));


        // 6g - isPresentOrElse()
        // TEST9 - shouldNotDisplayComputersWithNameThatDoesNotExist()

        computers.stream()
                .filter((computer -> computer.getType().equals("Typo")))
                .findFirst()
                .ifPresentOrElse(computer -> System.out.println(computer.name),
                        () -> System.out.println("Typo is not exist"));


        // 6h - orElseThrow()

        RAM ramAsANegativeNumber = computers.stream()
                .map(computer -> computer.getRAM())
                .filter(ram -> ram.getCapacity() < 0)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Bad value"));

        HDD hddBrand = computers.stream()
                .map(computer -> computer.getHDD())
                .filter(hdd -> hdd.getBrand().equals("AQ"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Bad value"));

        CPU cpuRyzen = computers.stream()
                .map(computer -> computer.getCpu())
                .filter(cpu -> cpu.getBrand().contains("Intello"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Bad value"));
    }
}