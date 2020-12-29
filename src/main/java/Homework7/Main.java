package Homework7;

public class Main {
    public static void main(String[] args) {

        BugReporter tester = new BugReporter("Adam", "Pietruszka", "adam@wp.pl");

        Bug bug1 = new Bug("I work despite not having a coffee", 1, tester);
        System.out.println(bug1);




    }

}
