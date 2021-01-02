package Homework8;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
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

    @org.junit.Test
    public void shouldIDBeAPositiveNumber() {
        Bug bug = new Bug(1, "xyz", 1, new BugReporter("Adam", "Pieta", "awa@.wp.pl"));
        {
            bug.getId();
            assertEquals(1, bug.getId());
        }
    }

    @org.junit.Test
    public void shouldIDBeNotAPositiveNumber() {
        Bug bug = new Bug(1, "xyz", -1, new BugReporter("Adam", "Pieta", "awa@.wp.pl"));
        {
            bug.getId();
            assertNotEquals(-1, bug.getId());
        }
    }

    @org.junit.Test
    public void shouldNotifyStatusChange() {
        Bug bug = new Bug(1, "xyz", 1, new BugReporter("Adam", "Pieta", "awa@.wp.pl"));
        {
            bug.getStatus();
            assertTrue("Status has been changed", bug.getStatus());
        }
    }

}
