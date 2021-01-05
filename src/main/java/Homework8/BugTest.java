package Homework8;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BugTest {

    @org.junit.Test
    public void shouldNotAllowToSendInvalidEmail() {
        BugReporter tester = new BugReporter("Adam", "Pietruszka", "adam@wp.pl");
        tester.setEmail("bad.mail.pl");
        {
            tester.getEmail();
            assertEquals("adam@wp.pl", tester.getEmail());
        }

    }

    @org.junit.Test
    public void shouldNotAllowToSetPositiveId() {
        Bug bug = new Bug(1, "xyz", 1, new BugReporter("Adam", "Pieta", "awa@.wp.pl"));
        bug.setId(1);

        {
            bug.getId();
            assertEquals(1, bug.getId());
        }
    }

    @org.junit.Test
    public void shouldAllowToSetNegativeId() {
        Bug bug = new Bug(1, "xyz", -1, new BugReporter("Adam", "Pieta", "awa@.wp.pl"));
        bug.setId(-1);
        {
            bug.getId();
            assertNotEquals(-1, bug.getId());
        }
    }

    @org.junit.Test
    public void shouldAllowToSendNotifyStatusChange() {
        Bug bug = new Bug(1, "xyz", 1, new BugReporter("Adam", "Pieta", "awa@.wp.pl"));

        bug.setStatus(true);
        {
            bug.getStatus();
            assertEquals(true, bug.getStatus());
        }
    }

}
