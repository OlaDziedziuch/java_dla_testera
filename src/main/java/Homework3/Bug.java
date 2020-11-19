package Homework3;

public class Bug {

    private String description;
    private String email;
    private int priority;
    private boolean status;
    private String firstName;
    private String lastName;

    public Bug(String description, String email, int priority, String firstName, String lastName) {

        this.description = description;
        this.email = email;
        this.priority = priority;
        this.status = getStatus();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getters and setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() < 10) {
            System.out.println("Description must contain at least 10 characters.");
        } else {
            this.description = description;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("E-mail address must contain '@'.");
        }
    }

    public int getPriority() {
        return priority;
    }

    public int setPriority(int priority) {

        if ((priority > 0) && (priority <= 5)) {
            this.priority = priority;

            switch (priority) {
                case 2:
                    System.out.println("The priority is: 2");
                    break;
                case 3:
                    System.out.println("The priority is: 3");
                    break;
                case 4:
                    System.out.println("The priority is: 4");
                    break;
                case 5:
                    System.out.println("The priority is: 5");
                    break;
                default:
                    System.out.println("The priority is: 1");
            }

        } else {
            System.out.println("The priority should be selected between 1-5.");

        }
        return priority;
    }

    public boolean getStatus() {
        return true;
    }

    public void setStatus() {
        this.status = false;
        System.out.println("The status has been changed. Actual status is closed.");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getMailApplicant(String email) {
        this.email = email;
    }

    public void setApplicant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayAllInfo() {
        System.out.println("Description: " + description + "\n" +
                "Applicant: " + firstName + " " + lastName + "\n" +
                "Applicant's e-mail: " + email + "\n" +
                "Is the status open? - " + status + "\n");
    }

}

