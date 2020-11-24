package Homework3;

public class Main {
    public static void main(String[] args) {

        Bug bug1 = new Bug("I work despite not having a coffee", "", 1, "", "");
        Bug bug2 = new Bug("I picked up important decisions on an empty stomach", "", 1, "", "");
        Bug bug3 = new Bug("", "", 1,"");

        bug3.getLastName();

        // description validation
        System.out.println("Bug1 description contains: " + bug1.getDescription().length() + " characters.");
        bug1.setDescription("blabla");
        bug1.setDescription("I didn't learn when I was young, so I have to learn now.");
        System.out.println("Bug1 description: " +bug1.getDescription());
        System.out.println("Bug1 description's length: " + bug1.getDescription().length() + " characters.");

        // email validation
        bug1.setEmail("example@wp.pl");
        System.out.println("Bug1 e-mail: " + bug1.getEmail());
        bug1.setEmail("example*wp.pl");

        // priority validation
        bug1.setPriority(3);
        System.out.println("Bug1 priority: " + bug1.getPriority());
        bug1.setPriority(7);

    }

}
