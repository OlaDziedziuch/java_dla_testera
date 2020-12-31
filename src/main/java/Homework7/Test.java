package Homework7;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.Test
    public void positiveEmailValidation() {
        BugReporter tester = new BugReporter("Adam", "Pietruszka", "adam@wp.pl");
        {
            tester.getEmail();
            assertEquals("adam@wp.pl", tester.getEmail());
        }

    }
}
