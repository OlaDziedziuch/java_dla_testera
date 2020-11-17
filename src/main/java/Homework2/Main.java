package Homework2;

public class Main {
    public static void main(String[] args) {

        Bug bug1 = new Bug("I work despite not having a coffee", "",1, "", "");
        Bug bug2 = new Bug("I picked up important decisions on an empty stomach", "",1, "", "");

        bug1.setApplicant("Christopher", "Pietruszka");
        bug1.setMailApplicant("chris@parsley.com");
        bug1.getStatus();
        bug1.setPriority(4);
        bug1.setStatus();
        bug1.displayAllInfo();


        bug2.setApplicant("Mark", "Gruszka");
        bug2.setMailApplicant("mark@pear.com");
        bug2.getStatus();
        bug2.setPriority(90);
        bug2.displayAllInfo();


    }

}
