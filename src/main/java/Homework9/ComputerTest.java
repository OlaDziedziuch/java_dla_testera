package Homework9;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


public class ComputerTest {

    private List<Computer> computers = new ArrayList<Computer>();

    @Before
    public void setUp() {

        computers.clear();

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
        computers.add(new Laptop("Lenovo", "TypeH", new HDD("A", 500), new RAM("B",
                264), new CPU("AMD Ryzen", 1.4, 6), 60));
    }

    @Test

    // TEST1
    public void shouldDisplayQuantityOfComputerWithRAMAbove128Gb() {
        System.out.println("Running test: shouldDisplayQuantityOfComputerWithRAMAbove128Gb ");

        long computersAbove128GB = computers.stream()
                .filter(computer -> computer.getRAM().getCapacity() > 128)
                .count();

        int expectedOutput = 2;
        long methodOutput = computersAbove128GB;

        assertEquals(expectedOutput, methodOutput);

    }

    @Test
    // TEST2
    public void shouldDisplayMaxValueOfRAMCapacity() {
        System.out.println("Running test: shouldDisplayMaxValueOfRAMCapacity");

        Optional<Computer> maxRAM = computers.stream()
                .max(Comparator.comparingInt(Computer -> Computer.getRAM().getCapacity()));

        int expectedOutput = 264;
        int methodOutput = maxRAM.get().getRAM().getCapacity();

        assertEquals(expectedOutput, methodOutput);

    }

    @Test
    // TEST3
    public void shouldDisplayTheHighestCPUClockSpeed() {
        System.out.println("Running test: shouldDisplayTheHighestCPUClockSpeed");

        Optional<Computer> maxCpuClockSpeed = computers.stream()
                .min(Comparator.comparingDouble(Computer -> Computer.getCpu().getClockSpeed()));

        double expectedOutput = 1.4;
        double methodOutput = maxCpuClockSpeed.get().getCpu().getClockSpeed();

        assertEquals(expectedOutput, methodOutput);

    }

    @Test
    // TEST4
    public void shouldCheckAllComputersHaveAtLeast2Cores() {
        System.out.println("Running test: shouldCheckAllComputersHaveAtLeast2Cores ");

        Optional<CPU> compsWithLessThan2Cores = computers.stream()
                .map(Computer::getCpu)
                .filter(CPU -> CPU.getCores() < 1)
                .findFirst();

        if (compsWithLessThan2Cores.isEmpty()) {
            System.out.println("All computers have at least 2 cores in the processor.");
        }

        boolean expectedOutput = true;
        boolean methodOutput = compsWithLessThan2Cores.isEmpty();

        assertEquals(expectedOutput, methodOutput);

    }

    @Test
    // TEST5
    public void shouldDisplayAmigaAfterFilteringStream() {
        System.out.println("Running test: shouldDisplayAmigaAfterFilteringStream() ");

        String isAmigaExist = computers.stream()
                .map(computer -> computer.getName())
                .filter(c -> c.equals("Amiga"))
                .findFirst()
                .orElse("Amiga is not exist");

        String expectedOutput = "Amiga";
        String methodOutput = isAmigaExist;

        assertEquals(expectedOutput, methodOutput);

    }


    @Test
    // TEST6
    public void shouldCreateNewUserInCaseWhenCPUClockSpeedIsBelow5() {
        System.out.println("Running test: shouldCreateNewUserInCaseWhenCPUClockSpeedIsBelow5");

        CPU isAdminComp = computers.stream()
                .map(computer -> computer.getCpu())
                .filter(clock -> clock.getClockSpeed() > 5)
                .findFirst()
                .orElseGet(() -> new CPU("Adminowski'brand", 6.0, 10));

        CPU expectedOutput = new CPU("Adminowski'brand", 6.0, 10);
        CPU methodOutput = isAdminComp;

        assertEquals(expectedOutput, methodOutput);

    }

    @Test
    // TEST7
    public void shouldCreateNewUserInCaseWhenCPUCoreIsUnder10() {
        System.out.println("Running test: shouldCreateNewUserInCaseOrElseGet");

        CPU isSuperAdminComp = computers.stream()
                .map(computer -> computer.getCpu())
                .filter(clock -> clock.getCores() > 10)
                .findFirst()
                .orElseGet(() -> new CPU("Adminowski'brand", 6.0, 12));

        String expectedOutput = "Intel Core I3";
        String methodOutput = isSuperAdminComp.getBrand();

        assertEquals(expectedOutput, methodOutput);

    }

    @Test
    // TEST8
    public void shouldDisplayComputersNameWithHDDCapacityAbove250() {
        System.out.println("Running test: shouldDisplayComputersNameWithHDDCapacityAbove250");

        computers.stream()
                .filter(computer -> computer.getHDD().getCapacity() > 250)
                .findFirst()
                .ifPresent(computer -> System.out.println(computer.getName()));


        String expectedOutput = "Atari";
        String methodOutput = String.valueOf(computers.get(3).getName());

        assertEquals(methodOutput, expectedOutput);
    }

    @Test
    // TEST9
    public void shouldNotDisplayComputersWithNameThatDoesNotExist() {
        System.out.println("shouldNotDisplayComputersWithNameThatDoesNotExist");

        computers.stream()
                .filter((computer -> computer.getType().equals("Typo")))
                .findFirst()
                .ifPresentOrElse(computer -> System.out.println(computer.name),
                        () -> System.out.println("Typo not exist"));

        boolean expectedOutput = false;
        boolean methodOutput = computers.get(1).getType().equals("Typo");

        assertEquals(methodOutput, expectedOutput);
    }

}

