package Homework2;

public class Main {
    public static void main(String[] args) {

        Bug bug1 = new Bug("Picture is not displayed", "zya@op.pl");
        Bug bug2 = new Bug("Typo", "abc@wp.pl");

        bug1.displayAllInfo();
        bug1.displayApplicant("Maggie", "Laggie");
        bug1.getStatus();
        bug1.changeStatus();
        bug1.setPriority(3);
        bug1.displayAllInfo();

        bug2.displayAllInfo();
        bug2.displayApplicant("Kate", "Take");
        bug2.getStatus();
        bug2.setPriority(5);
        bug2.displayAllInfo();

    }

}
